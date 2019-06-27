# manofletter
AIA SG logger

   #logback
   #Logback’s Core Features & Advantages
    
    1. faster execution compared to log4j
    2. native support for slf4j, which makes it easy to switch to a different logging framework, should that be necessary later on
    3. conditional processing of the defined configuration
    4. advanced filtering capabilities
    5. compression of archived log files
    6. support for setting a maximum number of archived log files
    7. HTTP-access logging
    8. recovery from I/O failures
    
   #The Logback project is organized in main 3 modules:
     
    1. logback-core – contains the basic logging functionality
    2. logback-classic – contains additional logging improvements, such as slf4j support
    3. logback-access – provides integration with servlet containers, such as Tomcat and Jetty

  link : https://stackify.com/logging-logback/
  
   # Log4j 2
    1. The Log4j API supports logging Messages instead of just Strings
    2. The Log4j API supports lambda expressions
    3. The Log4j API provides many more logging methods than SLF4J 
    4. In addition to the “parameterized logging” format supported by SLF4J, the Log4j API also supports events using the java.text.MessageFormat syntax as well printf-sytle messages
    5. The Log4j API provides a LogManager.shutdown() method. The underlying logging implementation must implement the Terminable interface for the method to have effect
    6. Other constructs such as Markers, log Levels, and ThreadContext (aka MDC) are fully supported
    
  link : https://logging.apache.org/log4j/2.x/


