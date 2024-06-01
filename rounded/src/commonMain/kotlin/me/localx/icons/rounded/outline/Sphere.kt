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

public val Icons.Outline.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    moveTo(12.0f, 16.0f)
                    curveTo(6.276f, 16.0f, 2.0f, 13.889f, 2.0f, 12.0f)
                    curveTo(2.0f, 10.111f, 6.276f, 8.0f, 12.0f, 8.0f)
                    curveTo(17.724f, 8.0f, 22.0f, 10.111f, 22.0f, 12.0f)
                    curveTo(22.0f, 13.889f, 17.724f, 16.0f, 12.0f, 16.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(13.9564f, 2.0022f, 15.8693f, 2.5776f, 17.5023f, 3.6549f)
                    curveTo(19.1354f, 4.7322f, 20.417f, 6.2643f, 21.189f, 8.062f)
                    curveTo(18.3531f, 6.5993f, 15.189f, 5.8893f, 12.0f, 6.0f)
                    curveTo(8.811f, 5.8893f, 5.6469f, 6.5993f, 2.811f, 8.062f)
                    curveTo(3.583f, 6.2643f, 4.8646f, 4.7322f, 6.4977f, 3.6549f)
                    curveTo(8.1307f, 2.5776f, 10.0436f, 2.0022f, 12.0f, 2.0f)
                    close()
                    moveTo(12.0f, 22.0f)
                    curveTo(10.0436f, 21.9977f, 8.1307f, 21.4224f, 6.4977f, 20.3451f)
                    curveTo(4.8646f, 19.2678f, 3.583f, 17.7357f, 2.811f, 15.938f)
                    curveTo(5.6469f, 17.4007f, 8.811f, 18.1107f, 12.0f, 18.0f)
                    curveTo(15.189f, 18.1107f, 18.3531f, 17.4007f, 21.189f, 15.938f)
                    curveTo(20.417f, 17.7357f, 19.1354f, 19.2678f, 17.5023f, 20.3451f)
                    curveTo(15.8693f, 21.4224f, 13.9564f, 21.9977f, 12.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
