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

public val Icons.Filled.UserKey: ImageVector
    get() {
        if (_userKey != null) {
            return _userKey!!
        }
        _userKey = Builder(name = "UserKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(19.309f, 10.009f)
                curveToRelative(-2.089f, -0.127f, -3.932f, 1.166f, -4.845f, 3.049f)
                curveToRelative(-0.643f, 1.327f, -0.537f, 2.507f, -0.171f, 3.565f)
                curveToRelative(0.0f, 0.0f, -0.293f, 0.376f, -0.293f, 0.876f)
                curveToRelative(0.0f, 1.0f, -0.022f, 1.5f, -0.022f, 1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.978f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.776f)
                curveToRelative(0.53f, 0.0f, 1.039f, -0.211f, 1.414f, -0.586f)
                lineToRelative(3.827f, -3.827f)
                curveToRelative(0.948f, 0.411f, 2.044f, 0.544f, 3.193f, 0.267f)
                curveToRelative(1.885f, -0.454f, 3.373f, -2.035f, 3.71f, -3.945f)
                curveToRelative(0.538f, -3.055f, -1.7f, -5.723f, -4.611f, -5.9f)
                close()
                moveTo(20.0f, 15.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 23.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.343f, 0.887f, -2.482f, 2.105f, -2.863f)
                curveToRelative(0.279f, -0.929f, 0.998f, -1.669f, 1.912f, -1.979f)
                curveToRelative(0.027f, -0.259f, 0.082f, -0.496f, 0.15f, -0.707f)
                curveToRelative(-0.102f, -0.457f, -0.14f, -0.908f, -0.146f, -1.356f)
                curveToRelative(-1.183f, -0.692f, -2.554f, -1.095f, -4.021f, -1.095f)
                curveTo(3.589f, 14.0f, 0.0f, 17.589f, 0.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.184f)
                curveToRelative(-0.112f, -0.314f, -0.184f, -0.648f, -0.184f, -1.0f)
                close()
            }
        }
        .build()
        return _userKey!!
    }

private var _userKey: ImageVector? = null
