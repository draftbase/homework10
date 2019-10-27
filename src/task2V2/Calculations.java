package task2V2;

public class Calculations {
    Box[] boxes = new Box[8];

    public Calculations(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box[] getBoxes() {
        return boxes;
    }

    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box optimalBox(Product product){
        //obliczenia
        Box optimalBox = null;
        for(int i = 0; i<boxes.length;i++){
            if((boxes[i].getVolumeBox() >= product.getVolumeProduct() && optimalBox == null)
                    || (boxes[i].getVolumeBox() >= product.getVolumeProduct()
                    && optimalBox.getVolumeBox() > boxes[i].getVolumeBox())){
                optimalBox = boxes[i];
            }
        }
        return optimalBox;
    }

}
