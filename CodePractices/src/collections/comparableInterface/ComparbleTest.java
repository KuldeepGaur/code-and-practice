package collections.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by AMIT on 17-07-2016.
 */
public class ComparbleTest implements Comparator<StudentInfo>{

    String compareOn=null;
    public ComparbleTest(String compareOn) {
        this.compareOn=compareOn;
    }

    public static void main(String[] args) {


        ArrayList <StudentInfo> studentInfos =new ArrayList<>();

        studentInfos.add(0,new StudentInfo(44,11));
        studentInfos.add(1,new StudentInfo(33,22));
        studentInfos.add(2,new StudentInfo(22,33));
        studentInfos.add(3,new StudentInfo(11,44));


        System.out.println(studentInfos.toString());
        Collections.sort(studentInfos,new ComparbleTest("rollNo"));
        System.out.println(studentInfos.toString());
        Collections.sort(studentInfos,new ComparbleTest("marks"));
        System.out.println(studentInfos.toString());
    }

    public int compare(StudentInfo studentInfo1,StudentInfo studentInfo2){
        if("rollNo".equals(this.compareOn)){
            if(studentInfo1!=null && studentInfo2!=null){
                if(studentInfo1.rollNo==studentInfo2.rollNo)
                    return 0;

                return  studentInfo1.rollNo-studentInfo2.rollNo;
            }
        }
        else if("marks".equals(this.compareOn)){
            if(studentInfo1!=null && studentInfo2!=null){
                if(studentInfo1.marks==studentInfo2.marks)
                    return 0;

                return  studentInfo1.marks-studentInfo2.marks;
            }
        }

        return 0;
    }
}
