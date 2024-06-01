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

public val Icons.Bold.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.167f, 15.3561f)
                    lineTo(23.117f, 10.4071f)
                    curveTo(23.3956f, 10.1285f, 23.6167f, 9.7978f, 23.7675f, 9.4338f)
                    curveTo(23.9182f, 9.0697f, 23.9959f, 8.6796f, 23.9959f, 8.2856f)
                    curveTo(23.9959f, 7.8916f, 23.9182f, 7.5014f, 23.7675f, 7.1374f)
                    curveTo(23.6167f, 6.7734f, 23.3956f, 6.4427f, 23.117f, 6.1641f)
                    lineTo(18.167f, 1.2151f)
                    lineTo(16.046f, 3.3361f)
                    lineTo(19.71f, 7.0001f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 7.0001f, 1.6815f, 7.3688f, 1.0251f, 8.0252f)
                    curveTo(0.3687f, 8.6816f, 0.0f, 9.5718f, 0.0f, 10.5001f)
                    lineTo(0.0f, 20.5001f)
                    curveTo(0.0f, 21.4283f, 0.3687f, 22.3186f, 1.0251f, 22.975f)
                    curveTo(1.6815f, 23.6313f, 2.5717f, 24.0001f, 3.5f, 24.0001f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(21.0001f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 21.0001f, 3.2402f, 20.9474f, 3.1465f, 20.8536f)
                    curveTo(3.0527f, 20.7599f, 3.0f, 20.6327f, 3.0f, 20.5001f)
                    verticalLineTo(10.5001f)
                    curveTo(3.0f, 10.3675f, 3.0527f, 10.2403f, 3.1465f, 10.1465f)
                    curveTo(3.2402f, 10.0528f, 3.3674f, 10.0001f, 3.5f, 10.0001f)
                    horizontalLineTo(19.282f)
                    lineTo(16.046f, 13.2351f)
                    lineTo(18.167f, 15.3561f)
                    close()
                }
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
