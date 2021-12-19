package vn.techmaster;

public class ClassGeneric <T> {
    public T obj;

    public ClassGeneric(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ClassGeneric{" +
                "obj=" + obj +
                '}';
    }
}
