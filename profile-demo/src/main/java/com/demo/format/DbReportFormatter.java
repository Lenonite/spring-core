package com.demo.format;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("db")
public class DbReportFormatter implements ReportFormatter{
    @Override
    public Report format(Report report) {
        System.out.println("DbReportFormatter::format()invoked");
        return report;
    }
}
