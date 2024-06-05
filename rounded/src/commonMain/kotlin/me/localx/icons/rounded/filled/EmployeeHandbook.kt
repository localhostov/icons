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

public val Icons.Filled.EmployeeHandbook: ImageVector
    get() {
        if (_employeeHandbook != null) {
            return _employeeHandbook!!
        }
        _employeeHandbook = Builder(name = "EmployeeHandbook", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.204f, 2.162f)
                curveToRelative(-1.141f, -0.953f, -2.629f, -1.348f, -4.157f, -1.069f)
                lineToRelative(-1.764f, 0.432f)
                curveToRelative(-1.902f, 0.347f, -3.283f, 2.002f, -3.283f, 3.936f)
                verticalLineToRelative(15.467f)
                curveToRelative(-0.664f, 0.097f, -1.336f, 0.097f, -2.0f, 0.0f)
                lineTo(11.0f, 5.461f)
                curveToRelative(0.0f, -1.934f, -1.381f, -3.589f, -3.226f, -3.923f)
                lineToRelative(-1.88f, -0.457f)
                curveToRelative(-1.464f, -0.263f, -2.956f, 0.128f, -4.099f, 1.081f)
                curveToRelative(-1.142f, 0.953f, -1.796f, 2.352f, -1.796f, 3.838f)
                verticalLineToRelative(10.792f)
                curveToRelative(0.0f, 2.417f, 1.727f, 4.486f, 4.105f, 4.919f)
                lineToRelative(6.285f, 1.143f)
                curveToRelative(0.534f, 0.097f, 1.071f, 0.146f, 1.609f, 0.146f)
                reflectiveCurveToRelative(1.075f, -0.048f, 1.609f, -0.146f)
                lineToRelative(6.285f, -1.143f)
                curveToRelative(2.379f, -0.433f, 4.105f, -2.502f, 4.105f, -4.919f)
                lineTo(23.997f, 6.0f)
                curveToRelative(0.0f, -1.487f, -0.654f, -2.886f, -1.796f, -3.838f)
                close()
                moveTo(4.5f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(5.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _employeeHandbook!!
    }

private var _employeeHandbook: ImageVector? = null
