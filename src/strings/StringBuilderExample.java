package strings;

public class StringBuilderExample {
    public static String reverseString(String val1){
        //replace abc -> cba
        StringBuilder sb = new StringBuilder(val1);
        sb.reverse();
        String result = sb.toString();
        return result;
    }
    public static void main(String[] args) {
        //mutate/modify -> stirng
//        StringBuilder sb = new StringBuilder();
//        sb.append("abcd"); //add at the end
//        System.out.println(sb);
//        sb.replace(2,4,"e");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        sb.append(10); // string "10"
//        System.out.println(sb);
//        sb.insert(2,"Newton");
//        System.out.println(sb);
//        sb.delete(0, 2);
//        System.out.println(sb);
//        String s = sb.toString();
//        System.out.println(s);
        String name = "mnop";
        char arr[] = name.toCharArray(); //[m, n, o, p]
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String ans = reverseString(name);
        System.out.println(ans);



    }
}
