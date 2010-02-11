/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubenlaguna.en4j.interfaces;

import com.rubenlaguna.en4j.noteinterface.Note;
import java.beans.PropertyChangeListener;
import java.io.InputStream;
import java.util.Collection;
import org.netbeans.api.progress.ProgressHandle;

/**
 *
 * @author ecerulm
 */
public interface NoteRepository {

    Collection<Note> getAllNotes();
    //TODO add a rebuildIndex method

    void importEntries(InputStream in, ProgressHandle ph) throws InterruptedException;

    Note get(int id);

    void add(Note n);

    int getHighestUSN();

    void addPropertyChangeListener(PropertyChangeListener listener);

    void removePropertyChangeListener(PropertyChangeListener listener);
}
