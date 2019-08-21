# scijava-parallel-all
Artifact that has dependency on all project using scijava-parallel. It is used for simple launching e.g. by maven or eclipse.

## Maven
Start with 

```
mvn exec:java -Dexec.mainClass="cz.it4i.scijava.RunImageJ" -Dexec.classpathScope="test"
```

## Eclipse
Run cz.it4i.scijava.RunImageJ within test directory.
