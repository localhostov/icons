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

public val Icons.Bold.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9747f, 8.6951f)
                    lineTo(15.8887f, 1.6092f)
                    curveTo(13.7393f, -0.5348f, 10.2602f, -0.5348f, 8.1107f, 1.6092f)
                    lineTo(1.0247f, 8.6951f)
                    curveTo(0.3663f, 9.3501f, -0.0028f, 10.2413f, -3.0E-4f, 11.1701f)
                    verticalLineTo(21.5481f)
                    curveTo(0.0019f, 22.9027f, 1.1001f, 24.0f, 2.4548f, 24.0011f)
                    horizontalLineTo(21.5447f)
                    curveTo(22.8993f, 24.0f, 23.9975f, 22.9027f, 23.9997f, 21.5481f)
                    verticalLineTo(11.1701f)
                    curveTo(24.0023f, 10.2413f, 23.6332f, 9.3501f, 22.9747f, 8.6951f)
                    close()
                    moveTo(20.9997f, 21.0011f)
                    horizontalLineTo(15.9997f)
                    verticalLineTo(17.8191f)
                    curveTo(15.9997f, 15.7105f, 14.2903f, 14.0011f, 12.1817f, 14.0011f)
                    horizontalLineTo(11.8177f)
                    curveTo(9.7091f, 14.0011f, 7.9997f, 15.7105f, 7.9997f, 17.8191f)
                    verticalLineTo(21.0011f)
                    horizontalLineTo(2.9997f)
                    verticalLineTo(11.1701f)
                    curveTo(3.0001f, 11.0375f, 3.0525f, 10.9104f, 3.1458f, 10.8161f)
                    lineTo(10.2317f, 3.7301f)
                    curveTo(11.2079f, 2.7537f, 12.7908f, 2.7535f, 13.7673f, 3.7297f)
                    curveTo(13.7674f, 3.7298f, 13.7676f, 3.73f, 13.7677f, 3.7301f)
                    lineTo(20.8537f, 10.8161f)
                    curveTo(20.947f, 10.9104f, 20.9994f, 11.0375f, 20.9997f, 11.1701f)
                    verticalLineTo(21.0011f)
                    horizontalLineTo(20.9997f)
                    close()
                }
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
