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

public val Icons.Bold.TimeFast: ImageVector
    get() {
        if (_timeFast != null) {
            return _timeFast!!
        }
        _timeFast = Builder(name = "TimeFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(8.0f, 16.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(6.0f, 11.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(11.0f)
                    close()
                    moveTo(11.0f, 6.0f)
                    verticalLineTo(12.621f)
                    lineTo(14.439f, 16.061f)
                    lineTo(16.561f, 13.939f)
                    lineTo(14.0f, 11.379f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(11.0f)
                    close()
                    moveTo(12.0f, 0.0f)
                    curveTo(9.3432f, 0.0052f, 6.7631f, 0.8916f, 4.664f, 2.5202f)
                    curveTo(2.5648f, 4.1488f, 1.0652f, 6.4278f, 0.4f, 9.0f)
                    horizontalLineTo(3.53f)
                    curveTo(4.0809f, 7.4456f, 5.0486f, 6.0726f, 6.3271f, 5.0311f)
                    curveTo(7.6057f, 3.9895f, 9.1461f, 3.3195f, 10.7797f, 3.0943f)
                    curveTo(12.4134f, 2.8691f, 14.0775f, 3.0973f, 15.5902f, 3.754f)
                    curveTo(17.103f, 4.4107f, 18.406f, 5.4707f, 19.357f, 6.818f)
                    curveTo(20.308f, 8.1653f, 20.8703f, 9.7481f, 20.9824f, 11.3934f)
                    curveTo(21.0945f, 13.0387f, 20.7522f, 14.6832f, 19.9928f, 16.147f)
                    curveTo(19.2334f, 17.6109f, 18.0862f, 18.8379f, 16.6765f, 19.6937f)
                    curveTo(15.2669f, 20.5496f, 13.6491f, 21.0015f, 12.0f, 21.0f)
                    verticalLineTo(24.0f)
                    curveTo(15.1826f, 24.0f, 18.2348f, 22.7357f, 20.4853f, 20.4853f)
                    curveTo(22.7357f, 18.2348f, 24.0f, 15.1826f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8174f, 22.7357f, 5.7652f, 20.4853f, 3.5147f)
                    curveTo(18.2348f, 1.2643f, 15.1826f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _timeFast!!
    }

private var _timeFast: ImageVector? = null
