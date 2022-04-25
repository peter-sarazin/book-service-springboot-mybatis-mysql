package com.petersarazin.booksservicespringbootmybatismysql.domain;

public class Publisher {
    private Integer publisherId;
    private String publisherName;
    private String url;

    public Integer getPublisherId() {return publisherId;}
    public void setPublisherId(Integer publisherId) {this.publisherId = publisherId;}

    public String getPublisherName() {return publisherName;}
    public void setPublisherName(String publisherName) {this.publisherName = publisherName;}

    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}
}
