package dk.easj.nick6375.beeradviser;



import java.util.ArrayList;
import java.util.List;

public class BeerExpert
{
    List<String> getBrands (String color)
    {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber"))
        {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else if(color.equals("light"))
        {
            brands.add("Michelob Ultra");
            brands.add("Heineken Light");
        }
        else if (color.equals("dark"))
        {
           brands.add("Guiness Draught");
           brands.add("Sleeman Dark");
        }
        else
        {
            brands.add("Big Rock Traditional");
            brands.add("Sleeman Honey Brown Lager");
        }
        return brands;
    }
}


