package br.edu.ifba.works.abstractFactory.product.content;

public class SummedUp implements ContentModel {
    private String title;
    private String author;
    private Integer year;

    public SummedUp(){}

    public SummedUp(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
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


    @Override
    public String buildingContent() {
        return "<!--" + this.getTitle() + "-->\n" +
                "<bold>" + this.getTitle() + "</bold>\n" +
                "<italic>" + this.getAuthor() + " " + this.getYear() + "</italic>\n";
    }
}
