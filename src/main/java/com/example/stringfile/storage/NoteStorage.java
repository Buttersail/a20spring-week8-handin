package com.example.stringfile.storage;

import com.example.stringfile.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteStorage {

    private static ArrayList<Note> list;
    private static final String fileName = "data.dat";
    private static FileStorage fileStorage;

    static {
        list = new ArrayList<>();
    }

    public static void setFileStorage(FileStorage fs) {
        fileStorage = fs;
    }

    public static void saveNotesToFile() {
        fileStorage.saveToFile(list, fileName);
    }

    public static void readNotesFromFile() {
        Object object = fileStorage.readObject(fileName);
        if(object != null) {
            list = (ArrayList<Note>)object;
        }
    }

    public static ArrayList<Note> getList() {
        return list;
    }

    public static Note getNote(int index) {
        return list.get(index);
    }

    public static int getLength() {
        return list.size();
    }

}
