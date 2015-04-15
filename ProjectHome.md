
Application description:

The Jasper Patient Tracker is a Java Swing and MySQL application designed for a clinic or a small doctor's office.



The basic problem application will solve:

This application is free forever so the likelihood an organization trying the application is increased. Adaptation of software in the health care IT industry has traditionally been guarded. Authors Dana Blankenhorn and Paula Rooneyof in a 08/02/2007 article entitled "What is stalling open source in healthcare?" cite proprietary advantage and bureaucracy keeping adoption of the open source Medsphere at bay (http://blogs.zdnet.com/open-source/?p=1272). A health care IT user or developer debugging the inner workings of the application might gain enough trust to the application to approve it for use.

Currently there exist no SourceForge open source Java Swing patient tracking or Java Swing EHR application as a SourceForge project at the time of this writing. A search on SourceForge using "(+public +health +patient)" produced one open source application "eBed - Surge Capacity for Public Health", whereas "(+public +health +patient +swing)" produced a zero listing.

A web application was ruled-out due to insecurities and reliability. One such application can be found as a PHP solution at MirrorMed at http://www.mirrormed.org. Our application is explicitly non-web.

Another application, Open Dental at http://en.wikipedia.org/wiki/Open_Dental, has up to "1,000 dentists using OD, and guess 10,000,000 patient records" although it is based on .Net C#. Java Swing has a far wide base of code developers to increase the likelihood of attaining committers to the project.

A forum for applications which process basic  EHR (Electronic Health Record) transactions can be found at http://www.doctorsgadgets.com/forum/open-source-medical-software. Our application has EHR as a basic component in tracking patients.



Technologies used:

Java Swing was selected to allow the application to operate in a closed computer network. The application is designed for multiple users. For example, a receptionist and a practitioner can use the application simultaneously. The native database is MySQL through JDBC although provisions will be made to connect to other databases. All database SQL statements are transaction based. Installation is through Java Web Start to ease IT management. The targeted platforms are Windows, Mac, and Linux. The initial committers are versed on the Windows and Mac computers. The application is designed with Spanish as the first multi-language to reach the greatest adoption on the American continent. The provision for another language will later facilitate other languages besides English and Spanish.