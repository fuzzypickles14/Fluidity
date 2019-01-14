package com.fluidity.api.tome;

import java.util.ArrayList;

public interface ITomeChapter {
    ArrayList<ITomePage> pages = new ArrayList<>();

    String title = "";

    String contents = "";

    default String getTitle() {
        return title;
    }

    default String getContents() {
        return contents;
    }

    void addPage(ITomePage page);
}
