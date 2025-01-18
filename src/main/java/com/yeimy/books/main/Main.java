package com.yeimy.books.main;
import com.yeimy.books.model.Data;
import com.yeimy.books.service.ConverterData;
import com.yeimy.books.service.UseApi;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private UseApi useapi = new UseApi();
    private ConverterData converterData = new ConverterData();

    public void showMenu(){
        var json = useapi.getInformation(URL_BASE);

        var data = converterData.getData(json, Data.class);
        System.out.println(data);        
    }

}
