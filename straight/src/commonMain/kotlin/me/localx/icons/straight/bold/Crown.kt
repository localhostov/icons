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

public val Icons.Bold.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 22.2001f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 22.2001f, 1.4413f, 21.884f, 0.8787f, 21.3214f)
                    curveTo(0.3161f, 20.7588f, 0.0f, 19.9957f, 0.0f, 19.2001f)
                    lineTo(0.0f, 1.8001f)
                    lineTo(6.272f, 8.076f)
                    lineTo(12.0f, 2.3481f)
                    lineTo(17.728f, 8.076f)
                    lineTo(24.0f, 1.8001f)
                    verticalLineTo(19.2001f)
                    curveTo(24.0f, 19.9957f, 23.6839f, 20.7588f, 23.1213f, 21.3214f)
                    curveTo(22.5587f, 21.884f, 21.7956f, 22.2001f, 21.0f, 22.2001f)
                    close()
                    moveTo(3.0f, 9.045f)
                    verticalLineTo(19.2001f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(9.045f)
                    lineTo(17.728f, 12.318f)
                    lineTo(12.0f, 6.5901f)
                    lineTo(6.272f, 12.318f)
                    lineTo(3.0f, 9.045f)
                    close()
                }
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
