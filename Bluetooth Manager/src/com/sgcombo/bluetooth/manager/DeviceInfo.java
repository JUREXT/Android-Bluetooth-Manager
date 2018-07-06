package com.sgcombo.bluetooth.manager;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import android.bluetooth.BluetoothDevice;

/*
Copyright (C) 2014 by Vladimir Novick http://www.linkedin.com/in/vladimirnovick , 

    vlad.novick@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

*/

public class DeviceInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4899058289679063313L;


	
	private Long id;
	private Long thread_id;
	
	
	public DeviceInfo(Long threadId){
		thread_id = threadId;
	}
	public DeviceInfo(){

		thread_id = 0l;
	}
	
	private BluetoothDevice device;
	
	public BluetoothDevice getDevice() {
		return device;
	}
	public void setDevice(BluetoothDevice device) {
		this.device = device;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public Long getId(){
		return id;
		}
	
	public void setId(Long id){
		this.id = id;
	}
	

private String address;
private String Name;







public String getAddress(){
return address;
}



public void setAddress(String address){
	this.address = address;
}









}