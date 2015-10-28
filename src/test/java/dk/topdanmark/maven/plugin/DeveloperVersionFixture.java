package dk.topdanmark.maven.plugin;

/**
 * Created by zapp on 28/10/15.
 */
public class DeveloperVersionFixture extends VersionFixture {

    private String version;

    @Override
    public void putVersion(String version) {
        this.version = version;
    }

    @Override
    public void bumpVersion() {
        this.version += "-SNAPSHOT";
    }

    @Override
    public String bumpedVersion() {
        return this.version;
    }
}