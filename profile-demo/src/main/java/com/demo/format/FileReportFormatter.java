package com.demo.format;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("file")
public class FileReportFormatter implements ReportFormatter{
    @Override
    public Report format(Report report) {
        System.out.println("FileReportFormatter::format()invoked");
        return report;
    }
}
