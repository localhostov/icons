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

public val Icons.Filled.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.74f, 9.2501f)
                    lineTo(9.0f, 0.1371f)
                    verticalLineTo(6.4851f)
                    lineTo(0.0f, 0.0571f)
                    verticalLineTo(23.9431f)
                    lineTo(9.0f, 17.5151f)
                    verticalLineTo(23.9431f)
                    lineTo(22.741f, 14.1321f)
                    curveTo(23.1295f, 13.8546f, 23.4461f, 13.4883f, 23.6646f, 13.0637f)
                    curveTo(23.883f, 12.6392f, 23.997f, 12.1686f, 23.997f, 11.6911f)
                    curveTo(23.997f, 11.2137f, 23.883f, 10.7431f, 23.6646f, 10.3185f)
                    curveTo(23.4461f, 9.894f, 23.1295f, 9.5277f, 22.741f, 9.2501f)
                    horizontalLineTo(22.74f)
                    close()
                }
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
