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

public val Icons.Bold.Doctor: ImageVector
    get() {
        if (_doctor != null) {
            return _doctor!!
        }
        _doctor = Builder(name = "Doctor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 5.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 5.0f, 1.6815f, 5.3688f, 1.0251f, 6.0251f)
                    curveTo(0.3687f, 6.6815f, 0.0f, 7.5717f, 0.0f, 8.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.5f)
                    curveTo(24.0f, 7.5717f, 23.6313f, 6.6815f, 22.9749f, 6.0251f)
                    curveTo(22.3185f, 5.3688f, 21.4283f, 5.0f, 20.5f, 5.0f)
                    close()
                    moveTo(10.0f, 3.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(8.5f)
                    curveTo(3.0f, 8.3674f, 3.0527f, 8.2402f, 3.1465f, 8.1465f)
                    curveTo(3.2402f, 8.0527f, 3.3674f, 8.0f, 3.5f, 8.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 8.0f, 20.7598f, 8.0527f, 20.8536f, 8.1465f)
                    curveTo(20.9473f, 8.2402f, 21.0f, 8.3674f, 21.0f, 8.5f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(13.5f, 13.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(18.5f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(13.0f)
                    close()
                }
            }
        }
        .build()
        return _doctor!!
    }

private var _doctor: ImageVector? = null
