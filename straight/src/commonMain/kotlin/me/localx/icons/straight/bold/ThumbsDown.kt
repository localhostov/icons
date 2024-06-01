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

public val Icons.Bold.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 13.929f)
                    lineTo(22.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 15.0f)
                    curveTo(0.0f, 15.7956f, 0.3161f, 16.5587f, 0.8787f, 17.1213f)
                    curveTo(1.4413f, 17.6839f, 2.2043f, 18.0f, 3.0f, 18.0f)
                    horizontalLineTo(7.582f)
                    lineTo(9.248f, 21.264f)
                    curveTo(9.6224f, 21.9979f, 10.2472f, 22.5734f, 11.0093f, 22.8864f)
                    curveTo(11.7715f, 23.1993f, 12.6205f, 23.2289f, 13.4025f, 22.9698f)
                    curveTo(14.1846f, 22.7107f, 14.848f, 22.1801f, 15.2726f, 21.4741f)
                    curveTo(15.6972f, 20.768f, 15.8548f, 19.9333f, 15.717f, 19.121f)
                    lineTo(15.526f, 18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(13.929f)
                    close()
                    moveTo(3.0f, 6.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(21.0f, 15.0f)
                    horizontalLineTo(11.974f)
                    lineTo(12.76f, 19.624f)
                    curveTo(12.7712f, 19.6877f, 12.768f, 19.753f, 12.7507f, 19.8153f)
                    curveTo(12.7334f, 19.8776f, 12.7024f, 19.9352f, 12.66f, 19.984f)
                    curveTo(12.6124f, 20.0404f, 12.5517f, 20.0842f, 12.4831f, 20.1115f)
                    curveTo(12.4146f, 20.1388f, 12.3403f, 20.1487f, 12.267f, 20.1404f)
                    curveTo(12.1937f, 20.1321f, 12.1236f, 20.1058f, 12.0628f, 20.0639f)
                    curveTo(12.0021f, 20.0219f, 11.9527f, 19.9656f, 11.919f, 19.9f)
                    lineTo(10.0f, 16.14f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(19.5f)
                    lineTo(21.0f, 14.066f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
