package com.david.di.crud.apiproducts.repositories;

import com.david.di.crud.apiproducts.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {
}
