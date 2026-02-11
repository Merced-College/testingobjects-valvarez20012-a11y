//Victor Alvarez
//Guardian.java
public class Guardian {

    // Fields
    private String name;
    private String classType;   // Titan, Hunter, Warlock
    private int lightLevel;
    private boolean hasGhost;

    // No-arg constructor
    public Guardian() {
        name = "Unknown Guardian";
        classType = "None";
        lightLevel = 0;
        hasGhost = false;
    }

    // Parameterized constructor
    public Guardian(String name, String classType, int lightLevel, boolean hasGhost) {
        this.name = name;
        this.classType = classType;
        this.lightLevel = lightLevel;
        this.hasGhost = hasGhost;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getClassType() { return classType; }
    public void setClassType(String classType) { this.classType = classType; }

    public int getLightLevel() { return lightLevel; }
    public void setLightLevel(int lightLevel) {
        if (lightLevel >= 0) this.lightLevel = lightLevel;  // validation
    }

    public boolean hasGhost() { return hasGhost; }
    public void setHasGhost(boolean hasGhost) { this.hasGhost = hasGhost; }

    // toString override
    @Override
    public String toString() {
        return "Guardian{name='" + name + 
               "', classType='" + classType + 
               "', lightLevel=" + lightLevel + 
               ", hasGhost=" + hasGhost + "}";
    }
}
