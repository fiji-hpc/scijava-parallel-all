# scijava-parallel-all
Artifact that has dependency on all project using scijava-parallel. It is used for simple launching e.g. by maven or eclipse.

Running requires Java 8.
## Maven
Start with 

```
mvn exec:java -Dexec.mainClass="cz.it4i.scijava.RunImageJ"
```
Note: There is not fully functional labkit on HPC when executing in platform started by maven. It is a know issue but without solution internally labkit throws exception (without logging) "NoClassDefFoundError: net.imglib2.loops.LoopBuilder$TriConsumer" although imglib2 is in dependencies.   

## Eclipse
Run cz.it4i.scijava.RunImageJ within test directory.
