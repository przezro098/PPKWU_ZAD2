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
