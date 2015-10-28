package dk.topdanmark.maven.plugin;

/**
 * Created by zapp on 28/10/15.
 */
public abstract class VersionFixture {
    private String version;

    public abstract void putVersion(String version);

    public abstract void bumpVersion();

    public abstract String bumpedVersion();
}
