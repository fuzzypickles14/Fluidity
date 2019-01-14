package com.fluidity.api.tome;

public interface ITomePage {
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

}
