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

public val Icons.Bold.UserCrown: ImageVector
    get() {
        if (_userCrown != null) {
            return _userCrown!!
        }
        _userCrown = Builder(name = "UserCrown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.854f, 23.958f)
                curveToRelative(-0.119f, 0.028f, -0.238f, 0.042f, -0.354f, 0.042f)
                curveToRelative(-0.676f, 0.0f, -1.29f, -0.46f, -1.457f, -1.146f)
                curveToRelative(-0.551f, -2.269f, -2.625f, -3.854f, -5.042f, -3.854f)
                reflectiveCurveToRelative(-4.492f, 1.585f, -5.042f, 3.854f)
                curveToRelative(-0.195f, 0.805f, -1.003f, 1.298f, -1.811f, 1.104f)
                curveToRelative(-0.805f, -0.195f, -1.299f, -1.007f, -1.104f, -1.812f)
                curveToRelative(0.878f, -3.619f, 4.15f, -6.146f, 7.958f, -6.146f)
                reflectiveCurveToRelative(7.08f, 2.527f, 7.958f, 6.146f)
                curveToRelative(0.195f, 0.805f, -0.299f, 1.616f, -1.104f, 1.812f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(6.0f, 0.764f)
                curveToRelative(0.0f, -0.754f, 0.978f, -1.051f, 1.397f, -0.423f)
                lineToRelative(1.603f, 2.659f)
                lineTo(11.297f, 0.32f)
                curveToRelative(0.37f, -0.431f, 1.037f, -0.431f, 1.406f, 0.0f)
                lineToRelative(2.297f, 2.68f)
                lineToRelative(1.603f, -2.659f)
                curveToRelative(0.419f, -0.628f, 1.397f, -0.331f, 1.397f, 0.423f)
                verticalLineToRelative(7.236f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(9.0f, 7.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _userCrown!!
    }

private var _userCrown: ImageVector? = null
