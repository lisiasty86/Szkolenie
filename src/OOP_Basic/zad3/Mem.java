package OOP_Basic.zad3;

public class Mem {

    private String name;
    private String urlOfPicture;
    private String description;
    private String favourite;

    public Mem() {

    }

    public Mem(String name, String urlOfPicture, String description, String favourite) {
        this.name = name;
        this.urlOfPicture = urlOfPicture;
        this.description = description;
        this.favourite = favourite;
    }

    public Mem createNewMem(String name, String urlOfPicture, String description, String favourite) {
        Mem mem = new Mem();
        if (favourite.equals("yes") || favourite.equals("Yes")) {
            return new Mem(name, urlOfPicture, description, favourite);
        }
        return null;
    }

    public boolean isFavourite(Mem mem) {
        boolean x = false;
        this.favourite = mem.favourite;

        if (this.favourite.equals("yes")) {
            x = true;
        }
        return x;
    }

    public void display(String name, String urlOfPicture, String description, String favourite) {
        if  (favourite.equals("yes") || favourite.equals("Yes")) {
            System.out.println("Mem{" +
                    "name='" + name + '\'' +
                    ", urlOfPicture='" + urlOfPicture + '\'' +
                    ", description='" + description + '\'' +
                    ", favourite='" + favourite + '\'' +
                    '}');
        }
    }

    public void display2(Mem mem) {
        if  (favourite.equals("yes") || favourite.equals("Yes")) {
            System.out.println("Mem{" +
                    "name='" + this.name + '\'' +
                    ", urlOfPicture='" + this.urlOfPicture + '\'' +
                    ", description='" + this.description + '\'' +
                    ", favourite='" + this.favourite + '\'' +
                    '}');
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlOfPicture() {
        return urlOfPicture;
    }

    public void setUrlOfPicture(String urlOfPicture) {
        this.urlOfPicture = urlOfPicture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", urlOfPicture='" + urlOfPicture + '\'' +
                ", description='" + description + '\'' +
                ", favourite='" + favourite + '\'' +
                '}';
    }
}
