package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.AngleDoubleLeft: ImageVector
    get() {
        if (_angleDoubleLeft != null) {
            return _angleDoubleLeft!!
        }
        _angleDoubleLeft = Builder(name = "AngleDoubleLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.1209f, 11.2929f)
                    lineTo(13.0129f, 1.3999f)
                    lineTo(11.5999f, -0.0131f)
                    lineTo(1.7069f, 9.8789f)
                    curveTo(1.1445f, 10.4415f, 0.8286f, 11.2044f, 0.8286f, 11.9999f)
                    curveTo(0.8286f, 12.7954f, 1.1445f, 13.5584f, 1.7069f, 14.1209f)
                    lineTo(11.5919f, 24.0059f)
                    lineTo(13.0059f, 22.5919f)
                    lineTo(3.1219f, 12.7069f)
                    curveTo(2.9343f, 12.5195f, 2.8288f, 12.2653f, 2.8286f, 12.0001f)
                    curveTo(2.8284f, 11.735f, 2.9336f, 11.4806f, 3.1209f, 11.2929f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 1.417f)
                    lineTo(21.583f, 0.0f)
                    lineTo(10.293f, 11.29f)
                    curveTo(10.1056f, 11.4775f, 10.0002f, 11.7318f, 10.0002f, 11.997f)
                    curveTo(10.0002f, 12.2622f, 10.1056f, 12.5165f, 10.293f, 12.704f)
                    lineTo(21.584f, 24.0f)
                    lineTo(23.0f, 22.584f)
                    lineTo(12.414f, 12.0f)
                    lineTo(23.0f, 1.417f)
                    close()
                }
            }
        }
        .build()
        return _angleDoubleLeft!!
    }

private var _angleDoubleLeft: ImageVector? = null
