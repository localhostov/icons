package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.RampLoading: ImageVector
    get() {
        if (_rampLoading != null) {
            return _rampLoading!!
        }
        _rampLoading = Builder(name = "RampLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.64f, 19.096f)
                lineToRelative(-3.548f, -7.096f)
                lineTo(5.908f, 12.0f)
                lineToRelative(-3.548f, 7.096f)
                curveToRelative(-0.529f, 1.058f, -0.474f, 2.291f, 0.148f, 3.297f)
                reflectiveCurveToRelative(1.699f, 1.607f, 2.883f, 1.607f)
                horizontalLineToRelative(13.217f)
                curveToRelative(1.184f, 0.0f, 2.261f, -0.601f, 2.883f, -1.607f)
                reflectiveCurveToRelative(0.678f, -2.239f, 0.148f, -3.297f)
                close()
                moveTo(18.94f, 20.816f)
                curveToRelative(-0.052f, 0.084f, -0.151f, 0.185f, -0.331f, 0.185f)
                lineTo(5.392f, 21.001f)
                curveToRelative(-0.18f, 0.0f, -0.279f, -0.1f, -0.331f, -0.185f)
                curveToRelative(-0.052f, -0.084f, -0.097f, -0.218f, -0.017f, -0.378f)
                lineToRelative(2.718f, -5.438f)
                horizontalLineToRelative(8.477f)
                lineToRelative(2.718f, 5.438f)
                curveToRelative(0.08f, 0.16f, 0.035f, 0.294f, -0.017f, 0.378f)
                close()
                moveTo(5.0f, 9.484f)
                lineToRelative(-3.0f, 5.905f)
                lineTo(2.0f, 3.5f)
                curveTo(2.0f, 1.57f, 3.57f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(22.0f, 15.389f)
                lineToRelative(-3.0f, -5.905f)
                lineTo(19.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(5.984f)
                close()
            }
        }
        .build()
        return _rampLoading!!
    }

private var _rampLoading: ImageVector? = null
