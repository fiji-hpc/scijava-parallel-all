# scijava-parallel-all
Artifact that has dependency on all project using scijava-parallel. It is used for simple launching e.g. by maven or eclipse.

Running requires Java 8.
## Maven
Start with 

```
mvn exec:java -Dexec.mainClass="cz.it4i.scijava.RunImageJ" -Dexec.classpathScope="test"
```
Note: There is not fully functional labkit on HPC when executing in platform started by maven. It is know issue but without solution. 

## Eclipse
Run cz.it4i.scijava.RunImageJ within test directory.
