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
                    moveTo(24.0f, 19.0006f)
                    verticalLineTo(5.0006f)
                    curveTo(24.0f, 4.205f, 23.6839f, 3.4419f, 23.1213f, 2.8793f)
                    curveTo(22.5587f, 2.3167f, 21.7956f, 2.0006f, 21.0f, 2.0006f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 2.0006f, 1.4413f, 2.3167f, 0.8787f, 2.8793f)
                    curveTo(0.3161f, 3.4419f, 0.0f, 4.205f, 0.0f, 5.0006f)
                    lineTo(0.0f, 19.0006f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(21.0006f)
                    horizontalLineTo(6.5f)
                    verticalLineTo(24.0006f)
                    horizontalLineTo(17.5f)
                    verticalLineTo(21.0006f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(19.0006f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(3.0f, 5.0006f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(16.0006f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(5.0006f)
                    close()
                }
            }
        }
        .build()
        return _screen!!
    }

private var _screen: ImageVector? = null
