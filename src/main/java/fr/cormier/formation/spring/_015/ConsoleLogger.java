package fr.cormier.formation.spring._015;

public class ConsoleLogger extends Log{

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        System.out.println("text : "+text);
        this.Text = Text;
    }

    String Text;

    public ConsoleLogger(){
        System.out.println("Console Logger");
    }

    @Override
    public void Log(String log) {
        System.out.println("Console Logger qui log: " + this.Text);
    }
}
