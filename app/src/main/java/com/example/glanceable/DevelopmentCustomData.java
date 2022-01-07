package com.example.glanceable;

public class DevelopmentCustomData {
    private int developmentImage;
    private String developmentHead;

    public int getDevelopmentImage() {
        return developmentImage;
    }

    public void setDevelopmentImage(int developmentImage) {
        this.developmentImage = developmentImage;
    }

    public String getDevelopmentHead() {
        return developmentHead;
    }

    public void setDevelopmentHead(String developmentHead) {
        this.developmentHead = developmentHead;
    }

    public DevelopmentCustomData(int developmentImage, String developmentHead) {
        this.developmentImage = developmentImage;
        this.developmentHead = developmentHead;
    }
}
