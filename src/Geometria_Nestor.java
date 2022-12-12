public class Geometria_Nestor {
    //Declarar variables que serviran para poder representar cada elemento de la figura geometrica
    double num1, num2, num3, num4, num5;
    String nomFigura;

    //Constructor de la figura: Triangulo
    public void Triangulo(){
        nomFigura = "Triangulo";
        num1 = 0; // base
        num2 = 0; // altura
        num3 = 0; // lado A
        num4 = 0; // lado B
        num5 = 0; // lado C
    }

    //Metodos de la figura: Triangulo

    //Pedir valores
    public void insertar_valoresTriangulo(Geometria_Nestor Triangulo, double base, double altura, double ladoA, double ladoB, double ladoC){
        Triangulo.setNum1(base);
        Triangulo.setnum2(altura);
        Triangulo.setNum3(ladoA);
        Triangulo.setNum4(ladoB);
        Triangulo.setNum5(ladoC);
    }

    //Area del Triangulo:
    public double calcular_areaTriangulo(Geometria_Nestor Triangulo){
        double areaTriangulo = (Triangulo.getNum1() * Triangulo.getnum2())/2; // area = base * altura / 2
        return areaTriangulo;
    }

    // Perimetro del Triangulo:
    public double calcular_perimetroTriangulo(Geometria_Nestor Triangulo){
        double perimetroTriangulo = Triangulo.getNum3()+ Triangulo.getNum4() + Triangulo.getNum5(); // p = a + b + c
        return perimetroTriangulo;
    }


    //Constructor de la figura: Cuadrado
    public void Cuadrado(){
        nomFigura = "Cuadrado";
        num1 = 0; // lado
    }

    //Metodos de la figura: Cuadrado

    //Pedir valores
    public void insertar_valoresCuadrado(Geometria_Nestor Cuadrado, double lado){
        Cuadrado.setNum1(lado);
    }

    //Area del Cuadrado:
    public double calcular_areaCuadrado(Geometria_Nestor Cuadrado){
        double areaCuadrado = Math.pow(Cuadrado.getNum1(),2); // area = a^2
        return areaCuadrado;
    }

    // Perimetro del Cuadrado:
    public double calcular_perimetroCuadrado(Geometria_Nestor Cuadrado){
        double perimetroCuadrado = 4 * Cuadrado.getNum1(); // p = 4 * lado
        return perimetroCuadrado;
    }


    //Constructor de la figura: Rectangulo
    public void Rectangulo() {
        nomFigura = "Rectangulo";
        num1 = 0; //lado menor
        num2 = 0; // lado mayor
    }

    //Metodos de la figura: Rectangulo

    //Pedir valores
    public void insertar_valoresRectangulo(Geometria_Nestor Rectangulo, double ladoMenor, double ladoMayor){
        Rectangulo.setNum1(ladoMenor);
        Rectangulo.setnum2(ladoMayor);
    }

    //Area del Rectagulo:
    public double calcular_areaRectagulo(Geometria_Nestor Rectagulo){
        double areaRectagulo = Rectagulo.getNum1() * Rectagulo.getnum2(); // area = lado menor * lado mayor
        return areaRectagulo;
    }

    // Perimetro del Rectagulo:
    public double calcular_perimetroRectagulo(Geometria_Nestor Rectagulo){
        double perimetroRectagulo = (Rectagulo.getNum1() + Rectagulo.getnum2()) * 2; // p = 4 * lado
        return perimetroRectagulo;
    }


    //Constructor de la figura: Paralelogramo
    public void Paralelogramo() {
        nomFigura = "Paralelogramo";
        num1 = 0; //lado menor
        num2 = 0; // lado mayor
        num3 = 0; //Altura
    }

    //Metodos de la figura: Paralelogramo

    //Pedir valores
    public void insertar_valoresParalelogramo(Geometria_Nestor Paralelogramo, double ladoMenor, double ladoMayor, double altura){
        Paralelogramo.setNum1(ladoMenor);
        Paralelogramo.setnum2(ladoMayor);
        Paralelogramo.setNum3(altura);
    }

    //Area del Paralelogramoo:
    public double calcular_areaParalelogramo(Geometria_Nestor Paralelogramo){
        double areaParalelogramo = Paralelogramo.getnum2() * Paralelogramo.getNum3(); // area = Altura * lado mayor
        return areaParalelogramo;
    }

    // Perimetro del Paralelogramo:
    public double calcular_perimetroParalelogramo(Geometria_Nestor Paralelogramo){
        double perimetroParalelogramo = (Paralelogramo.getNum1() + Paralelogramo.getnum2()) * 2; // p = (lado menor + lado mayor) * 2)
        return perimetroParalelogramo;
    }


    //Constructor de la figura: Circulo
    public void Circulo() {
        nomFigura = "Circulo";
        num1 = 0; //radio
    }

    //Metodos de la figura: Circulo

    //Pedir valores
    public void insertar_valoresCirculo(Geometria_Nestor Circulo, double radio){
        Circulo.setNum1(radio);
    }

    //Area del Circulo:
    public double calcular_areaCirculo(Geometria_Nestor Circulo){
        double areaRombo = Math.PI*Math.pow(Circulo.getNum1(),2); // area = pi * radio^2
        return areaRombo;
    }

    // Perimetro del Circulo:
    public double calcular_perimetroCirculo(Geometria_Nestor Circulo){
        double perimetroCirculo =  2 * Math.PI * Circulo.getNum1(); // p = 2 * pi * radio
        return perimetroCirculo;
    }


    //Constructor de la figura: Poligono Regular de N lados
    public void Poligono() {
        nomFigura = "Poligono Regular de N lados";
        num1 = 0; //lado
        num2 = 0; // numero de lados
        num3 = 0; // apotema
    }

    //Metodos de la figura: Poligono

    //Pedir valores
    public void insertar_valoresPoligono(Geometria_Nestor Poligono, double lado, double numlados, double apotema){
        Poligono.setNum1(lado);
        Poligono.setnum2(numlados);
        Poligono.setNum3(apotema);
    }

    //Area del Poligono:
    public double calcular_areaPoligono(Geometria_Nestor Poligono){
        double areaRombo = ((Poligono.getNum1() * Poligono.getnum2()) * Poligono.getNum3()) / 2; // area = pi * radio^2
        return areaRombo;
    }

    // Perimetro del Poligono:
    public double calcular_perimetroPoligono(Geometria_Nestor Poligono){
        double perimetroPoligono =  Poligono.getNum1() * Poligono.getnum2(); // p = 2 * pi * radio
        return perimetroPoligono;
    }


    //Constructor de la figura: Esfera
    public void Esfera() {
        nomFigura = "Esfera";
        num1 = 0; //radio
    }

    //Metodos de la figura: Esfera

    //Pedir valores
    public void insertar_valoresEsfera(Geometria_Nestor Esfera, double radio){
        Esfera.setNum1(radio);
    }

    //Area de la Esfera:
    public double calcular_areaEsfera(Geometria_Nestor Esfera){
        double areaEsfera =  Math.pow(Esfera.getNum1(),2) * 4 * Math.PI; // area = 4 * pi * radio^2
        return areaEsfera;
    }

    // Volumen de la Esfera:
    public double calcular_perimetroEsfera(Geometria_Nestor Esfera){
        double volumenEsfera = (Math.pow(Esfera.getNum1(),3) * 4 * Math.PI) / 3; // volumen = = (4 * pi * radio^3) / 3
        return volumenEsfera;
    }


    //Constructor de la figura: Cilindro
    public void Cilindro() {
        nomFigura = "Cilindro";
        num1 = 0; //radio
        num2 = 0; //altura
    }

    //Metodos de la figura: Cilindro

    //Pedir valores
    public void insertar_valoresCilindro(Geometria_Nestor Cilindro, double radio, double altura){
        Cilindro.setNum1(radio);
        Cilindro.setnum2(altura);
    }

    //Area del Cilindro:
    public double calcular_areaCilindro(Geometria_Nestor Cilindro){
        double areaCilindro = 2 * Math.PI * Cilindro.getNum1() * Cilindro.getnum2(); // area superficie lateral= 2 * pi * radio * altura
        return areaCilindro;
    }

    // Volumen del Cilindro:
    public double calcular_perimetroCilindro(Geometria_Nestor Cilindro){
        double volumenCilindro = Cilindro.getnum2() * Math.pow(Cilindro.getNum1(), 2) * Math.PI; // volumen = = pi * radio^2 * altura
        return volumenCilindro;
    }


    //Constructor de la figura: Cono
    public void Cono() {
        nomFigura = "Cono";
        num1 = 0; //altura
        num2 = 0; //altura inclinada
        num3 = 0; //radio
    }

    //Metodos de la figura: Cono

    //Pedir valores
    public void insertar_valoresCono(Geometria_Nestor Cono, double altura, double alturaIn, double radio){
        Cono.setNum1(altura);
        Cono.setnum2(alturaIn);
        Cono.setNum3(radio);
    }

    //Area del Cono:
    public double calcular_areaCono(Geometria_Nestor Cono){
        double areaCono = Math.PI * Cono.getNum3() * Cono.getnum2(); // area superficie lateral= pi * radio * altura inclinada
        return areaCono;
    }

    // Volumen del Cono:
    public double calcular_perimetroCono(Geometria_Nestor Cono){
        double volumenCono = (Math.PI * Math.pow(Cono.getNum3(), 2)* Cono.getNum1()) / 3; // volumen = (pi * radio^2 * altura) / 3
        return volumenCono;
    }


    //getters y setters
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getnum2() {
        return num2;
    }

    public void setnum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

}
