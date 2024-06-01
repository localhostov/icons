package me.localx.icons.straight.bold

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

public val Icons.Bold.Reflect: ImageVector
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
                    moveTo(24.0f, 13.4995f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.4995f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.4995f)
                    close()
                    moveTo(9.671f, 0.5155f)
                    lineTo(9.544f, 0.4295f)
                    curveTo(9.0889f, 0.1563f, 8.5695f, 0.0088f, 8.0388f, 0.0019f)
                    curveTo(7.5081f, -0.005f, 6.9851f, 0.1291f, 6.5231f, 0.3904f)
                    curveTo(6.0611f, 0.6517f, 5.6767f, 1.0308f, 5.4092f, 1.4892f)
                    curveTo(5.1416f, 1.9476f, 5.0004f, 2.4687f, 5.0f, 2.9995f)
                    verticalLineTo(8.9995f)
                    horizontalLineTo(21.008f)
                    lineTo(9.671f, 0.5155f)
                    close()
                    moveTo(8.0f, 3.0115f)
                    lineTo(11.992f, 5.9995f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0115f)
                    close()
                    moveTo(9.544f, 23.5694f)
                    lineTo(21.008f, 14.9995f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(20.9995f)
                    curveTo(5.0032f, 21.7941f, 5.3202f, 22.5554f, 5.8822f, 23.1173f)
                    curveTo(6.4441f, 23.6792f, 7.2053f, 23.9963f, 8.0f, 23.9994f)
                    curveTo(8.5441f, 23.9988f, 9.0779f, 23.8502f, 9.544f, 23.5694f)
                    close()
                    moveTo(11.992f, 17.9995f)
                    lineTo(8.0f, 20.9875f)
                    verticalLineTo(17.9995f)
                    horizontalLineTo(11.992f)
                    close()
                }
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
