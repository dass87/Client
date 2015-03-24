/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.tripdashboard.pets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author David
 */
public class RestClient {

    // http://localhost:8080/pets/api/pets
    public static void main(String[] args) throws IOException {

        String pet;
        int choose;

        System.out.println("Do you want to see a list of Pets, one Pet by ID or even create a Pet? \n Type: \n 1 to see the list \n 2 to see the Pet \n 3 to create one Pet.");
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);
        pet = br.readLine();

        choose = Integer.valueOf(pet);

        get_Create_Pet(choose);

    }

    public static int get_Create_Pet(int choose) throws IOException {

        if (choose == 1) {
            /* GET Pet List*/
            Client client = ClientBuilder.newClient();
            List<Pett> pets = client.target("http://localhost:8080/TD-Pets/api/pets")
                    .request(MediaType.APPLICATION_JSON)
                    .get(new GenericType<List<Pett>>() {
                    });

            System.out.println(pets);
            
        } else if (choose == 2) {
            String ids;
            int id;

            System.out.println("Type the ID that you want to see");
            InputStreamReader str = new InputStreamReader(System.in);
            BufferedReader bR = new BufferedReader(str);
            ids = bR.readLine();

            id = Integer.valueOf(ids);

            /* GET Pet by ID*/
            Client client = ClientBuilder.newClient();
            WebTarget myResource = client.target("http://localhost:8080/TD-Pets/api/pets/" + id);
            Pett response = myResource.request(MediaType.APPLICATION_JSON)
                    .get(Pett.class);

            System.out.println(response);

        } else if (choose == 3) {

            Pett pet1 = new Pett();

            String x;

            InputStreamReader str = new InputStreamReader(System.in);
            BufferedReader bR = new BufferedReader(str);

            System.out.println("Name : ");
            x = bR.readLine();
            pet1.setName(x);

            Client client = ClientBuilder.newClient();
            WebTarget myResource = client.target("http://localhost:8080/TD-Pets/api/pets");
            Pett pet = myResource.request(MediaType.APPLICATION_JSON).post(Entity.json(pet1), Pett.class);
            
            System.out.println("You´ve created a Pet with name: " + x);

        } else {
            System.out.println("Wrong choose!");
        }
        return 0;
    }
}
