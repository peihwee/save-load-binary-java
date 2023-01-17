/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;
/**
 *
 * @author user
 */
public class Pokemon implements Serializable
{
    private String sName;
    private int iLevel;
    
    public Pokemon(String sName, int iLevel)
    {
        this.sName = sName;
        this.iLevel = iLevel;
    }
    
    public String getName()
    {
        return this.sName;
    }
    
    public int getLevel()
    {
        return this.iLevel;
    }
}
