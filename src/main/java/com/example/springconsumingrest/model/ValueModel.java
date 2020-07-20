package com.example.springconsumingrest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueModel {
    private Long id;
    private String quote;

    public ValueModel() {
    }

    public ValueModel(Long id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "ValueModel{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
