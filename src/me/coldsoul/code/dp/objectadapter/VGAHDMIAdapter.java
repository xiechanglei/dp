package me.coldsoul.code.dp.objectadapter;

public class VGAHDMIAdapter implements HDMI {
	private VGA vgaDevice;

	public VGAHDMIAdapter(VGA vga) {
		this.vgaDevice = vga;
	}

	@Override
	public void reviceHdmiData() {
		this.vgaDevice.reviceVgaData();
	}

}
