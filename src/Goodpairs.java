import java.util.Scanner;

public class Goodpairs {
    public int pairss(int pairs[],int sumvalue){
        int cnt=0;
        for(int i=0;i<pairs.length;i++){
            for (int j=i+1;j<pairs.length;j++){
                if(pairs[i]+pairs[j]==sumvalue)
                {
                    cnt++;
                }
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int pairs[]=new int[size];
        for(int i=0;i<size;i++){
            pairs[i]=scan.nextInt();

        }
        int sumvalue=scan.nextInt();
        Goodpairs pair=new Goodpairs();
        System.out.println(pair.pairss(pairs,sumvalue));

    }
}
