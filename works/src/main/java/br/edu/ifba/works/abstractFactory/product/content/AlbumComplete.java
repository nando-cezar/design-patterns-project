package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.factoryMethod.product.Album;
import br.edu.ifba.works.factoryMethod.product.Works;

public class AlbumComplete implements ContentModel {

    private String title;
    private String author;
    private Integer year;
    private String recordCompany;
    private String studio;
    private Double score;
    private Double duration;
    public AlbumComplete() {
        super();
    }

    public AlbumComplete(Works works) {
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

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String buildingContent() {
        return "<!--" + this.getTitle() + "-->\n" +
                "<bold>" + this.getTitle() + "</bold>\n" +
                "<italic>" + this.getAuthor() + " " + this.getYear() + "</italic>\n" +
                "Record Company: " + this.getRecordCompany() +
                "Duration: " + this.getDuration() +
                "Score: " + this.getScore() + "\n";
    }
}
