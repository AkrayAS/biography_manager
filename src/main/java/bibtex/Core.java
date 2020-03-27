package bibtex;

import java.util.ArrayList;

public class Core {
    private String name;
    private ArrayList<String> ids = new ArrayList<>();
    private ArrayList<Article> articles = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Masterthesis> mastertheses = new ArrayList<>();
    private ArrayList<Misc> miscs = new ArrayList<>();
    private ArrayList<Techreport> techreports = new ArrayList<>();

    public boolean add(Article article) {
        try {
            this.articles.add(article);
            this.ids.add(article.getNameID());
            return true;
        }catch (Exception e){
            System.out.println("ERROR. It was not possible to add this parameter.");
            return false;
        }
    }

    public boolean add(Book book) {
        try {
            this.books.add(book);
            this.ids.add(book.getNameID());
            return true;
        }catch (Exception e){
            System.out.println("ERROR. It was not possible to add this parameter.");
            return false;
        }
    }


    public boolean add(Masterthesis masterthesis) {
        try {
            this.mastertheses.add(masterthesis);
            this.ids.add(masterthesis.getNameID());
            return true;
        }catch (Exception e){
            System.out.println("ERROR. It was not possible to add this parameter.");
            return false;
        }
    }


    public boolean add(Misc misc) {
        try {
            this.miscs.add(misc);
            this.ids.add(misc.getNameID());
            return true;
        }catch (Exception e){
            System.out.println("ERROR. It was not possible to add this parameter.");
            return false;
        }
    }

    public boolean add(Techreport techreport) {
        try {
            this.techreports.add(techreport);
            this.ids.add(techreport.getNameID());
            return true;
        } catch (Exception e) {
            System.out.println("ERROR. It was not possible to add this parameter.");
            return false;
        }
    }

    public boolean containID(String id){
        return !this.ids.contains(id);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> exportText() {
        try {
            ArrayList<String> data = new ArrayList<>();
            if (this.articles.size() > 0){
                for (Article aux : this.articles) {
                    data.add(aux.toString());
                }
            }

            if (this.books.size() > 0){
                for (Book aux : this.books) {
                    data.add(aux.toString());
                }
            }

            if (this.mastertheses.size() > 0){
                for (Masterthesis aux : this.mastertheses) {
                    data.add(aux.toString());
                }
            }

            if (this.miscs.size() > 0){
                for (Misc aux : this.miscs) {
                    data.add(aux.toString());
                }
            }

            if (this.techreports.size() > 0){
                for (Techreport aux : this.techreports) {
                    data.add(aux.toString());
                }
            }
            return data;
        }catch (Exception e){
            System.out.println("ERROR. During process of capturing text.");
            return null;
        }
    }

    public ArrayList<String> getAllID(){
        try {
            ArrayList<String> data = new ArrayList<>();
            if (this.articles.size() > 0){
                for (Article aux : this.articles) {
                    data.add(aux.getNameID());
                }
            }

            if (this.books.size() > 0){
                for (Book aux : this.books) {
                    data.add(aux.getNameID());
                }
            }

            if (this.mastertheses.size() > 0){
                for (Masterthesis aux : this.mastertheses) {
                    data.add(aux.getNameID());
                }
            }

            if (this.miscs.size() > 0){
                for (Misc aux : this.miscs) {
                    data.add(aux.getNameID());
                }
            }

            if (this.techreports.size() > 0){
                for (Techreport aux : this.techreports) {
                    data.add(aux.getNameID());
                }
            }
            return data;
        }catch (Exception e){
            System.out.println("ERROR. During process of capturing text.");
            return null;
        }
    }

    public boolean remove(String id){
        for (int i = 0; i < this.ids.size() ; i++) {

            for (int j = 0; j < this.books.size(); j++) {
                Book aux = this.books.get(j);
                if (aux.getNameID().equalsIgnoreCase(id)){
                    this.books.remove(j);
                    return true;
                }
            }

            for (int j = 0; j < this.mastertheses.size(); j++) {
                Masterthesis aux = this.mastertheses.get(j);
                if (aux.getNameID().equalsIgnoreCase(id)){
                    this.mastertheses.remove(j);
                    return true;
                }
            }

            for (int j = 0; j < this.articles.size(); j++) {
                Article aux = this.articles.get(j);
                if (aux.getNameID().equalsIgnoreCase(id)){
                    this.articles.remove(j);
                    return true;
                }
            }

            for (int j = 0; j < this.miscs.size(); j++) {
                Misc aux = this.miscs.get(j);
                if (aux.getNameID().equalsIgnoreCase(id)){
                    this.miscs.remove(j);
                    return true;
                }
            }

            for (int j = 0; j < this.techreports.size(); j++) {
                Techreport aux = this.techreports.get(j);
                if (aux.getNameID().equalsIgnoreCase(id)){
                    this.techreports.remove(j);
                    return true;
                }
            }

        }
        return false;
    }
}
