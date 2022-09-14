import java.util.Scanner;

import javax.swing.SingleSelectionModel;
import javax.swing.text.html.CSS;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("******* Cadastro e Consulta de Usuários em Java puro*******");
        String userName1, userName2, userName3;
        String userEmail1, userEmail2, userEmail3;
        int userCPF1, userCPF2, userCPF3, searchCPF;

        System.out.println("[Cadastro // Usuário 1]:");
        System.out.println("Insira o nome do usuário: ");
        userName1 = sc.next();

        System.out.println("Insira o endereço de email do usuário: ");
        userEmail1 = sc.next();

        System.out.println("Insira o CPF do usuário: ");
        userCPF1 = sc.nextInt();

        

        System.out.println("[Cadastro // Usuário 2]:");
        System.out.println("Insira o nome do usuário: ");
        userName2 = sc.next();

        System.out.println("Insira o endereço de email do usuário: ");
        userEmail2 = sc.next();

        if(userEmail2 == userEmail1)
        {
            System.out.print("Email já cadastrado!");
            userEmail2 = sc.next();
        }

        System.out.println("Insira o CPF do usuário: ");
        userCPF2 = sc.nextInt();

        if(userCPF2 == userCPF1)
        {
            System.out.print("CPF já cadastrado!");
            userCPF2 = sc.nextInt();
        }



        System.out.println("[Cadastro // Usuário 3]:");
        System.out.println("Insira o nome do usuário: ");
        userName3 = sc.next();

        System.out.println("Insira o endereço de email do usuário: ");
        userEmail3 = sc.next();

        if(userEmail3 == userEmail1 || userEmail3 == userEmail2)
        {
            System.out.print("Email já cadastrado!");
            userEmail3 = sc.next();
        }

        System.out.println("Insira o CPF do usuário: ");
        userCPF3 = sc.nextInt();

        if(userCPF3 == userCPF1 || userCPF3 == userCPF2)
        {
            System.out.print("Email já cadastrado!");
            userCPF3 = sc.nextInt();
        }

        System.out.println("[Consulta]:");
        System.out.print("Insira o CPF do usuário à ser visualizado: ");
        searchCPF = sc.nextInt();

        if(searchCPF == userCPF1)
        {
            System.out.println("[Ficha do usuário 1]");
            System.out.println("Nome: " + userName1);
            System.out.println("CPF: " + userCPF1);
            System.out.println("Email: " + userEmail1);
        }

        if(searchCPF == userCPF2)
        {
            System.out.println("[Ficha do usuário 2]");
            System.out.println("Nome: " + userName2);
            System.out.println("CPF: " + userCPF2);
            System.out.println("Email: " + userEmail2);
        }

        if(searchCPF == userCPF3)
        {
            System.out.println("[Ficha do usuário 3]");
            System.out.println("Nome: " + userName3);
            System.out.println("CPF: " + userCPF3);
            System.out.println("Email: " + userEmail3);
        }
        
        else
        {
            System.out.println("Usuário não encontrado!");            
        }
        sc.close();
    }
}
