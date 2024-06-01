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

public val Icons.Bold.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.7492f, 20.6625f)
                    curveTo(7.0679f, 20.6628f, 6.4146f, 20.392f, 5.9332f, 19.9099f)
                    lineTo(0.4431f, 14.4217f)
                    curveTo(-0.1477f, 13.8308f, -0.1477f, 12.8729f, 0.4431f, 12.282f)
                    curveTo(1.034f, 11.6912f, 1.9919f, 11.6912f, 2.5828f, 12.282f)
                    lineTo(7.7492f, 17.4483f)
                    lineTo(21.4172f, 3.7803f)
                    curveTo(22.0081f, 3.1896f, 22.966f, 3.1896f, 23.5569f, 3.7803f)
                    curveTo(24.1477f, 4.3713f, 24.1477f, 5.3292f, 23.5569f, 5.9201f)
                    lineTo(9.5651f, 19.9099f)
                    curveTo(9.0838f, 20.392f, 8.4305f, 20.6628f, 7.7492f, 20.6625f)
                    close()
                }
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
