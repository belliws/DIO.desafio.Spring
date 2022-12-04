package one.digitalinovation.Service.impl;

import org.springframework.stereotype.Service;

import one.digitalinovation.Service.ClienteService;
import one.digitalinovation.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Override
    public Iterable<Cliente> buscarTodos(){
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id){
        return null;
    }

    @Override
    public void inserir(Cliente cliente){}

    @Override
    public void atualizar(Long id, Cliente cliente){}
    
    @Override
    public void deletar(Long id){}

    
}
