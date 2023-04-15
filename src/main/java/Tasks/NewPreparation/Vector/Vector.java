package Tasks.NewPreparation.Vector;

public class Vector {

    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double VectorLength(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double ScalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector CrossProduct(Vector vector){
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        );
    }

    public double Cos(Vector vector){
        return ScalarProduct(vector) / (VectorLength() * vector.VectorLength());
    }

    public Vector Add(Vector vector){
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector Subtr(Vector vector){
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString(){
        return "Vector {x: " + x + ", y: " + y + ", z: " + z + "}";
    }

    public static void main(String[] args){
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].VectorLength());
        System.out.println(vectors[0].ScalarProduct(vectors[1]));
        System.out.println(vectors[0].CrossProduct(vectors[1]));
        System.out.println(vectors[0].Cos(vectors[1]));
        System.out.println(vectors[0].Add(vectors[1]));
        System.out.println(vectors[0].Subtr(vectors[1]));
    }

}
