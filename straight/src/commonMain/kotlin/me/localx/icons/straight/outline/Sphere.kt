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
                    moveTo(12.0f, 15.0f)
                    curveTo(5.988f, 15.0f, 2.0f, 13.194f, 2.0f, 12.0f)
                    curveTo(2.0f, 10.806f, 5.988f, 9.0f, 12.0f, 9.0f)
                    curveTo(18.012f, 9.0f, 22.0f, 10.806f, 22.0f, 12.0f)
                    curveTo(22.0f, 13.194f, 18.012f, 15.0f, 12.0f, 15.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(14.0941f, 2.0034f, 16.1345f, 2.6635f, 17.8338f, 3.8873f)
                    curveTo(19.5331f, 5.1111f, 20.8059f, 6.837f, 21.473f, 8.822f)
                    curveTo(18.4889f, 7.5217f, 15.2535f, 6.8995f, 12.0f, 7.0f)
                    curveTo(8.7465f, 6.8995f, 5.5111f, 7.5217f, 2.527f, 8.822f)
                    curveTo(3.1941f, 6.837f, 4.4669f, 5.1111f, 6.1662f, 3.8873f)
                    curveTo(7.8656f, 2.6635f, 9.9059f, 2.0034f, 12.0f, 2.0f)
                    close()
                    moveTo(12.0f, 22.0f)
                    curveTo(9.9059f, 21.9966f, 7.8656f, 21.3365f, 6.1662f, 20.1127f)
                    curveTo(4.4669f, 18.8889f, 3.1941f, 17.163f, 2.527f, 15.178f)
                    curveTo(5.5111f, 16.4783f, 8.7465f, 17.1005f, 12.0f, 17.0f)
                    curveTo(15.2535f, 17.1005f, 18.4889f, 16.4783f, 21.473f, 15.178f)
                    curveTo(20.8059f, 17.163f, 19.5331f, 18.8889f, 17.8338f, 20.1127f)
                    curveTo(16.1345f, 21.3365f, 14.0941f, 21.9966f, 12.0f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
