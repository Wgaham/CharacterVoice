package com.wgaham.listviewtest;

/**
 * Created by zh on 2017/7/28.
 */

public class CharacterVoice {

    private String name;

    private int imageId;

    public CharacterVoice(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
