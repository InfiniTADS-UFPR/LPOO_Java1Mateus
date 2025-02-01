package br.ufpr.lpoo.tarefa06.exercicio10;

public class C_12 extends C implements I1, I2{

    float[][] atributo3;

    public C_12() {
        super();
        this.atributo3 = new float[2][2];
    }

    public C_12(String p1, float p2) {
        super(p1, p2);
        this.atributo3 = new float[][]{{1.0f, 1.0f, 1.0f}, {1.0f, 1.0f, 1.0f}, {1.0f, 1.0f, 1.0f}};
    }

    @Override
    public void operacao1() {
        System.out.println("Passou pela operação 1");
        System.out.println("Atributo 1: " + this.atributo1);
        System.out.println("Atributo 2: " + this.atributo2);
        System.out.println("Atributo 3: ");
        for (float[] floats : this.atributo3) {
            for (float aFloat : floats) {
                System.out.print(aFloat + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void operacao2() {
        System.out.println("Passou pela operação 2");
        System.out.println("-----------------------");
    }
}
