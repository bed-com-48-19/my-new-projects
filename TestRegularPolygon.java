public class TestRegularPolygon{
    public static void main(String[] MAULIDI){

        // create an object time to connect this class with the regularPolygon class

        RegularPolygon poly = new RegularPolygon(6 , 4);

        RegularPolygon pl = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("the area of the regular polygon is " + poly.getArea());
        System.out.println("the area of the regular polygon is " + pl.getArea());

    }
}