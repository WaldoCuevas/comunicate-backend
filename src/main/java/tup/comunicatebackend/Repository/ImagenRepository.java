package tup.comunicatebackend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tup.comunicatebackend.Models.Imagen;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen,Integer>   {

    List<Imagen> findByOrderById();

}
