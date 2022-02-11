import java.beans.Expression;

public class InterpretadorExpressao {

    private InterpretadorOperacoes io;

    public InterpretadorExpressao(InterpretadorOperacoes io) {
        this.io = io;
    }

    public int interpretar(String input) {

        Expressao exp = null;

        if(input.contains("ADD")) {
            exp = new SomarExpressao(input);
        } else if(input.contains("SUBTRACT")) {
            exp = new SubtrairExpressao(input);
        }

        int result = exp.interpretar(io);
        System.out.println(input);

        return result;
    }
}
