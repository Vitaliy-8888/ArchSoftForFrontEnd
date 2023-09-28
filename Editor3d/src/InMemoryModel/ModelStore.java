package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

// импортируем классы из других пакетов для наших переменных
import ModelEliments.Camera;
import ModelEliments.Flash;
import ModelEliments.PoligonalModel;
import ModelEliments.Scene;

// создаем класс ModelStore и имплементируем интерфейс iModelChanger
public class ModelStore implements iModelChanger {
    // добавим типы данных и переменные
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers; // [] - массив

    // создаем конструктор для отношения агрегации (незакрашенного ромбика)
    public ModelStore(iModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        // инициализируем
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
    }

    public Scene getScena(int id) // метод getScena с типом Scene принимает id и возвращает scenes.get(i)
    {
        for (int i = 0; i < scenes.size(); i++) // делаем проверку
        {
            if (scenes.get(i).id == id) 
            {
                return scenes.get(i);
            }
        }
        return null;
    }

    // добавляем метод для iModelChanger
    @Override
    public void NotifyChange(iModelChanger sender) {

    }
}