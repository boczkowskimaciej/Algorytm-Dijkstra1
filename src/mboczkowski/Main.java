package mboczkowski;

import mboczkowski.model.Edge;
import mboczkowski.model.Vertex;

public class Main {

    public static void main(String[] args) {

        Vertex wroclaw = new Vertex("Wroclaw");
        Vertex poznan = new Vertex("Poznan");
        Vertex warszawa = new Vertex("Warszawa");
        Vertex gdansk = new Vertex("Gdansk");
        Vertex krakow = new Vertex("Krakow");
        Vertex lodz = new Vertex("Lodz");
        Vertex bialystok = new Vertex("Bialystok");

        wroclaw.link(poznan,150);
        wroclaw.link(lodz, 200);
        lodz.link(poznan,150);
        lodz.link(warszawa,100);
        warszawa.link(gdansk,150);
        warszawa.link(bialystok,200);
        warszawa.link(krakow,300);
        bialystok.link(krakow,400);

        




    }
}
