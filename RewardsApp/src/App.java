import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.BronzeGenerator;
import Fabric.EmeraldGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.PearlGenerator;
import Fabric.PlatinumGenerator;
import Fabric.RubyGenerator;
import Fabric.SilverGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        // создаем список ItemGenerator
        List<ItemGenerator> generators = new ArrayList<>();

        // добавим фабрики генераторов наград
        for (int i = 0; i < 10; i++) {            // золота 10
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 5; i++) {             // алмазов 5
            generators.add(new GemGenerator());
        }
        for (int i = 0; i < 20; i++) {            // серебро 20
            generators.add(new SilverGenerator());
        }      
        for (int i = 0; i < 20; i++) {            // бронза 20
            generators.add(new BronzeGenerator());
        }
        for (int i = 0; i < 10; i++) {               // платина 10
            generators.add(new PlatinumGenerator());
        }
        for (int i = 0; i < 10; i++) {              // изумруд 10
            generators.add(new EmeraldGenerator());
        }
        for (int i = 0; i < 10; i++) {              // рубин 10
            generators.add(new RubyGenerator());
        }
        for (int i = 0; i < 10; i++) {               // жемчуг 10
            generators.add(new PearlGenerator());
        }

        
        // рандомно генерируем 10 наград
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(95); // 95 - количество запросов на фабрики
            generators.get(index).openReward();
        }
    }
}
