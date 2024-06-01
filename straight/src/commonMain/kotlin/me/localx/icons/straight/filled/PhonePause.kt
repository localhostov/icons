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

public val Icons.Filled.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.8779f, 19.113f)
                    lineTo(20.7069f, 22.285f)
                    curveTo(20.1541f, 22.835f, 19.4975f, 23.2698f, 18.7753f, 23.5642f)
                    curveTo(18.0532f, 23.8586f, 17.2798f, 24.0067f, 16.4999f, 24.0f)
                    curveTo(9.2519f, 24.0f, -1.0E-4f, 14.748f, -1.0E-4f, 7.5f)
                    curveTo(-0.007f, 6.7198f, 0.1412f, 5.946f, 0.436f, 5.2236f)
                    curveTo(0.7307f, 4.5012f, 1.1662f, 3.8446f, 1.7169f, 3.292f)
                    lineTo(4.8869f, 0.122f)
                    lineTo(11.1509f, 6.387f)
                    lineTo(7.0269f, 10.512f)
                    curveTo(8.2529f, 13.4267f, 10.5683f, 15.7478f, 13.4799f, 16.981f)
                    lineTo(17.6129f, 12.848f)
                    lineTo(23.8779f, 19.113f)
                    close()
                    moveTo(21.9999f, 0.0f)
                    horizontalLineTo(19.9999f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(17.9999f, 0.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(17.9999f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
