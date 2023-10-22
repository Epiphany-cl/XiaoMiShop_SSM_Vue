import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyTest {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};

        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                int temp = i;
                for (int j = 0; j < 5; j++) {
                    if (i < arr.length){
                        System.out.println(arr[i]);
                    }else {
                        break;
                    }
                    i++;
                }
                i = temp;
                System.out.println("-----");
            }
        }
    }

    @Test
    public void testOrderNo(){
        System.out.println(this.generateOrderNo());
    }

    private String generateOrderNo(){
        // 获取当前日期和时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String dateStr = sdf.format(new Date());

        // 生成一个随机的4位数
        Random random = new Random();
        int randomNum = random.nextInt(10000);

        // 将日期、时间和随机数组合起来形成订单号
        return dateStr + String.format("%04d", randomNum);
    }
}
