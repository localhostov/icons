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

public val Icons.Filled.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.8352f, 2.1657f)
                    curveTo(21.149f, 1.4793f, 20.3344f, 0.9349f, 19.4378f, 0.5634f)
                    curveTo(18.5412f, 0.192f, 17.5802f, 8.0E-4f, 16.6097f, 8.0E-4f)
                    curveTo(15.6392f, 8.0E-4f, 14.6782f, 0.192f, 13.7816f, 0.5634f)
                    curveTo(12.885f, 0.9349f, 12.0703f, 1.4793f, 11.3842f, 2.1657f)
                    lineTo(2.1652f, 11.3847f)
                    curveTo(1.4759f, 12.0702f, 0.9287f, 12.885f, 0.5548f, 13.7824f)
                    curveTo(0.181f, 14.6798f, -0.0122f, 15.6422f, -0.0135f, 16.6143f)
                    curveTo(-0.0148f, 17.5865f, 0.1757f, 18.5493f, 0.5471f, 19.4477f)
                    curveTo(0.9186f, 20.3461f, 1.4636f, 21.1624f, 2.151f, 21.8498f)
                    curveTo(2.8384f, 22.5372f, 3.6547f, 23.0823f, 4.5531f, 23.4537f)
                    curveTo(5.4515f, 23.8251f, 6.4144f, 24.0156f, 7.3865f, 24.0143f)
                    curveTo(8.3587f, 24.013f, 9.321f, 23.8199f, 10.2184f, 23.446f)
                    curveTo(11.1158f, 23.0722f, 11.9306f, 22.5249f, 12.6162f, 21.8357f)
                    lineTo(21.8352f, 12.6167f)
                    curveTo(22.5215f, 11.9305f, 23.0659f, 11.1159f, 23.4374f, 10.2193f)
                    curveTo(23.8088f, 9.3227f, 24.0f, 8.3617f, 24.0f, 7.3912f)
                    curveTo(24.0f, 6.4207f, 23.8088f, 5.4597f, 23.4374f, 4.5631f)
                    curveTo(23.0659f, 3.6665f, 22.5215f, 2.8518f, 21.8352f, 2.1657f)
                    close()
                    moveTo(9.7072f, 19.7077f)
                    lineTo(8.2932f, 18.2937f)
                    lineTo(9.0862f, 17.5007f)
                    lineTo(6.5002f, 14.9147f)
                    lineTo(5.7072f, 15.7077f)
                    lineTo(4.2932f, 14.2937f)
                    lineTo(7.2932f, 11.2937f)
                    lineTo(8.7072f, 12.7077f)
                    lineTo(7.9142f, 13.5007f)
                    lineTo(10.5002f, 16.0867f)
                    lineTo(11.2932f, 15.2937f)
                    lineTo(12.7072f, 16.7077f)
                    lineTo(9.7072f, 19.7077f)
                    close()
                    moveTo(16.7072f, 12.7077f)
                    lineTo(15.2932f, 11.2937f)
                    lineTo(16.0862f, 10.5007f)
                    lineTo(13.5002f, 7.9147f)
                    lineTo(12.7072f, 8.7077f)
                    lineTo(11.2932f, 7.2937f)
                    lineTo(14.2932f, 4.2937f)
                    lineTo(15.7072f, 5.7077f)
                    lineTo(14.9142f, 6.5007f)
                    lineTo(17.5002f, 9.0867f)
                    lineTo(18.2932f, 8.2937f)
                    lineTo(19.7072f, 9.7077f)
                    lineTo(16.7072f, 12.7077f)
                    close()
                }
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
