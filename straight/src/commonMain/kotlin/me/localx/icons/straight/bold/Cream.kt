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

public val Icons.Bold.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 11.351f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(18.955f)
                    curveTo(18.9194f, 4.8469f, 18.6372f, 3.7148f, 18.1275f, 2.6799f)
                    curveTo(17.6178f, 1.6449f, 16.8924f, 0.7311f, 16.0f, 0.0f)
                    curveTo(16.0085f, 0.3963f, 15.9366f, 0.7902f, 15.7889f, 1.158f)
                    curveTo(15.6411f, 1.5258f, 15.4204f, 1.8599f, 15.1401f, 2.1402f)
                    curveTo(14.8599f, 2.4204f, 14.5258f, 2.6411f, 14.158f, 2.7889f)
                    curveTo(13.7902f, 2.9366f, 13.3963f, 3.0085f, 13.0f, 3.0f)
                    horizontalLineTo(10.0f)
                    curveTo(6.934f, 3.0f, 5.751f, 4.691f, 5.293f, 6.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(11.351f)
                    curveTo(1.4036f, 11.6339f, 0.8994f, 12.0796f, 0.5455f, 12.6368f)
                    curveTo(0.1916f, 13.194f, 0.0025f, 13.8399f, 0.0f, 14.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(14.5f)
                    curveTo(23.9975f, 13.8399f, 23.8084f, 13.194f, 23.4545f, 12.6368f)
                    curveTo(23.1006f, 12.0796f, 22.5964f, 11.6339f, 22.0f, 11.351f)
                    close()
                    moveTo(19.0f, 9.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(19.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(14.5f)
                    curveTo(3.0f, 14.3674f, 3.0527f, 14.2402f, 3.1465f, 14.1464f)
                    curveTo(3.2402f, 14.0527f, 3.3674f, 14.0f, 3.5f, 14.0f)
                    horizontalLineTo(20.5f)
                    curveTo(20.6326f, 14.0f, 20.7598f, 14.0527f, 20.8536f, 14.1464f)
                    curveTo(20.9473f, 14.2402f, 21.0f, 14.3674f, 21.0f, 14.5f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
