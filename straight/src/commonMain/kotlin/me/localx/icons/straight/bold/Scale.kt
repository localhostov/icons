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

public val Icons.Bold.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.5f, 1.9992f)
                    horizontalLineTo(16.46f)
                    curveTo(15.8997f, 1.3701f, 15.2126f, 0.8668f, 14.4439f, 0.5221f)
                    curveTo(13.6753f, 0.1774f, 12.8424f, -8.0E-4f, 12.0f, -8.0E-4f)
                    curveTo(11.1576f, -8.0E-4f, 10.3247f, 0.1774f, 9.5561f, 0.5221f)
                    curveTo(8.7874f, 0.8668f, 8.1003f, 1.3701f, 7.54f, 1.9992f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 1.9992f, 1.6815f, 2.3679f, 1.0251f, 3.0243f)
                    curveTo(0.3687f, 3.6807f, 0.0f, 4.5709f, 0.0f, 5.4992f)
                    lineTo(0.0f, 23.9992f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.4992f)
                    curveTo(24.0f, 4.5709f, 23.6313f, 3.6807f, 22.9749f, 3.0243f)
                    curveTo(22.3185f, 2.3679f, 21.4283f, 1.9992f, 20.5f, 1.9992f)
                    close()
                    moveTo(21.0f, 20.9992f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(5.4992f)
                    curveTo(3.0f, 5.3665f, 3.0527f, 5.2394f, 3.1465f, 5.1456f)
                    curveTo(3.2402f, 5.0518f, 3.3674f, 4.9992f, 3.5f, 4.9992f)
                    horizontalLineTo(6.09f)
                    curveTo(6.0321f, 5.3294f, 6.002f, 5.6639f, 6.0f, 5.9992f)
                    verticalLineTo(7.9992f)
                    horizontalLineTo(9.291f)
                    lineTo(11.718f, 2.9992f)
                    lineTo(14.4f, 4.3412f)
                    lineTo(12.7f, 7.9992f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(5.9992f)
                    curveTo(17.998f, 5.6639f, 17.9679f, 5.3294f, 17.91f, 4.9992f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 4.9992f, 20.7598f, 5.0518f, 20.8536f, 5.1456f)
                    curveTo(20.9473f, 5.2394f, 21.0f, 5.3665f, 21.0f, 5.4992f)
                    verticalLineTo(20.9992f)
                    close()
                }
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
