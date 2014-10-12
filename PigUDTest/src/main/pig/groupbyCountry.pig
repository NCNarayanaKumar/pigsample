register ../../../target/PigUDTest-1.0-SNAPSHOT.jar;
A = load 'pigtesthdfs/input.txt' using PigStorage(':') AS (id:int,name:chararray,dob:chararray,dept:chararray,salary:int,country:chararray); 
X = FILTER A BY country == 'AU';
B = foreach A generate id; 
C = ORDER A By country; 
D = GROUP A BY country;
E = FOREACH D GENERATE group, COUNT(A);
--D = foreach X generate id; 
--store B into ‘id.out’;
--dump B;
--dump A;
--dump C;
--DUMP D;
DUMP E;

