package me.localx.icons.rounded.outline

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

public val Icons.Outline.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) {
            return _trafficCone!!
        }
        _trafficCone = Builder(name = "TrafficCone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-0.873f)
                lineTo(14.773f, 1.979f)
                curveTo(14.341f, 0.805f, 13.252f, 0.045f, 12.0f, 0.045f)
                reflectiveCurveToRelative(-2.341f, 0.76f, -2.773f, 1.936f)
                lineTo(1.873f, 22.0f)
                horizontalLineToRelative(-0.873f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.536f)
                curveToRelative(0.024f, 0.0f, 0.048f, 0.0f, 0.072f, 0.0f)
                horizontalLineToRelative(20.392f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(7.676f, 12.0f)
                horizontalLineToRelative(8.647f)
                lineToRelative(1.469f, 4.0f)
                lineTo(6.207f, 16.0f)
                lineToRelative(1.469f, -4.0f)
                close()
                moveTo(11.103f, 2.671f)
                curveToRelative(0.214f, -0.581f, 0.74f, -0.626f, 0.896f, -0.626f)
                reflectiveCurveToRelative(0.683f, 0.045f, 0.896f, 0.625f)
                lineToRelative(2.693f, 7.33f)
                horizontalLineToRelative(-7.178f)
                lineToRelative(2.692f, -7.329f)
                close()
                moveTo(5.472f, 18.0f)
                horizontalLineToRelative(13.056f)
                lineToRelative(1.469f, 4.0f)
                lineTo(4.003f, 22.0f)
                lineToRelative(1.469f, -4.0f)
                close()
            }
        }
        .build()
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
