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

public val Icons.Outline.ErrorCamera: ImageVector
    get() {
        if (_errorCamera != null) {
            return _errorCamera!!
        }
        _errorCamera = Builder(name = "ErrorCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.193f, 10.0f)
                horizontalLineToRelative(5.807f)
                curveToRelative(1.302f, 0.0f, 2.402f, -0.839f, 2.816f, -2.0f)
                horizontalLineToRelative(1.184f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.382f)
                lineToRelative(0.776f, -1.553f)
                curveToRelative(0.155f, -0.31f, 0.138f, -0.678f, -0.044f, -0.973f)
                reflectiveCurveToRelative(-0.504f, -0.475f, -0.851f, -0.475f)
                lineTo(6.0f, -0.001f)
                curveTo(3.794f, 0.0f, 2.0f, 1.794f, 2.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.057f)
                lineToRelative(-1.52f, 4.054f)
                curveToRelative(-0.437f, 1.164f, -1.565f, 1.946f, -2.809f, 1.946f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.728f)
                curveToRelative(2.073f, 0.0f, 3.954f, -1.304f, 4.682f, -3.244f)
                lineToRelative(1.784f, -4.756f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(13.882f)
                lineToRelative(-0.776f, 1.553f)
                curveToRelative(-0.069f, 0.139f, -0.105f, 0.292f, -0.105f, 0.447f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(23.756f, 21.337f)
                lineToRelative(-5.197f, -8.458f)
                curveToRelative(-0.683f, -1.171f, -2.376f, -1.171f, -3.059f, 0.0f)
                lineToRelative(-5.256f, 8.458f)
                curveToRelative(-0.689f, 1.181f, 0.163f, 2.663f, 1.53f, 2.663f)
                horizontalLineToRelative(10.453f)
                curveToRelative(1.367f, 0.0f, 2.218f, -1.483f, 1.53f, -2.663f)
                close()
                moveTo(17.0f, 23.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _errorCamera!!
    }

private var _errorCamera: ImageVector? = null
