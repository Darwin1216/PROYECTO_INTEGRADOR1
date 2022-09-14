/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.controlador;

import edu.ec.intsuperior.modelo.Clientes;
import edu.ec.intsuperior.modelo.Empleado;
import edu.ec.intsuperior.vista.Buscar_Cliente;
import edu.ec.intsuperior.vista.Inicio;

import edu.ec.intsuperior.vista.Subadmin;
import edu.ec.intsuperior.vista.Subempleados;

import edu.ec.intsuperior.vista.loggin;
import edu.ec.intsuperior.vista.logginemp;
import edu.ec.intsuperior.vista.Cliente;

import edu.ec.intsuperior.vista.Buscar_Empleado;
import edu.ec.intsuperior.vista.Empleados;
import edu.ec.intsuperior.vista.Reservas;
import edu.ec.intsuperior.vista.Servicio;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Controlador {

    Inicio inicio = new Inicio(this);
    loggin loggin = new loggin(this);
    logginemp logginemp = new logginemp(this);
    Subadmin subadmin = new Subadmin(this);
    Subempleados subempleados = new Subempleados(this);
    Cliente cliente = new Cliente(this);
    Buscar_Cliente buscar_Cliente = new Buscar_Cliente(this);
    Reservas Reservas = new Reservas(this);
    Servicio Servicio = new Servicio(this);
    Empleados empleados = new Empleados(this);
    Buscar_Empleado buscar_Empleado = new Buscar_Empleado(this);
    Conexion conexion = new Conexion();
 

    public void conectar() {
        conexion.getConexion();
    }

    public void showinicio() {
        inicio.setVisible(true);
    }

    public void closeinicio() {
        inicio.setVisible(false);
    }

    public void showloggin() {
        loggin.setVisible(true);
    }

    public void closeloggin() {
        loggin.setVisible(false);
    }

    public void showsubadmin() {
        subadmin.setVisible(true);
    }

    public void closesubadmin() {
        subadmin.setVisible(false);
    }

    public void showsubempleados() {
        subempleados.setVisible(true);
    }

    public void closesubempleados() {
        subempleados.setVisible(false);
    }

    public void showClinete() {
        cliente.setVisible(true);
    }

    public void closeCliente() {
        cliente.setVisible(false);
    }

    public void showBuscar_cliente() {
        buscar_Cliente.setVisible(true);
    }

    public void closeBuscar_cliente() {
        buscar_Cliente.setVisible(false);
    }

    public void showlogginemp() {
        logginemp.setVisible(true);
    }

    public void closelogginemp() {
        logginemp.setVisible(false);
    }

    public void showReservas() {
        Reservas.setVisible(true);
    }

    public void closeReservas() {
        Reservas.setVisible(false);
    }

    public void showServicio() {
        Servicio.setVisible(true);
    }

    public void closeServicio() {
        Servicio.setVisible(false);
    }

    public void showEmpleados() {
        empleados.setVisible(true);
    }

    public void closeEmpleados() {
        empleados.setVisible(false);
    }

    public void showBuscar_Empleado() {
        buscar_Empleado.setVisible(true);

    }

    public void closeBuscar_Empleados() {
        buscar_Empleado.setVisible(false);
    }

    public int existeUsuarioID(int idUsuario) {
        int cod = 0;
        String pass = "";
        try {

            String query = "SELECT * FROM usuario WHERE idUsuario = " + idUsuario;
            Statement st = Conexion.getConexion().createStatement();
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
                cod = resultSet.getInt("idUsuario");
                pass = resultSet.getString("passwd");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cod;
    }

    public String existeUsuarioPass(int idUsuario) {

        String pass = "";
        try {

            String query = "SELECT * FROM usuario WHERE idUsuario = " + idUsuario;
            Statement st = Conexion.getConexion().createStatement();
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
                pass = resultSet.getString("passwd");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return pass;
    }

    public ArrayList<Empleado> listaEmpleado() {
        ArrayList<Empleado> lista = new ArrayList<>();
        Empleado empleado;
        try {

            String query = "SELECT * FROM empleados";
            Statement st = Conexion.getConexion().createStatement();
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
                empleado = new Empleado();
                empleado.setIDEMPLEADOS(resultSet.getInt("IDEMPLEADOS"));
                empleado.setEMPNOMBRECOMPLETO(resultSet.getString("EMPNOMBRECOMPLETO"));
                empleado.setEMPEDAD(resultSet.getInt("EMPEDAD"));
                empleado.setEMPDIRECCION(resultSet.getString("EMPDIRECCION"));
                empleado.setEMPCARGO(resultSet.getString("EMPCARGO"));
                empleado.setEMPESTADOCIVIL(resultSet.getString("EMPESTADOCIVIL"));
                empleado.setEMPCORREO(resultSet.getString("EMPCORREO"));
                empleado.setEMPTELEFONO(resultSet.getString("EMPTELEFONO"));
                empleado.setEMPFECHAINGRESO(resultSet.getString("EMPFECHAINGRESO"));
                empleado.setEMPHORARIO(resultSet.getString("EMPHORARIO"));
                lista.add(empleado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista;
        
        
    }
 public ArrayList<Clientes> listaCliente() {
        ArrayList<Clientes> lista = new ArrayList<>();
        Clientes clientes;
         ;
        try {

            String query = "SELECT * FROM clientes";
            Statement st = Conexion.getConexion().createStatement();
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()) {
               clientes = new Clientes();
                clientes.setIDCLIENTE(resultSet.getInt("IDCLIENTES"));
               clientes.setCLINOMBRECOMPLETO(resultSet.getString("CLINOMBRECOMPLETO"));
                clientes.setCLITELEFONO(resultSet.getString("CLITELEFONO"));
                clientes.setCLIDIRECCION(resultSet.getString("CLIDIRECCION"));
                clientes.setCLICORREO(resultSet.getString("CLIEMAIL"));
                lista.add(clientes);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 return lista;
 }
}
 




