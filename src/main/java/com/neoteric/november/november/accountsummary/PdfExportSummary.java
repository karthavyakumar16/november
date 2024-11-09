package com.neoteric.november.november.accountsummary;

public class PdfExportSummary implements ExportAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("export to pdf is done");
        return "data exported to pdf";
    }
}
