package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.factoryMethod.product.Album;
import br.edu.ifba.works.factoryMethod.product.Works;

public class AlbumHtmlComplete implements ContentModel {

    private String title;
    private String author;
    private Integer year;
    private String recordCompany;
    private String studio;
    private Double score;
    private Double duration;
    public AlbumHtmlComplete() {}

    public AlbumHtmlComplete(Works works) {
        var album = (Album) works;
        this.title = album.getTitle();
        this.author = album.getAuthor();
        this.year = album.getYear();
        this.recordCompany = album.getRecordCompany();
        this.studio = album.getStudio();
        this.score = album.getScore();
        this.duration = album.getDuration();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public String getStudio() {
        return studio;
    }

    public Double getScore() {
        return score;
    }

    public Double getDuration() {
        return duration;
    }

    @Override
    public String buildingContent() {
        return "<!--" + this.getTitle() + "-->\n" +
                "<bold>" + this.getTitle() + "</bold>\n" +
                "<italic>" + this.getAuthor() + " " + this.getYear() + "</italic>\n" +
                "Record Company: " + this.getRecordCompany() + "\n" +
                "Duration: " + this.getDuration() + "\n" +
                "Score: " + this.getScore() + "\n";
    }
}
