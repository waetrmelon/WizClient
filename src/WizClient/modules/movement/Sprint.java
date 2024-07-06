package com.WizClient.modules.movement;

import org.lwjgl.input.Keyboard;

import com.WizClient.modules.WizModule;

import net.minecraft.client.Minecraft;

public class Sprint extends WizModule {
	
	public Sprint() {
		super("Sprint", "", false, Keyboard.KEY_G);
	}
	
	
	public void OnToggle() {
		
	}
	
	public void OnUpdate() {
		if (this.toggled) {
			if (Minecraft.getMinecraft().thePlayer.moveForward != 0) {
				Minecraft.getMinecraft().thePlayer.setSprinting(true);		
			}	
		}
	}
	
}
