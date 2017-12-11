package demo.example.designPatterns.creational.prototype;

import java.io.Serializable;

public class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}