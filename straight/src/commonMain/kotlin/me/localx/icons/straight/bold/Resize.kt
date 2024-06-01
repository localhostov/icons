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

public val Icons.Bold.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 3.5f)
                    curveTo(24.0f, 2.5717f, 23.6313f, 1.6815f, 22.9749f, 1.0251f)
                    curveTo(22.3185f, 0.3687f, 21.4283f, 0.0f, 20.5f, 0.0f)
                    horizontalLineTo(8.5f)
                    curveTo(7.5717f, 0.0f, 6.6815f, 0.3687f, 6.0251f, 1.0251f)
                    curveTo(5.3688f, 1.6815f, 5.0f, 2.5717f, 5.0f, 3.5f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 11.0f, 1.6815f, 11.3687f, 1.0251f, 12.0251f)
                    curveTo(0.3687f, 12.6815f, 0.0f, 13.5717f, 0.0f, 14.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(10.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(14.5f)
                    curveTo(3.0f, 14.3674f, 3.0527f, 14.2402f, 3.1465f, 14.1464f)
                    curveTo(3.2402f, 14.0527f, 3.3674f, 14.0f, 3.5f, 14.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(21.0f, 16.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(14.5f)
                    curveTo(12.996f, 14.1026f, 12.9236f, 13.7088f, 12.786f, 13.336f)
                    lineTo(16.0f, 10.121f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.879f)
                    lineTo(10.664f, 11.214f)
                    curveTo(10.2912f, 11.0764f, 9.8974f, 11.004f, 9.5f, 11.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.5f)
                    curveTo(8.0f, 3.3674f, 8.0527f, 3.2402f, 8.1465f, 3.1465f)
                    curveTo(8.2402f, 3.0527f, 8.3674f, 3.0f, 8.5f, 3.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 3.0f, 20.7598f, 3.0527f, 20.8536f, 3.1465f)
                    curveTo(20.9473f, 3.2402f, 21.0f, 3.3674f, 21.0f, 3.5f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
