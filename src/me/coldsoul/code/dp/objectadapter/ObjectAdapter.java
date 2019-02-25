package me.coldsoul.code.dp.objectadapter;

public class ObjectAdapter {
	public static void main(String[] args) {

		HDMI hdmi = new VGAHDMIAdapter(new VGAMonitor());
		hdmi.reviceHdmiData();

		hdmi = new VGAHDMIAdapter(new VGATV());
		hdmi.reviceHdmiData();
	}
}
