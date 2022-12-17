package ec.edu.itsqmet.product.dto;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name =  "product")
public class ProductDTO {
	@Id
	private Integer id_producto;
	private String name ;
	private double price;
	private int stock;
	private boolean status;
}
