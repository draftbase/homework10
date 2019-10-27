package task2V2;

public class Box extends Form {
    private Form form;

    public Box(String type, Form form) {
        super(type);
        this.form = form;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
}
