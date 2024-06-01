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

public val Icons.Bold.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.879f, 1.0f)
                    lineTo(18.0f, 4.879f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(3.5f)
                    curveTo(16.0f, 2.5717f, 15.6313f, 1.6815f, 14.9749f, 1.0251f)
                    curveTo(14.3185f, 0.3687f, 13.4283f, 0.0f, 12.5f, 0.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 0.0f, 1.6815f, 0.3687f, 1.0251f, 1.0251f)
                    curveTo(0.3687f, 1.6815f, 0.0f, 2.5717f, 0.0f, 3.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(6.121f)
                    lineTo(24.0f, 3.121f)
                    lineTo(21.879f, 1.0f)
                    close()
                    moveTo(3.5f, 3.0f)
                    horizontalLineTo(12.5f)
                    curveTo(12.6326f, 3.0f, 12.7598f, 3.0527f, 12.8536f, 3.1465f)
                    curveTo(12.9473f, 3.2402f, 13.0f, 3.3674f, 13.0f, 3.5f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(10.816f)
                    curveTo(10.7238f, 8.7356f, 10.5948f, 8.4855f, 10.433f, 8.257f)
                    lineTo(12.2f, 5.9f)
                    lineTo(9.8f, 4.1f)
                    lineTo(7.594f, 7.041f)
                    curveTo(7.0512f, 7.1149f, 6.5392f, 7.3367f, 6.114f, 7.6823f)
                    curveTo(5.689f, 8.0278f, 5.3672f, 8.4837f, 5.184f, 9.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.5f)
                    curveTo(3.0f, 3.3674f, 3.0527f, 3.2402f, 3.1465f, 3.1465f)
                    curveTo(3.2402f, 3.0527f, 3.3674f, 3.0f, 3.5f, 3.0f)
                    close()
                    moveTo(3.0f, 21.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
