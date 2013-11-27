package kfs.kfsFind;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author pavedrim
 */
public class kfsTwoFiles implements FileFilter {

    private final long st;
    private final long nd;
    private final boolean includeSt;
    private final boolean includeNd;

    public kfsTwoFiles(long st, long nd) {
        this(st, true, nd, true);
    }

    public kfsTwoFiles(File st, File nd) {
        this(st.lastModified(), true, nd.lastModified(), true);
    }

    public kfsTwoFiles(File st, boolean includeSt, File nd, boolean includeNd) {
        this(st.lastModified(), includeSt, nd.lastModified(), includeNd);
    }

    public kfsTwoFiles(long st, boolean includeSt, long nd, boolean includeNd) {
        this.includeSt = includeSt;
        this.includeNd = includeNd;
        if (st < nd) {
            this.st = st;
            this.nd = nd;
        } else {
            this.st = nd;
            this.nd = st;
        }
    }

    public boolean accept(long time) {
        return (((st < time) || (includeSt && (st == time)))
                && (nd > time) || (includeNd && (nd == time)));
    }

    @Override
    public boolean accept(File file) {
        return accept(file.lastModified());
    }
}
