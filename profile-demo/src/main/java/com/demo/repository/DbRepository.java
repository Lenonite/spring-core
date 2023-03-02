package com.demo.repository;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("db")
public class DbRepository implements ReportRepository {
    @Override
    public Report save(Report report) {
        System.out.println("DbRepository  ::save() invoked");
        return report;
    }
}
