/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.controladores;

import static edu.cecar.componentes.singletons.SingletonConexionBD.getInstance;
import edu.cecar.modelos.Example;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author C4RL05 B3LTR4N
 */
public class ControladorExample {
    public Vector<Example> consultarExample() throws SQLException{
        Vector<Example> resultado = new Vector<>();
        PreparedStatement ps = getInstance().prepareStatement("Select * " + "from manpower.examples limit 1000");
        ResultSet resultSet = ps.executeQuery();
        
        while (resultSet.next()) {            
            Example example = new Example(resultSet.getString(1),
                                          resultSet.getString(2),
                                          resultSet.getString(3),
                                          resultSet.getString(4));
            resultado.add(example);
        }
        return resultado;
    }
}
