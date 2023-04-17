package src.Laba2;

import javax.swing.*;

public class Info {
    private String name;
    private String nm;
    public Info(String name,String nm){
        this.name=name;
        this.nm=nm;
    }

    public Info(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNm() {
        return nm;
    }

    public void setAge(String nm) {
        this.nm = nm;
    }
}
