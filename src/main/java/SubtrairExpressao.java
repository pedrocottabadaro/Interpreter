public class SubtrairExpressao implements Expressao{


    private String expressao;

    public SubtrairExpressao(String expressao) {
        this.expressao = expressao;
    }

    @Override
    public int interpretar(InterpretadorOperacoes io) {
        return io.subtrair(expressao);

    }
}
