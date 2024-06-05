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

public val Icons.Filled.EmployeeMan: ImageVector
    get() {
        if (_employeeMan != null) {
            return _employeeMan!!
        }
        _employeeMan = Builder(name = "EmployeeMan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.758f, 1.308f, -3.204f, 3.0f, -3.449f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.051f, 2.0f, -2.051f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.948f, 2.0f, 2.051f)
                curveToRelative(1.692f, 0.245f, 3.0f, 1.691f, 3.0f, 3.449f)
                close()
                moveTo(10.0f, 17.5f)
                curveToRelative(0.0f, -1.204f, 0.411f, -2.326f, 1.093f, -3.244f)
                curveToRelative(-0.673f, -0.161f, -1.372f, -0.256f, -2.093f, -0.256f)
                curveTo(4.043f, 14.0f, 0.009f, 18.028f, 0.0f, 22.983f)
                curveToRelative(-0.001f, 0.557f, 0.443f, 1.017f, 1.0f, 1.017f)
                horizontalLineToRelative(10.261f)
                curveToRelative(-0.787f, -0.952f, -1.261f, -2.172f, -1.261f, -3.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _employeeMan!!
    }

private var _employeeMan: ImageVector? = null
