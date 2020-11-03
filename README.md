# PPKWU_ZAD2

String analyzer

Project is written in Spring Boot technology. The main feature of the application is to analyze given string and return data about : 
a) count of lowercase letters,
b) count of uppercase letters,
c) count of special characters,
d) count of combination

It's realized by "StringAnalyzer" class which is annotated as a "@RestController". 
"Analyze" method is annotated as a "@RequestMapping" and is called when clinet uses path "/analyze".
Above method realizes project assmumptions. 

To use please : 
1) build project using any Java IDE,
2) make sure that project is running
3) type in your browser "http://localhost:8080/analyze?input=stringWhichWeWantToAnalyze"
4) data will be returned as a plain text
