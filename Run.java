package classs;
import java.util.Random;

public class Run extends Student{
    public static void main(String[] args){
        Class[] ClassArr=new Class[2];//班级
        Group[] GroupArr=new Group[6];//小组
        Student[] StudentArr=new Student[12];//学生

        for(int i=0;i<2;i++){
            ClassArr[i]=new Class();
            ClassArr[i].setClassNumber(i+7);
        }
        for(int i=0;i<6;i++){
            GroupArr[i]=new Group();
            GroupArr[i].setGroupNumber(i+1);
        }
        for(int i=0;i<12;i++){
            StudentArr[i]=new Student();
            StudentArr[i].setId(i+1);
            StudentArr[i].setClassNumber(7+(i+1)%2);
            StudentArr[i].setGroupNumber(1+(i/2));
            //02468八班 13579七班

        }

        StudentArr[0].setName("休1");
        StudentArr[1].setName("休2");
        StudentArr[2].setName("休3");
        StudentArr[3].setName("休4");
        StudentArr[4].setName("休5");
        StudentArr[5].setName("休6");
        StudentArr[6].setName("休7");
        StudentArr[7].setName("休8");
        StudentArr[8].setName("休9");
        StudentArr[9].setName("休10");
        StudentArr[10].setName("休11");
        StudentArr[11].setName("休12");

        //抽小组
        Random rand=new Random();
        int group= rand.nextInt(6);
        System.out.println("抽取的小组为：");
        System.out.println(GroupArr[group].getGroupNumber());

        //随机抽小组中的学生
        Random rand5=new Random();
        int groups= rand.nextInt(6);
        System.out.println("抽取的小组为：");
        System.out.println(GroupArr[groups].getGroupNumber());
        Random rand2=new Random();
        int student= rand.nextInt(2);
        System.out.println("抽取的学生为：");
        System.out.println(StudentArr[groups*2+student].getName());

        //随机抽取全班的学生
        Random rand3=new Random();
        int clas=rand.nextInt(2);
        System.out.println("抽取的班级为：");
        System.out.println(ClassArr[clas].getClassNumber());
        Random rand4=new Random();
        int student2= rand.nextInt(6);
        System.out.println("抽取的学生为：");
        System.out.println(StudentArr[(clas%2)+2*(student2)].getName());
    }
}
