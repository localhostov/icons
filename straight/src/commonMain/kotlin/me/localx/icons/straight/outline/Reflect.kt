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

public val Icons.Outline.Reflect: ImageVector
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
                    moveTo(7.0f, 2.5007f)
                    curveTo(7.0f, 2.416f, 7.0215f, 2.3327f, 7.0625f, 2.2586f)
                    curveTo(7.1035f, 2.1845f, 7.1627f, 2.122f, 7.2345f, 2.077f)
                    curveTo(7.3062f, 2.032f, 7.3883f, 2.006f, 7.4728f, 2.0014f)
                    curveTo(7.5574f, 1.9968f, 7.6418f, 2.0138f, 7.718f, 2.0507f)
                    lineTo(14.084f, 7.0007f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(2.5007f)
                    close()
                    moveTo(8.787f, 23.6417f)
                    lineTo(19.916f, 15.0007f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(21.5007f)
                    curveTo(4.9982f, 21.9439f, 5.1144f, 22.3796f, 5.3369f, 22.7629f)
                    curveTo(5.5594f, 23.1463f, 5.88f, 23.4634f, 6.2657f, 23.6817f)
                    curveTo(6.6514f, 23.8999f, 7.0883f, 24.0115f, 7.5315f, 24.0048f)
                    curveTo(7.9746f, 23.9981f, 8.408f, 23.8735f, 8.787f, 23.6437f)
                    verticalLineTo(23.6417f)
                    close()
                    moveTo(14.084f, 17.0007f)
                    lineTo(7.718f, 21.9487f)
                    curveTo(7.6419f, 21.9856f, 7.5578f, 22.0026f, 7.4733f, 21.998f)
                    curveTo(7.3889f, 21.9935f, 7.307f, 21.9677f, 7.2353f, 21.923f)
                    curveTo(7.1636f, 21.8782f, 7.1044f, 21.816f, 7.0632f, 21.7422f)
                    curveTo(7.0221f, 21.6683f, 7.0003f, 21.5853f, 7.0f, 21.5007f)
                    verticalLineTo(17.0007f)
                    horizontalLineTo(14.084f)
                    close()
                }
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
