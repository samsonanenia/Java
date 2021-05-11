public class Main {

    public static void main(String[] arg){
        Account hagos = new Account("Hagos", "Gebru", 5000 );
        Account james = new Account("James", "Bond", 3000);

        hagos.debit(2000);
        System.out.println(hagos);
        hagos.credit(1000);
        james.debit(4000);
        System.out.println(hagos);

    }
}
