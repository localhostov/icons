package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.CupStrawSwoosh: ImageVector
    get() {
        if (_cupStrawSwoosh != null) {
            return _cupStrawSwoosh!!
        }
        _cupStrawSwoosh = Builder(name = "CupStrawSwoosh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.478f, 14.712f)
                lineToRelative(-0.576f, 4.874f)
                curveToRelative(-0.296f, 2.516f, -2.431f, 4.414f, -4.965f, 4.414f)
                horizontalLineToRelative(-5.875f)
                curveToRelative(-2.534f, 0.0f, -4.668f, -1.897f, -4.966f, -4.414f)
                lineToRelative(-0.45f, -3.812f)
                curveToRelative(0.881f, -0.55f, 3.194f, -1.774f, 4.903f, -1.774f)
                curveToRelative(1.039f, 0.0f, 2.149f, 0.45f, 3.325f, 0.927f)
                curveToRelative(1.301f, 0.528f, 2.647f, 1.073f, 4.076f, 1.073f)
                curveToRelative(1.573f, 0.0f, 3.311f, -0.688f, 4.528f, -1.288f)
                close()
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-7.494f)
                lineToRelative(0.266f, -2.124f)
                curveToRelative(0.062f, -0.5f, 0.489f, -0.876f, 0.993f, -0.876f)
                horizontalLineToRelative(3.235f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.235f)
                curveToRelative(-1.509f, 0.0f, -2.79f, 1.129f, -2.977f, 2.627f)
                lineToRelative(-0.297f, 2.373f)
                lineTo(2.0f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.611f)
                lineToRelative(0.781f, 6.614f)
                curveToRelative(1.183f, -0.641f, 3.287f, -1.614f, 5.158f, -1.614f)
                curveToRelative(1.428f, 0.0f, 2.774f, 0.545f, 4.076f, 1.073f)
                curveToRelative(1.176f, 0.477f, 2.286f, 0.927f, 3.325f, 0.927f)
                curveToRelative(1.655f, 0.0f, 3.877f, -1.147f, 4.815f, -1.719f)
                lineToRelative(0.624f, -5.281f)
                horizontalLineToRelative(0.611f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cupStrawSwoosh!!
    }

private var _cupStrawSwoosh: ImageVector? = null
