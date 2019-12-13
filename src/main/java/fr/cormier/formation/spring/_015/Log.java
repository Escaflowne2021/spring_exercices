package fr.cormier.formation.spring._015;

abstract class Log implements Logger {



    void Parle(){
        System.out.println("Main log");
    }

    @Override
    public void Log(String log) {
        System.out.println("Class Log qui parle");
    }
}
