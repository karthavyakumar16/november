package com.neoteric.november.november.accountsummary;

public class PolymorphismWithInterfaceTest {
  public static void main(String[] args){
      ExportAccountSummary excelAccountSummary=new ExcelExportSummary();
    excelAccountSummary.export(new AccountSummary());
    ExportAccountSummary pdfExportsummary=new PdfExportSummary();
    pdfExportsummary.export(new AccountSummary());
  }
}
