public class SomarExpressao implements Expressao{
    private String expressao;

    public SomarExpressao(String expressao) {
        this.expressao = expressao;
    }

    @Override
    public int interpretar(InterpretadorOperacoes io) {
        return io.somar(expressao);

    }
}
