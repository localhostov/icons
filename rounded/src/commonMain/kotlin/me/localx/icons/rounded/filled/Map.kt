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

public val Icons.Filled.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 23.8938f)
                    curveTo(6.8221f, 23.8636f, 6.6461f, 23.8228f, 6.473f, 23.7718f)
                    lineTo(3.604f, 22.8718f)
                    curveTo(2.5665f, 22.567f, 1.6554f, 21.9349f, 1.0066f, 21.0699f)
                    curveTo(0.3578f, 20.2048f, 0.0061f, 19.1531f, 0.004f, 18.0718f)
                    verticalLineTo(5.9998f)
                    curveTo(0.0051f, 5.1778f, 0.2087f, 4.3688f, 0.597f, 3.6443f)
                    curveTo(0.9852f, 2.9199f, 1.5461f, 2.3023f, 2.23f, 1.8462f)
                    curveTo(2.9138f, 1.3902f, 3.6995f, 1.1098f, 4.5176f, 1.0298f)
                    curveTo(5.3357f, 0.9499f, 6.1608f, 1.0728f, 6.92f, 1.3878f)
                    lineTo(7.0f, 1.4248f)
                    verticalLineTo(23.8938f)
                    close()
                    moveTo(20.68f, 1.1668f)
                    lineTo(20.659f, 1.1598f)
                    lineTo(17.944f, 0.2598f)
                    curveTo(17.6369f, 0.1602f, 17.3207f, 0.0908f, 17.0f, 0.0528f)
                    verticalLineTo(22.3148f)
                    lineTo(19.054f, 22.9068f)
                    curveTo(19.6426f, 23.0501f, 20.256f, 23.0578f, 20.8479f, 22.9294f)
                    curveTo(21.4399f, 22.801f, 21.995f, 22.5398f, 22.4713f, 22.1656f)
                    curveTo(22.9476f, 21.7914f, 23.3327f, 21.3139f, 23.5975f, 20.7691f)
                    curveTo(23.8623f, 20.2243f, 23.9999f, 19.6265f, 24.0f, 19.0208f)
                    verticalLineTo(5.8758f)
                    curveTo(23.9985f, 4.8446f, 23.6789f, 3.8391f, 23.0847f, 2.9963f)
                    curveTo(22.4905f, 2.1535f, 21.6508f, 1.5146f, 20.68f, 1.1668f)
                    close()
                    moveTo(15.0f, 0.1898f)
                    curveTo(15.0f, 0.1898f, 9.157f, 1.8628f, 9.0f, 1.8798f)
                    verticalLineTo(23.8798f)
                    curveTo(9.1f, 23.8588f, 15.0f, 22.2438f, 15.0f, 22.2438f)
                    verticalLineTo(0.1898f)
                    close()
                }
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
