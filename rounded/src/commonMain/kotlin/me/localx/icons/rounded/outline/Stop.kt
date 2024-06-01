package me.localx.icons.rounded.outline

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

public val Icons.Outline.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 0.0016f, 2.4036f, 0.5289f, 1.4662f, 1.4662f)
                    curveTo(0.5289f, 2.4036f, 0.0016f, 3.6744f, 0.0f, 5.0f)
                    lineTo(0.0f, 19.0f)
                    curveTo(0.0016f, 20.3256f, 0.5289f, 21.5964f, 1.4662f, 22.5338f)
                    curveTo(2.4036f, 23.4711f, 3.6744f, 23.9984f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 23.9984f, 21.5964f, 23.4711f, 22.5338f, 22.5338f)
                    curveTo(23.4711f, 21.5964f, 23.9984f, 20.3256f, 24.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(23.9984f, 3.6744f, 23.4711f, 2.4036f, 22.5338f, 1.4662f)
                    curveTo(21.5964f, 0.5289f, 20.3256f, 0.0016f, 19.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(22.0f, 19.0f)
                    curveTo(22.0f, 19.7956f, 21.6839f, 20.5587f, 21.1213f, 21.1213f)
                    curveTo(20.5587f, 21.6839f, 19.7956f, 22.0f, 19.0f, 22.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 22.0f, 3.4413f, 21.6839f, 2.8787f, 21.1213f)
                    curveTo(2.3161f, 20.5587f, 2.0f, 19.7956f, 2.0f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(2.0f, 4.2043f, 2.3161f, 3.4413f, 2.8787f, 2.8787f)
                    curveTo(3.4413f, 2.3161f, 4.2043f, 2.0f, 5.0f, 2.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 2.0f, 20.5587f, 2.3161f, 21.1213f, 2.8787f)
                    curveTo(21.6839f, 3.4413f, 22.0f, 4.2043f, 22.0f, 5.0f)
                    verticalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
