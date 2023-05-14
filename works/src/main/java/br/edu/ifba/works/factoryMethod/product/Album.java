package br.edu.ifba.works.factoryMethod.product;

public class Album extends Works {

    private String recordCompany;
    private String studio;
    private String author;
    private Double duration;

    public Album(){
        super();
    }
    public Album(String title, Integer year, Double score) {
        super(title, year, score);
    }

    public Album(String title, Integer year, Double score, String recordCompany, String studio, String author, Double duration) {
        super(title, year, score);
        this.recordCompany = recordCompany;
        this.studio = studio;
        this.author = author;
        this.duration = duration;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public void toJSON() {
        System.out.println(
                "{ \n" +
                        "\t Book { \n" +
                        "\t\t 'title': '" + super.getTitle() + "'\n" +
                        "\t\t 'year': '" + super.getYear() + "'\n" +
                        "\t\t 'score': '" + super.getScore() + "'\n" +
                        "\t\t 'recordCompany': '" + this.getRecordCompany() + "'\n" +
                        "\t\t 'studio': '" + this.getStudio() + "'\n" +
                        "\t\t 'author': '" + this.getAuthor() + "'\n" +
                        "\t\t 'duration': '" + this.getDuration() + "'\n" +
                        "\t}\n" +
                        '}'
        );
    }

    @Override
    public void toXML() {
        System.out.println(
                "<book title = " + super.getTitle() + " year = " + super.getYear() + ">\n" +
                        "\t<score>" + this.getScore() + "</score>\n" +
                        "\t<recordCompany>" + this.getRecordCompany() + "</recordCompany>\n" +
                        "\t<studio>" + this.getStudio() + "</studio>\n" +
                        "\t<author>" + this.getAuthor() + "</author>\n" +
                        "\t<duration>" + this.getDuration() + "</duration>\n" +
                        "</book>"
        );
    }

}
