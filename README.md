# call-drools-udf
Dirty demo of calling a KIE REST API from Apache pig

##Make sure all kie server dependencies are available in pig classpath

## Pig scriptlet for running the UDF
REGISTER <<path>>/call-drools-udf-0.0.1-SNAPSHOT.jar
A = load '<<path>>/Data.txt' USING PigStorage('\n') AS ( textCol:chararray);
DEFINE validate_against_rules com.kiin.pig.validate_against_rules();
validated = FOREACH A GENERATE validate_against_rules(textCol);
dump validated;

##reach out to kailashnath.kutti@gmail.com for sample data
