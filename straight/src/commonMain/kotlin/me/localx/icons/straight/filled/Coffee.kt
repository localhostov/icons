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

public val Icons.Filled.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9998f, 6.0f)
                    horizontalLineTo(0.9998f)
                    verticalLineTo(5.0f)
                    curveTo(0.9998f, 4.2043f, 1.3159f, 3.4413f, 1.8785f, 2.8787f)
                    curveTo(2.4411f, 2.3161f, 3.2042f, 2.0f, 3.9998f, 2.0f)
                    horizontalLineTo(4.1708f)
                    curveTo(4.3784f, 1.4155f, 4.7617f, 0.9095f, 5.2682f, 0.5514f)
                    curveTo(5.7747f, 0.1934f, 6.3795f, 8.0E-4f, 6.9998f, 0.0f)
                    lineTo(16.9998f, 0.0f)
                    curveTo(17.6201f, 8.0E-4f, 18.2249f, 0.1934f, 18.7314f, 0.5514f)
                    curveTo(19.2379f, 0.9095f, 19.6212f, 1.4155f, 19.8288f, 2.0f)
                    horizontalLineTo(19.9998f)
                    curveTo(20.7955f, 2.0f, 21.5585f, 2.3161f, 22.1211f, 2.8787f)
                    curveTo(22.6837f, 3.4413f, 22.9998f, 4.2043f, 22.9998f, 5.0f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(9.9998f, 16.0f)
                    curveTo(10.1048f, 19.954f, 13.8948f, 19.953f, 13.9998f, 16.0f)
                    curveTo(13.8998f, 12.046f, 10.1048f, 12.047f, 9.9998f, 16.0f)
                    close()
                    moveTo(8.0808f, 15.0f)
                    curveTo(8.9728f, 9.713f, 15.0288f, 9.716f, 15.9188f, 15.0f)
                    horizontalLineTo(21.0078f)
                    lineTo(21.8828f, 8.0f)
                    horizontalLineTo(2.1168f)
                    lineTo(2.9918f, 15.0f)
                    horizontalLineTo(8.0808f)
                    close()
                    moveTo(15.9188f, 17.0f)
                    curveTo(15.0268f, 22.287f, 8.9718f, 22.284f, 8.0808f, 17.0f)
                    horizontalLineTo(3.2418f)
                    lineTo(4.1168f, 24.0f)
                    horizontalLineTo(19.8828f)
                    lineTo(20.7578f, 17.0f)
                    horizontalLineTo(15.9188f)
                    close()
                }
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
