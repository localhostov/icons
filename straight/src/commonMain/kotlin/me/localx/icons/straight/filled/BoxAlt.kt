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

public val Icons.Filled.BoxAlt: ImageVector
    get() {
        if (_boxAlt != null) {
            return _boxAlt!!
        }
        _boxAlt = Builder(name = "BoxAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0f, 0.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 0.0f, 22.5587f, 0.3161f, 23.1213f, 0.8787f)
                    curveTo(23.6839f, 1.4413f, 24.0f, 2.2043f, 24.0f, 3.0f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(14.0f, 0.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(24.0f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(21.0f, 19.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(8.0f, 5.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 5.0f)
                    horizontalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _boxAlt!!
    }

private var _boxAlt: ImageVector? = null
