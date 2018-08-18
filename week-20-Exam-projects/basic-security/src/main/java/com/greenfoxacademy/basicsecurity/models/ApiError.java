package com.greenfoxacademy.basicsecurity.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ApiError {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;
    private String error;
    private String message;
    private String path;
    private String status;

    public ApiError() {
    }

    public ApiError(String error, String message, String path, String status) {
        this.error = error;
        this.message = message;
        this.path = path;
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return timestamp.toString() + "\r\n" +
                error + "\r\n" +
                message + "\r\n" +
                path + "\r\n" +
                status + "\r\n";
    }
}
