package me.localx.icons.straight.filled

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

public val Icons.Filled.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 10.0f)
                    verticalLineTo(3.0f)
                    curveTo(0.0f, 2.2043f, 0.3161f, 1.4413f, 0.8787f, 0.8787f)
                    curveTo(1.4413f, 0.3161f, 2.2043f, 0.0f, 3.0f, 0.0f)
                    lineTo(11.0f, 0.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(0.0f)
                    curveTo(21.7956f, 0.0f, 22.5587f, 0.3161f, 23.1213f, 0.8787f)
                    curveTo(23.6839f, 1.4413f, 24.0f, 2.2043f, 24.0f, 3.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(0.0f)
                    close()
                    moveTo(5.0f, 17.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 16.9984f, 21.5964f, 16.4711f, 22.5338f, 15.5338f)
                    curveTo(23.4711f, 14.5964f, 23.9984f, 13.3256f, 24.0f, 12.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0016f, 13.3256f, 0.5289f, 14.5964f, 1.4662f, 15.5338f)
                    curveTo(2.4036f, 16.4711f, 3.6744f, 16.9984f, 5.0f, 17.0f)
                    close()
                }
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
