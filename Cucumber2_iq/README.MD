auto-->
*Quick way to add cucumber dependencies
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=6.2.2"  
                              \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"
   
manuel---->
**Required Dependency
  -->cucumber-core
  -->cucumber-html
  -->cucumber-java
  -->cucumber-junit
  -->cucumber-jvm-deps
  -->cucumber-reporting
  -->hamcrest-core
  -->gherkin
  -->selenium-java
  -->junit
  
  mvn clean test verify -DCucumber.options="--tags @Login"

   
   