package me.localx.icons.rounded.bold

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

public val Icons.Bold.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.501f, 21.0f)
                horizontalLineToRelative(-0.454f)
                reflectiveCurveTo(15.159f, 2.249f, 15.159f, 2.249f)
                curveTo(14.667f, 0.91f, 13.427f, 0.045f, 12.0f, 0.045f)
                reflectiveCurveToRelative(-2.667f, 0.865f, -3.159f, 2.204f)
                lineTo(1.957f, 20.988f)
                horizontalLineToRelative(-0.533f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.499f, 0.671f, -1.5f, 1.499f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.499f, 1.501f)
                lineToRelative(21.077f, 0.013f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.828f, 0.0f, 1.499f, -0.671f, 1.5f, -1.499f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.499f, -1.501f)
                close()
                moveTo(8.456f, 12.0f)
                horizontalLineToRelative(7.089f)
                lineToRelative(1.102f, 3.0f)
                lineTo(7.353f, 15.0f)
                lineToRelative(1.102f, -3.0f)
                close()
                moveTo(11.658f, 3.284f)
                curveToRelative(0.115f, -0.318f, 0.57f, -0.318f, 0.686f, 0.0f)
                lineToRelative(2.1f, 5.716f)
                horizontalLineToRelative(-4.885f)
                lineToRelative(2.1f, -5.716f)
                close()
                moveTo(6.252f, 18.0f)
                horizontalLineToRelative(11.497f)
                lineToRelative(1.101f, 2.998f)
                lineToRelative(-13.697f, -0.008f)
                lineToRelative(1.098f, -2.99f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
