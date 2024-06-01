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

public val Icons.Filled.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 0.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 0.0f, 4.4413f, 0.3161f, 3.8787f, 0.8787f)
                    curveTo(3.3161f, 1.4413f, 3.0f, 2.2043f, 3.0f, 3.0f)
                    verticalLineTo(23.9f)
                    lineTo(6.67f, 21.39f)
                    lineTo(9.341f, 23.216f)
                    lineTo(12.007f, 21.39f)
                    lineTo(14.673f, 23.216f)
                    lineTo(17.337f, 21.391f)
                    lineTo(21.0f, 23.9f)
                    verticalLineTo(3.0f)
                    curveTo(21.0f, 2.2043f, 20.6839f, 1.4413f, 20.1213f, 0.8787f)
                    curveTo(19.5587f, 0.3161f, 18.7956f, 0.0f, 18.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(15.0f, 14.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(17.0f, 9.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
