package bibtex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App {
    private ArrayList<Core> cores = new ArrayList<>();

    public boolean add(Core core){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == core.getName()){
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
            if (aux.getName() == name){
                this.cores.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> export(String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName().equals(name)){
                return aux.exportText();
            }
        }
        return null;
    }

    public void add(Article article, String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == name){
                if (!aux.isId(article.getNameID())){
                    aux.add(article);
                }
            }
        }
    }

    public void add(Book book, String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == name){
                aux.add(book);
            }
        }
    }

    public void add( Masterthesis masterthesis, String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == name){
                aux.add(masterthesis);
            }
        }
    }

    public void add(Misc misc, String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == name){
                if (!aux.isId(misc.getNameID())){
                    aux.add(misc);
                }
            }
        }
    }

    public void add(Techreport techreport, String name){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == name){
                if (!aux.isId(techreport.getNameID())){
                    aux.add(techreport);
                }
            }
        }
    }

    public void remove(String name, String id){
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            if (aux.getName() == name){
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
        for (int i = 0; i < this.cores.size() ; i++) {
            Core aux = this.cores.get(i);
            ArrayList<String> data = aux.exportText();
            for (int j = 0; j < data.size(); j++) {
                writeArq.println(data.toString());
                writeArq.println("\n");
            }
        }
    }
}
