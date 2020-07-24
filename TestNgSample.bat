G:
cd G:\Workshop\TestNgSampleProject
set projectLocation=G:\Workshop\TestNgSampleProject
set classpath=%projectLocation%\bin;%projectLocation%\src\req_jars\*
java org.testng.TestNG %projectLocation%\testng.xml

pause