import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Perguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> perguntas = new ArrayDeque<>();
        Queue<String> respostasCorretas = new ArrayDeque<>();

        perguntas.add("Qual é o sistema operacional mais utilizado em smartphones?\na) Windows \nb) iOS \nc) Linux \nd) Android");
        perguntas.add("Qual linguagem de programação é amplamente usada para desenvolvimento web front-end?\na) Java\nb) Python\nc) HTML\nd) C++");
        perguntas.add("Qual desses não é um tipo de armazenamento de dados?\na) SSD\nb) RAM\nc) CPU\nd) HDD");
        perguntas.add("Qual protocolo é comumente usado para enviar e-mails?\na) FTP\nb) HTTP\nc) SMTP\nd) TCP");
        perguntas.add("O que significa a sigla (HTML)?\na) Hyper Transfer Markup Language\nb) Hypertext Markup Language\nc) Hyperlink and Text Markup Language\nd) High Tech Markup Language");
        perguntas.add("Qual é a função principal de um firewall?\na) Acelerar a velocidade da internet\nb) Proteger contra vírus e malware\nc) Realizar backups automáticos\nd) Aumentar a capacidade de armazenamento");
        perguntas.add("Qual desses não é um tipo de banco de dados?\na) MySQL\nb) MongoDB\nc) Python\nd) PostgreSQL");
        perguntas.add("Qual componente do computador é conhecido como (cérebro) da máquina?\na) Placa-mãe\nb) CPU\nc) RAM\nd) Fonte de alimentação");
        perguntas.add("Qual é o principal objetivo da codificação de dados?\na) Proteger os dados contra hackers\nb) Organizar os dados em um banco de dados\nc) Converter dados em uma forma que pode ser processada por um computador\nd) Armazenar os dados em um servidor");
        perguntas.add("Qual desses é um exemplo de linguagem de programação de alto nível?\na) Assembly\nb) C\nc) Python\nd) Machine Language");
        perguntas.add("Qual desses não é um tipo de ataque cibernético?\na) Phishing\nb) Ransomware\nc) Firewall\nd) DDOS");
        perguntas.add("Qual é o componente de hardware que converte sinais digitais em sinais analógicos e vice-versa?\na) Modem\nb) Router\nc) Switch\nd) Hub");
        perguntas.add("Qual é o propósito principal do sistema operacional?\na) Gerenciar hardware e software\nb) Navegar na internet\nc) Criar documentos\nd) Editar imagens");
        perguntas.add("Qual é a unidade básica de armazenamento de dados em um computador?\na) Byte\nb) Bit\nc) Kilobyte\nd) Megabyte");
        perguntas.add("Qual desses não é um tipo de linguagem de programação?\na) Java\nb) Linux\nc) Python\nd) C++");


        respostasCorretas.add("d");
        respostasCorretas.add("c");
        respostasCorretas.add("c");
        respostasCorretas.add("c");
        respostasCorretas.add("b");
        respostasCorretas.add("b");
        respostasCorretas.add("c");
        respostasCorretas.add("b");
        respostasCorretas.add("c");
        respostasCorretas.add("c");
        respostasCorretas.add("c");
        respostasCorretas.add("a");
        respostasCorretas.add("a");
        respostasCorretas.add("a");
        respostasCorretas.add("b");

        System.out.println("Bem-vindo ao Quiz!");

        while (!perguntas.isEmpty()) {
            String pergunta = perguntas.poll();
            String respostaCorreta = respostasCorretas.poll();

            System.out.println(pergunta);
            System.out.print("Resposta: ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase(respostaCorreta)) {
                System.out.println("Correto!");
                
            } else {
                System.out.println("Errado. A resposta correta é: " + respostaCorreta);
            }
        }

        System.out.println("\nFim do quiz!");

        System.out.println("\nRespostas corretas:");
        for (String resposta : respostasCorretas) {
            System.out.println(resposta);
        }

        scanner.close();
    }
}
