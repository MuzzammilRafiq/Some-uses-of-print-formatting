import java.util.Scanner;
public class AnagramString {
    static boolean isAnagram(String a, String b) {
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
       char A[]= a1.toCharArray();
       char B[]= b1.toCharArray();

       if (a.length() == b.length() ) {
         char t1,t2;
         for(int i=0;i<a1.length()-1;i++){
          for(int j=0;j<a1.length()-1;j++){
              if(A[j] > A[j+1]){   // use < for Descending order
                 t1 = A[j+1];
                 A[j+1] = A[j];
                 A[j]=t1;
                }
            }
        }
        for(int i=0;i<b1.length()-1;i++){
            for(int j=0;j<b1.length()-1;j++){
                if(B[j] > B[j+1]){   // use < for Descending order
                   t2 = B[j+1];
                   B[j+1] = B[j];
                   B[j]=t2;
                  }
              }
          }
          String A1= new String(A);
          String B1= new String(B);
        if(A1.equalsIgnoreCase(B1)) {
            return true;
        } else {
             return false;
        }
       } else {
           return false;
       }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
