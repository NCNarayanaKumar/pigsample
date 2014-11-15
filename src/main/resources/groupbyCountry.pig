employees = load 'pigtesthdfs/input.txt' using PigStorage(':') AS (id:int,name:chararray,dob:chararray,dept:chararray,salary:int,country:chararray); 
D = GROUP employees BY country;
EG = FOREACH D GENERATE group, COUNT(employees);
DUMP EG;
EGO = ORDER EG BY (group);
STORE EGO into 'groupedbycountry' USING PigStorage(',');
