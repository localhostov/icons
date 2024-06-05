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

public val Icons.Filled.UserCrown: ImageVector
    get() {
        if (_userCrown != null) {
            return _userCrown!!
        }
        _userCrown = Builder(name = "UserCrown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-0.29f, 0.0f, -0.565f, -0.126f, -0.755f, -0.345f)
                reflectiveCurveToRelative(-0.275f, -0.51f, -0.234f, -0.797f)
                curveToRelative(0.559f, -3.91f, 3.994f, -6.858f, 7.99f, -6.858f)
                reflectiveCurveToRelative(7.431f, 2.948f, 7.99f, 6.858f)
                curveToRelative(0.041f, 0.287f, -0.044f, 0.578f, -0.234f, 0.797f)
                reflectiveCurveToRelative(-0.465f, 0.345f, -0.755f, 0.345f)
                close()
                moveTo(15.0f, 3.0f)
                lineTo(12.703f, 0.32f)
                curveToRelative(-0.37f, -0.431f, -1.037f, -0.431f, -1.406f, 0.0f)
                lineToRelative(-2.297f, 2.68f)
                lineTo(7.397f, 0.341f)
                curveToRelative(-0.418f, -0.628f, -1.397f, -0.331f, -1.397f, 0.423f)
                verticalLineToRelative(5.236f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 0.764f)
                curveToRelative(0.0f, -0.754f, -0.978f, -1.051f, -1.397f, -0.423f)
                lineToRelative(-1.603f, 2.659f)
                close()
                moveTo(6.0f, 8.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                lineTo(6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _userCrown!!
    }

private var _userCrown: ImageVector? = null
