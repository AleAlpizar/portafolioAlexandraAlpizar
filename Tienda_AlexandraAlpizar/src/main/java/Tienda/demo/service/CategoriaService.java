/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda.demo.service;

/**
 *
 * @author 11alp
 */
import Tienda.demo.domain.Categoria;
import java.util.List;
public interface CategoriaService {        

// Se obtiene un listado de categorias en un List    
    public List<Categoria> getCategorias(boolean activos); 
    public Categoria getCategoria(Categoria categoria);
    public void save(Categoria categoria);
    public void delete(Categoria categoria);

    public Object getcategoria(Categoria categoria);
}