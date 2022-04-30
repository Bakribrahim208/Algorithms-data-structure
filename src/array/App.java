package array;
public class App {

    //reverse String 
    public static void main(String[] args) {
        char[] s ="Ahmed".toCharArray();
       int start =0;
       int end =s.length-1;
       while(start<end){
           //swap char  using temp varible
           char  temp  = s[start];
           s[start] = s[end];
           s[end] = temp;
           start++;
           end--;
       }
    System.out.println(String.valueOf(s));
    }
}
