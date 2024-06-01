package me.localx.icons.straight.outline

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

public val Icons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 6.0f)
                    curveTo(15.028f, 6.0f, 13.057f, 8.227f, 12.0f, 9.882f)
                    curveTo(10.943f, 8.227f, 8.972f, 6.0f, 6.0f, 6.0f)
                    curveTo(4.4087f, 6.0f, 2.8826f, 6.6321f, 1.7574f, 7.7574f)
                    curveTo(0.6321f, 8.8826f, 0.0f, 10.4087f, 0.0f, 12.0f)
                    curveTo(0.0f, 13.5913f, 0.6321f, 15.1174f, 1.7574f, 16.2426f)
                    curveTo(2.8826f, 17.3679f, 4.4087f, 18.0f, 6.0f, 18.0f)
                    curveTo(8.972f, 18.0f, 10.943f, 15.773f, 12.0f, 14.118f)
                    curveTo(13.057f, 15.773f, 15.028f, 18.0f, 18.0f, 18.0f)
                    curveTo(19.5913f, 18.0f, 21.1174f, 17.3679f, 22.2426f, 16.2426f)
                    curveTo(23.3679f, 15.1174f, 24.0f, 13.5913f, 24.0f, 12.0f)
                    curveTo(24.0f, 10.4087f, 23.3679f, 8.8826f, 22.2426f, 7.7574f)
                    curveTo(21.1174f, 6.6321f, 19.5913f, 6.0f, 18.0f, 6.0f)
                    close()
                    moveTo(6.0f, 16.0f)
                    curveTo(4.9391f, 16.0f, 3.9217f, 15.5786f, 3.1716f, 14.8284f)
                    curveTo(2.4214f, 14.0783f, 2.0f, 13.0609f, 2.0f, 12.0f)
                    curveTo(2.0f, 10.9391f, 2.4214f, 9.9217f, 3.1716f, 9.1716f)
                    curveTo(3.9217f, 8.4214f, 4.9391f, 8.0f, 6.0f, 8.0f)
                    curveTo(8.693f, 8.0f, 10.382f, 10.945f, 10.9f, 12.0f)
                    curveTo(10.386f, 13.06f, 8.708f, 16.0f, 6.0f, 16.0f)
                    close()
                    moveTo(18.0f, 16.0f)
                    curveTo(15.307f, 16.0f, 13.618f, 13.055f, 13.1f, 12.0f)
                    curveTo(13.615f, 10.942f, 15.293f, 8.0f, 18.0f, 8.0f)
                    curveTo(19.0609f, 8.0f, 20.0783f, 8.4214f, 20.8284f, 9.1716f)
                    curveTo(21.5786f, 9.9217f, 22.0f, 10.9391f, 22.0f, 12.0f)
                    curveTo(22.0f, 13.0609f, 21.5786f, 14.0783f, 20.8284f, 14.8284f)
                    curveTo(20.0783f, 15.5786f, 19.0609f, 16.0f, 18.0f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
