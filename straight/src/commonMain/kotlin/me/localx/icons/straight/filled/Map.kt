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
                    moveTo(15.0f, 22.2812f)
                    lineTo(9.0f, 23.7812f)
                    verticalLineTo(1.9242f)
                    lineTo(15.0f, 0.3142f)
                    verticalLineTo(22.2812f)
                    close()
                    moveTo(7.0f, 1.4172f)
                    lineTo(4.155f, 0.2332f)
                    curveTo(3.6992f, 0.0431f, 3.2036f, -0.0316f, 2.712f, 0.0158f)
                    curveTo(2.2204f, 0.0632f, 1.7482f, 0.2312f, 1.3371f, 0.505f)
                    curveTo(0.9261f, 0.7787f, 0.589f, 1.1497f, 0.3557f, 1.5849f)
                    curveTo(0.1225f, 2.0202f, 3.0E-4f, 2.5064f, -0.0f, 3.0002f)
                    lineTo(-0.0f, 21.7542f)
                    lineTo(7.0f, 23.7542f)
                    verticalLineTo(1.4172f)
                    close()
                    moveTo(21.867f, 1.6172f)
                    lineTo(17.515f, 0.1552f)
                    curveTo(17.3471f, 0.1006f, 17.1748f, 0.0608f, 17.0f, 0.0362f)
                    verticalLineTo(22.2732f)
                    lineTo(24.0f, 23.9782f)
                    verticalLineTo(4.4832f)
                    curveTo(23.9998f, 3.8391f, 23.7923f, 3.2121f, 23.4081f, 2.6951f)
                    curveTo(23.024f, 2.178f, 22.4836f, 1.7984f, 21.867f, 1.6122f)
                    verticalLineTo(1.6172f)
                    close()
                }
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
