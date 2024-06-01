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

public val Icons.Filled.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(8.464f, 15.536f)
                    curveTo(9.4028f, 16.472f, 10.6743f, 16.9976f, 12.0f, 16.9976f)
                    curveTo(13.3257f, 16.9976f, 14.5972f, 16.472f, 15.536f, 15.536f)
                    lineTo(16.95f, 16.95f)
                    curveTo(15.971f, 17.9289f, 14.7237f, 18.5955f, 13.3659f, 18.8656f)
                    curveTo(12.008f, 19.1356f, 10.6006f, 18.9969f, 9.3216f, 18.4671f)
                    curveTo(8.0425f, 17.9373f, 6.9493f, 17.04f, 6.1802f, 15.8889f)
                    curveTo(5.411f, 14.7378f, 5.0005f, 13.3844f, 5.0005f, 12.0f)
                    curveTo(5.0005f, 10.6156f, 5.411f, 9.2622f, 6.1802f, 8.1111f)
                    curveTo(6.9493f, 6.96f, 8.0425f, 6.0627f, 9.3216f, 5.5329f)
                    curveTo(10.6006f, 5.0031f, 12.008f, 4.8644f, 13.3659f, 5.1344f)
                    curveTo(14.7237f, 5.4045f, 15.971f, 6.0711f, 16.95f, 7.05f)
                    lineTo(15.536f, 8.464f)
                    curveTo(14.5982f, 7.5262f, 13.3263f, 6.9993f, 12.0f, 6.9993f)
                    curveTo(10.6737f, 6.9993f, 9.4018f, 7.5262f, 8.464f, 8.464f)
                    curveTo(7.5262f, 9.4018f, 6.9994f, 10.6737f, 6.9994f, 12.0f)
                    curveTo(6.9994f, 13.3263f, 7.5262f, 14.5982f, 8.464f, 15.536f)
                    close()
                }
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
