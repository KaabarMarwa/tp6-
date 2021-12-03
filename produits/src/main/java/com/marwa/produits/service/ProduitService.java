package com.marwa.produits.service;
import java.util.List;

import com.marwa.produits.entities.Marque;
import com.marwa.produits.entities.Produit;

public interface ProduitService {
Produit saveProduit(Produit p);
Produit updateProduit(Produit p);
void deleteProduit(Produit p);
void deleteProduitById(Long id);
Produit getProduit(Long id);
List<Produit> getAllProduits();
List<Produit> findByNomProduit(String nom);
List<Produit> findByNomProduitContains(String nom);
List<Produit> findByNomPrix (String nom, Double prix);
List<Produit> findByMarque (Marque marque);
List<Produit> findByMarqueIdMarque(Long id);
List<Produit> findByOrderByNomProduitAsc();
List<Produit> trierProduitsNomsPrix();
}