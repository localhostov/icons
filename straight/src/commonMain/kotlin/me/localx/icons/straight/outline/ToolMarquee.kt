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

public val Icons.Outline.ToolMarquee: ImageVector
    get() {
        if (_toolMarquee != null) {
            return _toolMarquee!!
        }
        _toolMarquee = Builder(name = "ToolMarquee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(24.0f, 3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 2.0f, 21.5196f, 2.1054f, 21.7071f, 2.2929f)
                    curveTo(21.8946f, 2.4804f, 22.0f, 2.7348f, 22.0f, 3.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(24.0f, 9.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(6.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(2.0f, 3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 6.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(2.0f, 9.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(15.0f, 0.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(15.0f, 22.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _toolMarquee!!
    }

private var _toolMarquee: ImageVector? = null
