public class Person{
    public static void main(String args[]){
        Device projector = new Projector();
        Device tv = new TV();
        Device soundSystem = new SurroundSoundSystem();

        RemoteControl.connectTo(projector);
        RemoteControl.connectTo(tv);
        RemoteControl.connectTo(soundSystem);
    }
}