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

public val Icons.Outline.TimeFast: ImageVector
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
                    verticalLineTo(22.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(8.0f, 18.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(6.0f, 14.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(12.0f, 0.0f)
                    curveTo(8.8185f, 0.0034f, 5.7682f, 1.2688f, 3.5185f, 3.5185f)
                    curveTo(1.2688f, 5.7682f, 0.0034f, 8.8185f, 0.0f, 12.0f)
                    horizontalLineTo(2.0f)
                    curveTo(2.0f, 10.0222f, 2.5865f, 8.0888f, 3.6853f, 6.4443f)
                    curveTo(4.7841f, 4.7998f, 6.3459f, 3.5181f, 8.1732f, 2.7612f)
                    curveTo(10.0004f, 2.0043f, 12.0111f, 1.8063f, 13.9509f, 2.1922f)
                    curveTo(15.8907f, 2.578f, 17.6725f, 3.5304f, 19.0711f, 4.9289f)
                    curveTo(20.4696f, 6.3275f, 21.422f, 8.1093f, 21.8079f, 10.0491f)
                    curveTo(22.1937f, 11.9889f, 21.9957f, 13.9996f, 21.2388f, 15.8268f)
                    curveTo(20.4819f, 17.6541f, 19.2002f, 19.2159f, 17.5557f, 20.3147f)
                    curveTo(15.9112f, 21.4135f, 13.9778f, 22.0f, 12.0f, 22.0f)
                    verticalLineTo(24.0f)
                    curveTo(15.1826f, 24.0f, 18.2348f, 22.7357f, 20.4853f, 20.4853f)
                    curveTo(22.7357f, 18.2348f, 24.0f, 15.1826f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8174f, 22.7357f, 5.7652f, 20.4853f, 3.5147f)
                    curveTo(18.2348f, 1.2643f, 15.1826f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(11.0f, 7.0f)
                    verticalLineTo(12.414f)
                    lineTo(14.293f, 15.707f)
                    lineTo(15.707f, 14.293f)
                    lineTo(13.0f, 11.586f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _timeFast!!
    }

private var _timeFast: ImageVector? = null
