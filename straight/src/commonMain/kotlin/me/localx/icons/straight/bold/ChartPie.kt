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

public val Icons.Bold.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3066f, 0.7038f, 5.3332f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9135f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3312f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(15.621f, 13.5f)
                    horizontalLineTo(20.865f)
                    curveTo(20.6398f, 14.8358f, 20.1143f, 16.1029f, 19.328f, 17.206f)
                    lineTo(15.621f, 13.5f)
                    close()
                    moveTo(20.865f, 10.5f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(3.135f)
                    curveTo(15.3388f, 3.4496f, 17.0348f, 4.3269f, 18.3539f, 5.6461f)
                    curveTo(19.6731f, 6.9652f, 20.5504f, 8.6612f, 20.865f, 10.5f)
                    close()
                    moveTo(3.0f, 12.0f)
                    curveTo(3.004f, 9.8752f, 3.7588f, 7.8201f, 5.1312f, 6.1979f)
                    curveTo(6.5036f, 4.5758f, 8.4052f, 3.4909f, 10.5f, 3.135f)
                    verticalLineTo(12.621f)
                    lineTo(17.206f, 19.328f)
                    curveTo(15.8614f, 20.2876f, 14.2783f, 20.858f, 12.6306f, 20.9765f)
                    curveTo(10.983f, 21.095f, 9.3346f, 20.757f, 7.8665f, 19.9997f)
                    curveTo(6.3984f, 19.2424f, 5.1674f, 18.0951f, 4.3089f, 16.6838f)
                    curveTo(3.4504f, 15.2725f, 2.9975f, 13.6519f, 3.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
