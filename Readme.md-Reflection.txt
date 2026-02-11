### Checkpoint Q1
Before overriding toString(), printing an object shows ClassName@hashcode. This happens because Java uses Object.toString(), which prints the class name and a hash value.

### Checkpoint Q2
My class fields and defaults:
Dog:
name = null (reference)
age = 0 (primitive)
breed = null (reference)

Guardian:
name = null (reference)
classType = null (reference)
lightLevel = 0 (primitive)
hasGhost = false (primitive)

### Checkpoint Q3
Constructors allow objects to start with meaningful values instead of Java’s default nulls and zeros. The parameterized constructor lets me fully initialize the object in one line.

### Checkpoint Q4
After overriding toString(), objects print human-readable descriptions. @Override ensures I correctly replace the method from Object.

### Checkpoint Q5
Encapsulation protects data and allows validation. For example, I prevent negative Light Levels in setLightLevel().
