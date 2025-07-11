import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTask(String description){
        tasks.add(new Task(description));
        System.out.println("Задача добавлена");
    }

    public void removeTask(int index){
        if(index >= 0 && index <= tasks.size()){
            tasks.remove(index);
            System.out.println("Задача удалена");
        }else{
            System.out.println("Неверный индекс задачи");
        }
    }

    public void completeTask(int index){
        if(index >= 0 && index <= tasks.size()){
            tasks.get(index).marksAsCompleted();
            System.out.println("Задача отмечена как выполненная");
        }else{
            System.out.println("Неверный индекс задачи");
        }

    }

    public void showTasks(){
        if(tasks.isEmpty()){
            System.out.println("Список задач пуст");
        }else{
            for(int i= 0; i < tasks.size(); i ++){
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }
}
