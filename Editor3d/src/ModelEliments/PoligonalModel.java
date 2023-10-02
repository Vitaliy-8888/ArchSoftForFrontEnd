package ModelEliments;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public PoligonalModel(List<Texture> Textures) {
        // Poligons создаем внутри
        // Textures получаем сслку снаружи - это агрегация
        this.Poligons = new ArrayList<>();
        this.Textures = Textures;

        // т.к. (1..*) - то в Poligons мы должны добавить один элемент new Poligon
        this.Poligons.add(new Poligon(new Point3D()));
    }
}