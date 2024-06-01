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

public val Icons.Bold.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.0f)
                    verticalLineTo(3.5f)
                    curveTo(24.0f, 2.5717f, 23.6313f, 1.6815f, 22.9749f, 1.0251f)
                    curveTo(22.3185f, 0.3687f, 21.4283f, 0.0f, 20.5f, 0.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 0.0f, 1.6815f, 0.3687f, 1.0251f, 1.0251f)
                    curveTo(0.3687f, 1.6815f, 0.0f, 2.5717f, 0.0f, 3.5f)
                    lineTo(0.0f, 19.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(3.0f, 3.5f)
                    curveTo(3.0f, 3.3674f, 3.0527f, 3.2402f, 3.1465f, 3.1465f)
                    curveTo(3.2402f, 3.0527f, 3.3674f, 3.0f, 3.5f, 3.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 3.0f, 20.7598f, 3.0527f, 20.8536f, 3.1465f)
                    curveTo(20.9473f, 3.2402f, 21.0f, 3.3674f, 21.0f, 3.5f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(14.7f, 8.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(16.3f)
                    lineTo(13.311f, 15.483f)
                    lineTo(10.311f, 9.483f)
                    lineTo(9.3f, 11.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(7.7f)
                    lineTo(10.689f, 3.517f)
                    lineTo(13.689f, 9.517f)
                    lineTo(14.7f, 8.0f)
                    close()
                }
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
