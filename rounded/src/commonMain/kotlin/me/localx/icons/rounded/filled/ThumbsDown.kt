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

public val Icons.Filled.ThumbsDown: ImageVector
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
                    moveTo(23.9512f, 12.3f)
                    lineTo(23.2462f, 7.3f)
                    curveTo(23.0729f, 6.1099f, 22.4784f, 5.0215f, 21.5708f, 4.2325f)
                    curveTo(20.6633f, 3.4434f, 19.5028f, 3.0061f, 18.3002f, 3.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(18.584f)
                    lineTo(9.6262f, 21.884f)
                    curveTo(9.9489f, 22.5363f, 10.4951f, 23.051f, 11.1654f, 23.3346f)
                    curveTo(11.8356f, 23.6181f, 12.5854f, 23.6516f, 13.2783f, 23.429f)
                    curveTo(13.9712f, 23.2064f, 14.5611f, 22.7425f, 14.9408f, 22.1216f)
                    curveTo(15.3205f, 21.5008f, 15.4647f, 20.7642f, 15.3472f, 20.046f)
                    lineTo(15.0112f, 18.0f)
                    horizontalLineTo(19.0002f)
                    curveTo(19.7159f, 18.0f, 20.4234f, 17.8464f, 21.0746f, 17.5494f)
                    curveTo(21.7259f, 17.2525f, 22.3059f, 16.8192f, 22.7752f, 16.2788f)
                    curveTo(23.2446f, 15.7384f, 23.5925f, 15.1036f, 23.7954f, 14.4171f)
                    curveTo(23.9982f, 13.7307f, 24.0514f, 13.0087f, 23.9512f, 12.3f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 8.0f)
                    verticalLineTo(13.0f)
                    curveTo(0.0016f, 14.3256f, 0.5289f, 15.5964f, 1.4662f, 16.5338f)
                    curveTo(2.4036f, 17.4711f, 3.6744f, 17.9984f, 5.0f, 18.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 3.0016f, 2.4036f, 3.5289f, 1.4662f, 4.4662f)
                    curveTo(0.5289f, 5.4036f, 0.0016f, 6.6744f, 0.0f, 8.0f)
                    horizontalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
