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

public val Icons.Bold.WorkflowAlt: ImageVector
    get() {
        if (_workflowAlt != null) {
            return _workflowAlt!!
        }
        _workflowAlt = Builder(name = "WorkflowAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 14.255f)
                verticalLineToRelative(-3.634f)
                lineToRelative(4.5f, -4.621f)
                lineTo(18.0f, 0.0f)
                lineToRelative(-4.121f, 4.0f)
                horizontalLineToRelative(-3.98f)
                curveTo(9.434f, 1.721f, 7.414f, 0.0f, 5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.244f, 0.0f, 5.0f)
                curveToRelative(0.0f, 2.045f, 1.237f, 3.802f, 3.0f, 4.576f)
                verticalLineToRelative(5.423f)
                lineTo(0.0f, 14.999f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.101f)
                curveToRelative(1.607f, -0.328f, 2.932f, -1.431f, 3.576f, -2.899f)
                horizontalLineToRelative(3.303f)
                lineToRelative(3.621f, 3.621f)
                verticalLineToRelative(3.634f)
                curveToRelative(-2.021f, 0.642f, -3.5f, 2.514f, -3.5f, 4.745f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                curveToRelative(0.0f, -2.231f, -1.479f, -4.103f, -3.5f, -4.745f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(18.0f, 4.121f)
                lineToRelative(1.879f, 1.879f)
                lineToRelative(-1.879f, 1.879f)
                lineToRelative(-1.879f, -1.879f)
                lineToRelative(1.879f, -1.879f)
                close()
                moveTo(18.0f, 20.999f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _workflowAlt!!
    }

private var _workflowAlt: ImageVector? = null
