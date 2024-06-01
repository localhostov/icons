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

public val Icons.Filled.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 3.0229f)
                    curveTo(24.0012f, 3.4201f, 23.9236f, 3.8137f, 23.7715f, 4.1807f)
                    curveTo(23.6194f, 4.5477f, 23.3959f, 4.8809f, 23.114f, 5.1609f)
                    lineTo(19.707f, 8.5678f)
                    curveTo(19.0644f, 9.2043f, 18.697f, 10.0675f, 18.6837f, 10.9718f)
                    curveTo(18.6704f, 11.8762f, 19.0123f, 12.7497f, 19.636f, 13.4048f)
                    lineTo(18.2f, 14.7998f)
                    lineTo(9.2f, 5.7998f)
                    lineTo(10.6f, 4.3639f)
                    curveTo(11.2552f, 4.9873f, 12.1287f, 5.329f, 13.033f, 5.3157f)
                    curveTo(13.9373f, 5.3025f, 14.8004f, 4.9352f, 15.437f, 4.2929f)
                    lineTo(18.839f, 0.8859f)
                    curveTo(19.4147f, 0.3355f, 20.1805f, 0.0283f, 20.977f, 0.0283f)
                    curveTo(21.7735f, 0.0283f, 22.5393f, 0.3355f, 23.115f, 0.8859f)
                    curveTo(23.3966f, 1.1658f, 23.6198f, 1.4988f, 23.7717f, 1.8656f)
                    curveTo(23.9237f, 2.2325f, 24.0012f, 2.6258f, 24.0f, 3.0229f)
                    close()
                    moveTo(1.913f, 17.6808f)
                    curveTo(1.4502f, 18.1383f, 1.1445f, 18.7308f, 1.0399f, 19.373f)
                    curveTo(0.9353f, 20.0153f, 1.0372f, 20.6742f, 1.331f, 21.2548f)
                    lineTo(0.0f, 22.5858f)
                    lineTo(1.414f, 23.9998f)
                    lineTo(2.745f, 22.6688f)
                    curveTo(3.3256f, 22.9626f, 3.9845f, 23.0645f, 4.6268f, 22.9599f)
                    curveTo(5.2691f, 22.8553f, 5.8616f, 22.5496f, 6.319f, 22.0868f)
                    lineTo(14.368f, 14.0378f)
                    lineTo(9.962f, 9.6318f)
                    lineTo(1.913f, 17.6808f)
                    close()
                }
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
