package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 9.0f)
                    curveTo(24.0f, 8.2044f, 23.6839f, 7.4413f, 23.1213f, 6.8787f)
                    curveTo(22.5587f, 6.3161f, 21.7956f, 6.0f, 21.0f, 6.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 6.0f, 1.4413f, 6.3161f, 0.8787f, 6.8787f)
                    curveTo(0.3161f, 7.4413f, 0.0f, 8.2044f, 0.0f, 9.0f)
                    lineTo(0.0f, 21.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.0f)
                    close()
                    moveTo(7.0f, 2.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(17.0f, 22.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(22.0f, 19.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(9.0f)
                    curveTo(2.0f, 8.7348f, 2.1054f, 8.4804f, 2.2929f, 8.2929f)
                    curveTo(2.4804f, 8.1054f, 2.7348f, 8.0f, 3.0f, 8.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 8.0f, 21.5196f, 8.1054f, 21.7071f, 8.2929f)
                    curveTo(21.8946f, 8.4804f, 22.0f, 8.7348f, 22.0f, 9.0f)
                    verticalLineTo(19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 9.9994f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(11.9994f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(9.9994f)
                    close()
                }
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
