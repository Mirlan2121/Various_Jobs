public class main {
    public static void main(String[] args) {
        terminal dosCredoTerminal = new terminal();
        dosCredoTerminal.name = "DocCredo";
        dosCredoTerminal.address = "Chui 124";
        dosCredoTerminal.cash = 100000;

        terminal DemirTerminal = new terminal();
        DemirTerminal.name = "Demir";
        DemirTerminal.address = "Chui 125";
        DemirTerminal.cash = 500000;

        System.out.println(dosCredoTerminal.address + " " + dosCredoTerminal.name + " " + dosCredoTerminal.cash);
        System.out.println(DemirTerminal.address + " " + DemirTerminal.cash + " " + DemirTerminal.name);
    }
}
