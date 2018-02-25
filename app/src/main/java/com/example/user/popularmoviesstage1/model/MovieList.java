package com.example.user.popularmoviesstage1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Andris on 024 24.02.18.
 */

public class MovieList {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("results")
    @Expose
    private List<Movie> movies = null;

    public MovieList(Integer page, Integer totalResults, Integer totalPages, List<Movie> movies) {
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
        this.movies = movies;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<Movie> getResults() {
        return movies;
    }

    public void setResults(List<Movie> movies) {
        this.movies = movies;
    }


}
