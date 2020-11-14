
import hung.util.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class MathUtilTest {

    public static void main(String[] args) {
        long expected = 120;
        //hy vong=120 neu goi 5!
        long actual = MathUtility.getFactorial(5);
        //in ra kiem tra su khop nhau giua cai ta muon va cai ta lam
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);
        //tiep tuc cho cac tinh huong test can phai test ta goi la test cases, vd 6!, 7!,...
        //ve ly thuyet ta phai test het ca tinh huong
        //ve thuc hanh ky 5 se hoc mon SWT301
        System.out.println("6! expected 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0! expected 1, actual: " + MathUtility.getFactorial(0));
        //ky vong nem ve ngoai le ma phai la ngoai le IllegalArguementException
        //neu user co tinh dua tham so <0 hoac >20
        System.out.println("expected IllegalArguementException, actual: " + MathUtility.getFactorial(21));
        System.out.println("Them dong code moi");
    }
    
}
