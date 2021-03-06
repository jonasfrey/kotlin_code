
// this file was generated by create_new_folder_project.js

package multilinestring_lesson

import kotlin_helpers.*
import kotlin.reflect.full.memberProperties

fun main() {
    test()
}


fun test(){

    val s_multiline = """
I: Bus=0019 Vendor=0000 Product=0001 Version=0000
N: Name="Power Button"
P: Phys=PNP0C0C/button/input0
S: Sysfs=/devices/LNXSYSTM:00/LNXSYBUS:00/PNP0C0C:00/input/input0
U: Uniq=
H: Handlers=kbd event0 
B: PROP=0
B: EV=3
B: KEY=10000000000000 0

I: Bus=0019 Vendor=0000 Product=0001 Version=0000
N: Name="Power Button"
P: Phys=LNXPWRBN/button/input0
S: Sysfs=/devices/LNXSYSTM:00/LNXPWRBN:00/input/input1
U: Uniq=
H: Handlers=kbd event1 
B: PROP=0
B: EV=3
B: KEY=10000000000000 0

I: Bus=0003 Vendor=1b1c Product=0a1d Version=0111
N: Name="Cosair Corsair VOID PRO USB Gaming Headset  Consumer Control"
P: Phys=usb-0000:02:00.0-2/input3
S: Sysfs=/devices/pci0000:00/0000:00:01.3/0000:02:00.0/usb1/1-2/1-2:1.3/0003:1B1C:0A1D.0001/input/input2
U: Uniq=00000000
H: Handlers=kbd event2 
B: PROP=0
B: EV=13
B: KEY=c000000000000 0
B: MSC=10

I: Bus=0003 Vendor=1b1c Product=0a1d Version=0111
N: Name="Cosair Corsair VOID PRO USB Gaming Headset "
P: Phys=usb-0000:02:00.0-2/input3
S: Sysfs=/devices/pci0000:00/0000:00:01.3/0000:02:00.0/usb1/1-2/1-2:1.3/0003:1B1C:0A1D.0001/input/input3
U: Uniq=00000000
H: Handlers=event3 
B: PROP=0
B: EV=1b
B: KEY=1 0 0 0 0
B: ABS=10000000000
B: MSC=10

I: Bus=0003 Vendor=046d Product=0aaa Version=0111
N: Name="Logitech PRO X Consumer Control"
P: Phys=usb-0000:0c:00.3-3.2/input3
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.2/3-3.2:1.3/0003:046D:0AAA.0002/input/input4
U: Uniq=000000000000
H: Handlers=kbd event4 
B: PROP=0
B: EV=13
B: KEY=3 0 0 e000000000000 0
B: MSC=10

I: Bus=0003 Vendor=1e7d Product=2dd2 Version=0111
N: Name="ROCCAT ROCCAT Kone Pure Ultra"
P: Phys=usb-0000:0c:00.3-3.1.1/input0
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.1/3-3.1.1:1.0/0003:1E7D:2DD2.0003/input/input8
U: Uniq=
H: Handlers=mouse0 event5 
B: PROP=0
B: EV=17
B: KEY=1f0000 0 0 0 0
B: REL=1943
B: MSC=10

I: Bus=0003 Vendor=046d Product=0aaa Version=0111
N: Name="Logitech PRO X"
P: Phys=usb-0000:0c:00.3-3.2/input3
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.2/3-3.2:1.3/0003:046D:0AAA.0002/input/input5
U: Uniq=000000000000
H: Handlers=kbd event6 leds 
B: PROP=0
B: EV=20013
B: KEY=100000000000000 0 0 0
B: MSC=10
B: LED=80

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HDA ATI HDMI HDMI/DP,pcm=3"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:03.1/0000:0a:00.1/sound/card0/input16
U: Uniq=
H: Handlers=event11 
B: PROP=0
B: EV=21
B: SW=140

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HDA ATI HDMI HDMI/DP,pcm=7"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:03.1/0000:0a:00.1/sound/card0/input17
U: Uniq=
H: Handlers=event14 
B: PROP=0
B: EV=21
B: SW=140

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HD-Audio Generic Front Mic"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.4/sound/card2/input22
U: Uniq=
H: Handlers=event15 
B: PROP=0
B: EV=21
B: SW=10

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HD-Audio Generic Rear Mic"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.4/sound/card2/input23
U: Uniq=
H: Handlers=event16 
B: PROP=0
B: EV=21
B: SW=10

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HDA ATI HDMI HDMI/DP,pcm=8"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:03.1/0000:0a:00.1/sound/card0/input18
U: Uniq=
H: Handlers=event17 
B: PROP=0
B: EV=21
B: SW=140

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HDA ATI HDMI HDMI/DP,pcm=9"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:03.1/0000:0a:00.1/sound/card0/input19
U: Uniq=
H: Handlers=event18 
B: PROP=0
B: EV=21
B: SW=140

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HD-Audio Generic Line"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.4/sound/card2/input24
U: Uniq=
H: Handlers=event19 
B: PROP=0
B: EV=21
B: SW=2000

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HD-Audio Generic Line Out"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.4/sound/card2/input25
U: Uniq=
H: Handlers=event20 
B: PROP=0
B: EV=21
B: SW=40

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HDA ATI HDMI HDMI/DP,pcm=10"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:03.1/0000:0a:00.1/sound/card0/input20
U: Uniq=
H: Handlers=event21 
B: PROP=0
B: EV=21
B: SW=140

I: Bus=0003 Vendor=1b1c Product=1b09 Version=0111
N: Name="Corsair Corsair K70R Gaming Keyboard"
P: Phys=usb-0000:0c:00.3-3.1.3/input0
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.3/3-3.1.3:1.0/0003:1B1C:1B09.0007/input/input27
U: Uniq=
H: Handlers=sysrq kbd event22 js1 leds 
B: PROP=0
B: EV=120013
B: KEY=7fffff 0 0 0 0 0 0 0 1000000000007 ff98002a000007ff febeffdfffefffff fffffffffffffffe
B: MSC=10
B: LED=7

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HD-Audio Generic Front Headphone"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.4/sound/card2/input26
U: Uniq=
H: Handlers=event23 
B: PROP=0
B: EV=21
B: SW=4

I: Bus=0000 Vendor=0000 Product=0000 Version=0000
N: Name="HDA ATI HDMI HDMI/DP,pcm=11"
P: Phys=ALSA
S: Sysfs=/devices/pci0000:00/0000:00:03.1/0000:0a:00.1/sound/card0/input21
U: Uniq=
H: Handlers=event12 
B: PROP=0
B: EV=21
B: SW=140

I: Bus=0003 Vendor=1b1c Product=1b09 Version=0111
N: Name="Corsair Corsair K70R Gaming Keyboard"
P: Phys=usb-0000:0c:00.3-3.1.3/input1
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.3/3-3.1.3:1.1/0003:1B1C:1B09.0008/input/input28
U: Uniq=
H: Handlers=kbd event24 
B: PROP=0
B: EV=1f
B: KEY=3f000303ff 0 0 483ffff17aff32d bfd4444600000000 1 130ff38b17c000 677bfad9415fed 19ed68000004400 10000002
B: REL=1040
B: ABS=100000000
B: MSC=10

I: Bus=0003 Vendor=1b1c Product=1b09 Version=0111
N: Name="Corsair Corsair K70R Gaming Keyboard"
P: Phys=usb-0000:0c:00.3-3.1.3/input2
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.3/3-3.1.3:1.2/0003:1B1C:1B09.0009/input/input29
U: Uniq=
H: Handlers=sysrq kbd event13 
B: PROP=0
B: EV=100013
B: KEY=7f80000000000000 e0b0ffdf01cfffff fffffffffffffffe
B: MSC=10

I: Bus=0003 Vendor=1e7d Product=2dd2 Version=0111
N: Name="ROCCAT ROCCAT Kone Pure Ultra Keyboard"
P: Phys=usb-0000:0c:00.3-3.1.1/input2
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.1/3-3.1.1:1.2/0003:1E7D:2DD2.000A/input/input32
U: Uniq=
H: Handlers=sysrq kbd event7 
B: PROP=0
B: EV=10001f
B: KEY=3f000303ff 0 0 483ffff17aff32d bfd4444600000000 1 130ff38b17c007 ffff7bfad941dfff ffbeffdfffefffff fffffffffffffffe
B: REL=1040
B: ABS=100000000
B: MSC=10

I: Bus=0003 Vendor=1e7d Product=2dd2 Version=0111
N: Name="ROCCAT ROCCAT Kone Pure Ultra Mouse"
P: Phys=usb-0000:0c:00.3-3.1.1/input2
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.1/3-3.1.1:1.2/0003:1E7D:2DD2.000A/input/input33
U: Uniq=
H: Handlers=event8 js0 
B: PROP=0
B: EV=9
B: ABS=3

I: Bus=0003 Vendor=1e7d Product=2dd2 Version=0111
N: Name="ROCCAT ROCCAT Kone Pure Ultra"
P: Phys=usb-0000:0c:00.3-3.1.1/input2
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.1/3-3.1.1:1.2/0003:1E7D:2DD2.000A/input/input34
U: Uniq=
H: Handlers=event9 
B: PROP=0
B: EV=9
B: ABS=10000000000

I: Bus=0003 Vendor=1e7d Product=2dd2 Version=0111
N: Name="ROCCAT ROCCAT Kone Pure Ultra Wireless Radio Control"
P: Phys=usb-0000:0c:00.3-3.1.1/input2
S: Sysfs=/devices/pci0000:00/0000:00:08.1/0000:0c:00.3/usb3/3-3/3-3.1/3-3.1.1/3-3.1.1:1.2/0003:1E7D:2DD2.000A/input/input35
U: Uniq=
H: Handlers=rfkill kbd event10 
B: PROP=0
B: EV=13
B: KEY=80000000000000 0 0 0
B: MSC=10
"""


val a_devices_lines = s_multiline.split("\n\n"); 
for(s_device_lines in a_devices_lines){
    println(s_device_lines)
}

for(s_device_lines in a_devices_lines){
    var a_devices_lines_parts = s_device_lines.split("\n")
    
    var a_bus_vendor_product_version = a_devices_lines_parts.filter{s -> s.lowercase().indexOf("vendor") != -1}.first().split(" ")
    var a_name = a_devices_lines_parts.filter{s -> s.lowercase().indexOf("name") != -1}.first().split(" ")
    

    val o_proc_bus_input_device = Proc_bus_input_device (
        a_bus_vendor_product_version.filter{s -> s.lowercase().indexOf("bus") != -1}.first().split("=").last().trim(),
        a_bus_vendor_product_version.filter{s -> s.lowercase().indexOf("vendor") != -1}.first().split("=").last().trim(),
        a_bus_vendor_product_version.filter{s -> s.lowercase().indexOf("product") != -1}.first().split("=").last().trim(),
        a_bus_vendor_product_version.filter{s -> s.lowercase().indexOf("version") != -1}.first().split("=").last().trim(),
        a_devices_lines_parts.filter{s -> s.lowercase().indexOf("name") != -1}.first().split("=").last(),
        s_device_lines
    )

    // println("DEVICE:  ")
    // for(prop in Proc_bus_input_device::class.memberProperties){
    //     // println(key)
    //     println("${prop.name} = ${prop.get(o_proc_bus_input_device)}")
    // }
    
}


}


class Proc_bus_input_device(
    val s_bus : String,
    val s_vendor : String,
    val s_product : String,
    val s_version : String,
    val s_name : String,
    val s_multilinestring_proc_bus_input_devices : String
){
    val s_bus : String,
    val s_vendor : String,
    val s_product : String,
    val s_version : String,
    val s_name : String,
    val s_multilinestring_proc_bus_input_devices : String

}