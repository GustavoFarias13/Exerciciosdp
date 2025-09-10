package com.gustavofarias.exerciciosopcionais.singleton.softwarelicense;

public class MainLicense {
    public static void main(String[] args) {
        SoftwareLicense license = SoftwareLicense.getInstance();
        license.performOperation(); // Bloqueado

        license.activateLicense("ABC-123-XYZ");
        license.performOperation(); // Sucesso

        license.expireLicense();
        license.performOperation(); // Bloqueado novamente
    }
}
