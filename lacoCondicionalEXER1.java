package pacoteJava;

public class lacoCondicionalEXER1 {

}
String primeiraPalavra;
String segundaPalavra;
String terceiraPalavra;
String animal = "";
        
System.out.println("\n\nExercício 5:");

System.out.println("\nDigite a primeira palavra: ");
primeiraPalavra = ler.nextLine().toLowerCase();
        
System.out.println("Digite a segunda palavra: ");
segundaPalavra = ler.nextLine().toLowerCase();
        
System.out.println("Digite a terceira palavra: ");
terceiraPalavra = ler.nextLine().toLowerCase();
        
if(primeiraPalavra.equals("vertebrado") && segundaPalavra.equals("ave") && terceiraPalavra.equals("carnivoro"))
{
  animal = "Águia";
}
else if(primeiraPalavra.equals("vertebrado") && segundaPalavra.equals("ave") && terceiraPalavra.equals("onivoro"))
{
  animal = "Pomba";
}
else if(primeiraPalavra.equals("vertebrado") && segundaPalavra.equals("mamifero") && terceiraPalavra.equals("onivoro"))
{
  animal = "Homem";
}
else if(primeiraPalavra.equals("vertebrado") && segundaPalavra.equals("mamifero") && terceiraPalavra.equals("herbivero"))
{
  animal = "Vaca";
}
else if(primeiraPalavra.equals("invertebrado") && segundaPalavra.equals("inseto") && terceiraPalavra.equals("hematofago"))
{
  animal = "Pulga";
}
else if(primeiraPalavra.equals("invertebrado") && segundaPalavra.equals("inseto") && terceiraPalavra.equals("herbivoro"))
{
  animal = "Lagarta";
}
else if(primeiraPalavra.equals("invertebrado") && segundaPalavra.equals("anelideo") && terceiraPalavra.equals("hematofago"))
{
  animal = "Sanguessuga";
}
else if(primeiraPalavra.equals("invertebrado") && segundaPalavra.equals("anelideo") && terceiraPalavra.equals("onivoro")){
  animal = "Minhoca";
}
        
System.out.printf("Animal: %s", animal);{
}
}
}


