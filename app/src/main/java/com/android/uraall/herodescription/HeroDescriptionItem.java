package com.android.uraall.herodescription;

public class HeroDescriptionItem {


    //создаём необходимые переменные для описания
    private int imageResource;
    private String title;
    private String position;
    private String description;

    //добавляем в конструктор
    public HeroDescriptionItem(int imageResource, String title, String position,
                               String description) {
        this.imageResource = imageResource;
        this.title = title;
        this.position = position;
        this.description = description;
    }

    //создаём гетеры для обращения
    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }
}
