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

public val Icons.Bold.AngleLeft: ImageVector
    get() {
        if (_angleLeft != null) {
            return _angleLeft!!
        }
        _angleLeft = Builder(name = "AngleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0411f, 24.0f)
                    lineTo(6.5341f, 14.48f)
                    curveTo(5.8799f, 13.8228f, 5.5127f, 12.9333f, 5.5127f, 12.006f)
                    curveTo(5.5127f, 11.0787f, 5.8799f, 10.1892f, 6.5341f, 9.532f)
                    lineTo(16.0521f, 0.0f)
                    lineTo(18.1701f, 2.121f)
                    lineTo(8.6521f, 11.652f)
                    curveTo(8.5583f, 11.7458f, 8.5057f, 11.8729f, 8.5057f, 12.0055f)
                    curveTo(8.5057f, 12.1381f, 8.5583f, 12.2652f, 8.6521f, 12.359f)
                    lineTo(18.1581f, 21.879f)
                    lineTo(16.0411f, 24.0f)
                    close()
                }
            }
        }
        .build()
        return _angleLeft!!
    }

private var _angleLeft: ImageVector? = null
