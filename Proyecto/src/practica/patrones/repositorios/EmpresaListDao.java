package practica.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practica.patrones.dominio.Empresa;

public class EmpresaListDao implements IEmpresaDao
{
    List<Empresa> empresaListas = new ArrayList<>();

    public EmpresaListDao ()
    {
        empresaListas.add(new Empresa("SOLUTIONS S.A.", "Av. Luis Plaza Dañin y Hermano Miguel.", 01, "10448009899"));
    }

    @Override
    public void insertar(Empresa empresa) 
    {
       empresaListas.add(empresa);
        
    }

    @Override
    public void eliminar(Empresa empresa) 
    {
        empresaListas.remove(empresa);
        
    }

    @Override
    public List<Empresa> consultarTodos() 
    {
        return empresaListas;
    }
    
    
}
