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

public val Icons.Filled.Rainbow: ImageVector
    get() {
        if (_rainbow != null) {
            return _rainbow!!
        }
        _rainbow = Builder(name = "Rainbow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 20.9997f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(14.9997f)
                    curveTo(21.449f, 1.7297f, 2.546f, 1.7407f, 2.0f, 14.9997f)
                    verticalLineTo(20.9997f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.9997f)
                    curveTo(0.661f, -0.9243f, 23.345f, -0.9113f, 24.0f, 14.9997f)
                    verticalLineTo(20.9997f)
                    close()
                    moveTo(20.0f, 20.9997f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(14.9997f)
                    curveTo(17.747f, 7.0677f, 6.25f, 7.0737f, 6.0f, 14.9997f)
                    verticalLineTo(20.9997f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(14.9997f)
                    curveTo(4.4f, 4.3997f, 19.6f, 4.4067f, 20.0f, 14.9997f)
                    verticalLineTo(20.9997f)
                    close()
                    moveTo(16.0f, 20.9997f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(14.9997f)
                    curveTo(14.0f, 14.4693f, 13.7893f, 13.9606f, 13.4142f, 13.5855f)
                    curveTo(13.0391f, 13.2104f, 12.5304f, 12.9997f, 12.0f, 12.9997f)
                    curveTo(11.4696f, 12.9997f, 10.9609f, 13.2104f, 10.5858f, 13.5855f)
                    curveTo(10.2107f, 13.9606f, 10.0f, 14.4693f, 10.0f, 14.9997f)
                    verticalLineTo(20.9997f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(14.9997f)
                    curveTo(8.0f, 13.9388f, 8.4214f, 12.9214f, 9.1716f, 12.1713f)
                    curveTo(9.9217f, 11.4211f, 10.9391f, 10.9997f, 12.0f, 10.9997f)
                    curveTo(13.0609f, 10.9997f, 14.0783f, 11.4211f, 14.8284f, 12.1713f)
                    curveTo(15.5786f, 12.9214f, 16.0f, 13.9388f, 16.0f, 14.9997f)
                    verticalLineTo(20.9997f)
                    close()
                }
            }
        }
        .build()
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
