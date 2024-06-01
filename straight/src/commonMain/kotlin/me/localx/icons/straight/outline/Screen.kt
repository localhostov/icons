package me.localx.icons.straight.outline

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

public val Icons.Outline.Screen: ImageVector
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
                    moveTo(24.0f, 19.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 5.2043f, 23.6839f, 4.4413f, 23.1213f, 3.8787f)
                    curveTo(22.5587f, 3.3161f, 21.7956f, 3.0f, 21.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 19.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(2.0f, 6.0f)
                    curveTo(2.0f, 5.7348f, 2.1054f, 5.4804f, 2.2929f, 5.2929f)
                    curveTo(2.4804f, 5.1054f, 2.7348f, 5.0f, 3.0f, 5.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 5.0f, 21.5196f, 5.1054f, 21.7071f, 5.2929f)
                    curveTo(21.8946f, 5.4804f, 22.0f, 5.7348f, 22.0f, 6.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(6.0f)
                    close()
                }
            }
        }
        .build()
        return _screen!!
    }

private var _screen: ImageVector? = null
