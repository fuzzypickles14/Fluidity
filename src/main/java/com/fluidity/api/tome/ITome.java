package com.fluidity.api.tome;

import java.util.ArrayList;

public interface ITome {
    ArrayList<ITomeChapter> chapter = new ArrayList<>();

    String title = "";

    String contents = "";

    default String getTitle() {
        return title;
    }

    default String getContents() {
        return contents;
    }

    void addChapter(ITomeChapter chapter);
}
