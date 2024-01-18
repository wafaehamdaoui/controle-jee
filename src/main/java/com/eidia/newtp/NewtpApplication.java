package com.eidia.newtp;

import com.eidia.newtp.Entities.Produit;
import com.eidia.newtp.Entities.Utilisateur;
import com.eidia.newtp.dao.ProduitRepository;
import com.eidia.newtp.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NewtpApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(NewtpApplication.class, args);
        ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
        //userRepository.save(new Utilisateur("wafae","12345"));
        produitRepository.save(new Produit("product1",690,90));
        produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
    }

}
