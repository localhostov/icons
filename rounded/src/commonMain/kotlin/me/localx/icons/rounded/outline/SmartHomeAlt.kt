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

public val Icons.Outline.SmartHomeAlt: ImageVector
    get() {
        if (_smartHomeAlt != null) {
            return _smartHomeAlt!!
        }
        _smartHomeAlt = Builder(name = "SmartHomeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.083f, 6.564f)
                lineTo(15.083f, 1.08f)
                curveToRelative(-1.815f, -1.422f, -4.352f, -1.422f, -6.167f, 0.0f)
                lineTo(1.917f, 6.564f)
                curveToRelative(-1.218f, 0.953f, -1.917f, 2.388f, -1.917f, 3.936f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.548f, -0.699f, -2.982f, -1.917f, -3.936f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.929f, 0.419f, -1.789f, 1.15f, -2.361f)
                lineToRelative(7.0f, -5.484f)
                curveToRelative(0.545f, -0.427f, 1.197f, -0.64f, 1.85f, -0.64f)
                reflectiveCurveToRelative(1.306f, 0.213f, 1.85f, 0.64f)
                lineToRelative(7.0f, 5.484f)
                curveToRelative(0.731f, 0.572f, 1.15f, 1.433f, 1.15f, 2.361f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(16.771f, 10.396f)
                curveToRelative(1.796f, 2.376f, 1.569f, 5.749f, -0.528f, 7.846f)
                curveToRelative(-1.133f, 1.134f, -2.64f, 1.758f, -4.243f, 1.758f)
                reflectiveCurveToRelative(-3.109f, -0.624f, -4.243f, -1.758f)
                curveToRelative(-2.097f, -2.097f, -2.324f, -5.47f, -0.528f, -7.846f)
                curveToRelative(0.333f, -0.44f, 0.959f, -0.529f, 1.401f, -0.194f)
                curveToRelative(0.44f, 0.333f, 0.528f, 0.96f, 0.195f, 1.401f)
                curveToRelative(-1.198f, 1.583f, -1.048f, 3.83f, 0.347f, 5.225f)
                curveToRelative(1.512f, 1.512f, 4.146f, 1.512f, 5.657f, 0.0f)
                curveToRelative(1.395f, -1.395f, 1.544f, -3.642f, 0.347f, -5.225f)
                curveToRelative(-0.333f, -0.441f, -0.246f, -1.068f, 0.195f, -1.401f)
                curveToRelative(0.441f, -0.335f, 1.067f, -0.246f, 1.401f, 0.194f)
                close()
            }
        }
        .build()
        return _smartHomeAlt!!
    }

private var _smartHomeAlt: ImageVector? = null
