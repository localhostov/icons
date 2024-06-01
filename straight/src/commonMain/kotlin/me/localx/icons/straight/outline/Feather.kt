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

public val Icons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.2453f, 0.7577f)
                    curveTo(22.9611f, 0.4709f, 22.6131f, 0.2552f, 22.2298f, 0.1282f)
                    curveTo(21.8465f, 0.0012f, 21.4386f, -0.0336f, 21.0393f, 0.0267f)
                    curveTo(15.1f, 0.9648f, 9.5913f, 3.7018f, 5.2563f, 7.8687f)
                    curveTo(4.4971f, 8.6322f, 3.9053f, 9.5454f, 3.5184f, 10.5502f)
                    curveTo(3.1315f, 11.5549f, 2.9582f, 12.6293f, 3.0093f, 13.7047f)
                    curveTo(3.0803f, 15.2648f, 3.6279f, 16.7656f, 4.5783f, 18.0047f)
                    lineTo(0.0433f, 22.5427f)
                    lineTo(1.4573f, 23.9567f)
                    lineTo(5.9913f, 19.4227f)
                    curveTo(7.3054f, 20.4469f, 8.9253f, 21.0002f, 10.5913f, 20.9937f)
                    curveTo(11.6975f, 20.9888f, 12.7913f, 20.76f, 13.8068f, 20.3213f)
                    curveTo(14.8223f, 19.8825f, 15.7385f, 19.2428f, 16.5003f, 18.4407f)
                    curveTo(20.4665f, 14.1246f, 23.0673f, 8.7317f, 23.9753f, 2.9407f)
                    curveTo(24.0336f, 2.5451f, 23.9979f, 2.1413f, 23.8711f, 1.762f)
                    curveTo(23.7443f, 1.3828f, 23.5299f, 1.0387f, 23.2453f, 0.7577f)
                    close()
                    moveTo(5.0073f, 13.6077f)
                    curveTo(4.9692f, 12.8104f, 5.0975f, 12.0139f, 5.3842f, 11.2689f)
                    curveTo(5.6709f, 10.5239f, 6.1096f, 9.8468f, 6.6723f, 9.2807f)
                    curveTo(7.1053f, 8.8467f, 7.5503f, 8.4457f, 8.0003f, 8.0607f)
                    verticalLineTo(14.5857f)
                    lineTo(6.0103f, 16.5757f)
                    curveTo(5.4039f, 15.7002f, 5.0563f, 14.6716f, 5.0073f, 13.6077f)
                    close()
                    moveTo(15.0543f, 17.0587f)
                    curveTo(14.102f, 18.0967f, 12.8104f, 18.7605f, 11.4121f, 18.9306f)
                    curveTo(10.0138f, 19.1007f, 8.6007f, 18.766f, 7.4273f, 17.9867f)
                    lineTo(12.4143f, 12.9997f)
                    horizontalLineTo(18.1613f)
                    curveTo(17.2724f, 14.459f, 16.2309f, 15.8197f, 15.0543f, 17.0587f)
                    close()
                    moveTo(21.9933f, 2.6587f)
                    curveTo(21.5198f, 5.5616f, 20.6038f, 8.3746f, 19.2773f, 10.9997f)
                    horizontalLineTo(14.4143f)
                    lineTo(17.9573f, 7.4567f)
                    lineTo(16.5433f, 6.0427f)
                    lineTo(10.0003f, 12.5857f)
                    verticalLineTo(6.5167f)
                    curveTo(13.4053f, 4.2116f, 17.2698f, 2.6725f, 21.3273f, 2.0057f)
                    curveTo(21.3565f, 2.0017f, 21.3859f, 1.9997f, 21.4153f, 1.9997f)
                    curveTo(21.4928f, 1.9996f, 21.5695f, 2.0148f, 21.6411f, 2.0445f)
                    curveTo(21.7127f, 2.0742f, 21.7777f, 2.1178f, 21.8323f, 2.1727f)
                    curveTo(21.8955f, 2.2347f, 21.943f, 2.3109f, 21.971f, 2.3948f)
                    curveTo(21.999f, 2.4788f, 22.0066f, 2.5682f, 21.9933f, 2.6557f)
                    verticalLineTo(2.6587f)
                    close()
                }
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
