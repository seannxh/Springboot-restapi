//Spring Boot

//Pros
//Helps me build production ready
//Spring initializes - makes it easy to create spring boot project spring.start.io
//Spring Boot start projects
//spring boot autoconfiguration
//spring boot dev tools - makes manual changes to application server without having to restart the server

//LOGGING
//Different Config for Different Env
//Monitor - Spring Boot Actuator

//@ConfigurationProperties
//Configuration properties enables to externalize all the tools for my application
//#When having problems can use this to get more info
//# if trace everything else below is printed vice versa
//#trace - everything to log
//
//#debug - a lot more information
//#info
//#warning - one level above error
//#error - only error and exception will print
//#off - shuts

//How to run the application in a real application like setting
// mvn clean
//mvn package1
//java -jar ////.jar name located in target

//localhost/actuator
//It tells you if your bean is autoconfigured
//I can see all the things I have created and see the things I can do in app prop

//actuator/env
//endpoint shows all the details about the application environment
//JVM//TOMCAT

//actuator/metrics
//http.server.requests
 //Can see the server statics of the count of request total time it takes
