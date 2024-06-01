package me.localx.icons.straight.filled

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
import me.localx.icons.straight.Icons

public val Icons.Filled.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.45f, 13.8642f)
                    lineTo(12.192f, 23.1212f)
                    curveTo(11.9134f, 23.3999f, 11.5826f, 23.6209f, 11.2186f, 23.7717f)
                    curveTo(10.8546f, 23.9225f, 10.4645f, 24.0001f, 10.0705f, 24.0001f)
                    curveTo(9.6765f, 24.0001f, 9.2863f, 23.9225f, 8.9223f, 23.7717f)
                    curveTo(8.5583f, 23.6209f, 8.2275f, 23.3999f, 7.949f, 23.1212f)
                    lineTo(0.879f, 16.0502f)
                    curveTo(0.3166f, 15.4876f, 6.0E-4f, 14.7247f, 6.0E-4f, 13.9292f)
                    curveTo(6.0E-4f, 13.1337f, 0.3166f, 12.3708f, 0.879f, 11.8082f)
                    lineTo(7.179f, 5.5082f)
                    lineTo(4.318f, 2.6222f)
                    lineTo(5.74f, 1.2162f)
                    lineTo(14.709f, 10.2962f)
                    lineTo(16.246f, 8.7702f)
                    lineTo(10.121f, 2.5702f)
                    lineTo(10.136f, 2.5542f)
                    lineTo(9.036f, 1.4542f)
                    lineTo(10.451f, 0.0372f)
                    lineTo(24.028f, 13.6132f)
                    lineTo(22.613f, 15.0282f)
                    lineTo(21.45f, 13.8642f)
                    close()
                    moveTo(19.0f, 21.5002f)
                    curveTo(19.0f, 22.1633f, 19.2634f, 22.7992f, 19.7322f, 23.268f)
                    curveTo(20.201f, 23.7368f, 20.8369f, 24.0002f, 21.5f, 24.0002f)
                    curveTo(22.163f, 24.0002f, 22.7989f, 23.7368f, 23.2677f, 23.268f)
                    curveTo(23.7366f, 22.7992f, 24.0f, 22.1633f, 24.0f, 21.5002f)
                    curveTo(24.0f, 20.1192f, 21.5f, 17.0002f, 21.5f, 17.0002f)
                    curveTo(21.5f, 17.0002f, 19.0f, 20.2502f, 19.0f, 21.5002f)
                    close()
                }
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
