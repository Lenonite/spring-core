package com.demo;

import com.demo.format.DbReportFormatter;
import com.demo.format.FileReportFormatter;
import com.demo.format.ReportFormatter;
import com.demo.print.DbReportPrinter;
import com.demo.print.FileReportPrinter;
import com.demo.print.ReportPrinter;
import com.demo.repository.DbRepository;
import com.demo.repository.FileReportRepository;
import com.demo.repository.ReportRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ComponentScan
@Configuration
public class AppConfig {
    @Bean
    @Profile("file")
    public ReportRepository filereportRepository() {
        return new FileReportRepository();
    }

    @Bean
    @Profile("db")
    public ReportRepository dbreportReporsitory() {
        return new DbRepository();
    }

    @Bean
    @Profile("file")
    public ReportPrinter filereportprinter() {
        return new FileReportPrinter();
    }

    @Bean
    @Profile("db")
    public ReportPrinter dbreportprinter() {
        return new DbReportPrinter();

    }

    @Bean
    @Profile("file")
    public ReportFormatter filereportformatter() {
        return new FileReportFormatter();
    }

    @Bean
    @Profile("db")
    public ReportFormatter dbreportformatter() {
        return new DbReportFormatter();

    }
}