package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Produto p = new Produto("frango", 17.1);
        System.out.printf("O preço do %s está em R$ %.2f%n", p.getNome(), p.getPreco());
    }
}
