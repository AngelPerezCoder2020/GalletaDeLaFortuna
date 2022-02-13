package com.mycompany.galletadelafortunaproject;

public class GalletaDeLaFortuna {
    private String Mensaje;
    public GalletaDeLaFortuna(String Mensaje){
        this.Mensaje = Mensaje;
    }
    public void MostrarMensaje(){
        PantallaPrincipal.pantalla.getMostrador().setText(Mensaje);
    }
}
