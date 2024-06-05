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

public val Icons.Bold.ArrowProgress: ImageVector
    get() {
        if (_arrowProgress != null) {
            return _arrowProgress!!
        }
        _arrowProgress = Builder(name = "ArrowProgress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 19.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(21.5f, 17.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21.5f, 7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.145f, 14.144f)
                curveToRelative(0.257f, 0.541f, 0.795f, 0.857f, 1.356f, 0.857f)
                curveToRelative(0.216f, 0.0f, 0.435f, -0.047f, 0.643f, -0.146f)
                curveToRelative(0.748f, -0.355f, 1.067f, -1.25f, 0.711f, -1.999f)
                curveToRelative(-0.824f, -1.735f, -2.597f, -2.856f, -4.518f, -2.856f)
                lineTo(5.0f, 10.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.538f)
                curveToRelative(0.0f, 0.856f, 1.043f, 1.284f, 1.653f, 0.679f)
                lineToRelative(3.063f, -3.038f)
                curveToRelative(0.378f, -0.375f, 0.378f, -0.983f, 0.0f, -1.358f)
                lineToRelative(-3.063f, -3.038f)
                curveToRelative(-0.61f, -0.605f, -1.653f, -0.176f, -1.653f, 0.679f)
                verticalLineToRelative(1.538f)
                horizontalLineToRelative(-7.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(13.337f)
                curveToRelative(0.769f, 0.0f, 1.479f, 0.449f, 1.808f, 1.144f)
                close()
                moveTo(13.653f, 15.784f)
                curveToRelative(-0.61f, -0.605f, -1.653f, -0.176f, -1.653f, 0.679f)
                verticalLineToRelative(1.538f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.538f)
                curveToRelative(0.0f, 0.856f, 1.043f, 1.284f, 1.653f, 0.679f)
                lineToRelative(3.063f, -3.038f)
                curveToRelative(0.378f, -0.375f, 0.378f, -0.983f, 0.0f, -1.358f)
                lineToRelative(-3.063f, -3.038f)
                close()
            }
        }
        .build()
        return _arrowProgress!!
    }

private var _arrowProgress: ImageVector? = null
