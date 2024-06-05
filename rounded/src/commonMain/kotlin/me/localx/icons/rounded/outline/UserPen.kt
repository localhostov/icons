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

public val Icons.Outline.UserPen: ImageVector
    get() {
        if (_userPen != null) {
            return _userPen!!
        }
        _userPen = Builder(name = "UserPen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(10.75f, 16.22f)
                curveToRelative(-0.568f, -0.146f, -1.157f, -0.22f, -1.75f, -0.22f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.962f, 4.038f, -9.0f, 9.0f, -9.0f)
                curveToRelative(0.762f, 0.0f, 1.519f, 0.095f, 2.25f, 0.284f)
                curveToRelative(0.535f, 0.138f, 0.856f, 0.683f, 0.719f, 1.218f)
                curveToRelative(-0.137f, 0.535f, -0.68f, 0.856f, -1.218f, 0.719f)
                close()
                moveTo(23.121f, 11.879f)
                curveToRelative(-1.134f, -1.134f, -3.11f, -1.134f, -4.243f, 0.0f)
                lineToRelative(-6.707f, 6.707f)
                curveToRelative(-0.755f, 0.755f, -1.172f, 1.76f, -1.172f, 2.829f)
                verticalLineToRelative(1.586f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.586f)
                curveToRelative(1.069f, 0.0f, 2.073f, -0.417f, 2.828f, -1.172f)
                lineToRelative(6.707f, -6.707f)
                curveToRelative(0.567f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.878f, -2.121f)
                close()
                moveTo(21.706f, 14.707f)
                lineToRelative(-6.708f, 6.707f)
                curveToRelative(-0.377f, 0.378f, -0.879f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.586f)
                verticalLineToRelative(-0.586f)
                curveToRelative(0.0f, -0.534f, 0.208f, -1.036f, 0.586f, -1.414f)
                lineToRelative(6.708f, -6.707f)
                curveToRelative(0.377f, -0.378f, 1.036f, -0.378f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
            }
        }
        .build()
        return _userPen!!
    }

private var _userPen: ImageVector? = null
