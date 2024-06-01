package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.5129f, 3.5f)
                    lineTo(12.4999f, 2.0f)
                    horizontalLineTo(10.9999f)
                    curveTo(8.2631f, 1.997f, 5.6234f, 3.0144f, 3.5965f, 4.8534f)
                    curveTo(1.5696f, 6.6925f, 0.3011f, 9.221f, 0.0386f, 11.9452f)
                    curveTo(-0.2238f, 14.6695f, 0.5387f, 17.3937f, 2.1773f, 19.5858f)
                    curveTo(3.8159f, 21.7779f, 6.2128f, 23.2805f, 8.8999f, 23.8f)
                    curveTo(9.5848f, 23.9318f, 10.2805f, 23.9988f, 10.9779f, 24.0f)
                    curveTo(13.8958f, 23.995f, 16.693f, 22.8352f, 18.7584f, 20.774f)
                    curveTo(20.8237f, 18.7128f, 21.9891f, 15.9179f, 21.9999f, 13.0f)
                    verticalLineTo(11.5f)
                    horizontalLineTo(12.4999f)
                    lineTo(12.5129f, 3.5f)
                    close()
                    moveTo(18.8559f, 14.5f)
                    curveTo(18.5808f, 15.9238f, 17.9231f, 17.2457f, 16.9535f, 18.324f)
                    curveTo(15.9838f, 19.4023f, 14.7389f, 20.1962f, 13.3522f, 20.6205f)
                    curveTo(11.9656f, 21.0447f, 10.4896f, 21.0834f, 9.0826f, 20.7323f)
                    curveTo(7.6756f, 20.3812f, 6.3908f, 19.6535f, 5.3661f, 18.6275f)
                    curveTo(4.3414f, 17.6015f, 3.6154f, 16.3157f, 3.2661f, 14.9083f)
                    curveTo(2.9168f, 13.5009f, 2.9573f, 12.0249f, 3.3834f, 10.6388f)
                    curveTo(3.8095f, 9.2527f, 4.6049f, 8.0088f, 5.6845f, 7.0405f)
                    curveTo(6.764f, 6.0723f, 8.0868f, 5.4163f, 9.5109f, 5.143f)
                    lineTo(9.4999f, 14.5f)
                    horizontalLineTo(18.8559f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.4999f, 0.005f)
                    verticalLineTo(9.5f)
                    horizontalLineTo(23.9999f)
                    curveTo(23.9875f, 6.9847f, 22.9825f, 4.576f, 21.2034f, 2.7979f)
                    curveTo(19.4244f, 1.0198f, 17.0152f, 0.016f, 14.4999f, 0.005f)
                    close()
                }
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
