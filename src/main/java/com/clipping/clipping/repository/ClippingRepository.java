package com.clipping.clipping.repository;

import com.clipping.clipping.model.ClippingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime; // Importação adicionada
import java.util.List;

@Repository
public interface ClippingRepository extends JpaRepository<ClippingModel, Long> {
    List<ClippingModel> findByPalavraBusca(String palavraBusca);
    List<ClippingModel> findByDataBuscaAfter(LocalDateTime data);
}