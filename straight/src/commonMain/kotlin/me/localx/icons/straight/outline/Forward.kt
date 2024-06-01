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

public val Icons.Outline.Forward: ImageVector
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
                    moveTo(21.578f, 12.5051f)
                    lineTo(11.0f, 20.0571f)
                    verticalLineTo(13.6281f)
                    lineTo(2.0f, 20.0571f)
                    verticalLineTo(3.9431f)
                    lineTo(11.0f, 10.3721f)
                    verticalLineTo(3.8631f)
                    lineTo(21.59f, 10.8861f)
                    curveTo(21.7172f, 10.9798f, 21.8204f, 11.1023f, 21.8911f, 11.2435f)
                    curveTo(21.9618f, 11.3848f, 21.9981f, 11.5407f, 21.9969f, 11.6987f)
                    curveTo(21.9957f, 11.8566f, 21.9572f, 12.0121f, 21.8843f, 12.1522f)
                    curveTo(21.8115f, 12.2924f, 21.7066f, 12.4133f, 21.578f, 12.5051f)
                    close()
                }
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
