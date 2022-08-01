package com.core.java.dell;

public class AnswerValue {

    private String optionValue;
    private String stringValue;

    public AnswerValue(String optionValue, String stringValue) {
        this.optionValue = optionValue;
        this.stringValue = stringValue;
    }


    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }


    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }
}
