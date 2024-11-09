package com.neoteric.november.november.accountsummary;

public class ExcelExportSummary implements ExportAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("export to excel is done");
        return "data exported to excel";
    }
        public void test(){


    }
}
