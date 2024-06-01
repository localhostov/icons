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

public val Icons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.7259f, 9.0f)
                    lineTo(11.9999f, 24.0f)
                    lineTo(8.2739f, 9.0f)
                    horizontalLineTo(15.7259f)
                    close()
                    moveTo(10.9729f, 0.0f)
                    lineTo(8.4279f, 7.0f)
                    horizontalLineTo(15.5719f)
                    lineTo(13.0269f, 0.0f)
                    horizontalLineTo(10.9729f)
                    close()
                    moveTo(17.6999f, 7.0f)
                    horizontalLineTo(23.8409f)
                    curveTo(23.7487f, 6.7147f, 23.6138f, 6.445f, 23.4409f, 6.2f)
                    lineTo(19.9099f, 1.257f)
                    curveTo(19.6325f, 0.8683f, 19.2662f, 0.5515f, 18.8417f, 0.3329f)
                    curveTo(18.4171f, 0.1142f, 17.9465f, 1.0E-4f, 17.4689f, 0.0f)
                    lineTo(15.1549f, 0.0f)
                    lineTo(17.6999f, 7.0f)
                    close()
                    moveTo(17.7849f, 9.0f)
                    lineTo(15.0199f, 20.3f)
                    lineTo(23.3589f, 9.8f)
                    curveTo(23.5464f, 9.5577f, 23.6952f, 9.2879f, 23.7999f, 9.0f)
                    horizontalLineTo(17.7849f)
                    close()
                    moveTo(6.2149f, 9.0f)
                    horizontalLineTo(0.1999f)
                    curveTo(0.3064f, 9.2879f, 0.4565f, 9.5577f, 0.6449f, 9.8f)
                    lineTo(8.9799f, 20.3f)
                    lineTo(6.2149f, 9.0f)
                    close()
                    moveTo(6.2999f, 7.0f)
                    lineTo(8.8449f, 0.0f)
                    horizontalLineTo(6.5309f)
                    curveTo(6.0534f, 1.0E-4f, 5.5828f, 0.1142f, 5.1582f, 0.3329f)
                    curveTo(4.7336f, 0.5515f, 4.3674f, 0.8683f, 4.0899f, 1.257f)
                    lineTo(0.5589f, 6.2f)
                    curveTo(0.3857f, 6.4447f, 0.2508f, 6.7145f, 0.1589f, 7.0f)
                    horizontalLineTo(6.2999f)
                    close()
                }
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
