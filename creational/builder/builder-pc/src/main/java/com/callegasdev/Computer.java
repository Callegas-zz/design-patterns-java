package com.callegasdev;

/**
 * Created by callegas on 13/07/17.
 */
public final class Computer {

    private final Cabinet cabinet;
    private final HardDisk hardDisk;
    private final MotherBoard motherBoard;
    private final RAMMemory ramMemory;
    private final VGA vga;
    private final Processor processor;

    private Computer(Builder builder) {
        this.cabinet = builder.cabinet;
        this.hardDisk = builder.hardDisk;
        this.motherBoard = builder.motherBoard;
        this.ramMemory = builder.ramMemory;
        this.vga = builder.vga;
        this.processor = builder.processor;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public RAMMemory getRamMemory() {
        return ramMemory;
    }

    public VGA getVga() {
        return vga;
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("registered computer \n")
                .append(cabinet + "\n")
                .append(hardDisk + "\n")
                .append(motherBoard + "\n")
                .append(processor + "\n")
                .append(ramMemory + "\n")
                .append(vga);
        return sb.toString();
    }

    public static class Builder {

        private final Cabinet cabinet;
        private final HardDisk hardDisk;
        private final MotherBoard motherBoard;
        private final RAMMemory ramMemory;
        private final VGA vga;
        private final Processor processor;

        public Builder(Cabinet cabinet, HardDisk hardDisk, MotherBoard motherBoard, RAMMemory ramMemory, VGA vga, Processor processor) {
            if (cabinet == null || hardDisk == null || motherBoard == null || ramMemory == null || vga == null || processor == null) {
                throw new IllegalArgumentException("Any hardware can not be null");
            }
            this.cabinet = cabinet;
            this.hardDisk = hardDisk;
            this.motherBoard = motherBoard;
            this.ramMemory = ramMemory;
            this.vga = vga;
            this.processor = processor;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
