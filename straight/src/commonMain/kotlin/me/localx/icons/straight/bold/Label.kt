package me.localx.icons.straight.bold

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

public val Icons.Bold.Label: ImageVector
    get() {
        if (_label != null) {
            return _label!!
        }
        _label = Builder(name = "Label", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9999f, 0.0f)
                    lineTo(1.9999f, 5.615f)
                    verticalLineTo(21.0f)
                    curveTo(1.9999f, 21.7956f, 2.316f, 22.5587f, 2.8786f, 23.1213f)
                    curveTo(3.4412f, 23.6839f, 4.2043f, 24.0f, 4.9999f, 24.0f)
                    horizontalLineTo(18.9999f)
                    curveTo(19.7956f, 24.0f, 20.5587f, 23.6839f, 21.1213f, 23.1213f)
                    curveTo(21.6839f, 22.5587f, 21.9999f, 21.7956f, 21.9999f, 21.0f)
                    verticalLineTo(5.615f)
                    lineTo(11.9999f, 0.0f)
                    close()
                    moveTo(4.9999f, 21.0f)
                    verticalLineTo(7.371f)
                    lineTo(11.9999f, 3.441f)
                    lineTo(18.9999f, 7.371f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(4.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 10.5f)
                    curveTo(12.8284f, 10.5f, 13.5f, 9.8284f, 13.5f, 9.0f)
                    curveTo(13.5f, 8.1716f, 12.8284f, 7.5f, 12.0f, 7.5f)
                    curveTo(11.1716f, 7.5f, 10.5f, 8.1716f, 10.5f, 9.0f)
                    curveTo(10.5f, 9.8284f, 11.1716f, 10.5f, 12.0f, 10.5f)
                    close()
                }
            }
        }
        .build()
        return _label!!
    }

private var _label: ImageVector? = null
