package chapter13exceptions.exercisecreatedbyme;

public class ValidarSaldo {
    public static void main(String[] args){
        try{
            levantarDinheiro(110);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Consulta encerrada. Retire o seu cartão.");
        }

    }
    public static void levantarDinheiro(double valor) throws Exception{
        int saldo = 100;
        if (valor > saldo){
            throw new Exception("Saldo Insuficiente!");
        }
        else{
            System.out.println("Levantamento concluido!");
        }
    }
}
