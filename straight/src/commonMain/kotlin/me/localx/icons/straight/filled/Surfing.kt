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

public val Icons.Filled.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.124f, 0.8754f)
                    curveTo(22.8135f, 0.562f, 22.4368f, 0.3221f, 22.0215f, 0.1731f)
                    curveTo(21.6063f, 0.0241f, 21.1629f, -0.0301f, 20.724f, 0.0144f)
                    curveTo(18.452f, 0.2354f, 12.71f, 1.2145f, 8.461f, 5.4605f)
                    curveTo(4.7734f, 9.1473f, 1.9627f, 13.6167f, 0.237f, 18.5374f)
                    lineTo(0.0f, 19.1454f)
                    lineTo(1.72f, 20.8654f)
                    lineTo(15.586f, 6.9995f)
                    lineTo(17.0f, 8.4135f)
                    lineTo(3.134f, 22.2794f)
                    lineTo(4.854f, 23.9995f)
                    lineTo(5.463f, 23.7614f)
                    curveTo(10.3834f, 22.0363f, 14.8525f, 19.2258f, 18.539f, 15.5384f)
                    curveTo(22.787f, 11.2904f, 23.764f, 5.5475f, 23.985f, 3.2754f)
                    curveTo(24.0286f, 2.8366f, 23.974f, 2.3935f, 23.8251f, 1.9784f)
                    curveTo(23.6761f, 1.5633f, 23.4367f, 1.1865f, 23.124f, 0.8754f)
                    close()
                }
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
