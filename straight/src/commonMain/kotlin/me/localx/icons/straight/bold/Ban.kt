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

public val Icons.Bold.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 0.0f)
                    curveTo(9.6266f, 0.0f, 7.3065f, 0.7038f, 5.3331f, 2.0224f)
                    curveTo(3.3598f, 3.3409f, 1.8217f, 5.2151f, 0.9134f, 7.4078f)
                    curveTo(0.0052f, 9.6005f, -0.2324f, 12.0133f, 0.2306f, 14.3411f)
                    curveTo(0.6936f, 16.6689f, 1.8365f, 18.8071f, 3.5147f, 20.4853f)
                    curveTo(5.1929f, 22.1635f, 7.3311f, 23.3064f, 9.6589f, 23.7694f)
                    curveTo(11.9867f, 24.2324f, 14.3995f, 23.9948f, 16.5922f, 23.0866f)
                    curveTo(18.7849f, 22.1783f, 20.6591f, 20.6402f, 21.9776f, 18.6668f)
                    curveTo(23.2962f, 16.6935f, 24.0f, 14.3734f, 24.0f, 12.0f)
                    curveTo(23.9966f, 8.8185f, 22.7312f, 5.7682f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(13.8676f, 3.0002f, 15.6884f, 3.5849f, 17.207f, 4.672f)
                    lineTo(4.672f, 17.206f)
                    curveTo(3.7124f, 15.8614f, 3.142f, 14.2783f, 3.0235f, 12.6306f)
                    curveTo(2.905f, 10.983f, 3.243f, 9.3345f, 4.0002f, 7.8665f)
                    curveTo(4.7575f, 6.3984f, 5.9049f, 5.1674f, 7.3162f, 4.3089f)
                    curveTo(8.7275f, 3.4504f, 10.3481f, 2.9975f, 12.0f, 3.0f)
                    close()
                    moveTo(12.0f, 21.0f)
                    curveTo(10.1327f, 20.9999f, 8.3122f, 20.4152f, 6.794f, 19.328f)
                    lineTo(19.328f, 6.793f)
                    curveTo(20.2879f, 8.1376f, 20.8585f, 9.7208f, 20.9772f, 11.3686f)
                    curveTo(21.0958f, 13.0164f, 20.7579f, 14.6651f, 20.0006f, 16.1333f)
                    curveTo(19.2432f, 17.6016f, 18.0958f, 18.8326f, 16.6843f, 19.6912f)
                    curveTo(15.2729f, 20.5498f, 13.6521f, 21.0026f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
