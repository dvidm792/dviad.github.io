package practica.patrones.repositorios;

import java.util.List;

import practica.patrones.dominio.Empresa;

public interface IEmpresaDao 
{
    public void insertar(Empresa empresa);
    public void eliminar(Empresa empresa);
    public List<Empresa> consultarTodos();
}
