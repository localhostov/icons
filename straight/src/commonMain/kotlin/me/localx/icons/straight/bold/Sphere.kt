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
                    moveTo(3.044f, 12.0f)
                    curveTo(3.562f, 11.355f, 6.616f, 10.0f, 12.0f, 10.0f)
                    curveTo(17.384f, 10.0f, 20.437f, 11.355f, 20.956f, 12.0f)
                    curveTo(20.437f, 12.645f, 17.384f, 14.0f, 12.0f, 14.0f)
                    curveTo(6.616f, 14.0f, 3.562f, 12.645f, 3.044f, 12.0f)
                    close()
                    moveTo(12.0f, 3.0f)
                    curveTo(13.7061f, 3.0024f, 15.3764f, 3.4896f, 16.8162f, 4.405f)
                    curveTo(18.256f, 5.3203f, 19.406f, 6.6261f, 20.132f, 8.17f)
                    curveTo(17.5023f, 7.3435f, 14.7561f, 6.9484f, 12.0f, 7.0f)
                    curveTo(9.2439f, 6.9484f, 6.4977f, 7.3435f, 3.868f, 8.17f)
                    curveTo(4.5941f, 6.6261f, 5.744f, 5.3203f, 7.1838f, 4.405f)
                    curveTo(8.6236f, 3.4896f, 10.2939f, 3.0024f, 12.0f, 3.0f)
                    close()
                    moveTo(12.0f, 21.0f)
                    curveTo(10.2939f, 20.9977f, 8.6236f, 20.5104f, 7.1838f, 19.595f)
                    curveTo(5.744f, 18.6797f, 4.5941f, 17.3739f, 3.868f, 15.83f)
                    curveTo(6.4977f, 16.6565f, 9.2439f, 17.0516f, 12.0f, 17.0f)
                    curveTo(14.7561f, 17.0516f, 17.5023f, 16.6565f, 20.132f, 15.83f)
                    curveTo(19.406f, 17.3739f, 18.256f, 18.6797f, 16.8162f, 19.595f)
                    curveTo(15.3764f, 20.5104f, 13.7061f, 20.9977f, 12.0f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
