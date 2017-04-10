/**
 * Created by William Yu on 4/5/2017.
 */
public class Pyd2 {
    public static void main(String []args){

        int pydValue=5;

        int pydCountValue=pydValue-1;
        int c2=0;
        int count = 1;


        while (count<=pydValue) {
            for (int c = 0; c < pydCountValue; ++c) {
                System.out.print(" ");
            }
            while (c2 < count*2-1) {
                System.out.print("*");
                c2++;
            }
            c2=0;
            pydCountValue-=1;
            System.out.println();
            count++;
        }
        count=1;
        while (count<pydValue){
            for (int c=0; c<count;++c) {
                System.out.print(" ");
            }
            for(int c=0;c<2*(pydValue-count)-1;c++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }


       /* while ((oddCount-2)>1){
            while (c2 <(pydCountValue+2)){
                System.out.print(" ");
                c2++;
            }
            c2=0;
            while (c2<(oddCount-4)) {
                System.out.print("*");
                c2++;
            }
            pydCountValue +=1;
            oddCount-=2;
            c2=0;
            System.out.println();
        }*/
    }
}
