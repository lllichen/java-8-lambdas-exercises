package com.insightfullogic.java8.answers.chapter2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.text.DateFormatter;

import static java.lang.ThreadLocal.withInitial;
import static java.util.Arrays.asList;

public class Question2 {

     public final static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

}
