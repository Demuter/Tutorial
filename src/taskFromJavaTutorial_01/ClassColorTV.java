package taskFromJavaTutorial_01;

public class ClassColorTV implements InterfaceTV {

    String turn, volume, channel, brightness, searchChannels;


    @Override
    public void turn(String newTurn) {
        turn = ("TV was turned " + newTurn);
        System.out.println(turn);
    }

    @Override
    public void volume(String newVolume) {
        volume = ("TV was turned " + newVolume);
        System.out.println(volume);
    }

    @Override
    public void channel(String newChannel) {
        channel = ("TV was turned " + newChannel);
        System.out.println(channel);
    }

    @Override
    public void brightness(String newBrightness) {
        brightness = ("TV was turned " + newBrightness);
        System.out.println(brightness);
    }

    @Override
    public void searchChannels(String newStart) {
        searchChannels = ("TV was turned " + newStart);
        System.out.println(searchChannels);
    }
}
