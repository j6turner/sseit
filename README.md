Software Support Engineer Interview Test
============

This Web app allows the user to input development environments, submit that information, and view all records stored in the database. The required fields are "Operating System (OS)" and "OS Version," whereas inputting data into the "Notes" field is optional.

Features include [Java SE Development Kit v.1.8.0_60](http://www.oracle.com/technetwork/java/javase/downloads/index.html), [Struts2 v.2.3.20.1](http://struts.apache.org), [MySQL](http://www.mysql.com/downloads/), [GlassFish v.4.1.02](https://glassfish.java.net/download.html), and [Bootstrap](http://getbootstrap.com/). This application was built using the IDE IntelliJ IDEA.


Database Schema and Access
-----

The database for this application is called 'sseitturner' and the table is called 'entries.' The user is 'root,' and there is no password required. If accessing the MySQL database from the command line, upon starting the MySQL server and working from the 'mysql' prompt, enter the following script:

```mysql
DROP DATABASE IF EXISTS sseitturner;
```
```mysql
CREATE DATABASE IF NOT EXISTS sseitturner;
```
```mysql
USE sseitturner;
```
```mysql
CREATE TABLE IF NOT EXISTS entries
(
  id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  os VARCHAR(50) NOT NULL,
  osVersion VARCHAR(50) NOT NULL,
  notes VARCHAR(250) NOT NULL,
  timestamp TIMESTAMP DEFAULT now() NOT NULL
);
```

If using IntelliJ IDEA, connect to the database resources through the database tool window in the menu (View : Tool Windows : Database) or refer to the 'script.sql' file to run the script. Connection details are as follows:

Host = 'localhost'
Port = '3306'
Database = 'sseitturner'
URL = 'jdbc:mysql://localhost:3306/sseitturner'
User = 'root'
Password = ''


Usage
-----

If using IntelliJ IDEA, deploy the 'sseit:war exploded' artifact (or the WAR file for 'sseit:war exploded'). The main module of this application is 'sseit.' The SDK configured for this module is '1.8 (java version 1.8.0_60)' and the application server configured for this module is 'GlassFish 4.1.02' (details can be checked or set through the IntelliJ IDEA menu under File : Project Structure and under Run : Edit Configurations). The application server port is '8080,' the URL is 'http://localhost:8080/sseit_war_exploded/' (browser root page), and the GlassFish server settings are as follows:

 Server Domain = "domain1"
 Username = "admin"
 
 To open a browser window to view the application, click on Run : Run GlassFish4.1.02 in the menu. The project is set to update resources each time the 'Run' button is clicked; if a pop-up window poses the option to update resources, click 'OK.'
 
If using the terminal (Mac) or CMD (Windows) to view this project, change directories (cd) to the location of the project folder via one window and open another window to start the GlassFish server (assuming GlassFish is installed on the system; visit [this link](https://docs.oracle.com/javaee/6/tutorial/doc/bnadi.html) for more information). At the prompt, type 'asadmin start-domain --verbose' to start the server and 'asadmin stop-domain domain1' to stop the server. Alternatively, on Windows, the server can be accessed through the menu as follows: Start : All Programs : Java SDK : Start Application Server. Once the server is running, navigate to 'http://localhost:8080/sseit_war_exploded/' in a Web browser window. Otherwise, an application server such as Tomcat or Jetty can be utilized by copying the WAR file to the correct location (webapps directory).


Known Bugs
-----

None as of 2015-09-22.


Author
-----

J. TURNER


License
-------

MIT license