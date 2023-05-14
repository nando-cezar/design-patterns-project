package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookHtmlComplete implements ContentModel {

    private String title;
    private String author;
    private Integer year;
    private String publishingCompany;
    private Integer pageNumbers;
    private Double score;
    public BookHtmlComplete() {}

    public BookHtmlComplete(Works works) {
        var book = (Book) works;
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.year = book.getYear();
        this.publishingCompany = book.getPublishingCompany();
        this.pageNumbers = book.getPageNumbers();
        this.score = book.getScore();
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
                "Publishing Company: " + this.getPublishingCompany() + "\n" +
                "Page numbers: " + this.getPageNumbers() + "\n" +
                "Score: " + this.getScore() + "\n";
    }
}
