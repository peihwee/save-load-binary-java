/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author user
 */
public class ReadBinary {
    public static void main(String[] args)
    {
        File file = new File("save.bin");
        String txtToSave;
        Pokemon[] pokemons = new Pokemon[3];
        
        try 
        {
            FileInputStream strmFileIn = new FileInputStream(file);
            ObjectInputStream strmObjIn = new ObjectInputStream(strmFileIn);
            
            txtToSave = (String) strmObjIn.readObject();
            System.out.println("txtToSave: " + txtToSave);
            
            for (int i = 0; i < pokemons.length; i++) 
            {
                pokemons[i] = (Pokemon) strmObjIn.readObject();
                System.out.println("pokemons["+i+"] Name: " + pokemons[i].getName());
                System.out.println("pokemons["+i+"] Level: " + pokemons[i].getLevel());
            }
            strmObjIn.close();
        } 
        catch (IOException e) 
        {
            System.out.println("IOException: " + e.getMessage());
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
