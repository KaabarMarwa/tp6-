package com.marwa.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marwa.produits.entities.Marque;
import com.marwa.produits.entities.Produit;
import com.marwa.produits.repos.ProduitRepository;
@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private ProduitRepository produitRepository;
@Test
public void testCreateProduit() {
Produit prod = new Produit("rouge a levre",2200.500,new Date());
produitRepository.save(prod);
}
@Test
public void testFindProduit()
{
Produit p = produitRepository.findById(1L).get();

System.out.println(p);
}
@Test
public void testUpdateProduit()
{
Produit p = produitRepository.findById(2L).get();
p.setPrixProduit(100.0);
produitRepository.save(p);
}
@Test
public void testDeleteProduit()
{
produitRepository.deleteById(1L);;
}
@Test
public void testListerTousProduits()
{
List<Produit> prods = produitRepository.findAll();
for (Produit p : prods)
{
System.out.println(p);
}

}
@Test
public void testFindProduitByNom()
{
List<Produit> prods = produitRepository.findByNomProduit("PC");

for (Produit p : prods)
{
System.out.println(p);
}

}

@Test
public void testFindByNomProduitContains ()
{
List<Produit> prods=produitRepository.findByNomProduitContains("rouge a levre");

for (Produit p : prods)
{
System.out.println(p);
} }

@Test
public void testfindByNomPrix()
{
List<Produit> prods = produitRepository.findByNomPrix("mascara", 20.0);
for (Produit p : prods)
{
System.out.println(p);
}
}

@Test
public void testfindByMarque()
{
Marque marque = new Marque();
marque.setIdMarque(1L);
List<Produit> prods = produitRepository.findByMarque(marque);
for (Produit p : prods)
{
System.out.println(p);
}
}

@Test
public void findByMarqueIdMarque()
{
List<Produit> prods = produitRepository.findByMarqueIdMarque(2L);
for (Produit p : prods)
{
System.out.println(p);
}

}

@Test
public void testfindByOrderByNomProduitAsc()
{
List<Produit> prods =produitRepository.findByOrderByNomProduitAsc();
for (Produit p : prods)
{
System.out.println(p);
}

}


@Test
public void testTrierProduitsNomsPrix()
{
List<Produit> prods = produitRepository.trierProduitsNomsPrix();
for (Produit p : prods)
{
System.out.println(p);
}
}

}

