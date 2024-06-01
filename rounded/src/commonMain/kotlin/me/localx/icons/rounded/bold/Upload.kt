package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.7603f, 6.6514f)
                    lineTo(10.5411f, 3.8695f)
                    lineTo(10.5621f, 17.5009f)
                    curveTo(10.5621f, 18.3293f, 11.2337f, 19.0009f, 12.0621f, 19.0009f)
                    curveTo(12.8905f, 19.0009f, 13.562f, 18.3293f, 13.562f, 17.5009f)
                    lineTo(13.541f, 3.8865f)
                    lineTo(16.3059f, 6.6514f)
                    curveTo(16.8814f, 7.2473f, 17.831f, 7.2638f, 18.4268f, 6.6883f)
                    curveTo(19.0227f, 6.1128f, 19.0392f, 5.1632f, 18.4637f, 4.5673f)
                    curveTo(18.4516f, 4.5548f, 18.4393f, 4.5426f, 18.4268f, 4.5305f)
                    lineTo(15.2149f, 1.3186f)
                    curveTo(13.4577f, -0.4387f, 10.6085f, -0.4387f, 8.8512f, 1.3186f)
                    lineTo(8.8512f, 1.3186f)
                    lineTo(5.6394f, 4.5305f)
                    curveTo(5.0638f, 5.1263f, 5.0803f, 6.0759f, 5.6762f, 6.6514f)
                    curveTo(6.2575f, 7.2128f, 7.179f, 7.2128f, 7.7603f, 6.6514f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.4996f, 14.5003f)
                    curveTo(21.6712f, 14.5003f, 20.9996f, 15.1719f, 20.9996f, 16.0002f)
                    verticalLineTo(20.591f)
                    curveTo(20.9991f, 20.8167f, 20.8163f, 20.9995f, 20.5907f, 21.0f)
                    horizontalLineTo(3.4094f)
                    curveTo(3.1837f, 20.9994f, 3.0009f, 20.8167f, 3.0004f, 20.591f)
                    verticalLineTo(16.0002f)
                    curveTo(3.0004f, 15.1719f, 2.3288f, 14.5003f, 1.5005f, 14.5003f)
                    curveTo(0.6721f, 14.5003f, 5.0E-4f, 15.1719f, 5.0E-4f, 16.0002f)
                    verticalLineTo(20.591f)
                    curveTo(0.0027f, 22.4728f, 1.5276f, 23.9976f, 3.4094f, 23.9999f)
                    horizontalLineTo(20.5906f)
                    curveTo(22.4724f, 23.9976f, 23.9972f, 22.4727f, 23.9994f, 20.591f)
                    verticalLineTo(16.0002f)
                    curveTo(23.9995f, 15.1719f, 23.3279f, 14.5003f, 22.4996f, 14.5003f)
                    close()
                }
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
