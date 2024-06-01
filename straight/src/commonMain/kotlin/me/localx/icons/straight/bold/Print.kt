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

public val Icons.Bold.Print: ImageVector
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
                    moveTo(8.0f, 3.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(16.0f, 21.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(21.0f, 18.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.0f)
                    close()
                }
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
