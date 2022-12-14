package com.epam.edumanagementtimetabe.util;

public class EmailValidation {

    private static final String PATTERN_MAIL
            = "^([^!#$%&*+\\-/=?^_`{|\\.](?!.*[!#$%&*+-/=?^_`{|]{2})[a-zA-Z0-9!#$%&*+-/=?^_`{|]{0,50}[^!#$%&*+\\-/=?^_`{|\\.@]+)@([a-zA-Z0-9\\-]{1,50})\\.([a-z]{2,50})$";

    public static boolean validate(String email) {
        return email.matches(PATTERN_MAIL);
    }
}