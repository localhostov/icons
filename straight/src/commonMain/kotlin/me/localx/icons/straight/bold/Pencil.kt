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

public val Icons.Bold.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.824f, 1.176f)
                    curveTo(22.0597f, 0.4457f, 21.0432f, 0.0381f, 19.986f, 0.0381f)
                    curveTo(18.9288f, 0.0381f, 17.9123f, 0.4457f, 17.148f, 1.176f)
                    lineTo(0.0f, 18.324f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(5.676f)
                    lineTo(22.824f, 6.852f)
                    curveTo(23.5756f, 6.0987f, 23.9977f, 5.0781f, 23.9977f, 4.014f)
                    curveTo(23.9977f, 2.9499f, 23.5756f, 1.9293f, 22.824f, 1.176f)
                    close()
                    moveTo(4.434f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(19.566f)
                    lineTo(15.653f, 6.914f)
                    lineTo(17.087f, 8.347f)
                    lineTo(4.434f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
