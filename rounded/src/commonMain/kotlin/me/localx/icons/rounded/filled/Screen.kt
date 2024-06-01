package me.localx.icons.rounded.filled

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

public val Icons.Filled.Screen: ImageVector
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
                    moveTo(19.0f, 3.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 3.0016f, 2.4036f, 3.5289f, 1.4662f, 4.4662f)
                    curveTo(0.5289f, 5.4036f, 0.0016f, 6.6744f, 0.0f, 8.0f)
                    lineTo(0.0f, 14.0f)
                    curveTo(0.0016f, 15.3256f, 0.5289f, 16.5964f, 1.4662f, 17.5338f)
                    curveTo(2.4036f, 18.4711f, 3.6744f, 18.9984f, 5.0f, 19.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(8.0f)
                    curveTo(7.7348f, 20.0f, 7.4804f, 20.1054f, 7.2929f, 20.2929f)
                    curveTo(7.1054f, 20.4804f, 7.0f, 20.7348f, 7.0f, 21.0f)
                    curveTo(7.0f, 21.2652f, 7.1054f, 21.5196f, 7.2929f, 21.7071f)
                    curveTo(7.4804f, 21.8946f, 7.7348f, 22.0f, 8.0f, 22.0f)
                    horizontalLineTo(16.0f)
                    curveTo(16.2652f, 22.0f, 16.5196f, 21.8946f, 16.7071f, 21.7071f)
                    curveTo(16.8946f, 21.5196f, 17.0f, 21.2652f, 17.0f, 21.0f)
                    curveTo(17.0f, 20.7348f, 16.8946f, 20.4804f, 16.7071f, 20.2929f)
                    curveTo(16.5196f, 20.1054f, 16.2652f, 20.0f, 16.0f, 20.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 18.9984f, 21.5964f, 18.4711f, 22.5338f, 17.5338f)
                    curveTo(23.4711f, 16.5964f, 23.9984f, 15.3256f, 24.0f, 14.0f)
                    verticalLineTo(8.0f)
                    curveTo(23.9984f, 6.6744f, 23.4711f, 5.4036f, 22.5338f, 4.4662f)
                    curveTo(21.5964f, 3.5289f, 20.3256f, 3.0016f, 19.0f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _screen!!
    }

private var _screen: ImageVector? = null
