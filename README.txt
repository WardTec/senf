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
/*
 *
 *@author Sean Reid, Jason Phelps, Alek Amrani
*/

---SENF! the SEnsitive Number Finder:---

Senf is a fast, portable tool (written in Java, runnable just about
everywhere) for finding sensitive numbers. Use this tool to identify files on
your system that may have Social Security Numbers (SSNs) or Credit Card
Numbers (CCNs).


---Instructions for use:---

Instructions for use can be found in the SenfReadme on the website


---Instructions for developing:---

To compile the source code, the following command may be used:
	javac senf/*.java streams/*.java streamsources/*.java seeds/*.java parsers/*.java

To create an executable JAR archive, like the one available for download, the
following command may be used:
	jar cmf manifest senf/*.class senf/images/* streams/*.class streamsources/*.class

SENF! is moving towards a completely modular design.  This means that user
development will be easy, and fast.  At the moment, the seeds and parsers are
totally modular.  SENF! will load any seeds located in the "seeds" directory, as
well as any parsers in the "parsers" directory.


---Developing / Source ---

The SENF! source is open for browsing.  The SVN repository is at
https://source.its.utexas.edu/groups/its-iso/repos/senf

Authentication is controled by the UT EID System.  If you're interested in committing
to the SVN repository, you will need to contact the UT ISO.


---Big Ups to UT ISO---

Senf is brought to you by The University of Texas Information Security Office
