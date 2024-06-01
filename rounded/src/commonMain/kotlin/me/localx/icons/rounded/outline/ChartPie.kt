package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChartPie: ImageVector
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
                    moveTo(21.573f, 9.12f)
                    lineTo(12.665f, 10.852f)
                    curveTo(12.5248f, 10.6356f, 12.4018f, 10.4086f, 12.297f, 10.173f)
                    lineTo(8.957f, 2.473f)
                    curveTo(10.2214f, 2.0677f, 11.554f, 1.9187f, 12.8767f, 2.0345f)
                    curveTo(14.1995f, 2.1504f, 15.4858f, 2.5288f, 16.6605f, 3.1478f)
                    curveTo(17.8353f, 3.7667f, 18.8748f, 4.6137f, 19.7183f, 5.6391f)
                    curveTo(20.5618f, 6.6646f, 21.1923f, 7.8479f, 21.573f, 9.12f)
                    close()
                    moveTo(12.0f, 22.0f)
                    curveTo(9.7871f, 22.0008f, 7.6365f, 21.2672f, 5.8854f, 19.9143f)
                    curveTo(4.1343f, 18.5614f, 2.8817f, 16.6655f, 2.324f, 14.5241f)
                    curveTo(1.7663f, 12.3826f, 1.935f, 10.1167f, 2.8036f, 8.0814f)
                    curveTo(3.6723f, 6.0462f, 5.1919f, 4.3567f, 7.124f, 3.278f)
                    lineTo(10.462f, 10.969f)
                    curveTo(10.937f, 12.0622f, 11.6828f, 13.0162f, 12.629f, 13.741f)
                    lineTo(19.282f, 18.833f)
                    curveTo(18.3501f, 19.8318f, 17.2228f, 20.6283f, 15.9701f, 21.1731f)
                    curveTo(14.7174f, 21.7179f, 13.366f, 21.9994f, 12.0f, 22.0f)
                    close()
                    moveTo(20.5f, 17.245f)
                    lineTo(14.375f, 12.557f)
                    lineTo(21.956f, 11.084f)
                    curveTo(21.983f, 11.384f, 22.002f, 11.691f, 22.002f, 12.0f)
                    curveTo(22.0011f, 13.8543f, 21.4808f, 15.6713f, 20.5f, 17.245f)
                    close()
                }
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
