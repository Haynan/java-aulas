public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario haynan = new Funcionario();
        haynan.setNome("Haynan Penha");
        haynan.setCpf("22222222220");
        haynan.setSalario(2600.00);

        System.out.println(haynan.getNome());
        System.out.println(haynan.getBonificacao());
    }
}
