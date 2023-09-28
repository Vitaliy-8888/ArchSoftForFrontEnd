package InMemoryModel;

//Интерфейс позволяет сменить наблюдателя (позицию наблюдателя)
public interface iModelChangeObserver {
    // метод ApplyUpdateModel позволяет пересчитать модель
    // но метод ничего не принимает и не возвращает - void 
    public void ApplyUpdateModel();     
}
