public class ThreeDimentionalShape extends Polygon{
    int height;

    public ThreeDimentionalShape(String color, int sides, int height) {
        super(color, sides);
        this.height = height;
    }

    public int height(int height){
        System.out.println("The 3D Height is " + height);
        return height;
    }
}
