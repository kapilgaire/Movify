package com.example.movify.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName("id")
    private int id;

    @SerializedName("url")
    private String url;

    @SerializedName("imbd_code")
    private String imbd_code;

    @SerializedName("title")
    private String title;

    @SerializedName("title_english")
    private String title_english;


    @SerializedName("title_long")
    private String title_long;

    @SerializedName("slug")
    private String slug;

    @SerializedName("year")
    private Integer year;

    @SerializedName("rating")
    private Double rating;

    @SerializedName("runtime")
    private Integer runtime;

    @SerializedName("genre")
    private List<String> genre = new ArrayList<String>();

    @SerializedName("summary")
    private String summary;

    @SerializedName("description_full")
    private String description_full;

    @SerializedName("synopsis")
    private String synopsis;

    @SerializedName("yt_trailer_code")
    private String yt_trailer_code;


    @SerializedName("language")
    private String language;

    @SerializedName("mpa_rating")
    private String mpa_rating;

    @SerializedName("background_image")
    private String background_image;

    @SerializedName("background_image_original")
    private String background_image_original;

    @SerializedName("small_cover_image")
    private String small_cover_image;

    @SerializedName("medium_cover_image")
    private String medium_cover_image;

    @SerializedName("large_cover_image")
    private String large_cover_image;

    @SerializedName("state")
    private String state;

    @SerializedName("torrents")
    private List<MovieTorrents> torrentsList = new ArrayList<MovieTorrents>();

    @SerializedName("date_uploaded")
    private String date_uploaded;

    @SerializedName("date_uploaded_unix")
    private String date_uploaded_unix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImbd_code() {
        return imbd_code;
    }

    public void setImbd_code(String imbd_code) {
        this.imbd_code = imbd_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public void setTitle_english(String title_english) {
        this.title_english = title_english;
    }

    public String getTitle_long() {
        return title_long;
    }

    public void setTitle_long(String title_long) {
        this.title_long = title_long;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription_full() {
        return description_full;
    }

    public void setDescription_full(String description_full) {
        this.description_full = description_full;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getYt_trailer_code() {
        return yt_trailer_code;
    }

    public void setYt_trailer_code(String yt_trailer_code) {
        this.yt_trailer_code = yt_trailer_code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMpa_rating() {
        return mpa_rating;
    }

    public void setMpa_rating(String mpa_rating) {
        this.mpa_rating = mpa_rating;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public String getBackground_image_original() {
        return background_image_original;
    }

    public void setBackground_image_original(String background_image_original) {
        this.background_image_original = background_image_original;
    }

    public String getSmall_cover_image() {
        return small_cover_image;
    }

    public void setSmall_cover_image(String small_cover_image) {
        this.small_cover_image = small_cover_image;
    }

    public String getMedium_cover_image() {
        return medium_cover_image;
    }

    public void setMedium_cover_image(String medium_cover_image) {
        this.medium_cover_image = medium_cover_image;
    }

    public String getLarge_cover_image() {
        return large_cover_image;
    }

    public void setLarge_cover_image(String large_cover_image) {
        this.large_cover_image = large_cover_image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<MovieTorrents> getTorrentsList() {
        return torrentsList;
    }

    public void setTorrentsList(List<MovieTorrents> torrentsList) {
        this.torrentsList = torrentsList;
    }

    public String getDate_uploaded() {
        return date_uploaded;
    }

    public void setDate_uploaded(String date_uploaded) {
        this.date_uploaded = date_uploaded;
    }

    public String getDate_uploaded_unix() {
        return date_uploaded_unix;
    }

    public void setDate_uploaded_unix(String date_uploaded_unix) {
        this.date_uploaded_unix = date_uploaded_unix;
    }
}
