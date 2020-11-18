
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
public class Main {

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
//Mình muốn kết luận hàm ngon, mình phải test các trường hợp xài hàm
//trường hợp 5! 0! -5! 21! 20! ...
//mình phải thiết kế các test case (tình huống test) để sau đó mình verify
//giữa giá trị trả về của hàm (actual) có khớp với expected cái mình dự đoán
//hàm chạy phải trả về
//và nếu mọi thứ khớp, tức là actual == expected, mình mới dám gáy: hàm ngon
//cách này có nhược điểm: nhìn bằng mắt và so sánh kết quả của từng case
//
//cách này ổn, nhưng tiềm ẩn sai sót do nhìn bằng mắt hiều case

//cách nâng cao:
//cũng nhìn bằng mắt, nhưng chỉ nhìn hai màu xanh đỏ cho một test case
//có nghĩa: nếu bạn xài hàm với 100 tham số, chạy hàm 100 tình huống khác nhau
//bạn chỉ cần nhìn duy nhất hai màu xanh, đỏ
//xanh: code ổn cho mọi test case, mọi tình huống gọi hàm
//đỏ: mọi case màu xanh mà có một thằng đỏ, kết luận cả đám đỏ
//hàm dùng cho 99 trường hợp, expected = actual cho 99% tình huống
//chỉ có 1 tình huống sai, ko khớp, kết luận luôn hàm ko ổn định
//ai dám xài khi ko ổn định, ổn định và chính xác phải cho mọi trường hợp
//chỉ cần ít nhất một cái không ổn định, đỏ cả đám để đảm bảo rằng hàm phải
//chính xác mọi tình huống

//muốn phải được điều này, cần sự phụ giúp của các thư viện bên ngoài jdk, gọi
//là unit test framework
//các bộ unit test nổi tiếng: JUnit, TestNG, NUnit,