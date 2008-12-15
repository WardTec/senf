/*
 *
 * Senf was created by the Information Security Office
 * at the Univeristy of Texas at Austin.
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 3.0 United States
 * License. To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/3.0/us/
 *
 * Send comments to security@utexas.edu
 *
 */

package senf;

import java.io.*;
import javax.swing.JTable;
import java.util.ArrayList;

public class ACLThing
{
	private final String ACL_CONFIG_FILE = "senf.acl";
	private File ACLConfig;
	private String[] lines;
	private ArrayList< String > linesList;

	public ACLThing()
	{
		try
		{
			ACLConfig = new File( ACL_CONFIG_FILE );
			BufferedReader ACLReader = new BufferedReader( new FileReader( ACLConfig ) );
			String line;
			linesList = new ArrayList< String >();

                        while( ( line=ACLReader.readLine() )!= null )
                        {
				linesList.add( line );
                        }

                        ACLReader.close();
                }
		catch ( java.io.FileNotFoundException fnfe )
		{
                        System.out.println( "ACL not found!" );
                }
		catch ( java.io.IOException ioe )
		{
                        System.out.println( "Error reading ACL file!" );
                }
	}

	public void add( String toAdd )
	{
		linesList.add( toAdd );
	}

	public void remove( int toRemove )
	{
		linesList.remove( toRemove );
	}

	public void swap( int one, int two )
	{
		String first = linesList.get( one );
		String second = linesList.get( two );
		linesList.set( one, second );
		linesList.set( two, first );
	}

	public int getSize()
	{
		return linesList.size();
	}

	public String[] getLines()
	{
		String[] lines = new String[ linesList.size() ];
		int i;

		for( i=0; i<linesList.size(); i++)
		{
			lines[i] = linesList.get( i );
		}

		return lines;
	}

	public void finalize( JTable ACLTable )
	{
                try
                {
                        BufferedWriter ACLWriter = new BufferedWriter( new FileWriter( ACLConfig ) );
			int i;

			for( i=0; i<linesList.size(); i++ )
			{
				ACLWriter.write( linesList.get( i )+"\n" );
			}

			ACLWriter.close();
                }
                catch ( java.io.FileNotFoundException fnfe )
                {
                        System.out.println( "ACL not found!" );
                }
                catch ( java.io.IOException ioe )
                {
                        System.out.println( "Error reading ACL file!" );
		}
	}
}

