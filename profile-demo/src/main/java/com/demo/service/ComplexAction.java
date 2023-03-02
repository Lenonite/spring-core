package com.demo.service;

import com.demo.ds.Report;
import com.demo.format.ReportFormatter;
import com.demo.print.ReportPrinter;
import com.demo.repository.ReportRepository;
import org.springframework.stereotype.Service;

@Service
public class ComplexAction {
    private final ReportRepository repository;
    private final ReportPrinter printer;
    private final ReportFormatter formatter;

    public ComplexAction(ReportRepository repository, ReportPrinter printer, ReportFormatter formatter) {
        this.repository = repository;
        this.printer = printer;
        this.formatter = formatter;
    }

    public void reportAction() {
        printer.print(repository.save(formatter.format(new Report())));

    }
}
