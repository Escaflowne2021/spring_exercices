package fr.cormier.formation.spring._008;


public class MaClasseSingleton {

    private static volatile MaClasseSingleton instance;

    private MaClasseSingleton() {
    }

    public static MaClasseSingleton getInstance() {

        if (instance == null) {
            synchronized(MaClasseSingleton.class){
                if (instance == null) {
                    instance = new MaClasseSingleton();
                }
            }
        }
        return instance;
    }

    public void QuiSuije(){
        System.out.println("Singleton !");
    }
}
