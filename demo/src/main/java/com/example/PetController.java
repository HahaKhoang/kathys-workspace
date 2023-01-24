package com.example;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

public class PetController {
    PetService petService;
    Javalin app;
    
    public PetController(){
        petService = new PetService();
        app = Javalin.create();
    }

    public void startAPI(){
        // An endpoint is a pattern for a way to contact this server on a particular URL
        app.get("/pet/", ctx ->  
        {
            System.out.println("Contacting endpoint /pet");
            List<Pet> pets = petService.getAllPets();
            ctx.json(pets);
        }
        );

        app.post("/pet", ctx -> {
            // For debugging, let's see what the request body looks like
            System.out.println(ctx.body());
            // Create soemthing called an object mapper from Jackson Databind (from Maven)
            ObjectMapper om = new ObjectMapper();
            //Use the ObjectMapper to convert the request body's JSON into a usable Java object
            Pet pet = om.readValue(ctx.body(), Pet.class);
            petService.insertPet(pet);
        }
        );

        app.get("/pet/{name}", ctx -> {
            String petName = ctx.pathParam("name");
            Pet pet = petService.getPetByName(petName);
            ctx.json(pet);
        }
        );

        


        app.start(9001);
    }
}
