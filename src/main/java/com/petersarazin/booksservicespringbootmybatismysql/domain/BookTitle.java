package com.petersarazin.booksservicespringbootmybatismysql.domain;

public class BookTitle {
    private Integer bookTitleId;
    private String title;
    private String subtitle;
    private Integer volume;
    private String volumeTitle;

    public Integer getBookTitleId() {return this.bookTitleId;}
    public void setBookTitleId(Integer bookTitleId) {this.bookTitleId = bookTitleId;}

    public String getTitle() {return this.title;}
    public void setTitle(String title) {this.title = title;}

    public String getSubtitle() {return this.subtitle;}
    public void setSubtitle(String subtitle) {this.subtitle = subtitle;}

    public Integer getVolume() {return this.volume;}
    public void setVolume(Integer volume) {this.volume = volume;}

    public String getVolumeTitle() {return volumeTitle;}
    public void setVolumeTitle(String volumeTitle) {this.volumeTitle = volumeTitle;}
}
