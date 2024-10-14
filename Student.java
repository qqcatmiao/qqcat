package classs;

public class Student extends Group{
    private String name;
    private int Id;
    public void setId(int id){
        this.Id=id;
    }
    public int getId(){
        return Id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
