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
public class Clientes {
    int IDCLIENTES;
    String CLINOMBRECOMPLETO,CLIDIRECCION,CLIEMAIL,CLITELEFONO;
    
     public Clientes() {
     }
    

    public Clientes(int IDCLIENTES, String CLINOMBRECOMPLETO,  String CLIEMAIL, String CLITELEFONO, String CLIDIRECCION) {
        this.IDCLIENTES = IDCLIENTES;
        this.CLINOMBRECOMPLETO = CLINOMBRECOMPLETO;
        this.CLITELEFONO = CLITELEFONO;
        this.CLIDIRECCION=CLIDIRECCION;
        this.CLIEMAIL = CLIEMAIL;
        
    }

        public int getIDCLIENTE() {
            return IDCLIENTES;
        }

        public void setIDCLIENTE(int IDCLIENTE) {
            this.IDCLIENTES = IDCLIENTE;
        }

        public String getCLINOMBRECOMPLETO() {
            return CLINOMBRECOMPLETO;
        }

        public void setCLINOMBRECOMPLETO(String CLINOMBRECOMPLETO) {
            this.CLINOMBRECOMPLETO = CLINOMBRECOMPLETO;
        }

        public String getCLIDIRECCION() {
            return CLIDIRECCION;
        }

        public void setCLIDIRECCION(String CLIDIRECCION) {
            this.CLIDIRECCION = CLIDIRECCION;
        }

        public String getCLIEMAIL() {
            return CLIEMAIL;
        }

        public void setCLICORREO(String CLIEMAIL) {
            this.CLIEMAIL = CLIEMAIL;
        }

        public String getCLITELEFONO() {
            return CLITELEFONO;
        }

        public void setCLITELEFONO(String CLITELEFONO) {
            this.CLITELEFONO = CLITELEFONO;
        }

    
}
    

