# FoxunRPi
he goal of this project is tooperate the Foxun 4x4 HDMI Matrix 4K@60Hz 4:4:4 via network using the GPIO pins on the Raspberry Pi.
Requires UDP communication on port 5000.
Factory default IP address is 192.168.1.168.

Command structure for switching
---
All sent data is ASCII including spaces.
Select an HDMI input for an HDMI output.
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

E.g: @W 00 00 #
display Input1 on Output 1
