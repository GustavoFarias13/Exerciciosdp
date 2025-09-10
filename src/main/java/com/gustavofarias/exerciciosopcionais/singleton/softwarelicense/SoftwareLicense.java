package com.gustavofarias.exerciciosopcionais.singleton.softwarelicense;

class SoftwareLicense {
    private static SoftwareLicense instance;
    private String key;
    private boolean active = false;

    private SoftwareLicense() {}

    public static synchronized SoftwareLicense getInstance() {
        if (instance == null) {
            instance = new SoftwareLicense();
        }
        return instance;
    }

    public void activateLicense(String key) {
        this.key = key;
        this.active = true;
        System.out.println("Licença ativada: " + key);
    }

    public void expireLicense() {
        this.key = null;
        this.active = false;
        System.out.println("Licença expirada! Sistema bloqueado.");
    }

    public boolean isLicenseActive() {
        return active;
    }

    public void performOperation() {
        if (!active) {
            System.out.println("Operação bloqueada! Licença inválida.");
            return;
        }
        System.out.println("Operação realizada com sucesso!");
    }
}
