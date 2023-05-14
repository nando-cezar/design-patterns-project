package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.factoryMethod.product.Works;

public class HtmlSummedUp implements ContentModel {
    private String title;
    private String author;
    private Integer year;

    public HtmlSummedUp(){}

    public HtmlSummedUp(Works works) {
        this.title = works.getTitle();
        this.author = null;
        this.year = works.getYear();
    }

    public String getTitle() {
        return title;
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

    @Override
    public String buildingContent() {
        return "<!--" + this.getTitle() + "-->\n" +
                "<bold>" + this.getTitle() + "</bold>\n" +
                "<italic>" + this.getAuthor() + " " + this.getYear() + "</italic>\n";
    }
}
