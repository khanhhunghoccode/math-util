/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.util.test;

import static hung.util.MathUtility.*;
//chỉ có từ JDK 5 ?, hàm static gọi mà không cần tên class chấm do mình đã chơi
//trò khai báo sẵn tên class và tên hàm static qua lệnh import static
//sau này xài hàm static của class này không cần tên class chấm, xài như C
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {

    //viết ra những tình huống xài hàm getFactorial() và kiểm tra xem actual có
    //bằng expected hay không. như truyền thống bên main(), nhưng ở đây xịn xò
    //hơn, show ra màu xanh đỏ.
    //ngoài ra, nó còn dùng cho việc CI - Continuos Integration
    //                               CD - Continuos Delivery
    //                               CT - Continuos Regression Test
    //                               DevOps - Development & Operation
    //ngoài doanh nghiệp đang xài
    //app liên tục được kiểm tra chất lượng code, build ra file .jar .war
    //đẩy lên 1 server trung gian - STAGING ENVIRONMENT để cho nhóm test sẵn
    //sàng test kĩ
    //sau đó có thể đẩy thẳng lên PRODUCTION SERVER - MÁY CHẠY THẬT Ở NƠI KHÁCH
    //mọi việc sẽ bắt đầu kể từ lúc Developer push code lên Github
    //mọi thứ cứ thế tự động, không cần con người can thiệp
    
    @Test //từ khóa này tương đương biến hàm thành public static void main()
    //trong hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau của
    //expected vs. actual qua hàm assertEquals()... mà thư viện cung cấp
    //assert...() đủ các loại assert trên đời - assert: so sánh
    //thay vì so sánh bằng mắt, ta nhờ hàm so sánh giùm, thảy về màu giùm ta
    public void getFactorial_RunWell_IfValidArgument() {
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(1));
        //vietsub: hãy tính giùm 5! có bằng 120 không, nếu có báo đèn xanh, nếu
        //không thì báo đèn đỏ
    }
}