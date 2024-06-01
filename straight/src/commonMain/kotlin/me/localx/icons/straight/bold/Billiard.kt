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

public val Icons.Bold.Billiard: ImageVector
    get() {
        if (_billiard != null) {
            return _billiard!!
        }
        _billiard = Builder(name = "Billiard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(9.6266f, 24.0f, 7.3066f, 23.2962f, 5.3332f, 21.9776f)
                    curveTo(3.3598f, 20.6591f, 1.8217f, 18.7849f, 0.9135f, 16.5922f)
                    curveTo(0.0052f, 14.3995f, -0.2324f, 11.9867f, 0.2306f, 9.6589f)
                    curveTo(0.6936f, 7.3312f, 1.8365f, 5.1929f, 3.5147f, 3.5147f)
                    curveTo(5.1929f, 1.8365f, 7.3312f, 0.6936f, 9.6589f, 0.2306f)
                    curveTo(11.9867f, -0.2324f, 14.3995f, 0.0052f, 16.5922f, 0.9135f)
                    curveTo(18.7849f, 1.8217f, 20.6591f, 3.3598f, 21.9776f, 5.3332f)
                    curveTo(23.2962f, 7.3066f, 24.0f, 9.6266f, 24.0f, 12.0f)
                    curveTo(23.9966f, 15.1815f, 22.7312f, 18.2318f, 20.4815f, 20.4815f)
                    curveTo(18.2318f, 22.7312f, 15.1815f, 23.9966f, 12.0f, 24.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(10.22f, 3.0f, 8.4799f, 3.5278f, 6.9999f, 4.5168f)
                    curveTo(5.5198f, 5.5057f, 4.3663f, 6.9113f, 3.6851f, 8.5559f)
                    curveTo(3.0039f, 10.2004f, 2.8257f, 12.01f, 3.1729f, 13.7558f)
                    curveTo(3.5202f, 15.5016f, 4.3774f, 17.1053f, 5.636f, 18.364f)
                    curveTo(6.8947f, 19.6226f, 8.4984f, 20.4798f, 10.2442f, 20.8271f)
                    curveTo(11.99f, 21.1743f, 13.7996f, 20.9961f, 15.4442f, 20.3149f)
                    curveTo(17.0887f, 19.6337f, 18.4943f, 18.4802f, 19.4832f, 17.0001f)
                    curveTo(20.4722f, 15.5201f, 21.0f, 13.78f, 21.0f, 12.0f)
                    curveTo(20.9974f, 9.6139f, 20.0483f, 7.3262f, 18.361f, 5.639f)
                    curveTo(16.6738f, 3.9517f, 14.3861f, 3.0027f, 12.0f, 3.0f)
                    close()
                    moveTo(12.0f, 6.0f)
                    curveTo(10.8133f, 6.0f, 9.6533f, 6.3519f, 8.6666f, 7.0112f)
                    curveTo(7.6799f, 7.6705f, 6.9109f, 8.6075f, 6.4567f, 9.7039f)
                    curveTo(6.0026f, 10.8003f, 5.8838f, 12.0067f, 6.1153f, 13.1705f)
                    curveTo(6.3468f, 14.3344f, 6.9183f, 15.4035f, 7.7574f, 16.2426f)
                    curveTo(8.5965f, 17.0818f, 9.6656f, 17.6532f, 10.8295f, 17.8847f)
                    curveTo(11.9934f, 18.1162f, 13.1997f, 17.9974f, 14.2961f, 17.5433f)
                    curveTo(15.3925f, 17.0892f, 16.3295f, 16.3201f, 16.9888f, 15.3334f)
                    curveTo(17.6481f, 14.3467f, 18.0f, 13.1867f, 18.0f, 12.0f)
                    curveTo(18.0f, 10.4087f, 17.3679f, 8.8826f, 16.2426f, 7.7574f)
                    curveTo(15.1174f, 6.6322f, 13.5913f, 6.0f, 12.0f, 6.0f)
                    close()
                    moveTo(15.083f, 11.016f)
                    lineTo(12.35f, 16.654f)
                    lineTo(9.65f, 15.346f)
                    lineTo(11.272f, 12.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.083f)
                    verticalLineTo(11.016f)
                    close()
                }
            }
        }
        .build()
        return _billiard!!
    }

private var _billiard: ImageVector? = null
