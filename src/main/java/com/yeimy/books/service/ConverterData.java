package com.yeimy.books.service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterData implements IConverterData{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> close) {
        try {
            return objectMapper.readValue(json, close);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
