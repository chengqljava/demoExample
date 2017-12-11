package demo.example.designPatterns.creational.prototype;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException,
                                           ClassNotFoundException, IOException {
        Prototype1 prototype1 = new Prototype1();
        SerializableObject object = new SerializableObject();
        prototype1.setObj(object);
        prototype1.setStr("基本数据类型");
        object.setStr("引用对象字段");
        System.out
            .println("原对象:str" + prototype1.getStr() + "引用对象:str" + prototype1.getObj().getStr());
        //浅复制
        System.out.println("浅复制");
        Prototype1 simple = (Prototype1) prototype1.clone();
        System.out.println("原型对象复制对象引用地址：" + (prototype1 == simple));
        System.out.println("原型对象引用对象复制对象引用对象地址：" + (prototype1.getObj() == simple.getObj()));
        //深复制
        System.out.println("深复制");
        Prototype1 deep = (Prototype1) prototype1.deepClone();
        System.out.println("原型对象复制对象引用地址：" + (prototype1 == deep));
        System.out.println("原型对象引用对象复制对象引用对象地址：" + (prototype1.getObj() == deep.getObj()));
    }
}
