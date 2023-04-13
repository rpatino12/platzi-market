package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {
    // We can use Natives queries with SQL using the @Query annotation
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    // But is better to use the query methods, you just have to follow the notation correctly when naming the method
    // Let's create query methods that let us make queries only with the name of the method
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    // This query method find the products that are active (estado = true) and are the last units in the inventory
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
