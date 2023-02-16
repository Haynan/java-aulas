public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente haynan = new Gerente();
        haynan.setNome("Haynan Penha");
        haynan.setCpf("22222222220");
        haynan.setSalario(2600.00);

        System.out.println(haynan.getNome());
        System.out.println(haynan.getBonificacao());
    }
}
