package com.fluidity.api.tome;

import java.util.ArrayList;

public interface ITomeChapter {
    ArrayList<ITomePage> pages = new ArrayList<>();

    String title = "";

    String contents = "";

    String id = "";

    default String getTitle() {
        return title;
    }

    default String getContents() {
        return contents;
    }

    default String getId() {
        return id;
    }



    void addPage(ITomePage page);
}
