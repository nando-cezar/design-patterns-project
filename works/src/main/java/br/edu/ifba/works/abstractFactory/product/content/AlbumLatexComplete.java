package br.edu.ifba.works.abstractFactory.product.content;

import br.edu.ifba.works.abstractFactory.product.Markdown;
import br.edu.ifba.works.factoryMethod.product.Album;
import br.edu.ifba.works.factoryMethod.product.Works;

public class AlbumLatexComplete extends Markdown implements ContentModel {

    private String recordCompany;
    private String studio;
    private Double score;
    private Double duration;
    public AlbumLatexComplete() {}

    public AlbumLatexComplete(Works works) {
        super(works);
        var album = (Album) works;
        this.recordCompany = album.getRecordCompany();
        this.studio = album.getStudio();
        this.score = album.getScore();
        this.duration = album.getDuration();
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
        return "% " + this.getTitle() + "\n" +
                "\"textbf {" + this.getTitle() + "}\n" +
                "\"emph {" + this.getAuthor() + " (" + this.getYear() + ") }\n" +
                "Record Company: " + this.getRecordCompany() + "\n" +
                "Duration: " + this.getDuration() + "\n" +
                "Score: " + this.getScore() + "\n";
    }
}
