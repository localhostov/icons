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

public val Icons.Outline.Coffee: ImageVector
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
                    moveTo(22.9998f, 5.0f)
                    curveTo(22.9998f, 4.2043f, 22.6837f, 3.4413f, 22.1211f, 2.8787f)
                    curveTo(21.5585f, 2.3161f, 20.7955f, 2.0f, 19.9998f, 2.0f)
                    horizontalLineTo(19.8288f)
                    curveTo(19.6212f, 1.4155f, 19.2379f, 0.9095f, 18.7314f, 0.5514f)
                    curveTo(18.2249f, 0.1934f, 17.6201f, 8.0E-4f, 16.9998f, 0.0f)
                    lineTo(6.9998f, 0.0f)
                    curveTo(6.3795f, 8.0E-4f, 5.7747f, 0.1934f, 5.2682f, 0.5514f)
                    curveTo(4.7617f, 0.9095f, 4.3784f, 1.4155f, 4.1708f, 2.0f)
                    horizontalLineTo(3.9998f)
                    curveTo(3.2042f, 2.0f, 2.4411f, 2.3161f, 1.8785f, 2.8787f)
                    curveTo(1.3159f, 3.4413f, 0.9998f, 4.2043f, 0.9998f, 5.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(2.1168f)
                    lineTo(4.1168f, 24.0f)
                    horizontalLineTo(19.8828f)
                    lineTo(21.8828f, 8.0f)
                    horizontalLineTo(22.9998f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(2.9998f, 5.0f)
                    curveTo(2.9998f, 4.7348f, 3.1052f, 4.4804f, 3.2927f, 4.2929f)
                    curveTo(3.4802f, 4.1054f, 3.7346f, 4.0f, 3.9998f, 4.0f)
                    horizontalLineTo(5.9998f)
                    verticalLineTo(3.0f)
                    curveTo(5.9998f, 2.7348f, 6.1052f, 2.4804f, 6.2927f, 2.2929f)
                    curveTo(6.4802f, 2.1054f, 6.7346f, 2.0f, 6.9998f, 2.0f)
                    horizontalLineTo(16.9998f)
                    curveTo(17.265f, 2.0f, 17.5194f, 2.1054f, 17.7069f, 2.2929f)
                    curveTo(17.8945f, 2.4804f, 17.9998f, 2.7348f, 17.9998f, 3.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(19.9998f)
                    curveTo(20.265f, 4.0f, 20.5194f, 4.1054f, 20.7069f, 4.2929f)
                    curveTo(20.8945f, 4.4804f, 20.9998f, 4.7348f, 20.9998f, 5.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(2.9998f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(5.8828f, 22.0f)
                    lineTo(5.1328f, 16.0f)
                    horizontalLineTo(8.0808f)
                    curveTo(8.9728f, 21.287f, 15.0288f, 21.284f, 15.9188f, 16.0f)
                    horizontalLineTo(18.8668f)
                    lineTo(18.1168f, 22.0f)
                    horizontalLineTo(5.8828f)
                    close()
                    moveTo(9.9998f, 15.0f)
                    curveTo(10.1048f, 11.046f, 13.8948f, 11.047f, 13.9998f, 15.0f)
                    curveTo(13.8998f, 18.954f, 10.1048f, 18.953f, 9.9998f, 15.0f)
                    close()
                    moveTo(19.1168f, 14.0f)
                    horizontalLineTo(15.9168f)
                    curveTo(15.0248f, 8.713f, 8.9698f, 8.716f, 8.0788f, 14.0f)
                    horizontalLineTo(4.8788f)
                    lineTo(4.1288f, 8.0f)
                    horizontalLineTo(19.8668f)
                    lineTo(19.1168f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
