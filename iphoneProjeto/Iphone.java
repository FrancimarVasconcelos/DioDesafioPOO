package iphoneProjeto;
import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ReprodutorMusical sons = new ReprodutorMusical();
        sons.tocar();
        sons.pausar();
        System.out.println("selecionar Musica");
        String musica = sc.next();
        sons.selecionarMusica(musica);

        System.out.println();

        AparelhoTelefonico tele = new AparelhoTelefonico();
        System.out.println("Insira o numero");
        String numero = sc.next();
        tele.ligar(numero);
        tele.atender();
        tele.inciarCorreioVoz();

        System.out.println();

        NavegadorInternet net = new NavegadorInternet();
        System.out.println("Insira URL: ");
        String url = sc.next();
        net.exibirPagina(url);
        net.adicionarNovaAba();
        net.atualizarPagina();
    
       sc.close();
    }
    
    
}