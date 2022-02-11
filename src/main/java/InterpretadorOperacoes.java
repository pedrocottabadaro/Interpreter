public class InterpretadorOperacoes {

    public int somar(String input) {
        String[] tokens = interpretar(input);
        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[1]);
        return (num1 + num2);
    }

    public int subtrair(String input) {
        String[] tokens = interpretar(input);
        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[1]);
        return (num2 - num1);
    }

    private String[] interpretar(String input) {
        String str = input.replaceAll("[^0-9]", " ");
        str = str.replaceAll("( )+", " ").trim();
        String[] tokens = str.split(" ");
        return tokens;
    }
}
