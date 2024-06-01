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

public val Icons.Bold.Form: ImageVector
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
                    moveTo(20.6819f, 3.5608f)
                    lineTo(18.4389f, 1.3168f)
                    curveTo(18.0217f, 0.8981f, 17.5257f, 0.5661f, 16.9796f, 0.3401f)
                    curveTo(16.4335f, 0.114f, 15.848f, -0.0016f, 15.2569f, -2.0E-4f)
                    horizontalLineTo(5.4999f)
                    curveTo(4.5717f, -2.0E-4f, 3.6814f, 0.3685f, 3.025f, 1.0249f)
                    curveTo(2.3687f, 1.6813f, 1.9999f, 2.5715f, 1.9999f, 3.4998f)
                    verticalLineTo(23.9998f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(6.7418f)
                    curveTo(21.9969f, 5.5492f, 21.5233f, 4.406f, 20.6819f, 3.5608f)
                    close()
                    moveTo(4.9999f, 20.9998f)
                    verticalLineTo(3.4998f)
                    curveTo(4.9999f, 3.3672f, 5.0526f, 3.24f, 5.1464f, 3.1462f)
                    curveTo(5.2401f, 3.0524f, 5.3673f, 2.9998f, 5.4999f, 2.9998f)
                    horizontalLineTo(14.9999f)
                    verticalLineTo(6.9998f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(20.9998f)
                    horizontalLineTo(4.9999f)
                    close()
                    moveTo(7.9999f, 15.9998f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(18.9998f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(15.9998f)
                    close()
                    moveTo(7.9999f, 8.9998f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(13.9998f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(8.9998f)
                    close()
                }
            }
        }
        .build()
        return _form!!
    }

private var _form: ImageVector? = null
