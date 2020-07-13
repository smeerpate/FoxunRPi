import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

/***********************************************************************
 * Intetion is to operate the Foxun 4x4 HDMI Matrix 4K@60Hz 4:4:4
 * via network using the GPIO pins on the Raspberry Pi.
 * ********************************************************************/ 
public class FoxunRPi
{
	public static void main(String[] args) throws InterruptedException
	{
		GpioController gpioCtrl = GpioFactory.getInstance();
		GpioPinDigitalInput btnSel = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, PinPullResistance.PULL_DOWN);
		
		// Add event listner for btnSel.
        btnSel.addListener(new GpioPinListenerDigital()
        {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event)
			{
				if(event.getState().isHigh())
				{
					System.out.println("[INFO]   btnSel state is high.");
				}
				else
				{
					System.out.println("[INFO]   btnSel state is low.");
				}
			}
        });
		
	}
}
