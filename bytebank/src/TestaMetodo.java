public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoHaynan = new Conta();
        contaDoHaynan.saldo = 100;
        contaDoHaynan.deposita(50);
        System.out.println(contaDoHaynan.saldo);

        boolean conseguiuRetirar = contaDoHaynan.saca(20);
        System.out.println(contaDoHaynan.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(300, contaDoHaynan)) {
            System.out.println("transferencia realizada com sucesso");
        }else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoHaynan.saldo);
    }
}
