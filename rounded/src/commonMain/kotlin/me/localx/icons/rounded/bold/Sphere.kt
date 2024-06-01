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

public val Icons.Bold.Sphere: ImageVector
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
                    moveTo(12.0f, 15.272f)
                    curveTo(6.59f, 15.272f, 3.0f, 13.3f, 3.0f, 12.0f)
                    curveTo(3.0f, 10.7f, 6.59f, 8.728f, 12.0f, 8.728f)
                    curveTo(17.41f, 8.728f, 21.0f, 10.7f, 21.0f, 12.0f)
                    curveTo(21.0f, 13.3f, 17.41f, 15.272f, 12.0f, 15.272f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(13.4865f, 3.0015f, 14.9494f, 3.3712f, 16.2581f, 4.076f)
                    curveTo(17.5669f, 4.7808f, 18.6806f, 5.7988f, 19.5f, 7.039f)
                    curveTo(17.1059f, 6.13f, 14.5606f, 5.6851f, 12.0f, 5.728f)
                    curveTo(9.4395f, 5.6851f, 6.8941f, 6.13f, 4.5f, 7.039f)
                    curveTo(5.3194f, 5.7988f, 6.4332f, 4.7808f, 7.7419f, 4.076f)
                    curveTo(9.0506f, 3.3712f, 10.5136f, 3.0015f, 12.0f, 3.0f)
                    close()
                    moveTo(12.0f, 21.0f)
                    curveTo(10.5136f, 20.9985f, 9.0506f, 20.6288f, 7.7419f, 19.924f)
                    curveTo(6.4332f, 19.2192f, 5.3194f, 18.2012f, 4.5f, 16.961f)
                    curveTo(6.8941f, 17.87f, 9.4395f, 18.3149f, 12.0f, 18.272f)
                    curveTo(14.5606f, 18.3149f, 17.1059f, 17.87f, 19.5f, 16.961f)
                    curveTo(18.6806f, 18.2012f, 17.5669f, 19.2192f, 16.2581f, 19.924f)
                    curveTo(14.9494f, 20.6288f, 13.4865f, 20.9985f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
