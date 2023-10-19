import org.junit.Test;

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
}
