package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.748f, 23.9997f)
                    curveTo(2.3533f, 23.9986f, 1.9635f, 23.9128f, 1.605f, 23.748f)
                    curveTo(1.2464f, 23.5832f, 0.9274f, 23.3433f, 0.6696f, 23.0445f)
                    curveTo(0.4117f, 22.7457f, 0.2211f, 22.3951f, 0.1106f, 22.0162f)
                    curveTo(1.0E-4f, 21.6374f, -0.0277f, 21.2392f, 0.029f, 20.8487f)
                    curveTo(0.288f, 19.0427f, 1.162f, 15.7147f, 2.402f, 14.4747f)
                    curveTo(3.3468f, 13.5301f, 4.6282f, 12.9995f, 5.9642f, 12.9997f)
                    curveTo(7.3002f, 12.9999f, 8.5814f, 13.5308f, 9.526f, 14.4757f)
                    curveTo(10.4705f, 15.4205f, 11.0011f, 16.7019f, 11.0009f, 18.0379f)
                    curveTo(11.0007f, 19.3739f, 10.4698f, 20.6551f, 9.525f, 21.5997f)
                    curveTo(8.286f, 22.8387f, 4.958f, 23.7127f, 3.151f, 23.9717f)
                    curveTo(3.0175f, 23.9909f, 2.8828f, 24.0003f, 2.748f, 23.9997f)
                    close()
                    moveTo(23.1f, 0.8997f)
                    curveTo(22.5163f, 0.3437f, 21.7411f, 0.0336f, 20.935f, 0.0336f)
                    curveTo(20.1289f, 0.0336f, 19.3537f, 0.3437f, 18.77f, 0.8997f)
                    lineTo(8.27f, 11.3997f)
                    curveTo(9.2744f, 11.7454f, 10.1865f, 12.3159f, 10.9369f, 13.0676f)
                    curveTo(11.6873f, 13.8194f, 12.2561f, 14.7327f, 12.6f, 15.7377f)
                    lineTo(23.1f, 5.2297f)
                    curveTo(23.6726f, 4.6547f, 23.9942f, 3.8762f, 23.9942f, 3.0647f)
                    curveTo(23.9942f, 2.2531f, 23.6726f, 1.4747f, 23.1f, 0.8997f)
                    close()
                }
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
