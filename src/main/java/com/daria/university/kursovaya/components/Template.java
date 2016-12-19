package com.daria.university.kursovaya.components;


public class Template {
    private String psdTemplate;
    private StringBuilder code;

    public Template(){
        code = new StringBuilder();
    }

    public String getCode() {
        return code.toString();
    }

    public void setCode(StringBuilder code) {
        this.code = code;
    }

    public void addCode(String input){
        code.append(input + '\n');
    }

    public void setPsdTemplate(String psdTemplate) {
        this.psdTemplate = psdTemplate;
        if (psdTemplate!=null)
            System.out.println("Site template was created. Got file: " + this.psdTemplate);
    }

    public void clearCode(){
        code.setLength(0);
    }

    public String getPsdTemplate() {
        return psdTemplate;
    }
}
