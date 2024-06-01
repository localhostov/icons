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

public val Icons.Outline.TimeAdd: ImageVector
    get() {
        if (_timeAdd != null) {
            return _timeAdd!!
        }
        _timeAdd = Builder(name = "TimeAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 18.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(11.0f, 6.0f)
                    verticalLineTo(10.586f)
                    lineTo(8.293f, 13.293f)
                    lineTo(9.707f, 14.707f)
                    lineTo(13.0f, 11.414f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(11.0f)
                    close()
                    moveTo(2.0f, 12.0f)
                    curveTo(1.9988f, 10.6439f, 2.2735f, 9.3017f, 2.8073f, 8.0551f)
                    curveTo(3.3411f, 6.8085f, 4.1229f, 5.6835f, 5.1051f, 4.7484f)
                    curveTo(6.0873f, 3.8134f, 7.2494f, 3.0879f, 8.5208f, 2.6161f)
                    curveTo(9.7922f, 2.1443f, 11.1463f, 1.936f, 12.5007f, 2.0039f)
                    curveTo(13.8551f, 2.0718f, 15.1815f, 2.4145f, 16.3993f, 3.0111f)
                    curveTo(17.6171f, 3.6077f, 18.7009f, 4.4457f, 19.5847f, 5.4743f)
                    curveTo(20.4685f, 6.5028f, 21.1338f, 7.7004f, 21.5403f, 8.9942f)
                    curveTo(21.9467f, 10.2879f, 22.0858f, 11.6508f, 21.949f, 13.0f)
                    horizontalLineTo(23.949f)
                    curveTo(23.977f, 12.669f, 24.0f, 12.338f, 24.0f, 12.0f)
                    curveTo(24.0f, 9.6266f, 23.2962f, 7.3066f, 21.9776f, 5.3332f)
                    curveTo(20.6591f, 3.3598f, 18.7849f, 1.8217f, 16.5922f, 0.9135f)
                    curveTo(14.3995f, 0.0052f, 11.9867f, -0.2324f, 9.6589f, 0.2306f)
                    curveTo(7.3312f, 0.6936f, 5.1929f, 1.8365f, 3.5147f, 3.5147f)
                    curveTo(1.8365f, 5.1929f, 0.6936f, 7.3312f, 0.2306f, 9.6589f)
                    curveTo(-0.2324f, 11.9867f, 0.0052f, 14.3995f, 0.9135f, 16.5922f)
                    curveTo(1.8217f, 18.7849f, 3.3598f, 20.6591f, 5.3332f, 21.9776f)
                    curveTo(7.3066f, 23.2962f, 9.6266f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.338f, 24.0f, 12.669f, 23.977f, 13.0f, 23.949f)
                    verticalLineTo(21.949f)
                    curveTo(11.6093f, 22.09f, 10.2044f, 21.9377f, 8.8763f, 21.5018f)
                    curveTo(7.5481f, 21.0659f, 6.3262f, 20.3562f, 5.2895f, 19.4185f)
                    curveTo(4.2528f, 18.4809f, 3.4243f, 17.3361f, 2.8577f, 16.0583f)
                    curveTo(2.2911f, 14.7804f, 1.9989f, 13.3979f, 2.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _timeAdd!!
    }

private var _timeAdd: ImageVector? = null
