package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.848f, 16.0004f)
                    curveTo(15.5573f, 16.0003f, 15.2701f, 16.0636f, 15.0064f, 16.1859f)
                    curveTo(14.7427f, 16.3082f, 14.5088f, 16.4865f, 14.321f, 16.7084f)
                    lineTo(14.074f, 17.0004f)
                    horizontalLineTo(9.925f)
                    lineTo(9.679f, 16.7084f)
                    curveTo(9.4911f, 16.4863f, 9.257f, 16.308f, 8.9931f, 16.1857f)
                    curveTo(8.7292f, 16.0634f, 8.4418f, 16.0002f, 8.151f, 16.0004f)
                    horizontalLineTo(2.5f)
                    curveTo(1.837f, 16.0004f, 1.2011f, 16.2638f, 0.7322f, 16.7326f)
                    curveTo(0.2634f, 17.2014f, 0.0f, 17.8373f, 0.0f, 18.5004f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 19.1634f, 0.2634f, 19.7993f, 0.7322f, 20.2681f)
                    curveTo(1.2011f, 20.737f, 1.837f, 21.0004f, 2.5f, 21.0004f)
                    horizontalLineTo(21.5f)
                    curveTo(21.8283f, 21.0004f, 22.1534f, 20.9357f, 22.4567f, 20.8101f)
                    curveTo(22.76f, 20.6844f, 23.0356f, 20.5003f, 23.2678f, 20.2681f)
                    curveTo(23.4999f, 20.036f, 23.6841f, 19.7604f, 23.8097f, 19.4571f)
                    curveTo(23.9353f, 19.1538f, 24.0f, 18.8287f, 24.0f, 18.5004f)
                    curveTo(24.0f, 18.1721f, 23.9353f, 17.847f, 23.8097f, 17.5437f)
                    curveTo(23.6841f, 17.2403f, 23.4999f, 16.9647f, 23.2678f, 16.7326f)
                    curveTo(23.0356f, 16.5005f, 22.76f, 16.3163f, 22.4567f, 16.1907f)
                    curveTo(22.1534f, 16.065f, 21.8283f, 16.0004f, 21.5f, 16.0004f)
                    horizontalLineTo(15.848f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.0001f, 14.0f)
                    horizontalLineTo(8.1511f)
                    curveTo(9.1267f, 13.9986f, 10.0689f, 14.3543f, 10.8002f, 15.0f)
                    horizontalLineTo(13.2002f)
                    curveTo(13.9312f, 14.3553f, 14.8725f, 13.9997f, 15.8472f, 14.0f)
                    horizontalLineTo(21.0002f)
                    curveTo(21.3364f, 14.0023f, 21.6715f, 14.0392f, 22.0002f, 14.11f)
                    verticalLineTo(8.0f)
                    curveTo(21.9986f, 6.6744f, 21.4713f, 5.4036f, 20.5339f, 4.4662f)
                    curveTo(19.5966f, 3.5289f, 18.3257f, 3.0016f, 17.0002f, 3.0f)
                    horizontalLineTo(7.0002f)
                    curveTo(5.6746f, 3.0016f, 4.4037f, 3.5289f, 3.4664f, 4.4662f)
                    curveTo(2.529f, 5.4036f, 2.0017f, 6.6744f, 2.0001f, 8.0f)
                    verticalLineTo(14.11f)
                    curveTo(2.3288f, 14.0392f, 2.6639f, 14.0023f, 3.0001f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
