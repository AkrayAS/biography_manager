package bibtex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App {
    private ArrayList<Core> cores = new ArrayList<>();

    public boolean add(Core core){
        for (Core aux : this.cores) {
            if (aux.getName().equals(core.getName())) {
                System.out.println("Name already taken!");
                return false;
            }
        }
        this.cores.add(core);
        return true;
    }

    public boolean remove(String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName().equals(name)){
                this.cores.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> export(String name){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                return aux.exportText();
            }
        }
        return null;
    }

    public void add(Article article, String name){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                if (aux.containID(article.getNameID())) {
                    aux.add(article);
                }
            }
        }
    }

    public void add(Book book, String name){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                aux.add(book);
            }
        }
    }

    public void add( Masterthesis masterthesis, String name){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                aux.add(masterthesis);
            }
        }
    }

    public void add(Misc misc, String name){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                if (aux.containID(misc.getNameID())) {
                    aux.add(misc);
                }
            }
        }
    }

    public void add(Techreport techreport, String name){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                if (aux.containID(techreport.getNameID())) {
                    aux.add(techreport);
                }
            }
        }
    }

    public void remove(String name, String id){
        for (Core aux : this.cores) {
            if (aux.getName().equals(name)) {
                aux.remove(id);
            }
        }
    }

    public ArrayList<Core> getCores() {
        return cores;
    }

    public void writeFile(String destination) throws IOException {
        FileWriter arq = new FileWriter(destination);
        PrintWriter writeArq = new PrintWriter(arq);
        for (Core aux : this.cores) {
            ArrayList<String> data = aux.exportText();
            for (int j = 0; j < data.size(); j++) {
                writeArq.println(data.toString());
                writeArq.println("\n");
            }
        }
        writeArq.close();
    }
}
