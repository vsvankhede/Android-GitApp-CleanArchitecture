package com.vstechlab.demo.data.cache;

import android.content.Context;

import java.io.File;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Helper class to do operation on regular files/directories.
 */
@Singleton
public class FileManager {

    @Inject
    public FileManager() {}

    /**
     * Writes a file to Disk.
     *
     * This is an i/o operation and this method executes on main thread.
     * So it's important to perform this operation using another thread.
     *
     * @param file File to write to Disk.
     */
    public void writeToFile(File file, String fileContent) {

    }

    /**
     * Reads a content from file.
     *
     * This is an i/o operation and this method executes on main thread.
     * So it's important to perform this operation using another thread.
     *
     * @param file The file to read from.
     */
    public String readFileContent(File file) {
        return null;
    }

    /**
     * Return a boolean indicating whether this file can be found on the underlying filesystem.
     *
     * @param file The file to check existence.
     * @return true if file exists, false otherwise.
     */
    public boolean exists(File file) {
        return false;
    }

    /**
     * Warning: Deletes the content of the directory.
     *
     * This is i/o operating and this method executes on main thread.
     * So it's recommended to perform this on another thread.
     *
     * @param directory The directory which its content will be deleted.
     */
    public void clearDirectory(File directory) {

    }

    /**
     * Write a value to a user preferences file.
     *
     * @param context {@link Context} to retrieve android user preference.
     * @param preferenceFileName A file name representing from where data will be get from.
     * @param key A key that will be used to retrieve the value from the preference file.
     * @param value A long representing value to beinserted.
     */
    public void writeToPreferences(Context context, String preferenceFileName, String key,
                                   long value) {

    }

    /**
     * Get a value from a user shared preferences file.
     *
     * @param context {@link Context} to retrieve android user preference.
     * @param preferenceFileName A file name representing from where data will be get from.
     * @param key A key that will be used to retrieve the value from the preference file.
     * @return A long representing value retrieved from the preference file.
     */
    public long getFromSharedPreference(Context context, String preferenceFileName, String key) {
        return 0;
    }
}
