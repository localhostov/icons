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

public val Icons.Bold.Rec: ImageVector
    get() {
        if (_rec != null) {
            return _rec!!
        }
        _rec = Builder(name = "Rec", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                    moveTo(12.0f, 21.0f)
                    curveTo(10.22f, 21.0f, 8.4799f, 20.4722f, 6.9999f, 19.4832f)
                    curveTo(5.5198f, 18.4943f, 4.3663f, 17.0887f, 3.6851f, 15.4442f)
                    curveTo(3.0039f, 13.7996f, 2.8257f, 11.99f, 3.1729f, 10.2442f)
                    curveTo(3.5202f, 8.4984f, 4.3774f, 6.8947f, 5.636f, 5.636f)
                    curveTo(6.8947f, 4.3774f, 8.4984f, 3.5202f, 10.2442f, 3.1729f)
                    curveTo(11.99f, 2.8257f, 13.7996f, 3.0039f, 15.4442f, 3.6851f)
                    curveTo(17.0887f, 4.3663f, 18.4943f, 5.5198f, 19.4832f, 6.9999f)
                    curveTo(20.4722f, 8.4799f, 21.0f, 10.22f, 21.0f, 12.0f)
                    curveTo(20.9974f, 14.3861f, 20.0483f, 16.6738f, 18.361f, 18.361f)
                    curveTo(16.6738f, 20.0483f, 14.3861f, 20.9974f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _rec!!
    }

private var _rec: ImageVector? = null
