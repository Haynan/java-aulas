public class TestaBanco {
    public static void main(String[] args) {
        Cliente haynan = new Cliente();
        haynan.nome = "Haynan Penha";
        haynan.cpf = "222.222.222-22";
        haynan.profissao = "Programador";

        Conta contaDoHaynan = new Conta();
        contaDoHaynan.deposita(100);

        contaDoHaynan.titular = haynan;
        System.out.println(contaDoHaynan.titular.nome);
    }
}
