package com.example.imageslider;

public class SliderItem {

    //here we can use String variable to store the url ,while fetching image from internet.
    private int image;


    public SliderItem(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
