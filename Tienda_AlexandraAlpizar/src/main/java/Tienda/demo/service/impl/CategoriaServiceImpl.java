/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.demo.service.impl;

/**
 *
 * @author 11alp
 */
import Tienda.demo.dao.CategoriaDao;
import Tienda.demo.domain.categoria;
import Tienda.demo.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Tienda.demo.dao.CategoriaDao;
@Service
class CategoriaServiceImpl implements CategoriaService { 
    
    @Autowired    
    private CategoriaDao categoriaDao;    
    @Override    @Transactional(readOnly=true)    
    public List<categoria> getCategorias(boolean activos) {        
        var lista=categoriaDao.findAll();      
        if (activos) {           
            lista.removeIf(e -> !e.isActivo());        
        }        
        return lista;    
    }
}
