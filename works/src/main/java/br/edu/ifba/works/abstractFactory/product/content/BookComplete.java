package br.edu.ifba.works.abstractFactory.product.content;

public class BookComplete implements ContentModel {

    private String title;
    private String author;
    private Integer year;
    private String publishingCompany;
    private Integer pageNumbers;
    private Double score;
    public BookComplete() {
        super();
    }

    public BookComplete(String title, String author, Integer year, String publishingCompany, Integer pageNumbers, Double score) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publishingCompany = publishingCompany;
        this.pageNumbers = pageNumbers;
        this.score = score;
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

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public void setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public Double getScore() {
        return score;
    }

    public Integer getPageNumbers() {
        return pageNumbers;
    }

    @Override
    public String buildingContent() {
        return "<!--" + this.getTitle() + "-->\n" +
                "<bold>" + this.getTitle() + "</bold>\n" +
                "<italic>" + this.getAuthor() + " " + this.getYear() + "</italic>\n" +
                "Publishing Company: " + this.getPublishingCompany() +
                "Page numbers: " + this.getPageNumbers() +
                "Score: " + this.getScore() + "\n";
    }
}
