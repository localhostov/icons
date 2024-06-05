package me.localx.icons.straight.filled

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

public val Icons.Filled.EmployeeAlt: ImageVector
    get() {
        if (_employeeAlt != null) {
            return _employeeAlt!!
        }
        _employeeAlt = Builder(name = "EmployeeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 14.0f)
                horizontalLineToRelative(5.76f)
                curveToRelative(-0.392f, 0.585f, -0.651f, 1.266f, -0.732f, 2.0f)
                lineToRelative(-0.028f, 8.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.5f, 14.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.469f, 12.001f)
                curveToRelative(-1.841f, 0.012f, -3.568f, 0.707f, -4.895f, 1.87f)
                curveToRelative(0.533f, -2.27f, 1.198f, -5.091f, 1.663f, -7.036f)
                curveToRelative(0.019f, 0.066f, 0.038f, 0.131f, 0.059f, 0.196f)
                curveToRelative(0.243f, 2.101f, 1.454f, 3.91f, 3.174f, 4.971f)
                close()
                moveTo(13.108f, 8.633f)
                curveToRelative(0.079f, 0.335f, 0.355f, 1.494f, 0.643f, 2.709f)
                curveToRelative(0.641f, -0.815f, 1.634f, -1.341f, 2.749f, -1.341f)
                horizontalLineToRelative(0.015f)
                curveToRelative(-0.644f, -2.726f, -1.233f, -5.196f, -1.313f, -5.45f)
                curveToRelative(-0.855f, -2.722f, -3.348f, -4.55f, -6.202f, -4.55f)
                reflectiveCurveTo(3.652f, 1.829f, 2.798f, 4.55f)
                curveToRelative(-0.017f, 0.054f, -0.058f, 0.211f, -0.117f, 0.45f)
                horizontalLineToRelative(2.088f)
                curveToRelative(1.25f, 0.0f, 2.214f, -0.212f, 3.025f, -0.717f)
                curveToRelative(0.858f, -0.535f, 1.508f, -1.312f, 1.879f, -2.233f)
                curveToRelative(0.679f, 0.102f, 1.313f, 0.356f, 1.862f, 0.732f)
                curveToRelative(-0.527f, 1.319f, -1.455f, 2.432f, -2.683f, 3.198f)
                curveToRelative(-1.081f, 0.674f, -2.609f, 1.02f, -3.852f, 1.02f)
                curveToRelative(-0.038f, 0.0f, -0.41f, 0.0f, -0.69f, 0.0f)
                curveToRelative(0.361f, 2.264f, 2.327f, 3.999f, 4.69f, 3.999f)
                curveToRelative(1.751f, 0.0f, 3.284f, -0.953f, 4.108f, -2.368f)
                close()
            }
        }
        .build()
        return _employeeAlt!!
    }

private var _employeeAlt: ImageVector? = null
