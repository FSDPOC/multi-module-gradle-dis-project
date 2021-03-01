Multi Module project with Gradle 6.x.x

Steps to create a multiple projects using gradle 6:
1)	Install Gradle 6 in local machine
2)	Create a Gradle project in IntelliJ IDE 
3)	Add new module by selecting parent folder
4)	Update build.gradle configurations with buildscript in root and subprojects
5)	Add dependencies and plugins for springboot and camunda in a common and subprojects as per Gradle 6 documentation.
6)	Select the parent module and configure entry point for application to load on startup.
7)	Configure build.gradle with all subprojects as jar except entry module as bootJar 
8)	Install Docker
9)	Create DockerFile under root directory with configuration details. 

Structure of multi module project: 
   
			 
       
 
        
Configurations details:
Parent configuration at root level   
Child module as entry for application to load on startup
Child module configuration
Docker Configuration
 
Instruction and steps to execute:
Pre-requisite: Gradle installed on local machine
Build project with multiple modules and dependencies
/root-project>gradle clean build –stacktrace

Local environment:
/ root -project>gradle run --stacktrace

Build Docker image:
Pre-requisite: Docker installed on local machine
/ root -project>docker image build -t <name of the image> .
/ root-project>docker container run --name <name> -p <local port>:<host port> -d <name of the image>

