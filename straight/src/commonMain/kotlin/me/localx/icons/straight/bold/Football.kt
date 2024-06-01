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

public val Icons.Bold.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(10.642f, 20.886f)
                    lineTo(9.076f, 16.0f)
                    lineTo(3.947f, 15.993f)
                    curveTo(3.5345f, 15.1657f, 3.2538f, 14.279f, 3.115f, 13.365f)
                    lineTo(7.268f, 10.438f)
                    lineTo(5.753f, 5.538f)
                    curveTo(6.3846f, 4.9275f, 7.1014f, 4.4118f, 7.881f, 4.007f)
                    lineTo(12.0f, 7.0f)
                    lineTo(16.119f, 4.007f)
                    curveTo(16.8984f, 4.4109f, 17.6152f, 4.9255f, 18.247f, 5.535f)
                    lineTo(16.732f, 10.435f)
                    lineTo(20.885f, 13.362f)
                    curveTo(20.746f, 14.2763f, 20.4653f, 15.1633f, 20.053f, 15.991f)
                    lineTo(14.924f, 16.0f)
                    lineTo(13.358f, 20.886f)
                    curveTo(12.9089f, 20.9585f, 12.4549f, 20.9966f, 12.0f, 21.0f)
                    curveTo(11.5451f, 20.9966f, 11.0911f, 20.9585f, 10.642f, 20.886f)
                    close()
                    moveTo(14.924f, 16.0f)
                    horizontalLineTo(9.076f)
                    lineTo(7.268f, 10.438f)
                    lineTo(12.0f, 7.0f)
                    lineTo(16.732f, 10.438f)
                    lineTo(14.924f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
