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

public val Icons.Outline.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.6129f, 12.848f)
                    lineTo(14.1999f, 16.262f)
                    curveTo(11.2881f, 15.0287f, 8.9725f, 12.7077f, 7.7459f, 9.793f)
                    lineTo(11.1459f, 6.387f)
                    lineTo(4.8869f, 0.122f)
                    lineTo(1.7169f, 3.292f)
                    curveTo(1.1662f, 3.8446f, 0.7307f, 4.5012f, 0.436f, 5.2236f)
                    curveTo(0.1412f, 5.946f, -0.007f, 6.7198f, -1.0E-4f, 7.5f)
                    curveTo(-1.0E-4f, 14.748f, 9.2519f, 24.0f, 16.4999f, 24.0f)
                    curveTo(17.2798f, 24.0067f, 18.0532f, 23.8586f, 18.7753f, 23.5642f)
                    curveTo(19.4975f, 23.2698f, 20.1541f, 22.835f, 20.7069f, 22.285f)
                    lineTo(23.8779f, 19.113f)
                    lineTo(17.6129f, 12.848f)
                    close()
                    moveTo(19.2919f, 20.871f)
                    curveTo(18.9244f, 21.2346f, 18.4884f, 21.5216f, 18.0091f, 21.7154f)
                    curveTo(17.5298f, 21.9092f, 17.0169f, 22.0059f, 16.4999f, 22.0f)
                    curveTo(10.2669f, 22.0f, 1.9999f, 13.734f, 1.9999f, 7.5f)
                    curveTo(1.9938f, 6.983f, 2.0905f, 6.4698f, 2.2845f, 5.9905f)
                    curveTo(2.4785f, 5.5112f, 2.7659f, 5.0752f, 3.1299f, 4.708f)
                    lineTo(4.8869f, 2.951f)
                    lineTo(8.3229f, 6.387f)
                    lineTo(5.3889f, 9.323f)
                    lineTo(5.6349f, 9.936f)
                    curveTo(6.3555f, 11.8655f, 7.4826f, 13.6175f, 8.9399f, 15.0731f)
                    curveTo(10.3972f, 16.5286f, 12.1505f, 17.6537f, 14.0809f, 18.372f)
                    lineTo(14.6869f, 18.604f)
                    lineTo(17.6129f, 15.676f)
                    lineTo(21.0499f, 19.113f)
                    lineTo(19.2919f, 20.871f)
                    close()
                    moveTo(21.9999f, 8.0f)
                    horizontalLineTo(19.9999f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(17.9999f, 8.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(17.9999f)
                    verticalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
