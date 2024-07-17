package com.example.journaldev.tb2_moprog.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}