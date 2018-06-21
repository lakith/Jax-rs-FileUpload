package com.advance_jersey_app_3.app.jdbcConnection.models;

import java.util.ArrayList;

public class ErrorMessages {

    ArrayList<String> str;
    private int errorCode;
    private String errorDocumantation;

    public ErrorMessages(ArrayList<String> str, int errorCode, String errorDocumantation) {
        this.str = str;
        this.errorCode = errorCode;
        this.errorDocumantation = errorDocumantation;
    }

    public ErrorMessages() {
    }

    public ArrayList<String> getStr() {
        return str;
    }

    public void setStr(ArrayList<String> str) {
        this.str = str;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDocumantation() {
        return errorDocumantation;
    }

    public void setErrorDocumantation(String errorDocumantation) {
        this.errorDocumantation = errorDocumantation;
    }
}
