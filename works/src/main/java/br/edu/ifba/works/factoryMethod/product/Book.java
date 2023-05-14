package br.edu.ifba.works.factoryMethod.product;

public class Book extends Works {

    private String publishingCompany;
    private String language;
    private String author;
    private Integer pageNumbers;

    public Book(){
        super();
    }
    public Book(String title, Integer year, Double score) {
        super(title, year, score);
    }

    public Book(String title, Integer year, Double score, String publishingCompany, String language, String author, Integer pageNumbers) {
        super(title, year, score);
        this.publishingCompany = publishingCompany;
        this.language = language;
        this.author = author;
        this.pageNumbers = pageNumbers;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    @Override
    public void toJSON() {
        System.out.println(
                "{ \n" +
                "\t Book { \n" +
                        "\t\t 'title': '" + super.getTitle() + "'\n" +
                        "\t\t 'year': '" + super.getYear() + "'\n" +
                        "\t\t 'score': '" + super.getScore() + "'\n" +
                        "\t\t 'publishingCompany': '" + this.getPublishingCompany() + "'\n" +
                        "\t\t 'language': '" + this.getLanguage() + "'\n" +
                        "\t\t 'author': '" + this.getAuthor() + "'\n" +
                        "\t\t 'pageNumbers': '" + this.getPageNumbers() + "'\n" +
                    "\t}\n" +
                '}'
        );
    }

    @Override
    public void toXML() {
        System.out.println(
                "<book title = " + super.getTitle() + " year = " + super.getYear() + ">\n" +
                    "\t<score>" + 4.6 + "</score>\n" +
                    "\t<publishingCompany>" + publishingCompany + "</publishingCompany>\n" +
                    "\t<language>" + language + "</language>\n" +
                    "\t<author>" + author + "</author>\n" +
                    "\t<pageNumbers>" + pageNumbers + "</pageNumbers>\n" +
                "</book>"
        );
    }


}
