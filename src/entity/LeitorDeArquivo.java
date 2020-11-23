package entity;

import com.company.Status;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorDeArquivo {
    //TODO: Ler apartir de um csv. TA DE SACANAGEM QUE EU VOU TER QUE MEXER COM JAVA MESMO ????
    public ArrayList<Pedido> ler(){

        ArrayList<Pedido> lista_pedidos = new ArrayList<>();
        Scanner sc = null;
        try {
            //caminho do arquivo
            String path = "assets/pedidos.csv";

            //leitura do arquivo
            sc = new Scanner(new File(path));

            //enquanto houver linhas
            while (sc.hasNext()) {
                String linha = sc.nextLine();
                String[] campos = linha.split(";");

                lista_pedidos.add(new Pedido(Long.parseLong(campos[0]), campos[1], Double.parseDouble(campos[2]), Status.valueOf(campos[3])));
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }

        }

        return lista_pedidos;
    }
}
