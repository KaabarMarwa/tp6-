package com.marwa.produits.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idMarque;
private String nomMarque;

@JsonIgnore
@OneToMany(mappedBy = "marque")
private List<Produit> produits;

public Marque(String nomMarque, List<Produit> produits)
{

super();
this.nomMarque = nomMarque;
this.produits = produits;
}
public Long getIdMarque() {
return idMarque;
}
public void setIdMarque(Long idMarque) {
this.idMarque = idMarque;
}
public String getNomMarque() {
return nomMarque;
}
public void setNomMarque(String nomMarque) {
this.nomMarque = nomMarque;
}

public List<Produit> getProduits() {
return produits;
}
public void setProduits(List<Produit> produits) {
this.produits = produits;
}
}