package task2V2;

public class Product extends Form {
    private String nazwa;
    private Form form;

    public Product(String type, String nazwa, Form form) {
        super(type);
        this.nazwa = nazwa;
        this.form = form;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

}
