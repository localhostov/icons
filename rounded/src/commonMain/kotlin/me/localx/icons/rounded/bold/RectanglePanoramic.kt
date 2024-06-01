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

public val Icons.Bold.RectanglePanoramic: ImageVector
    get() {
        if (_rectanglePanoramic != null) {
            return _rectanglePanoramic!!
        }
        _rectanglePanoramic = Builder(name = "RectanglePanoramic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 5.0006f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 5.0022f, 2.6438f, 5.5822f, 1.6127f, 6.6133f)
                    curveTo(0.5816f, 7.6444f, 0.0016f, 9.0424f, 0.0f, 10.5006f)
                    lineTo(0.0f, 13.5006f)
                    curveTo(0.0016f, 14.9588f, 0.5816f, 16.3568f, 1.6127f, 17.3879f)
                    curveTo(2.6438f, 18.419f, 4.0418f, 18.999f, 5.5f, 19.0006f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 18.999f, 21.3562f, 18.419f, 22.3873f, 17.3879f)
                    curveTo(23.4184f, 16.3568f, 23.9984f, 14.9588f, 24.0f, 13.5006f)
                    verticalLineTo(10.5006f)
                    curveTo(23.9984f, 9.0424f, 23.4184f, 7.6444f, 22.3873f, 6.6133f)
                    curveTo(21.3562f, 5.5822f, 19.9582f, 5.0022f, 18.5f, 5.0006f)
                    close()
                    moveTo(21.0f, 13.5006f)
                    curveTo(21.0f, 14.1637f, 20.7366f, 14.7995f, 20.2678f, 15.2684f)
                    curveTo(19.7989f, 15.7372f, 19.163f, 16.0006f, 18.5f, 16.0006f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 16.0006f, 4.2011f, 15.7372f, 3.7322f, 15.2684f)
                    curveTo(3.2634f, 14.7995f, 3.0f, 14.1637f, 3.0f, 13.5006f)
                    verticalLineTo(10.5006f)
                    curveTo(3.0f, 9.8376f, 3.2634f, 9.2017f, 3.7322f, 8.7328f)
                    curveTo(4.2011f, 8.264f, 4.837f, 8.0006f, 5.5f, 8.0006f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 8.0006f, 19.7989f, 8.264f, 20.2678f, 8.7328f)
                    curveTo(20.7366f, 9.2017f, 21.0f, 9.8376f, 21.0f, 10.5006f)
                    verticalLineTo(13.5006f)
                    close()
                }
            }
        }
        .build()
        return _rectanglePanoramic!!
    }

private var _rectanglePanoramic: ImageVector? = null
