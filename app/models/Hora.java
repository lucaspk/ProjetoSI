package models;

public enum Hora {

        Seis(6), Oito(8), Dez(10), Doze(12), Quatorze(14), Desseis(16), Dezoito(18), Vinte(20), VinteDois(22);

        private int hora;

        Hora(int hora) {this.hora = hora;}

        public int getHora() { return hora; }

        public void setHora(int hora) { this.hora = hora; }

}
