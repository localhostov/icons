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

public val Icons.Outline.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = Builder(name = "Form", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.828f, 3.4138f)
                    lineTo(17.586f, 1.1718f)
                    curveTo(17.2154f, 0.7991f, 16.7745f, 0.5036f, 16.2889f, 0.3024f)
                    curveTo(15.8033f, 0.1012f, 15.2826f, -0.0016f, 14.757f, -2.0E-4f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, -2.0E-4f, 4.4413f, 0.3158f, 3.8787f, 0.8784f)
                    curveTo(3.3161f, 1.4411f, 3.0f, 2.2041f, 3.0f, 2.9998f)
                    verticalLineTo(23.9998f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(6.2418f)
                    curveTo(20.9974f, 5.1815f, 20.5762f, 4.1651f, 19.828f, 3.4138f)
                    close()
                    moveTo(18.414f, 4.8278f)
                    curveTo(18.4643f, 4.8823f, 18.5114f, 4.9398f, 18.555f, 4.9998f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(2.4448f)
                    curveTo(16.06f, 2.4884f, 16.1174f, 2.5355f, 16.172f, 2.5858f)
                    lineTo(18.414f, 4.8278f)
                    close()
                    moveTo(5.0f, 21.9998f)
                    verticalLineTo(2.9998f)
                    curveTo(5.0f, 2.7345f, 5.1054f, 2.4802f, 5.2929f, 2.2927f)
                    curveTo(5.4804f, 2.1051f, 5.7348f, 1.9998f, 6.0f, 1.9998f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(6.9998f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(21.9998f)
                    horizontalLineTo(5.0f)
                    close()
                    moveTo(7.0f, 15.9998f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(9.9998f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(15.9998f)
                    close()
                    moveTo(9.0f, 11.9998f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(13.9998f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(11.9998f)
                    close()
                    moveTo(7.0f, 17.9998f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(19.9998f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(17.9998f)
                    close()
                }
            }
        }
        .build()
        return _form!!
    }

private var _form: ImageVector? = null
