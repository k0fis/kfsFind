package kfs.kfsFind;

import java.io.File;

/**
 *
 * @author pavedrim
 */
public class kfsOneFile {

    private final long st;

    private final boolean includeSt;

    public kfsOneFile(long st) {
        this(st, true);
    }

    public kfsOneFile(File st) {
        this(st.lastModified(), true);
    }

    public kfsOneFile(File st, boolean includeSt) {
        this(st.lastModified(), includeSt);
    }

    public kfsOneFile(long st, boolean includeSt) {
        this.includeSt = includeSt;
        this.st = st;
    }

    public boolean acceptNewer(long time) {
        return (st < time) || (includeSt && (st == time));
    }

    public boolean acceptOlder(long time) {
        return (st > time) || (includeSt && (st == time));
    }

    public boolean acceptNewer(File file) {
        return acceptNewer(file.lastModified());
    }

    public boolean acceptOlder(File file) {
        return acceptNewer(file.lastModified());
    }
}
