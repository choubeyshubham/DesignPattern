package StructuralDesignPattern.Proxy.Challange;

interface Internet {
    public void connectTo(String serverhost) throws Exception;
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
    }
}
