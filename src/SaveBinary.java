/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author user
 */
public class SaveBinary 
{
    public static void main(String[] args) 
    {
        File file = new File("save.bin");
        String txtToSave = "Blah Blah Blah 2023 Jan 17";
        Pokemon[] pokemons = new Pokemon[3];
        pokemons[0] = new Pokemon("Pikachu", 14);
        pokemons[1] = new Pokemon("Charmander", 50);
        pokemons[2] = new Pokemon("Bulbasaur", 99);
        
        try
        {
            FileOutputStream strmFileOut = new FileOutputStream(file);
            ObjectOutputStream strmObjOut = new ObjectOutputStream(strmFileOut);
            
            strmObjOut.writeObject(txtToSave);
            
            for(int i = 0; i < pokemons.length; i++)
            {
                System.out.println(pokemons[i]);
                strmObjOut.writeObject(pokemons[i]);
            }
            System.out.println("closing");
            strmObjOut.close();
        } 
        catch (IOException e) 
        {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
