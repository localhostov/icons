package me.localx.icons.rounded.filled

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

public val Icons.Filled.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.8002f, 11.9998f)
                    curveTo(25.7392f, 9.0108f, 21.5732f, 1.5468f, 16.4002f, 4.3678f)
                    curveTo(16.2272f, -1.4062f, 7.7712f, -1.4032f, 7.6002f, 4.3678f)
                    curveTo(2.4672f, 1.5508f, -1.7618f, 8.9858f, 3.2002f, 11.9438f)
                    curveTo(-1.7488f, 14.9788f, 2.4002f, 22.1548f, 7.6002f, 19.6358f)
                    curveTo(7.7802f, 25.4058f, 16.2222f, 25.4008f, 16.4002f, 19.6358f)
                    curveTo(21.5622f, 22.1528f, 25.7722f, 14.9998f, 20.8002f, 11.9998f)
                    close()
                    moveTo(12.0002f, 15.9998f)
                    curveTo(10.9393f, 15.9998f, 9.9219f, 15.5784f, 9.1718f, 14.8283f)
                    curveTo(8.4216f, 14.0781f, 8.0002f, 13.0607f, 8.0002f, 11.9998f)
                    curveTo(8.0002f, 10.939f, 8.4216f, 9.9215f, 9.1718f, 9.1714f)
                    curveTo(9.9219f, 8.4213f, 10.9393f, 7.9998f, 12.0002f, 7.9998f)
                    curveTo(13.061f, 7.9998f, 14.0785f, 8.4213f, 14.8286f, 9.1714f)
                    curveTo(15.5787f, 9.9215f, 16.0002f, 10.939f, 16.0002f, 11.9998f)
                    curveTo(16.0002f, 13.0607f, 15.5787f, 14.0781f, 14.8286f, 14.8283f)
                    curveTo(14.0785f, 15.5784f, 13.061f, 15.9998f, 12.0002f, 15.9998f)
                    close()
                    moveTo(14.0002f, 11.9998f)
                    curveTo(14.0002f, 12.5303f, 13.7895f, 13.039f, 13.4144f, 13.414f)
                    curveTo(13.0393f, 13.7891f, 12.5306f, 13.9998f, 12.0002f, 13.9998f)
                    curveTo(11.4697f, 13.9998f, 10.961f, 13.7891f, 10.586f, 13.414f)
                    curveTo(10.2109f, 13.039f, 10.0002f, 12.5303f, 10.0002f, 11.9998f)
                    curveTo(10.0002f, 11.4694f, 10.2109f, 10.9607f, 10.586f, 10.5856f)
                    curveTo(10.961f, 10.2105f, 11.4697f, 9.9998f, 12.0002f, 9.9998f)
                    curveTo(12.5306f, 9.9998f, 13.0393f, 10.2105f, 13.4144f, 10.5856f)
                    curveTo(13.7895f, 10.9607f, 14.0002f, 11.4694f, 14.0002f, 11.9998f)
                    close()
                }
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
