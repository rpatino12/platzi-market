package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Long> {
    // We have to create a query method to find the purchases by client
    Optional<List<Compra>> findByIdCliente(String idCliente);
}
