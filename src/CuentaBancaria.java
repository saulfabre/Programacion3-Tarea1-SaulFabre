public class CuentaBancaria {

    private String titular;
    private float balance;
    private int numeroCuenta;
    private String tipoCuenta;

    public CuentaBancaria() {

    }

    public CuentaBancaria(String titular, float balance, int numeroCuenta, String tipoCuenta) {

        setTitular(titular);
        setBalance(balance);
        setNumeroCuenta(numeroCuenta);
        setTipoCuenta(tipoCuenta);
    }

    public String getTitular() {

        return titular;
    }

    public float getBalance() {

        return balance;
    }

    public int getNumeroCuenta() {

        return numeroCuenta;
    }

    public String getTipoCuenta() {

        return tipoCuenta;
    }

    public void setTitular(String titular) {

        this.titular = titular;
    }

    public void setBalance(float balance) {

        this.balance = balance;
    }

    public void setNumeroCuenta(int numeroCuenta) {

        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {

        this.tipoCuenta = tipoCuenta;
    }

    public void ingresarBalance(float balanceAgregar) {

        if (balance <= 0 ) {
            System.out.println(">> No se puede ingresar este monto, ingrese otra cantidad");
        }

        else {
            balance+= balanceAgregar;
            System.out.println(">> Sr " + titular + " Su monto ha sido ingresado a su cuenta con exito");
            System.out.println(">> Su balance es: " + getBalance());
        }
    }

    public void retirarBalance(float balanceRetirar) {

        if (balance < balanceRetirar) {
            System.out.println(">> Balance de la cuenta insuficiente");
        }

        else {
            balance-= balanceRetirar;
            System.out.println(">> Sr " + titular + " Su balance se ha retirado con exito");
            System.out.println(">> Su balance es: " + getBalance());
        }
    }

    public void enviarBalance(int numeroCuentaDestino, CuentaBancaria cuenta, float cantidad) {

        if (balance < cantidad) {

            System.out.println(">> Balance insuficiente");
        }


        if (numeroCuentaDestino == cuenta.getNumeroCuenta()) {

            cuenta.setBalance(cuenta.getBalance() + cantidad);
            balance-= cantidad;
            System.out.println(">> Dinero $" + cantidad + "DOP " + "enviado a " + cuenta.titular + " con exito");

        }

        else {
            System.out.println(">> Cuenta bancaria no encontrada");
        }
        
    }
    public void mostrarDatos() {

        System.out.println("--------------------------------");
        System.out.println(">> Titular de la cuenta: " + getTitular());
        System.out.println(">> Balance disponible: " + getBalance());
        System.out.println(">> Numero de cuenta: " + getNumeroCuenta());
        System.out.println(">> Tipo de cuenta: " + getTipoCuenta());
        System.out.println("--------------------------------");

    }

}