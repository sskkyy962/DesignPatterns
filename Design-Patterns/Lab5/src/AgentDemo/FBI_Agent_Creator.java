package AgentDemo;
import PoolPattern.AgentDemo.ObjectCreation_IF;
public class FBI_Agent_Creator implements ObjectCreation_IF{
    private String[] footprint = {"@", "#", "$", "*", ".", "?"};
    private int index;
    public Object create(){
        FBI_Agent agent = new FBI_Agent(footprint[index++]) {
            @Override
            public void startTask() {

            }

            @Override
            public void stopTask() {

            }

//            @Override
//            public void run() {
//
//            }
        };
        return agent;
    }
}
