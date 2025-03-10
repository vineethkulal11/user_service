package com.vineeth.payload.response;

import java.time.LocalDateTime;

public class ExceptionResponse {
    private String message;
    private String error;
    private LocalDateTime timeStamp;

    public ExceptionResponse(){

    }
    public ExceptionResponse(String message, String error, LocalDateTime timeStamp) {
        this.message = message;
        this.error = error;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
