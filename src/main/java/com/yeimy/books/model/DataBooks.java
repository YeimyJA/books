package com.yeimy.books.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBooks(String title, List<DataAuthors> authors, List<String> languages, Double numberDownloads) {
    

}
