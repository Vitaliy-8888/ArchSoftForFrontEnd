package Fabric;

import Interface.iGameItem;

public abstract class ItemGenerator {
    // публичный абстрактный метод, который возвращает интерфейс iGameItem
    public abstract iGameItem createItem();  
    // метод openReward - открывает награду
    public void openReward()
    {
        // метод createItem создаст новый продукт, и сразу его откроем
        createItem().open();
    }
}
