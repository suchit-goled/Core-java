class KeychainRun {

    KeychainRun() {
        System.out.println("executing keychain run in keychain run");
    }

    void show(Keychain keychain) {

        if (keychain != null) {
            keychain.info();
        } else {
            System.out.println("it is not a keychain");
        }
    }
}