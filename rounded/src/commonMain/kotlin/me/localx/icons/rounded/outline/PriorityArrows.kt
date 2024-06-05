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

public val Icons.Outline.PriorityArrows: ImageVector
    get() {
        if (_priorityArrows != null) {
            return _priorityArrows!!
        }
        _priorityArrows = Builder(name = "PriorityArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(11.5f, 11.051f)
                curveToRelative(-0.268f, 0.0f, -0.534f, -0.106f, -0.73f, -0.317f)
                lineToRelative(-1.77f, -1.894f)
                verticalLineToRelative(8.161f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-8.207f)
                lineToRelative(-1.914f, 1.914f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.561f, -2.561f)
                curveToRelative(0.467f, -0.467f, 1.268f, -0.732f, 1.768f, -0.732f)
                reflectiveCurveToRelative(1.3f, 0.265f, 1.768f, 0.732f)
                lineToRelative(2.463f, 2.636f)
                curveToRelative(0.377f, 0.403f, 0.355f, 1.036f, -0.048f, 1.414f)
                curveToRelative(-0.192f, 0.18f, -0.438f, 0.269f, -0.683f, 0.269f)
                close()
                moveTo(20.328f, 13.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.561f, 2.561f)
                curveToRelative(-0.467f, 0.467f, -1.268f, 0.732f, -1.768f, 0.732f)
                reflectiveCurveToRelative(-1.3f, -0.265f, -1.768f, -0.732f)
                lineToRelative(-2.561f, -2.561f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.914f, 1.914f)
                lineTo(14.998f, 7.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.207f)
                lineToRelative(1.914f, -1.914f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _priorityArrows!!
    }

private var _priorityArrows: ImageVector? = null
