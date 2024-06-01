package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.1001f, 8.0f)
                    curveTo(20.1025f, 6.7114f, 19.7936f, 5.4413f, 19.1997f, 4.2978f)
                    curveTo(18.6058f, 3.1543f, 17.7444f, 2.1711f, 16.6889f, 1.432f)
                    curveTo(15.6334f, 0.6929f, 14.415f, 0.2197f, 13.1373f, 0.0526f)
                    curveTo(11.8596f, -0.1144f, 10.5604f, 0.0296f, 9.3504f, 0.4726f)
                    curveTo(8.1403f, 0.9155f, 7.0551f, 1.6441f, 6.1872f, 2.5965f)
                    curveTo(5.3192f, 3.549f, 4.6942f, 4.6969f, 4.3652f, 5.9428f)
                    curveTo(4.0363f, 7.1887f, 4.0131f, 8.4956f, 4.2978f, 9.7523f)
                    curveTo(4.5824f, 11.0091f, 5.1665f, 12.1785f, 6.0001f, 13.161f)
                    verticalLineTo(21.147f)
                    curveTo(5.9989f, 21.6843f, 6.1498f, 22.211f, 6.4353f, 22.6662f)
                    curveTo(6.7208f, 23.1214f, 7.1293f, 23.4865f, 7.6135f, 23.7193f)
                    curveTo(8.0978f, 23.9522f, 8.6381f, 24.0432f, 9.1719f, 23.9819f)
                    curveTo(9.7057f, 23.9206f, 10.2112f, 23.7095f, 10.6301f, 23.373f)
                    lineTo(12.0001f, 22.273f)
                    lineTo(13.3691f, 23.373f)
                    curveTo(13.7884f, 23.7086f, 14.2939f, 23.9189f, 14.8274f, 23.9797f)
                    curveTo(15.361f, 24.0405f, 15.9008f, 23.9493f, 16.3848f, 23.7167f)
                    curveTo(16.8688f, 23.484f, 17.2772f, 23.1194f, 17.563f, 22.6648f)
                    curveTo(17.8488f, 22.2101f, 18.0003f, 21.684f, 18.0001f, 21.147f)
                    verticalLineTo(13.387f)
                    curveTo(19.3504f, 11.9179f, 20.0998f, 9.9953f, 20.1001f, 8.0f)
                    close()
                    moveTo(12.1001f, 3.0f)
                    curveTo(13.0891f, 3.0f, 14.0558f, 3.2932f, 14.878f, 3.8426f)
                    curveTo(15.7002f, 4.3921f, 16.3411f, 5.1729f, 16.7195f, 6.0866f)
                    curveTo(17.098f, 7.0002f, 17.197f, 8.0055f, 17.0041f, 8.9754f)
                    curveTo(16.8111f, 9.9453f, 16.3349f, 10.8363f, 15.6357f, 11.5355f)
                    curveTo(14.9364f, 12.2348f, 14.0455f, 12.711f, 13.0756f, 12.9039f)
                    curveTo(12.1057f, 13.0969f, 11.1004f, 12.9978f, 10.1867f, 12.6194f)
                    curveTo(9.2731f, 12.241f, 8.4922f, 11.6001f, 7.9428f, 10.7778f)
                    curveTo(7.3934f, 9.9556f, 7.1001f, 8.9889f, 7.1001f, 8.0f)
                    curveTo(7.1017f, 6.6744f, 7.629f, 5.4036f, 8.5664f, 4.4662f)
                    curveTo(9.5037f, 3.5289f, 10.7746f, 3.0016f, 12.1001f, 3.0f)
                    close()
                    moveTo(13.3101f, 19.487f)
                    curveTo(12.9385f, 19.1865f, 12.4751f, 19.0225f, 11.9971f, 19.0225f)
                    curveTo(11.5192f, 19.0225f, 11.0558f, 19.1865f, 10.6841f, 19.487f)
                    lineTo(9.0001f, 20.835f)
                    verticalLineTo(15.373f)
                    curveTo(10.9133f, 16.1819f, 13.0671f, 16.2091f, 15.0001f, 15.449f)
                    verticalLineTo(20.835f)
                    lineTo(13.3101f, 19.487f)
                    close()
                }
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
