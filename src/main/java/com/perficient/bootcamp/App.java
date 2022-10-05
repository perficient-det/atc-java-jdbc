package com.perficient.bootcamp;

import java.util.List;

import com.perficient.bootcamp.business.CatBO;
import com.perficient.bootcamp.business.PetOwnerBO;
import com.perficient.bootcamp.entity.Cat;
import com.perficient.bootcamp.entity.PetOwner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
//            PetOwner owner = new PetOwnerBO().findOwnerById(1);
            PetOwner owner = new PetOwnerBO().findOwnerByLastName("'BROOKS'");
//            PetOwner owner = new PetOwnerBO().findOwnerByLastName("'BROOKS'; insert into DOG (dog_id) values (" + new Random().nextInt() + ");");
//            PetOwner owner = new PetOwnerBO().findOwnerByLastName("'BROOKS'; DROP TABLE pets.dog;");
            List<Cat> cats = new CatBO().findAllCatsByOwnerId(owner.getOwnerId());

            System.out.println(owner);
            for (Cat cat : cats){
                System.out.println(cat);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }    
    }
}
