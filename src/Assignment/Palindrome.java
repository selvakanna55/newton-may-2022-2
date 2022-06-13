package Assignment;

public class Palindrome {
    static boolean check_Palindrome(String str,int s, int e) {

        if(s>str.length()/2){
            return true;
        }
        return str.charAt(s)==str.charAt(e) && check_Palindrome(str, s+1, e-1);

//     int n = str.length();
//     for(int i=0;i<(n/2);i++){
//         if(str.charAt(i)!=str.charAt(n-i-1)){
//             return false;
//         }
//     }
//     return true;
// //enter your code here

    //}

    }
}
