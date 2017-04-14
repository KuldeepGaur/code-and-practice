package collections.comparableInterface;

/**
 * Created by AMIT on 17-07-2016.
 */
public class StudentInfo implements Comparable{
    int rollNo=0;
    int marks=0;

    @Override
    public String toString() {
        return "Hi the rollNo of student is "+this.rollNo+"";
    }

    public StudentInfo(int rollNo) {
        this.rollNo = rollNo;
    }

    public StudentInfo(int marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object studentInfo) {
        if(studentInfo!=null && studentInfo instanceof StudentInfo){
            if(this.rollNo==((StudentInfo)studentInfo).rollNo)
                return 0;

            return  this.rollNo-((StudentInfo)studentInfo).rollNo;
        }
        return 0;
    }
}
