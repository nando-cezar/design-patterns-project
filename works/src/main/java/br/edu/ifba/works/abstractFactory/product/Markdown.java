package br.edu.ifba.works.abstractFactory.product;

import br.edu.ifba.works.factoryMethod.product.Works;

public class Markdown {

    private String title;
    private String author;
    private Integer year;

    public Markdown(){}

    public Markdown(Works works) {
        this.title = works.getTitle();
        this.author = null;
        this.year = works.getYear();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
