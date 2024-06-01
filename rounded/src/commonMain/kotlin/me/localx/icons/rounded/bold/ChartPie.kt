package me.localx.icons.rounded.bold

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
                    moveTo(20.415f, 8.836f)
                    lineTo(12.915f, 10.294f)
                    curveTo(12.871f, 10.209f, 12.822f, 10.127f, 12.784f, 10.039f)
                    lineTo(9.847f, 3.271f)
                    curveTo(11.9847f, 2.7322f, 14.2462f, 3.0023f, 16.1968f, 4.0295f)
                    curveTo(18.1475f, 5.0567f, 19.6498f, 6.7685f, 20.415f, 8.836f)
                    close()
                    moveTo(3.0f, 12.0f)
                    curveTo(3.0012f, 10.5025f, 3.3762f, 9.029f, 4.0912f, 7.7132f)
                    curveTo(4.8061f, 6.3973f, 5.8383f, 5.2808f, 7.094f, 4.465f)
                    lineTo(10.032f, 11.233f)
                    curveTo(10.5218f, 12.3633f, 11.2917f, 13.3501f, 12.269f, 14.1f)
                    lineTo(18.124f, 18.581f)
                    curveTo(16.8437f, 19.779f, 15.2408f, 20.5763f, 13.513f, 20.8744f)
                    curveTo(11.7851f, 21.1726f, 10.0078f, 20.9587f, 8.4f, 20.2591f)
                    curveTo(6.7922f, 19.5595f, 5.4242f, 18.4048f, 4.4647f, 16.9372f)
                    curveTo(3.5052f, 15.4696f, 2.996f, 13.7534f, 3.0f, 12.0f)
                    close()
                    moveTo(19.954f, 16.2f)
                    lineTo(15.56f, 12.836f)
                    lineTo(20.989f, 11.781f)
                    curveTo(20.989f, 11.854f, 21.0f, 11.926f, 21.0f, 12.0f)
                    curveTo(21.0005f, 13.4645f, 20.6414f, 14.9068f, 19.954f, 16.2f)
                    close()
                }
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
