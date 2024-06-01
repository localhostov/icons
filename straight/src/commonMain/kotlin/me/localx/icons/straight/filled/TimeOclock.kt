package me.localx.icons.straight.filled

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

public val Icons.Filled.TimeOclock: ImageVector
    get() {
        if (_timeOclock != null) {
            return _timeOclock!!
        }
        _timeOclock = Builder(name = "TimeOclock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(12.0f, 14.0f)
                    curveTo(11.5601f, 14.0015f, 11.1321f, 13.8575f, 10.7825f, 13.5904f)
                    curveTo(10.433f, 13.3233f, 10.1816f, 12.9481f, 10.0675f, 12.5233f)
                    curveTo(9.9534f, 12.0984f, 9.983f, 11.6478f, 10.1516f, 11.2415f)
                    curveTo(10.3203f, 10.8352f, 10.6186f, 10.4961f, 11.0f, 10.277f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(10.277f)
                    curveTo(13.3814f, 10.4961f, 13.6797f, 10.8352f, 13.8484f, 11.2415f)
                    curveTo(14.017f, 11.6478f, 14.0466f, 12.0984f, 13.9325f, 12.5233f)
                    curveTo(13.8184f, 12.9481f, 13.567f, 13.3233f, 13.2175f, 13.5904f)
                    curveTo(12.8679f, 13.8575f, 12.4399f, 14.0015f, 12.0f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _timeOclock!!
    }

private var _timeOclock: ImageVector? = null
