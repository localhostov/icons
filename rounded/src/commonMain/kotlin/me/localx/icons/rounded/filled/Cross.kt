package me.localx.icons.rounded.filled

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

public val Icons.Filled.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.4139f, 11.9999f)
                    lineTo(23.7069f, 1.7069f)
                    curveTo(23.8891f, 1.5183f, 23.9899f, 1.2657f, 23.9876f, 1.0035f)
                    curveTo(23.9853f, 0.7413f, 23.8801f, 0.4905f, 23.6947f, 0.3051f)
                    curveTo(23.5093f, 0.1197f, 23.2585f, 0.0145f, 22.9963f, 0.0122f)
                    curveTo(22.7341f, 0.01f, 22.4815f, 0.1108f, 22.2929f, 0.2929f)
                    lineTo(11.9999f, 10.5859f)
                    lineTo(1.7069f, 0.2929f)
                    curveTo(1.5183f, 0.1108f, 1.2657f, 0.01f, 1.0035f, 0.0122f)
                    curveTo(0.7413f, 0.0145f, 0.4905f, 0.1197f, 0.3051f, 0.3051f)
                    curveTo(0.1197f, 0.4905f, 0.0145f, 0.7413f, 0.0122f, 1.0035f)
                    curveTo(0.01f, 1.2657f, 0.1107f, 1.5183f, 0.2929f, 1.7069f)
                    lineTo(10.5859f, 11.9999f)
                    lineTo(0.2929f, 22.2929f)
                    curveTo(0.1054f, 22.4804f, 1.0E-4f, 22.7348f, 1.0E-4f, 22.9999f)
                    curveTo(1.0E-4f, 23.2651f, 0.1054f, 23.5194f, 0.2929f, 23.7069f)
                    curveTo(0.4804f, 23.8944f, 0.7347f, 23.9997f, 0.9999f, 23.9997f)
                    curveTo(1.2651f, 23.9997f, 1.5194f, 23.8944f, 1.7069f, 23.7069f)
                    lineTo(11.9999f, 13.4139f)
                    lineTo(22.2929f, 23.7069f)
                    curveTo(22.4804f, 23.8944f, 22.7347f, 23.9997f, 22.9999f, 23.9997f)
                    curveTo(23.2651f, 23.9997f, 23.5194f, 23.8944f, 23.7069f, 23.7069f)
                    curveTo(23.8944f, 23.5194f, 23.9997f, 23.2651f, 23.9997f, 22.9999f)
                    curveTo(23.9997f, 22.7348f, 23.8944f, 22.4804f, 23.7069f, 22.2929f)
                    lineTo(13.4139f, 11.9999f)
                    close()
                }
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
