package classs;

public class Class {
    private int ClassNumber; // 私有变量，外部无法直接访问
    public void setClassNumber(int classNumber){
        this.ClassNumber = classNumber;
    }

    // getter 方法，用于获取 ClassNumber 的值
    public int getClassNumber(){
        return this.ClassNumber;
    }
}
