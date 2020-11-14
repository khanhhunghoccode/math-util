/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.util;

/**
 *
 * @author PC
 */
public class MathUtility {
    //lam bo thu vien fake giong y chang Math
    //Math.PI, .abs(), .sqrt(), .pow(a,b) a*b
    //phàm là thư viện thì sẽ xài static khi ko cần lưu info cho riêng mình
    //còn thư viện mà vẫn cần lưu info riêng, thì vẫn non-static như bình thường

    public static final double PI = 3.1415;

    //tiện ích tính giai thừa n!=1.2.3...n
    //n phải là từ 0 trở lên
    //0!=1!=1
    //âm giai thừa vô nghĩa
    //giai thừa tăng cực nhanh, 21! long không chứa được
    //bài này sẽ chặn giai thừa từ 0..20
    //âm hoặc 21 trở lên không tính
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0...20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //viết else vô nghĩa, vì có return
        //mặc nhiên CPU đến được đây là hiểu rằng n=2...20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
