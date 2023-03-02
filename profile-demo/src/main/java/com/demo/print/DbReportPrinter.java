package com.demo.print;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("db")
public class DbReportPrinter implements ReportPrinter{
    @Override
    public void print(Report report) {

        System.out.println("DbReportPrinter::print() invoked");
    }
}
