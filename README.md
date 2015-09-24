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

The project folder contains the file 'script.sql' for reference or to run the script. Connection details are as follows:

Host = 'localhost'
Port = '3306'
Database = 'sseitturner'
URL = 'jdbc:mysql://localhost:3306/sseitturner'
User = 'root'
Password = ''


Usage
-----

The application server port is '8080' and the URL is 'http://localhost:8080/{...}/' (browser root page). To deploy the Web application using Tomcat, copy the WAR file 'sseit_war.war' into the '$CATALINA_HOME\webapps' directory. Restart the Tomcat server. When the Tomcat server is started, 'sseit_war.war' will be unpacked and launched from the 'webapps' directory.


Known Bugs
-----

None as of 2015-09-22.


Author
-----

J. TURNER


License
-------

MIT license