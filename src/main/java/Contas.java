
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Contas {
    
    private static final String PATH = "contas.txt";
    private static ArrayList<Conta> arquivo;
    
    private static Scanner createFile() {
        Scanner scan = null;
        try {
            File file = new File(PATH);
            file.createNewFile();
            scan = new Scanner(new FileReader(PATH, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.exit(1);
        }
        return scan;
    }
    
    private static void inicializa() {
        Scanner scan = null;
        try {
            scan = new Scanner(new FileReader(PATH, StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            scan = createFile();
        } catch (IOException e) {
            System.exit(1);
        } finally {
            arquivo = new ArrayList<>();
            while(scan.hasNextLine()) {
                String linha = scan.nextLine();
                
                String[] resultados = linha.split(";");
                
                arquivo.add(new Conta(resultados[0], resultados[1]));
            }
            scan.close();
        }
    }
    
    public static boolean verifica(String nome, String senha) {
        inicializa();
        
        ListIterator<Conta> it = arquivo.listIterator();
        
        while(it.hasNext()) {
            Conta conta = it.next();
            
            if ((conta.getNome().equals(nome)) && (conta.getSenha().equals(senha))) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean adiciona(String nome, String senha) {
        if ((nome.equals("")) || (senha.equals(""))) {
            return false;
        }
        
        inicializa();
        
        ListIterator<Conta> it = arquivo.listIterator();
        
        while(it.hasNext()) {
            Conta conta = it.next();
            
            if (conta.getNome().equals(nome)) {
                return false;
            }
        }
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true));
            
            writer.write(nome + ";" + senha);
            writer.newLine();
            
            writer.close();
        } catch (FileNotFoundException e) {
            System.exit(1);
        } catch (IOException e) {
            System.exit(1);
        }
        
        return true;
    }

    public static ArrayList<Conta> getArquivo() {
        return arquivo;
    }

    public static void setArquivo(ArrayList<Conta> arquivo) {
        Contas.arquivo = arquivo;
    }
}
