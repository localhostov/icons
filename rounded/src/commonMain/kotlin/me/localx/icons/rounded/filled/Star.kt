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

public val Icons.Filled.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.3268f, 12.4003f)
                    lineTo(4.8868f, 15.0003f)
                    lineTo(3.5348f, 19.1873f)
                    curveTo(3.3163f, 19.8367f, 3.3135f, 20.5393f, 3.5269f, 21.1904f)
                    curveTo(3.7403f, 21.8415f, 4.1583f, 22.4062f, 4.7188f, 22.8003f)
                    curveTo(5.2696f, 23.2071f, 5.9372f, 23.425f, 6.622f, 23.4216f)
                    curveTo(7.3067f, 23.4182f, 7.972f, 23.1936f, 8.5188f, 22.7813f)
                    lineTo(11.9998f, 20.2193f)
                    lineTo(15.4818f, 22.7783f)
                    curveTo(16.0317f, 23.1828f, 16.6956f, 23.4025f, 17.3782f, 23.4058f)
                    curveTo(18.0607f, 23.4091f, 18.7268f, 23.1959f, 19.2806f, 22.7968f)
                    curveTo(19.8343f, 22.3978f, 20.2473f, 21.8334f, 20.4601f, 21.1848f)
                    curveTo(20.6729f, 20.5362f, 20.6745f, 19.8369f, 20.4648f, 19.1873f)
                    lineTo(19.1128f, 15.0003f)
                    lineTo(22.6728f, 12.4003f)
                    curveTo(23.2219f, 11.9988f, 23.6302f, 11.4341f, 23.8391f, 10.7867f)
                    curveTo(24.0481f, 10.1394f, 24.0472f, 9.4425f, 23.8365f, 8.7957f)
                    curveTo(23.6258f, 8.1489f, 23.216f, 7.5852f, 22.6658f, 7.1852f)
                    curveTo(22.1156f, 6.7852f, 21.4531f, 6.5693f, 20.7728f, 6.5683f)
                    horizontalLineTo(16.3998f)
                    lineTo(15.0728f, 2.4323f)
                    curveTo(14.8641f, 1.7813f, 14.4541f, 1.2133f, 13.9018f, 0.8104f)
                    curveTo(13.3495f, 0.4074f, 12.6835f, 0.1903f, 11.9998f, 0.1903f)
                    curveTo(11.3161f, 0.1903f, 10.6501f, 0.4074f, 10.0978f, 0.8104f)
                    curveTo(9.5455f, 1.2133f, 9.1355f, 1.7813f, 8.9268f, 2.4323f)
                    lineTo(7.5998f, 6.5683f)
                    horizontalLineTo(3.2308f)
                    curveTo(2.5505f, 6.5693f, 1.888f, 6.7852f, 1.3378f, 7.1852f)
                    curveTo(0.7876f, 7.5852f, 0.3778f, 8.1489f, 0.1671f, 8.7957f)
                    curveTo(-0.0436f, 9.4425f, -0.0445f, 10.1394f, 0.1645f, 10.7867f)
                    curveTo(0.3734f, 11.4341f, 0.7817f, 11.9988f, 1.3308f, 12.4003f)
                    horizontalLineTo(1.3268f)
                    close()
                }
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
