package com.greenfoxacademy.pallida.repository;

import com.greenfoxacademy.pallida.model.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClothingRepo extends CrudRepository<Warehouse, Long> {
  @Query("select distinct c.itemName from Warehouse c")
  List<Warehouse> findAllDistinctByItemName();
  @Query("select distinct c.size from Warehouse c")
  List<Warehouse> findAllDistinctBySize();

  List<Warehouse> findAll();
  Warehouse findFirstByItemName(String name);

  List<Warehouse> findAllByUnitPriceGreaterThan(Float number);
  List<Warehouse> findAllByUnitPriceIsLessThan(Float number);
  List<Warehouse> findAllByUnitPriceEquals(Float number);

}
