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

public val Icons.Bold.BoxAlt: ImageVector
    get() {
        if (_boxAlt != null) {
            return _boxAlt!!
        }
        _boxAlt = Builder(name = "BoxAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 0.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 0.0f, 1.6815f, 0.3687f, 1.0251f, 1.0251f)
                    curveTo(0.3687f, 1.6815f, 0.0f, 2.5717f, 0.0f, 3.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.5f)
                    curveTo(24.0f, 2.5717f, 23.6313f, 1.6815f, 22.9749f, 1.0251f)
                    curveTo(22.3185f, 0.3687f, 21.4283f, 0.0f, 20.5f, 0.0f)
                    close()
                    moveTo(21.0f, 3.5f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 3.0f, 20.7598f, 3.0527f, 20.8536f, 3.1465f)
                    curveTo(20.9473f, 3.2402f, 21.0f, 3.3674f, 21.0f, 3.5f)
                    close()
                    moveTo(11.0f, 3.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(3.5f, 3.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.5f)
                    curveTo(3.0f, 3.3674f, 3.0527f, 3.2402f, 3.1465f, 3.1465f)
                    curveTo(3.2402f, 3.0527f, 3.3674f, 3.0f, 3.5f, 3.0f)
                    close()
                    moveTo(3.0f, 21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    close()
                    moveTo(14.5f, 16.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(14.5f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _boxAlt!!
    }

private var _boxAlt: ImageVector? = null
