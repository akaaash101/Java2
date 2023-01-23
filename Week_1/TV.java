package Week_1;

public class TV {

    int channel;
    int volume;
    boolean on;

    public TV() {

    }

    public void TurnOn() {
        on = true;
    }

    public void TurnOff() {
        on = false;
    }

    public void SetChannel(int newChannel) {
        if (newChannel <= 120 && newChannel >= 1) {
            channel = newChannel;
        }
    }

    public void ChannelUp() {
        if (channel < 120) {
            channel++;
        }
    }

    public void ChannelDown() {
        if (channel > 1) {
            channel--;
        }
    }

    @Override
    public String toString() {
        return "TV [channel: " + channel + " volume=" + volume + "]";
    }
}
