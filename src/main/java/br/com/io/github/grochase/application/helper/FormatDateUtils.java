package br.com.io.github.grochase.application.helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDateUtils {

    FormatDateUtils(){

    }

    public static String formatDateDDMMYYYY(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
