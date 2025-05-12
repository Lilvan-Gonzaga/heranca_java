public class HerancaVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
    }
}

class Veiculo {
    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo está freando.");
    }
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando rapidamente!");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando com segurança.");
    }
}

class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto acelera com agilidade!");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando suavemente.");
    }
}
