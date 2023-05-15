package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.factoryMethod.product.Book;
import br.edu.ifba.works.factoryMethod.product.Works;

public class BookLatexComplete extends Markdown implements ContentModel {

    private String publishingCompany;
    private Integer pageNumbers;
    private Double score;
    public BookLatexComplete() {}

    public BookLatexComplete(Works works) {
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
        return "% " + this.getTitle() + "\n" +
                "\"textbf {" + this.getTitle() + "}\n" +
                "\"emph {" + this.getAuthor() + " (" + this.getYear() + ") }\n" +
                "Publishing Company: " + this.getPublishingCompany() + "\n" +
                "Page numbers: " + this.getPageNumbers() + "\n" +
                "Score: " + this.getScore() + "\n";
    }
}
