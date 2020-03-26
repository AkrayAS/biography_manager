package bibtex;

import java.util.ArrayList;
import java.util.Iterator;

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

    public boolean isId(String id){
        if (this.ids.contains(id)){
            return true;
        }else return false;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> exportText() {
        try {
            ArrayList<String> data = new ArrayList<>();
            if (this.articles.size() > 0){
                Iterator<Article> iter = this.articles.iterator();
                while(iter.hasNext()) {
                    Article aux = iter.next();
                    data.add(aux.toString());
                }
            }

            if (this.books.size() > 0){
                Iterator<Book> iter = this.books.iterator();
                while(iter.hasNext()) {
                    Book aux = iter.next();
                    data.add(aux.toString());
                }
            }

            if (this.mastertheses.size() > 0){
                Iterator<Masterthesis> iter = this.mastertheses.iterator();
                while(iter.hasNext()) {
                    Masterthesis aux = iter.next();
                    data.add(aux.toString());
                }
            }

            if (this.miscs.size() > 0){
                Iterator<Misc> iter = this.miscs.iterator();
                while(iter.hasNext()) {
                    Misc aux = iter.next();
                    data.add(aux.toString());
                }
            }

            if (this.techreports.size() > 0){
                Iterator<Techreport> iter = this.techreports.iterator();
                while(iter.hasNext()) {
                    Techreport aux = iter.next();
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
                Iterator<Article> iter = this.articles.iterator();
                while(iter.hasNext()) {
                    Article aux = iter.next();
                    data.add(aux.getNameID());
                }
            }

            if (this.books.size() > 0){
                Iterator<Book> iter = this.books.iterator();
                while(iter.hasNext()) {
                    Book aux = iter.next();
                    data.add(aux.getNameID());
                }
            }

            if (this.mastertheses.size() > 0){
                Iterator<Masterthesis> iter = this.mastertheses.iterator();
                while(iter.hasNext()) {
                    Masterthesis aux = iter.next();
                    data.add(aux.getNameID());
                }
            }

            if (this.miscs.size() > 0){
                Iterator<Misc> iter = this.miscs.iterator();
                while(iter.hasNext()) {
                    Misc aux = iter.next();
                    data.add(aux.getNameID());
                }
            }

            if (this.techreports.size() > 0){
                Iterator<Techreport> iter = this.techreports.iterator();
                while(iter.hasNext()) {
                    Techreport aux = iter.next();
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
        Iterator<String> iterIDs = this.ids.iterator();
        while (iterIDs.hasNext()){

            if (this.articles.size() > 0){
                Iterator<Article> iter = this.articles.iterator();
                while(iter.hasNext()) {
                    Article aux = iter.next();
                   if(aux.getNameID().equals(id)) {
                       this.articles.remove(id);
                       return true;
                   }
                }
            }

            if (this.books.size() > 0){
                Iterator<Book> iter = this.books.iterator();
                while(iter.hasNext()) {
                    Book aux = iter.next();
                    if(aux.getNameID().equals(id)) {
                        this.books.remove(id);
                        return true;
                    }
                }
            }

            if (this.mastertheses.size() > 0){
                Iterator<Masterthesis> iter = this.mastertheses.iterator();
                while(iter.hasNext()) {
                    Masterthesis aux = iter.next();
                    if(aux.getNameID().equals(id)) {
                        this.mastertheses.remove(id);
                        return true;
                    }
                }
            }

            if (this.miscs.size() > 0){
                Iterator<Misc> iter = this.miscs.iterator();
                while(iter.hasNext()) {
                    Misc aux = iter.next();
                    if(aux.getNameID().equals(id)) {
                        this.miscs.remove(id);
                        return true;
                    }
                }
            }

            if (this.techreports.size() > 0){
                Iterator<Techreport> iter = this.techreports.iterator();
                while(iter.hasNext()) {
                    Techreport aux = iter.next();
                    if(aux.getNameID().equals(id)) {
                        this.techreports.remove(id);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
