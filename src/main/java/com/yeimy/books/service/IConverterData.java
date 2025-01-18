package com.yeimy.books.service;

public interface IConverterData {
    <T> T getData(String json, Class<T> close);
}
