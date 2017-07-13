package com.callegasdev.computer;

import com.callegasdev.computer.resources.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by callegas on 13/07/17.
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

    Computer mccree =
            new Computer.Builder(
                    new Cabinet("BlueCase", "BG-024"),
                    new HardDisk("WD", "WD10EZEX-00BN5A0", 1000),
                    new MotherBoard("MSI", "H270 GAMING PRO CARBON", "Intel® H270"),
                    new RAMMemory("Kingston", "HX421C14FB/4", "DDR4", 4),
                    new VGA("Gigabyte", "GV-N105TOC-4GD", "GDDR5", 4),
                    new Processor("Intel", "BX80677I57400", 3.500)
            ).build();
    LOGGER.info(mccree.toString());

        Computer winston =
                new Computer.Builder(
                        new Cabinet("BlueCase", "BG-023"),
                        new HardDisk("WD", "WD10PURX", 1000),
                        new MotherBoard("MSI", "B350 KRAIT GAMING", "AMD® B350"),
                        new RAMMemory("HiperX", "HX421C14FR2/8", "DDR4", 8),
                        new VGA("Gigabyte", "GV-N105TOC-4GD", "GDDR5", 4),
                        new Processor("AMD", "FD8300WMHKBOX", 3.300)
                ).build();
        LOGGER.info(winston.toString());

    }

}
