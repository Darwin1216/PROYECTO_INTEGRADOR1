/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.modelo;

/**
 *
 * @author user
 */
public class Empleado {
    int IDEMPLEADOS,EMPEDAD;
    String EMPNOMBRECOMPLETO,EMPDIRECCION,EMPCARGO,EMPESTADOCIVIL,EMPCORREO,EMPTELEFONO,EMPFECHAINGRESO,EMPHORARIO;

    public Empleado() {
    }

    public Empleado(int IDEMPLEADOS, int EMPEDAD, String EMPNOMBRECOMPLETO, String EMPDIRECCION, String EMPCARGO, String EMPESTADOCIVIL, String EMPCORREO, String EMPTELEFONO, String EMPFECHAINGRESO, String EMPHORARIO) {
        this.IDEMPLEADOS = IDEMPLEADOS;
        this.EMPEDAD = EMPEDAD;
        this.EMPNOMBRECOMPLETO = EMPNOMBRECOMPLETO;
        this.EMPDIRECCION = EMPDIRECCION;
        this.EMPCARGO = EMPCARGO;
        this.EMPESTADOCIVIL = EMPESTADOCIVIL;
        this.EMPCORREO = EMPCORREO;
        this.EMPTELEFONO = EMPTELEFONO;
        this.EMPFECHAINGRESO = EMPFECHAINGRESO;
        this.EMPHORARIO = EMPHORARIO;
    }

    public int getIDEMPLEADOS() {
        return IDEMPLEADOS;
    }

    public void setIDEMPLEADOS(int IDEMPLEADOS) {
        this.IDEMPLEADOS = IDEMPLEADOS;
    }

    public int getEMPEDAD() {
        return EMPEDAD;
    }

    public void setEMPEDAD(int EMPEDAD) {
        this.EMPEDAD = EMPEDAD;
    }

    public String getEMPNOMBRECOMPLETO() {
        return EMPNOMBRECOMPLETO;
    }

    public void setEMPNOMBRECOMPLETO(String EMPNOMBRECOMPLETO) {
        this.EMPNOMBRECOMPLETO = EMPNOMBRECOMPLETO;
    }

    public String getEMPDIRECCION() {
        return EMPDIRECCION;
    }

    public void setEMPDIRECCION(String EMPDIRECCION) {
        this.EMPDIRECCION = EMPDIRECCION;
    }

    public String getEMPCARGO() {
        return EMPCARGO;
    }

    public void setEMPCARGO(String EMPCARGO) {
        this.EMPCARGO = EMPCARGO;
    }

    public String getEMPESTADOCIVIL() {
        return EMPESTADOCIVIL;
    }

    public void setEMPESTADOCIVIL(String EMPESTADOCIVIL) {
        this.EMPESTADOCIVIL = EMPESTADOCIVIL;
    }

    public String getEMPCORREO() {
        return EMPCORREO;
    }

    public void setEMPCORREO(String EMPCORREO) {
        this.EMPCORREO = EMPCORREO;
    }

    public String getEMPTELEFONO() {
        return EMPTELEFONO;
    }

    public void setEMPTELEFONO(String EMPTELEFONO) {
        this.EMPTELEFONO = EMPTELEFONO;
    }

    public String getEMPFECHAINGRESO() {
        return EMPFECHAINGRESO;
    }

    public void setEMPFECHAINGRESO(String EMPFECHAINGRESO) {
        this.EMPFECHAINGRESO = EMPFECHAINGRESO;
    }

    public String getEMPHORARIO() {
        return EMPHORARIO;
    }

    public void setEMPHORARIO(String EMPHORARIO) {
        this.EMPHORARIO = EMPHORARIO;
    }
    
    
}
