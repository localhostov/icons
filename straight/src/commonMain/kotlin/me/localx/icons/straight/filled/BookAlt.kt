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

public val Icons.Filled.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.922f, 1.7f)
                    curveTo(22.5764f, 1.4135f, 22.1711f, 1.2077f, 21.7359f, 1.0977f)
                    curveTo(21.3006f, 0.9876f, 20.8463f, 0.9761f, 20.406f, 1.064f)
                    lineTo(16.284f, 2.064f)
                    curveTo(15.3624f, 2.2317f, 14.5288f, 2.7175f, 13.9287f, 3.4368f)
                    curveTo(13.3285f, 4.1561f, 12.9999f, 5.0632f, 13.0f, 6.0f)
                    verticalLineTo(20.8f)
                    lineTo(12.0f, 20.981f)
                    lineTo(11.0f, 20.8f)
                    verticalLineTo(6.0f)
                    curveTo(11.0037f, 5.0725f, 10.6832f, 4.1729f, 10.094f, 3.4565f)
                    curveTo(9.5047f, 2.7403f, 8.6838f, 2.2523f, 7.773f, 2.077f)
                    lineTo(3.536f, 1.049f)
                    curveTo(3.1038f, 0.9705f, 2.6596f, 0.9879f, 2.2348f, 1.1f)
                    curveTo(1.81f, 1.212f, 1.4151f, 1.416f, 1.0778f, 1.6975f)
                    curveTo(0.7405f, 1.9789f, 0.4692f, 2.331f, 0.2829f, 2.7289f)
                    curveTo(0.0967f, 3.1268f, 1.0E-4f, 3.5607f, 0.0f, 4.0f)
                    lineTo(0.0f, 20.834f)
                    lineTo(12.0f, 23.017f)
                    lineTo(24.0f, 20.834f)
                    verticalLineTo(4.0f)
                    curveTo(24.0f, 3.561f, 23.9035f, 3.1274f, 23.7172f, 2.7299f)
                    curveTo(23.5309f, 2.3324f, 23.2594f, 1.9808f, 22.922f, 1.7f)
                    close()
                }
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
