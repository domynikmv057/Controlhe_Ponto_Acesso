package com.dio.Live.service;

import com.dio.Live.model.TipoData;
import com.dio.Live.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TipoDataService {


    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData saveTipoData(TipoData tipoData){
       return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional <TipoData> getById(Long idTipoData) {
        return tipoDataRepository.findById(idTipoData);
    }

    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void deleteTipoData(Long idTipoData) {
         tipoDataRepository.deleteById(idTipoData);
    }
}
