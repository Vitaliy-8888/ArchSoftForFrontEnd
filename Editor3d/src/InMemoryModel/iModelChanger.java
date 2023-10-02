package InMemoryModel;

// Интерфейс смены модели
public interface iModelChanger {
    // метод ничего не возвращает - void
    // sender - переменная, тип у неё  - iModelChanger
    public void NotifyChange(iModelChanger sender);
}