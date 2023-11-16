import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double nrfaktor=1,nfaktor=1 ,rfaktor=1, n, r, netice;

        System.out.print("Lütfen küme eleman sayısını giriniz: ");
        n = scn.nextDouble();

        System.out.print("Lütfen oluşturulacak r elemanlı farklı grupların sayısını giriniz: ");
        r = scn.nextDouble();

        for (double i=1; i<=n; i++){

            nfaktor=nfaktor*i;
        }
        for (double j=1; j<=r; j++){

            rfaktor=rfaktor*j;
        }
        for (double k=1; k<=(n-r); k++){

            nrfaktor=nrfaktor*k;
        }

        netice=nfaktor/(rfaktor*nrfaktor);

        System.out.print("Sonuç: "+ netice);

    }
}