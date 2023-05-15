package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookHtmlComplete extends Markdown implements ContentModel {

    private String publishingCompany;
    private Integer pageNumbers;
    private Double score;
    public BookHtmlComplete() {}

    public BookHtmlComplete(Works works) {
        super(works);
        var book = (Book) works;
        this.publishingCompany = book.getPublishingCompany();
        this.pageNumbers = book.getPageNumbers();
        this.score = book.getScore();
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
