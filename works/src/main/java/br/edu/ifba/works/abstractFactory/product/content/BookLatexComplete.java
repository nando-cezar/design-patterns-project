package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookLatexComplete implements ContentModel {

    private String title;
    private String author;
    private Integer year;
    private String publishingCompany;
    private Integer pageNumbers;
    private Double score;
    public BookLatexComplete() {}

    public BookLatexComplete(Works works) {
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
        return "% " + this.getTitle() + "\n" +
                "\"textbf {" + this.getTitle() + "}\n" +
                "\"emph {" + this.getAuthor() + " (" + this.getYear() + ") }\n" +
                "Publishing Company: " + this.getPublishingCompany() + "\n" +
                "Page numbers: " + this.getPageNumbers() + "\n" +
                "Score: " + this.getScore() + "\n";
    }
}
