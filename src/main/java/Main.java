public class Main {
    public static void main(String args[]) {

        InterpretadorExpressao ie = new InterpretadorExpressao(new InterpretadorOperacoes());

        System.out.println("Result = " + ie.interpretar("ADD 12 and 13"));
        System.out.println("Result = " + ie.interpretar("SUBTRACT 76 from 621"));
    }
}
