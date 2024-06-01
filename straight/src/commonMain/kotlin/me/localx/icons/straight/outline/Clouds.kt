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

public val Icons.Outline.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.2945f, 21.8685f)
                    curveTo(1.3379f, 21.1767f, -0.4981f, 18.219f, 0.1938f, 15.2624f)
                    curveTo(0.5489f, 13.7446f, 1.5317f, 12.4489f, 2.8975f, 11.6977f)
                    curveTo(0.8465f, 7.7952f, 2.3475f, 2.9689f, 6.2501f, 0.9179f)
                    curveTo(10.1526f, -1.1331f, 14.9789f, 0.3679f, 17.0298f, 4.2705f)
                    curveTo(17.3579f, 4.8946f, 17.6017f, 5.5594f, 17.7551f, 6.2476f)
                    curveTo(21.407f, 7.0908f, 23.9831f, 10.3576f, 23.9516f, 14.1054f)
                    curveTo(23.3267f, 13.4803f, 22.588f, 12.9803f, 21.7753f, 12.6327f)
                    curveTo(21.201f, 10.2323f, 19.2124f, 8.4304f, 16.7673f, 8.0946f)
                    lineTo(16.0099f, 7.9948f)
                    lineTo(15.9101f, 7.2384f)
                    curveTo(15.4719f, 3.9644f, 12.4626f, 1.6656f, 9.1886f, 2.1037f)
                    curveTo(5.9146f, 2.5419f, 3.6157f, 5.5513f, 4.0539f, 8.8253f)
                    curveTo(4.1879f, 9.8267f, 4.5735f, 10.7778f, 5.1745f, 11.5899f)
                    lineTo(6.1993f, 13.0238f)
                    curveTo(5.6701f, 12.9869f, 5.1384f, 13.0293f, 4.6217f, 13.1495f)
                    curveTo(2.7592f, 13.6508f, 1.6557f, 15.5671f, 2.157f, 17.4296f)
                    curveTo(2.4214f, 18.4119f, 3.1009f, 19.2301f, 4.018f, 19.6703f)
                    curveTo(3.9609f, 20.4142f, 4.0549f, 21.1619f, 4.2945f, 21.8685f)
                    close()
                    moveTo(23.9516f, 19.0107f)
                    curveTo(23.9488f, 16.5594f, 22.168f, 14.4722f, 19.7478f, 14.0835f)
                    curveTo(17.8698f, 7.6245f, 8.4075f, 9.4206f, 9.0221f, 16.134f)
                    curveTo(6.8849f, 16.685f, 5.5991f, 18.8642f, 6.1501f, 21.0015f)
                    curveTo(6.6017f, 22.7529f, 8.1734f, 23.9828f, 9.982f, 23.9999f)
                    horizontalLineTo(18.9625f)
                    curveTo(21.7165f, 23.9966f, 23.9483f, 21.7648f, 23.9516f, 19.0107f)
                    close()
                    moveTo(11.6784f, 18.0129f)
                    lineTo(11.2024f, 16.6799f)
                    curveTo(9.6687f, 11.7705f, 17.1404f, 10.0394f, 17.9257f, 15.1343f)
                    lineTo(18.0255f, 16.0223f)
                    horizontalLineTo(19.0233f)
                    curveTo(20.6746f, 16.1045f, 21.9465f, 17.5096f, 21.8644f, 19.1608f)
                    curveTo(21.7868f, 20.7204f, 20.5234f, 21.9584f, 18.9625f, 22.0043f)
                    horizontalLineTo(9.982f)
                    curveTo(8.8799f, 22.0043f, 7.9864f, 21.1108f, 7.9864f, 20.0086f)
                    curveTo(7.9864f, 18.9064f, 8.8799f, 18.0129f, 9.982f, 18.0129f)
                    horizontalLineTo(11.6784f)
                    close()
                }
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
