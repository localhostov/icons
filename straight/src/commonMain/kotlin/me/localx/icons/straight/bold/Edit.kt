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

public val Icons.Bold.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 16.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.409f)
                    curveTo(3.0003f, 3.3006f, 3.0434f, 3.1967f, 3.1201f, 3.1201f)
                    curveTo(3.1967f, 3.0434f, 3.3006f, 3.0003f, 3.409f, 3.0f)
                    horizontalLineTo(15.172f)
                    lineTo(18.172f, 0.0f)
                    horizontalLineTo(3.409f)
                    curveTo(2.5052f, 0.0011f, 1.6387f, 0.3606f, 0.9996f, 0.9996f)
                    curveTo(0.3606f, 1.6387f, 0.0011f, 2.5052f, 0.0f, 3.409f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(18.349f)
                    lineTo(24.0f, 18.348f)
                    verticalLineTo(5.829f)
                    lineTo(21.0f, 8.829f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.9999f, 19.0002f)
                    horizontalLineTo(7.9999f)
                    lineTo(23.3999f, 3.6002f)
                    curveTo(23.7977f, 3.2024f, 24.0212f, 2.6628f, 24.0212f, 2.1002f)
                    curveTo(24.0212f, 1.5376f, 23.7977f, 0.998f, 23.3999f, 0.6002f)
                    curveTo(23.0021f, 0.2024f, 22.4625f, -0.0211f, 21.8999f, -0.0211f)
                    curveTo(21.3373f, -0.0211f, 20.7977f, 0.2024f, 20.3999f, 0.6002f)
                    lineTo(4.9999f, 16.0002f)
                    verticalLineTo(19.0002f)
                    close()
                }
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
