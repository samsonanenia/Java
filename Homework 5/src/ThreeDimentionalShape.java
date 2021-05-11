public class ThreeDimentionalShape extends Polygon{
    int height;

    public ThreeDimentionalShape(String color, int sides) {
        super(color, sides);
    }

    public int height(int height){
        this.height = height;
        System.out.println("The 3D Height is " + height);
        return height;
    }
}
