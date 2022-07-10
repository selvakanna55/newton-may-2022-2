package oops;

class CollegeStudent{
    int rollNo;
    String name;
    CollegeStudent(int studrollNo, String studName){
        rollNo = studrollNo;
        name = studName;
    }

}
public class ArrayOfObects {
    public static void main(String[] args) {
        CollegeStudent st1 = new CollegeStudent(10, "ab");
        CollegeStudent st2 = new CollegeStudent(11, "abc");

        CollegeStudent arr[] = new CollegeStudent[4];
        arr[0] = st1;
        arr[1] = st2;

    }
    static  int[] f(){
        int arr[] = {1, 2, 3, 4};
        return arr;
    }
}
