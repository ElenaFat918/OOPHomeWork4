import java.util.ArrayList;

public class Serch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> plans;

    public Serch(Planner planner) {
        plans = planner.getPlanner();
    }

    public ArrayList<String> spend(Planner m, Priority p) {
        for (Node i : plans) { //бегаем по узлам из дерева
            if ( i.p == p) { //достаем атрибуты и сравниваем их
                result.add(i.m.getMission()); //добавляем в результ список
            }
        }
        return result;
    }

}
