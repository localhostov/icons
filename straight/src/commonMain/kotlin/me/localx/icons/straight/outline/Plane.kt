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

public val Icons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0003f, 10.0f)
                    horizontalLineTo(17.6933f)
                    lineTo(13.4463f, 1.563f)
                    curveTo(13.1881f, 1.0899f, 12.8073f, 0.6951f, 12.3438f, 0.42f)
                    curveTo(11.8803f, 0.145f, 11.3512f, -1.0E-4f, 10.8123f, 0.0f)
                    horizontalLineTo(7.1303f)
                    lineTo(10.0303f, 10.0f)
                    horizontalLineTo(6.4003f)
                    lineTo(4.1003f, 7.705f)
                    curveTo(3.8401f, 7.4451f, 3.5237f, 7.2484f, 3.1755f, 7.1302f)
                    curveTo(2.8272f, 7.0121f, 2.4565f, 6.9755f, 2.0919f, 7.0233f)
                    curveTo(1.7272f, 7.0711f, 1.3785f, 7.2021f, 1.0725f, 7.4061f)
                    curveTo(0.7666f, 7.6102f, 0.5116f, 7.8818f, 0.3273f, 8.2f)
                    curveTo(0.1134f, 8.5635f, 0.0f, 8.9772f, -0.0014f, 9.3989f)
                    curveTo(-0.0028f, 9.8206f, 0.1079f, 10.2351f, 0.3193f, 10.6f)
                    lineTo(3.4073f, 16.0f)
                    horizontalLineTo(10.0193f)
                    lineTo(7.0193f, 24.0f)
                    horizontalLineTo(10.8123f)
                    curveTo(11.342f, 24.003f, 11.8628f, 23.8643f, 12.3208f, 23.5983f)
                    curveTo(12.7789f, 23.3323f, 13.1574f, 22.9486f, 13.4173f, 22.487f)
                    lineTo(17.4643f, 16.0f)
                    horizontalLineTo(24.0003f)
                    verticalLineTo(13.0f)
                    curveTo(24.0003f, 12.2044f, 23.6842f, 11.4413f, 23.1216f, 10.8787f)
                    curveTo(22.559f, 10.3161f, 21.7959f, 10.0f, 21.0003f, 10.0f)
                    close()
                    moveTo(9.7923f, 2.0f)
                    horizontalLineTo(10.8123f)
                    curveTo(10.9866f, 1.9985f, 11.1583f, 2.0431f, 11.3099f, 2.1293f)
                    curveTo(11.4614f, 2.2156f, 11.5875f, 2.3403f, 11.6753f, 2.491f)
                    lineTo(15.4553f, 10.0f)
                    horizontalLineTo(12.1103f)
                    lineTo(9.7923f, 2.0f)
                    close()
                    moveTo(22.0003f, 14.0f)
                    horizontalLineTo(16.3543f)
                    lineTo(11.6903f, 21.479f)
                    curveTo(11.6042f, 21.6367f, 11.4773f, 21.7683f, 11.3228f, 21.86f)
                    curveTo(11.1683f, 21.9517f, 10.9919f, 22.0f, 10.8123f, 22.0f)
                    horizontalLineTo(9.9003f)
                    lineTo(12.9003f, 14.0f)
                    horizontalLineTo(4.5673f)
                    lineTo(2.0553f, 9.6f)
                    curveTo(2.02f, 9.5389f, 2.0015f, 9.4694f, 2.0017f, 9.3989f)
                    curveTo(2.0019f, 9.3282f, 2.0208f, 9.2589f, 2.0564f, 9.198f)
                    curveTo(2.0921f, 9.137f, 2.1432f, 9.0866f, 2.2047f, 9.0519f)
                    curveTo(2.2661f, 9.0171f, 2.3357f, 8.9992f, 2.4063f, 9.0f)
                    curveTo(2.4592f, 8.9998f, 2.5117f, 9.0102f, 2.5606f, 9.0304f)
                    curveTo(2.6095f, 9.0507f, 2.6539f, 9.0805f, 2.6913f, 9.118f)
                    lineTo(5.5733f, 12.0f)
                    horizontalLineTo(21.0003f)
                    curveTo(21.2655f, 12.0f, 21.5198f, 12.1054f, 21.7074f, 12.2929f)
                    curveTo(21.8949f, 12.4804f, 22.0003f, 12.7348f, 22.0003f, 13.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
