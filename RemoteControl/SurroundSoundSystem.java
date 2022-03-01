public class SurroundSoundSystem implements Device{
    @Override
    public void performAction() {
        settingBass();       
        settingTreble();
        settingLight();
    }
    private void settingBass(){
        System.out.println("Setting the bass of speaker...");
    }
    private void settingTreble(){
        System.out.println("Setting the treble of speaker...");
    }
    private void settingLight(){
        System.out.println("Setting the light of speaker...");
    }
}
