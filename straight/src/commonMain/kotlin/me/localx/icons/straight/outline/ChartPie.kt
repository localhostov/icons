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
                    curveTo(24.0f, 8.8174f, 22.7357f, 5.7652f, 20.4853f, 3.5147f)
                    curveTo(18.2348f, 1.2643f, 15.1826f, 0.0f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(21.949f, 11.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(2.051f)
                    curveTo(15.2938f, 2.2846f, 17.4368f, 3.3024f, 19.0672f, 4.9328f)
                    curveTo(20.6976f, 6.5632f, 21.7154f, 8.7062f, 21.949f, 11.0f)
                    close()
                    moveTo(2.0f, 12.0f)
                    curveTo(2.0031f, 9.5219f, 2.925f, 7.1331f, 4.5875f, 5.2954f)
                    curveTo(6.2499f, 3.4577f, 8.5347f, 2.3017f, 11.0f, 2.051f)
                    verticalLineTo(12.414f)
                    lineTo(18.324f, 19.738f)
                    curveTo(16.8598f, 20.9374f, 15.0851f, 21.6963f, 13.2064f, 21.9264f)
                    curveTo(11.3277f, 22.1564f, 9.4223f, 21.8481f, 7.712f, 21.0374f)
                    curveTo(6.0017f, 20.2267f, 4.5569f, 18.9469f, 3.5457f, 17.3469f)
                    curveTo(2.5344f, 15.747f, 1.9984f, 13.8927f, 2.0f, 12.0f)
                    close()
                    moveTo(19.738f, 18.324f)
                    lineTo(14.414f, 13.0f)
                    horizontalLineTo(21.949f)
                    curveTo(21.754f, 14.9541f, 20.9846f, 16.8066f, 19.738f, 18.324f)
                    close()
                }
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
