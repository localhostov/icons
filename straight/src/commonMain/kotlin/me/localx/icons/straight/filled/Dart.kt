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

public val Icons.Filled.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.414f, 12.0f)
                    curveTo(11.12f, 15.115f, 7.785f, 20.457f, 7.121f, 21.121f)
                    curveTo(6.6849f, 21.5615f, 6.1217f, 21.8543f, 5.5106f, 21.9582f)
                    curveTo(4.8994f, 22.062f, 4.2712f, 21.9718f, 3.714f, 21.7f)
                    lineTo(1.414f, 24.0f)
                    lineTo(0.0f, 22.586f)
                    lineTo(2.3f, 20.286f)
                    curveTo(2.0338f, 19.729f, 1.9463f, 19.1032f, 2.0496f, 18.4945f)
                    curveTo(2.1529f, 17.8859f, 2.4419f, 17.324f, 2.877f, 16.886f)
                    curveTo(3.541f, 16.222f, 8.883f, 12.886f, 11.998f, 10.593f)
                    lineTo(13.414f, 12.0f)
                    close()
                    moveTo(12.0f, 4.586f)
                    verticalLineTo(10.586f)
                    lineTo(19.293f, 3.293f)
                    lineTo(20.707f, 4.707f)
                    lineTo(13.414f, 12.0f)
                    horizontalLineTo(19.414f)
                    lineTo(24.0f, 7.414f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    lineTo(16.586f, 0.0f)
                    lineTo(12.0f, 4.586f)
                    close()
                }
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
