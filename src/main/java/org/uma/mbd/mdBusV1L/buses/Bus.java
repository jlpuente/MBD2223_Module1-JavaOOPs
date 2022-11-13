package org.uma.mbd.mdBusV1L.buses;

import java.util.Objects;

public class Bus {

    private int codBus;
    private String matricula;
    private int codLinea;

    public Bus(int codBus, String matricula){
        this.codBus = codBus;
        this.matricula = matricula;
        codLinea = 0;
    }

    public void setCodLinea(int codLinea){
        this.codLinea = codLinea;
    }

    public int getCodBus() {
        return codBus;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCodLinea() {
        return codLinea;
    }

    @Override
    public boolean equals(Object o){
        return (o instanceof Bus b)
                && (b.codBus == codBus)
                && (b.matricula.equalsIgnoreCase(matricula));
    }

    @Override
    public int hashCode(){
        return Objects.hash(codBus, matricula.toLowerCase(), codLinea);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Bus(");
        sb.append(codBus)
        .append(",")
        .append(matricula)
        .append(",")
        .append(codLinea)
        .append(")");
        return sb.toString();
    }
}
