package me.coldsoul.code.dp.facade;

public class Computer {
	private Cpu cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}

	public void start() {
		cpu.start();
		memory.start();
		disk.start();
	}

	public void shutdown() {
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
	}
}
