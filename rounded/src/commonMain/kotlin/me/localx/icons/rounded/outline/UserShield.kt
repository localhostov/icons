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

public val Icons.Outline.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.958f, 15.576f)
                curveToRelative(-0.156f, 0.528f, -0.706f, 0.833f, -1.244f, 0.673f)
                curveToRelative(-0.553f, -0.165f, -1.129f, -0.249f, -1.714f, -0.249f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.778f, 0.0f, 1.548f, 0.112f, 2.286f, 0.332f)
                curveToRelative(0.529f, 0.158f, 0.83f, 0.715f, 0.672f, 1.244f)
                close()
                moveTo(24.0f, 14.436f)
                verticalLineToRelative(3.085f)
                curveToRelative(0.0f, 4.032f, -3.973f, 5.942f, -5.126f, 6.406f)
                curveToRelative(-0.12f, 0.048f, -0.247f, 0.072f, -0.373f, 0.072f)
                curveToRelative(-0.153f, 0.0f, -0.307f, -0.035f, -0.463f, -0.113f)
                curveToRelative(-1.123f, -0.562f, -5.038f, -2.796f, -5.038f, -6.365f)
                verticalLineToRelative(-3.085f)
                curveToRelative(0.0f, -1.295f, 0.826f, -2.439f, 2.055f, -2.848f)
                lineToRelative(3.131f, -1.038f)
                curveToRelative(0.203f, -0.067f, 0.426f, -0.067f, 0.629f, 0.0f)
                lineToRelative(3.13f, 1.038f)
                curveToRelative(1.229f, 0.408f, 2.056f, 1.553f, 2.056f, 2.848f)
                close()
                moveTo(22.0f, 14.436f)
                curveToRelative(0.0f, -0.432f, -0.275f, -0.813f, -0.686f, -0.949f)
                lineToRelative(-2.814f, -0.933f)
                lineToRelative(-2.815f, 0.933f)
                curveToRelative(-0.409f, 0.136f, -0.685f, 0.518f, -0.685f, 0.949f)
                verticalLineToRelative(3.085f)
                curveToRelative(0.0f, 2.28f, 2.63f, 3.888f, 3.545f, 4.379f)
                curveToRelative(1.031f, -0.454f, 3.455f, -1.796f, 3.455f, -4.379f)
                verticalLineToRelative(-3.085f)
                close()
                moveTo(14.0f, 6.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
