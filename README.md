# MAVEN

## Criando Projeto Maven
- https://maven.apache.org/guides/mini/guide-creating-archetypes.html
- https://www.sohamkamani.com/java/cli-app-with-maven/

## Generate
- https://maven.apache.org/archetype/maven-archetype-plugin/generate-mojo.html

```shell
mvn archetype:generate                                  
  -DinteractiveMode=false                               
  -DarchetypeArtifactId=maven-archetype-quickstart      
  -DarchetypeVersion=1.4                                
  -DgroupId=br.com.maven                          
  -DartifactId=maven 
```

## Build da aplicação
```shell
mvn clean compile package -Dmaven.test.skip -DskipTests -Dmaven.javadoc.skip=true 
```

## Rodar
```shell
mvn exec:java -Dexec.mainClass="br.com.maven.App" 
```
