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

public val Icons.Bold.Infinity: ImageVector
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
                    curveTo(15.31f, 6.0f, 13.244f, 7.855f, 12.0f, 9.37f)
                    curveTo(10.756f, 7.855f, 8.69f, 6.0f, 6.0f, 6.0f)
                    curveTo(4.4087f, 6.0f, 2.8826f, 6.6321f, 1.7574f, 7.7574f)
                    curveTo(0.6321f, 8.8826f, 0.0f, 10.4087f, 0.0f, 12.0f)
                    curveTo(0.0f, 13.5913f, 0.6321f, 15.1174f, 1.7574f, 16.2426f)
                    curveTo(2.8826f, 17.3679f, 4.4087f, 18.0f, 6.0f, 18.0f)
                    curveTo(8.69f, 18.0f, 10.756f, 16.145f, 12.0f, 14.63f)
                    curveTo(13.244f, 16.145f, 15.31f, 18.0f, 18.0f, 18.0f)
                    curveTo(19.5913f, 18.0f, 21.1174f, 17.3679f, 22.2426f, 16.2426f)
                    curveTo(23.3679f, 15.1174f, 24.0f, 13.5913f, 24.0f, 12.0f)
                    curveTo(24.0f, 10.4087f, 23.3679f, 8.8826f, 22.2426f, 7.7574f)
                    curveTo(21.1174f, 6.6321f, 19.5913f, 6.0f, 18.0f, 6.0f)
                    close()
                    moveTo(6.0f, 15.0f)
                    curveTo(5.2043f, 15.0f, 4.4413f, 14.6839f, 3.8787f, 14.1213f)
                    curveTo(3.3161f, 13.5587f, 3.0f, 12.7956f, 3.0f, 12.0f)
                    curveTo(3.0f, 11.2044f, 3.3161f, 10.4413f, 3.8787f, 9.8787f)
                    curveTo(4.4413f, 9.3161f, 5.2043f, 9.0f, 6.0f, 9.0f)
                    curveTo(7.791f, 9.0f, 9.4f, 10.783f, 10.239f, 12.0f)
                    curveTo(9.4f, 13.217f, 7.791f, 15.0f, 6.0f, 15.0f)
                    close()
                    moveTo(18.0f, 15.0f)
                    curveTo(16.209f, 15.0f, 14.6f, 13.217f, 13.761f, 12.0f)
                    curveTo(14.6f, 10.783f, 16.209f, 9.0f, 18.0f, 9.0f)
                    curveTo(18.7956f, 9.0f, 19.5587f, 9.3161f, 20.1213f, 9.8787f)
                    curveTo(20.6839f, 10.4413f, 21.0f, 11.2044f, 21.0f, 12.0f)
                    curveTo(21.0f, 12.7956f, 20.6839f, 13.5587f, 20.1213f, 14.1213f)
                    curveTo(19.5587f, 14.6839f, 18.7956f, 15.0f, 18.0f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
