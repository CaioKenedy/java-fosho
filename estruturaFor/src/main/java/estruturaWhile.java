

import java.util.Scanner;

public class estruturaWhile {
    
    public static void main(String[] args) {
        
        int totalAlunos = 10;
        
        Scanner leitor = new Scanner(System.in);
        
        while(totalAlunos > 0) {
            
            String nomeAluno = leitor.nextLine();
            int idadeAluno = leitor.nextInt();
            
            System.out.println("O nome do aluno é: " + nomeAluno + 
                    "e sua idade é: " + idadeAluno);
            
            totalAlunos = totalAlunos -1;
        }
    }
}
