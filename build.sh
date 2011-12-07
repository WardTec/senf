javac -cp lib/tika.jar senf/*.java streams/*.java streamsources/*.java seeds/*.java parsers/*.java
jar cmf manifest senf.jar senf/*.class senf/images/* streams/*.class streamsources/*.class
