package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Screen: ImageVector
    get() {
        if (_screen != null) {
            return _screen!!
        }
        _screen = Builder(name = "Screen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 2.0006f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 2.0022f, 2.6438f, 2.5822f, 1.6127f, 3.6133f)
                    curveTo(0.5816f, 4.6444f, 0.0016f, 6.0424f, 0.0f, 7.5006f)
                    lineTo(0.0f, 13.5006f)
                    curveTo(0.0016f, 14.9588f, 0.5816f, 16.3568f, 1.6127f, 17.3879f)
                    curveTo(2.6438f, 18.419f, 4.0418f, 18.999f, 5.5f, 19.0006f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(21.0006f)
                    horizontalLineTo(8.0f)
                    curveTo(7.6022f, 21.0006f, 7.2206f, 21.1586f, 6.9393f, 21.44f)
                    curveTo(6.658f, 21.7213f, 6.5f, 22.1028f, 6.5f, 22.5006f)
                    curveTo(6.5f, 22.8984f, 6.658f, 23.28f, 6.9393f, 23.5613f)
                    curveTo(7.2206f, 23.8426f, 7.6022f, 24.0006f, 8.0f, 24.0006f)
                    horizontalLineTo(16.0f)
                    curveTo(16.3978f, 24.0006f, 16.7794f, 23.8426f, 17.0607f, 23.5613f)
                    curveTo(17.342f, 23.28f, 17.5f, 22.8984f, 17.5f, 22.5006f)
                    curveTo(17.5f, 22.1028f, 17.342f, 21.7213f, 17.0607f, 21.44f)
                    curveTo(16.7794f, 21.1586f, 16.3978f, 21.0006f, 16.0f, 21.0006f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(19.0006f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 18.999f, 21.3562f, 18.419f, 22.3873f, 17.3879f)
                    curveTo(23.4184f, 16.3568f, 23.9984f, 14.9588f, 24.0f, 13.5006f)
                    verticalLineTo(7.5006f)
                    curveTo(23.9984f, 6.0424f, 23.4184f, 4.6444f, 22.3873f, 3.6133f)
                    curveTo(21.3562f, 2.5822f, 19.9582f, 2.0022f, 18.5f, 2.0006f)
                    close()
                    moveTo(21.0f, 13.5006f)
                    curveTo(21.0f, 14.1637f, 20.7366f, 14.7995f, 20.2678f, 15.2684f)
                    curveTo(19.7989f, 15.7372f, 19.163f, 16.0006f, 18.5f, 16.0006f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 16.0006f, 4.2011f, 15.7372f, 3.7322f, 15.2684f)
                    curveTo(3.2634f, 14.7995f, 3.0f, 14.1637f, 3.0f, 13.5006f)
                    verticalLineTo(7.5006f)
                    curveTo(3.0f, 6.8376f, 3.2634f, 6.2017f, 3.7322f, 5.7328f)
                    curveTo(4.2011f, 5.264f, 4.837f, 5.0006f, 5.5f, 5.0006f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 5.0006f, 19.7989f, 5.264f, 20.2678f, 5.7328f)
                    curveTo(20.7366f, 6.2017f, 21.0f, 6.8376f, 21.0f, 7.5006f)
                    verticalLineTo(13.5006f)
                    close()
                }
            }
        }
        .build()
        return _screen!!
    }

private var _screen: ImageVector? = null
