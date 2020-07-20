package com.example.springconsumingrest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteModel {
    private String type;
    private ValueModel value;

    public QuoteModel() {

    }

    public QuoteModel(String type, ValueModel value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ValueModel getValue() {
        return value;
    }

    public void setValue(ValueModel value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "QuoteModel{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
