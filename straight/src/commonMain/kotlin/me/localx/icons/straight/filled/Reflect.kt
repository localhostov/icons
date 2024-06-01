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

public val Icons.Filled.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.0007f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(11.0007f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.0007f)
                    close()
                    moveTo(8.886f, 0.4277f)
                    lineTo(8.786f, 0.3597f)
                    curveTo(8.4068f, 0.1323f, 7.9742f, 0.0095f, 7.5321f, 0.0038f)
                    curveTo(7.0899f, -0.0019f, 6.6542f, 0.1098f, 6.2694f, 0.3275f)
                    curveTo(5.8845f, 0.5451f, 5.5643f, 0.8609f, 5.3413f, 1.2427f)
                    curveTo(5.1183f, 1.6245f, 5.0005f, 2.0586f, 5.0f, 2.5007f)
                    verticalLineTo(9.0007f)
                    horizontalLineTo(19.916f)
                    lineTo(8.886f, 0.4277f)
                    close()
                    moveTo(8.786f, 23.6417f)
                    lineTo(19.916f, 15.0007f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(21.5007f)
                    curveTo(4.9982f, 21.9439f, 5.1144f, 22.3796f, 5.3369f, 22.7629f)
                    curveTo(5.5594f, 23.1463f, 5.88f, 23.4634f, 6.2657f, 23.6817f)
                    curveTo(6.6514f, 23.8999f, 7.0883f, 24.0115f, 7.5315f, 24.0048f)
                    curveTo(7.9746f, 23.9981f, 8.408f, 23.8735f, 8.787f, 23.6437f)
                    lineTo(8.786f, 23.6417f)
                    close()
                }
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
