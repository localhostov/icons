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

public val Icons.Outline.Brush: ImageVector
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
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 12.0f)
                    curveTo(0.0016f, 13.3256f, 0.5289f, 14.5964f, 1.4662f, 15.5338f)
                    curveTo(2.4036f, 16.4711f, 3.6744f, 16.9984f, 5.0f, 17.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 16.9984f, 21.5964f, 16.4711f, 22.5338f, 15.5338f)
                    curveTo(23.4711f, 14.5964f, 23.9984f, 13.3256f, 24.0f, 12.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(3.0f, 2.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                    curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    close()
                    moveTo(19.0f, 15.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 15.0f, 3.4413f, 14.6839f, 2.8787f, 14.1213f)
                    curveTo(2.3161f, 13.5587f, 2.0f, 12.7956f, 2.0f, 12.0f)
                    horizontalLineTo(22.0f)
                    curveTo(22.0f, 12.7956f, 21.6839f, 13.5587f, 21.1213f, 14.1213f)
                    curveTo(20.5587f, 14.6839f, 19.7956f, 15.0f, 19.0f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
