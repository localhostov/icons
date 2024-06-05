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

public val Icons.Bold.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 17.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(8.0f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.467f, 3.468f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(20.0f, 5.5f)
                close()
                moveTo(15.515f, 5.137f)
                curveToRelative(-0.455f, -0.329f, -1.095f, 0.089f, -0.967f, 0.637f)
                curveToRelative(0.224f, 0.959f, 0.374f, 2.053f, 0.429f, 3.226f)
                horizontalLineToRelative(-1.993f)
                curveToRelative(-0.086f, -2.554f, -0.494f, -4.487f, -0.983f, -4.487f)
                reflectiveCurveToRelative(-0.897f, 1.933f, -0.983f, 4.487f)
                horizontalLineToRelative(-1.993f)
                curveToRelative(0.055f, -1.173f, 0.205f, -2.268f, 0.429f, -3.226f)
                curveToRelative(0.128f, -0.547f, -0.512f, -0.966f, -0.967f, -0.637f)
                curveToRelative(-1.506f, 1.09f, -2.485f, 2.862f, -2.485f, 4.863f)
                reflectiveCurveToRelative(0.98f, 3.773f, 2.485f, 4.863f)
                curveToRelative(0.455f, 0.329f, 1.095f, -0.09f, 0.967f, -0.637f)
                curveToRelative(-0.224f, -0.958f, -0.374f, -2.053f, -0.429f, -3.226f)
                horizontalLineToRelative(1.992f)
                curveToRelative(0.085f, 2.566f, 0.493f, 4.513f, 0.984f, 4.513f)
                reflectiveCurveToRelative(0.899f, -1.946f, 0.984f, -4.513f)
                horizontalLineToRelative(1.992f)
                curveToRelative(-0.055f, 1.173f, -0.205f, 2.268f, -0.429f, 3.226f)
                curveToRelative(-0.128f, 0.547f, 0.512f, 0.966f, 0.967f, 0.637f)
                curveToRelative(1.506f, -1.09f, 2.485f, -2.862f, 2.485f, -4.863f)
                reflectiveCurveToRelative(-0.98f, -3.773f, -2.485f, -4.863f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
