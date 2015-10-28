package dk.topdanmark.maven.plugin;

/**
 * Created by zapp on 28/10/15.
 */
public class DeveloperPluginFixture {


    private String version;

    public DeveloperPluginFixture() {

    }

    public void putVersion(String version) {
        System.out.println("version = " + version);

        this.version = version;
    }


    public void bumpVersion() {
        version += "bumped";
    }

    public String bumpedVersion() {
        return version;
    }
}
