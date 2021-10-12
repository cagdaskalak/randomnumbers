import java.util.Random;
public class randomnumbers {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        //int x = random.nextInt(6)+1; // +1 yazarsan 1 ile 6 arasında (1 ve 6 dahil) rakamlar üretir.
        //double y = random.nextDouble(); // 0 ile 1 arasında sayılar üretir.
        boolean z = random.nextBoolean(); // true veya false verir.

        System.out.println(z);


    }
}
