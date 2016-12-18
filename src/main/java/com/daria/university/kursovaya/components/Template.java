package com.daria.university.kursovaya.components;


public class Template {
    private String psdTemplate;
    private String html;
    private String css;
    private String js;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public void setPsdTemplate(String psdTemplate) {
        this.psdTemplate = psdTemplate;
        System.out.println("Site template was created. Got file: " + this.psdTemplate);
    }
}
