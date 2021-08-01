import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
           String s = sc.next();
           s.toLowerCase();
           ArrayList<Integer> ar = new ArrayList<>();
           for(int i=0;i<s.length();i++){
               char ch = s.charAt(i);
               if(ch == 'a')
                    ar.add(1);
                if(ch == 'e')
                     ar.add(2);
                if(ch == 'i')
                    ar.add(3);
                if(ch == 'o')
                    ar.add(4);
                if(ch == 'u')
                    ar.add(5);
           }
            //   for (int i = 0; i < ar.size(); i++)
            // System.out.print(ar.get(i) + " ");
            
            //  System.out.println();
              int g = 0 ,w=0; 
              for (int i = 0; i < ar.size()-1; i++){
                    if(ar.get(i) <= ar.get(i+1))
                        g++;
              }
               
              for (int i = 0; i < ar.size()-1; i++){
                    if(ar.get(i) >= ar.get(i+1))
                        w++;
              }
             if(ar.size()== 0 || ar.size() == 1){
                   System.out.println("Good");
              }
              else{
                if(g == ar.size()-1)
                  System.out.println("Good");    
               else if(w == ar.size()-1)
                  System.out.println("Worst");
                 
                else
                    System.out.println("Bad");
              }
               
              
        }

    }
}

