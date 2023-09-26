package patterns.singletonPattern;

public class Version {
    private final int major;
    private final int minor;
    private final int revision;

    private static Version instance = new Version();

    private Version() {
        this.major = 1;
        this.minor = 0;
        this.revision = 0;
    }

    public synchronized static Version getInstance() {
        if(instance == null) {
            instance = new Version();
        }
        return instance;
    }

    @Override
    public String toString() {
        return major + "." + minor + "." + revision;
    }

    //recomendacion para si intentan instanciar lance un exception
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}


