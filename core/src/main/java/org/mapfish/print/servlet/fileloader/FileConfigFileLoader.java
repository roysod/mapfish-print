package org.mapfish.print.servlet.fileloader;

import com.google.common.collect.Iterators;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/**
 * A plugin that loads the config resources from urls starting with prefix:
 * {@value org.mapfish.print.servlet.fileloader.FileConfigFileLoader#PREFIX}://.
 *
 * @author Jesse on 4/28/2014.
 */
public final class FileConfigFileLoader extends AbstractFileConfigFileLoader {
    static final String PREFIX = "file";

    @Override
    protected Iterator<File> resolveFiles(final URI fileURI) {
        File file = platformIndependentUriToFile(fileURI);

        return Iterators.singletonIterator(file);
    }

    @Override
    public String getUriScheme() {
        return PREFIX;
    }
}
