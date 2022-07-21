package br.com.io.github.grochase.application.enums;

public enum Canal {
    MOBILE("01"),
    FRONT_REACT("02"),
    FRONT_ANGULAR("03"),
    CLIENT_API("04");

    private String value;

    Canal(String value) {
        this.value = value;
    }

    private Integer getIntValue(){
        return Integer.valueOf(value);
    }
}
