package com.neoteric.november.november.webpageabstractinterfae;

public abstract class AngularSite implements Website{
    @Override
    public String header() {
        return "header";
    }



    @Override
    public String footer() {
        return "footer";
    }
   public abstract String body();

    public String page (){
       header();
       body();
       footer();
       return this.getClass().getName();

    }

}
