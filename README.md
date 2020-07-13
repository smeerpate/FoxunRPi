# FoxunRPi
The goal of this project is to operate the Foxun 4x4 HDMI Matrix 4K@60Hz 4:4:4 via network using the GPIO pins on the Raspberry Pi.
Requires UDP communication on port 5000.
Factory default IP address is 192.168.1.168.

1 Command structure for switching
---
All data is in ASCII including spaces!

1.1 Select an HDMI input for an HDMI output
----

Format: @ W <"output"> <"input"> #

| ASCII string | Corresponding Output |
| --- | --- |
| 00 | Output1 |
| 01 | Output2 |
| 02 | Output3 |
| 03 | Output4 |
| 04 | All outputs |

| ASCII string | Corresponding Input |
| --- | --- |
| 00 | Input1 |
| 01 | Input2 |
| 02 | Input3 |
| 03 | Input4 |

E.g: 

***@ W 00 00 #***

Means: "Display input1 on output 1."
