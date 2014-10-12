register ../../../target/PigUDTest-1.0-SNAPSHOT.jar;
A = load 'pigtesthdfs/input.txt' using PigStorage(':') AS (id:int,name:chararray,dob:chararray,dept:chararray,salary:int,country:chararray); 
B = FOREACH A GENERATE com.pakjivega.pigjava.udf.UPPER(name);
DUMP B;
