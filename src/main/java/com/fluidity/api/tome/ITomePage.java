package com.fluidity.api.tome;

public interface ITomePage {
    String title = "";

    String contents = "";

    default String getTitle() {
        return title;
    }

    default String getContents() {
        return contents;
    }
}
