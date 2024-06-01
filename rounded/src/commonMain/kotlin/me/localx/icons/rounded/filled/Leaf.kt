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

public val Icons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1189f, 0.8715f)
                    curveTo(22.8064f, 0.5597f, 22.4286f, 0.3211f, 22.0127f, 0.1729f)
                    curveTo(21.5968f, 0.0247f, 21.1533f, -0.0293f, 20.7139f, 0.0145f)
                    curveTo(17.921f, 0.2845f, 8.528f, 1.4476f, 4.9f, 5.0715f)
                    curveTo(3.1657f, 6.8105f, 2.1374f, 9.1304f, 2.0134f, 11.5832f)
                    curveTo(1.8895f, 14.0359f, 2.6788f, 16.4477f, 4.229f, 18.3525f)
                    lineTo(15.289f, 7.2926f)
                    curveTo(15.4776f, 7.1104f, 15.7302f, 7.0096f, 15.9924f, 7.0119f)
                    curveTo(16.2546f, 7.0142f, 16.5054f, 7.1193f, 16.6908f, 7.3047f)
                    curveTo(16.8762f, 7.4901f, 16.9813f, 7.741f, 16.9836f, 8.0031f)
                    curveTo(16.9859f, 8.2653f, 16.8851f, 8.518f, 16.703f, 8.7065f)
                    lineTo(5.647f, 19.7665f)
                    curveTo(7.5512f, 21.3176f, 9.9627f, 22.1079f, 12.4156f, 21.9847f)
                    curveTo(14.8685f, 21.8615f, 17.1887f, 20.8336f, 18.9279f, 19.0995f)
                    curveTo(22.6039f, 15.4225f, 23.7279f, 6.0585f, 23.9869f, 3.2766f)
                    curveTo(24.0293f, 2.8364f, 23.9734f, 2.3924f, 23.8233f, 1.9765f)
                    curveTo(23.6732f, 1.5606f, 23.4326f, 1.1832f, 23.1189f, 0.8715f)
                    close()
                    moveTo(4.9f, 19.0995f)
                    curveTo(5.1386f, 19.3375f, 5.3863f, 19.5612f, 5.643f, 19.7705f)
                    lineTo(1.703f, 23.7105f)
                    curveTo(1.5139f, 23.8922f, 1.261f, 23.9924f, 0.9987f, 23.9894f)
                    curveTo(0.7365f, 23.9864f, 0.4859f, 23.8805f, 0.301f, 23.6946f)
                    curveTo(0.1161f, 23.5086f, 0.0117f, 23.2574f, 0.0101f, 22.9952f)
                    curveTo(0.0086f, 22.733f, 0.1102f, 22.4806f, 0.293f, 22.2925f)
                    lineTo(4.233f, 18.3525f)
                    curveTo(4.4423f, 18.6085f, 4.6646f, 18.8575f, 4.9f, 19.0995f)
                    close()
                }
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
