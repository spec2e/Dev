package dk.topdanmark.maven.plugin;

/**
 * Created by zapp on 28/10/15.
 */
public class ReleaseCandidateVersionFixture extends VersionFixture {

    private String version;

    @Override
    public void putVersion(String version) {
        this.version = version;
    }

    @Override
    public void bumpVersion() {
        this.version += "RC";
    }

    @Override
    public String bumpedVersion() {
        return this.version;
    }

    public boolean versionExists() {
        return true;
    }

    public String status() {
        return "version exists";
    }

    public boolean artifactExists() {
        return false;
    }
}
