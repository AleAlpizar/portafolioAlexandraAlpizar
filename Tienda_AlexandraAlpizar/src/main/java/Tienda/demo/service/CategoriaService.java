/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda.demo.service;

/**
 *
 * @author 11alp
 */
import Tienda.demo.domain.categoria;
import java.util.List;
public interface CategoriaService {        

// Se obtiene un listado de categorias en un List    
    public List<categoria> getCategorias(boolean activos); 
    public categoria getCategoria(categoria categoria);
    public void save(categoria categoria);
    public void delete(categoria categoria);
}