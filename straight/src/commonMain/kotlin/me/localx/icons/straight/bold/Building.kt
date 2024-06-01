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

public val Icons.Bold.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0f, 10.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(9.0f, 13.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(4.0f, 18.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(9.0f, 18.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(4.0f, 8.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(9.0f, 8.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(24.0f, 8.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.5f)
                    curveTo(0.0f, 2.5717f, 0.3687f, 1.6815f, 1.0251f, 1.0251f)
                    curveTo(1.6815f, 0.3687f, 2.5717f, 0.0f, 3.5f, 0.0f)
                    lineTo(12.5f, 0.0f)
                    curveTo(13.4283f, 0.0f, 14.3185f, 0.3687f, 14.9749f, 1.0251f)
                    curveTo(15.6313f, 1.6815f, 16.0f, 2.5717f, 16.0f, 3.5f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(20.5f)
                    curveTo(21.4283f, 5.0f, 22.3185f, 5.3688f, 22.9749f, 6.0251f)
                    curveTo(23.6313f, 6.6815f, 24.0f, 7.5717f, 24.0f, 8.5f)
                    close()
                    moveTo(13.0f, 3.5f)
                    curveTo(13.0f, 3.3674f, 12.9473f, 3.2402f, 12.8536f, 3.1465f)
                    curveTo(12.7598f, 3.0527f, 12.6326f, 3.0f, 12.5f, 3.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 3.0f, 3.2402f, 3.0527f, 3.1465f, 3.1465f)
                    curveTo(3.0527f, 3.2402f, 3.0f, 3.3674f, 3.0f, 3.5f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(3.5f)
                    close()
                    moveTo(21.0f, 8.5f)
                    curveTo(21.0f, 8.3674f, 20.9473f, 8.2402f, 20.8536f, 8.1465f)
                    curveTo(20.7598f, 8.0527f, 20.6326f, 8.0f, 20.5f, 8.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(8.5f)
                    close()
                    moveTo(17.0f, 13.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(13.0f)
                    close()
                    moveTo(17.0f, 18.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
