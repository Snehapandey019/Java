class rectangle {
    int length;
    int breadth;
    void area() {
        System.out.println((length * breadth));
    }

}
class areaofrectangle {
    public static void main(String args[]) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.length = 10;
        r1.breadth = 20;
        r2.breadth = 40;
        r2.length = 30;
        System.out.println("Area of rectangle 1 ");
        System.out.println("Area of rectangle 2 ");
        r1.area();
        r2.area();
    }
}