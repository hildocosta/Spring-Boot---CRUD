package br.com.historico.historico.service.mapper;

public interface Mapper<A, B>{

    B map(A input);
}