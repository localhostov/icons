package me.localx.icons.rounded.bold

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

public val Icons.Bold.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                    curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                    curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                    curveTo(23.9928f, 5.3755f, 18.6245f, 0.0072f, 12.0f, 0.0f)
                    close()
                    moveTo(12.0f, 21.0f)
                    curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                    curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                    curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                    curveTo(20.994f, 16.968f, 16.968f, 20.994f, 12.0f, 21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.6001f, 9.3332f)
                    curveTo(15.1861f, 9.9189f, 16.1359f, 9.9187f, 16.7216f, 9.3327f)
                    curveTo(17.3073f, 8.7467f, 17.3071f, 7.7969f, 16.7211f, 7.2112f)
                    curveTo(14.0762f, 4.5692f, 9.7903f, 4.5715f, 7.1483f, 7.2164f)
                    curveTo(4.5063f, 9.8613f, 4.5086f, 14.1472f, 7.1535f, 16.7892f)
                    curveTo(9.7963f, 19.4292f, 14.0782f, 19.4292f, 16.7211f, 16.7892f)
                    curveTo(17.3071f, 16.2035f, 17.3073f, 15.2537f, 16.7216f, 14.6677f)
                    curveTo(16.1359f, 14.0817f, 15.1861f, 14.0815f, 14.6001f, 14.6672f)
                    curveTo(13.1271f, 16.1404f, 10.7388f, 16.1406f, 9.2657f, 14.6676f)
                    curveTo(7.7925f, 13.1947f, 7.7923f, 10.8064f, 9.2652f, 9.3332f)
                    curveTo(10.7382f, 7.86f, 13.1265f, 7.8598f, 14.5997f, 9.3328f)
                    curveTo(14.5998f, 9.3329f, 14.5999f, 9.3331f, 14.6001f, 9.3332f)
                    close()
                }
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
