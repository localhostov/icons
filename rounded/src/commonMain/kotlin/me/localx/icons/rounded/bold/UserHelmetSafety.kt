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

public val Icons.Bold.UserHelmetSafety: ImageVector
    get() {
        if (_userHelmetSafety != null) {
            return _userHelmetSafety!!
        }
        _userHelmetSafety = Builder(name = "UserHelmetSafety", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.712f, 23.985f)
                curveToRelative(-0.072f, 0.01f, -0.143f, 0.015f, -0.214f, 0.015f)
                curveToRelative(-0.734f, 0.0f, -1.376f, -0.54f, -1.483f, -1.288f)
                curveToRelative(-0.396f, -2.774f, -2.87f, -4.712f, -6.015f, -4.712f)
                reflectiveCurveToRelative(-5.619f, 1.938f, -6.015f, 4.712f)
                curveToRelative(-0.117f, 0.821f, -0.878f, 1.392f, -1.697f, 1.273f)
                curveToRelative(-0.82f, -0.117f, -1.39f, -0.877f, -1.273f, -1.697f)
                curveToRelative(0.613f, -4.291f, 4.308f, -7.288f, 8.985f, -7.288f)
                reflectiveCurveToRelative(8.372f, 2.997f, 8.985f, 7.288f)
                curveToRelative(0.117f, 0.82f, -0.453f, 1.58f, -1.273f, 1.697f)
                close()
                moveTo(4.0f, 6.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveTo(6.0f, 2.407f, 7.973f, 0.276f, 10.5f, 0.025f)
                verticalLineToRelative(2.475f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(13.5f, 0.025f)
                curveToRelative(2.527f, 0.251f, 4.5f, 2.382f, 4.5f, 4.975f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _userHelmetSafety!!
    }

private var _userHelmetSafety: ImageVector? = null
