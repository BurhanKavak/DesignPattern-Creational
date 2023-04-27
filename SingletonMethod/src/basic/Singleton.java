package basic;

public class Singleton {

    private static Singleton singleton;

    private static int count = 0;

    private Singleton () {
        System.out.println("Ben olustum");
    }

    public static Singleton getSingleton() {
        //TODO Buradaki sıkıntı multithread yaparsak patlar açık vermiş oluruz.
        if (singleton == null) {
            singleton = new Singleton();
        }
        count++;
        System.out.println(count);
        return singleton;
    }
}
