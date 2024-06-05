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

public val Icons.Outline.UserMd: ImageVector
    get() {
        if (_userMd != null) {
            return _userMd!!
        }
        _userMd = Builder(name = "UserMd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(15.309f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(22.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -2.786f, -1.637f, -5.198f, -4.0f, -6.324f)
                verticalLineToRelative(2.496f)
                curveToRelative(1.164f, 0.413f, 2.0f, 1.524f, 2.0f, 2.828f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-0.327f, -0.047f, -0.661f, -0.072f, -1.0f, -0.072f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.695f, 0.0f, -1.366f, 0.102f, -2.0f, 0.292f)
                verticalLineToRelative(2.977f)
                curveToRelative(0.598f, 0.346f, 1.0f, 0.992f, 1.0f, 1.732f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.74f, 0.402f, -1.386f, 1.0f, -1.732f)
                verticalLineToRelative(-2.009f)
                curveToRelative(-1.812f, 1.267f, -3.0f, 3.368f, -3.0f, 5.741f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.963f, 4.037f, -9.0f, 9.0f, -9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _userMd!!
    }

private var _userMd: ImageVector? = null
