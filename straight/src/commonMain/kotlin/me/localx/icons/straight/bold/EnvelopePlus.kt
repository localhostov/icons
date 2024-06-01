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

public val Icons.Bold.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 4.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(11.2f)
                    lineTo(8.239f, 16.44f)
                    curveTo(8.7328f, 16.934f, 9.319f, 17.3258f, 9.9642f, 17.5932f)
                    curveTo(10.6095f, 17.8605f, 11.3011f, 17.9981f, 11.9995f, 17.9981f)
                    curveTo(12.6979f, 17.9981f, 13.3895f, 17.8605f, 14.0348f, 17.5932f)
                    curveTo(14.68f, 17.3258f, 15.2662f, 16.934f, 15.76f, 16.44f)
                    lineTo(18.217f, 13.984f)
                    curveTo(17.0357f, 13.946f, 15.8754f, 13.6609f, 14.811f, 13.147f)
                    lineTo(13.639f, 14.319f)
                    curveTo(13.1975f, 14.7407f, 12.6105f, 14.976f, 12.0f, 14.976f)
                    curveTo(11.3895f, 14.976f, 10.8025f, 14.7407f, 10.361f, 14.319f)
                    lineTo(3.0f, 6.96f)
                    verticalLineTo(6.5f)
                    curveTo(3.0f, 6.3674f, 3.0527f, 6.2402f, 3.1465f, 6.1465f)
                    curveTo(3.2402f, 6.0527f, 3.3674f, 6.0f, 3.5f, 6.0f)
                    horizontalLineTo(10.025f)
                    curveTo(10.016f, 5.834f, 10.0f, 5.669f, 10.0f, 5.5f)
                    curveTo(9.9997f, 4.6526f, 10.1261f, 3.81f, 10.375f, 3.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 3.0f, 1.6815f, 3.3688f, 1.0251f, 4.0251f)
                    curveTo(0.3687f, 4.6815f, 0.0f, 5.5717f, 0.0f, 6.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(11.974f)
                    curveTo(23.1229f, 12.7229f, 22.102f, 13.2848f, 21.0f, 13.625f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null
