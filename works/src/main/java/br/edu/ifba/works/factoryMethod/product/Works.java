package br.edu.ifba.works.factoryMethod.product;

public abstract class Works {

    private String title;
    private Integer year;
    private Double score;

    public Works() {}

    public Works(String title, Integer year, Double score) {
        this.title = title;
        this.year = year;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public abstract void toJSON();
    public abstract void toXML();
}
