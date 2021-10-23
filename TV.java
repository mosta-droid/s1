package sec1_1;
public class TV 
{
    
    private int channel;
    private int volume;
    private boolean on;
    public TV() 
    {
        channel=1;
        volume=1;
        on=true;
    }
    public void turnon()
    {
        on=true;
    }
    public void turnoff()
    {
        on=false;
    }
    public void setchannel(int newchannel)
    {
        if(newchannel<=120&&newchannel>0)
            channel=newchannel;
        else
            System.out.println("enter correct channel");
    }
    public void setvolume(int newvolume)
    {
        if(newvolume<=7&&newvolume>0)
            volume =newvolume;
        else
            System.out.println("enter correct volume");
    }
    public void chaneelup()
    {
        if(channel!=120)
            channel++;
        else
            System.out.println("the last channel 120");
    }
    public void changedown()
    {
        if(channel!=1)
            channel--;
        else
            System.out.println("the first channel 1");
    }
    public void volumeup()
    {
        if(volume!=7)
            volume++;
        else
            System.out.println("the high volume 7");
    }
    public void volumedown()
    {
        if(volume!=1)
            volume--;
        else
            System.out.println("the low volume 1");
    }
}
