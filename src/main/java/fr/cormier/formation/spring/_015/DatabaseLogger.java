package fr.cormier.formation.spring._015;

public class DatabaseLogger extends Log{

    public DatabaseLogger(){
        System.out.println("Datababase Logger");
    }

    @Override
    public void Log(String log) {
        System.out.println("Datababase Logger qui log: " +log);
    }
}
