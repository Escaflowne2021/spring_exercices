package fr.cormier.formation.spring._005;

public class personne {

    private String Name;
    private String Nom;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "personne{" +
                "Name='" + Name + '\'' +
                ", Nom='" + Nom + '\'' +
                ", age=" + age +
                '}';
    }
}
