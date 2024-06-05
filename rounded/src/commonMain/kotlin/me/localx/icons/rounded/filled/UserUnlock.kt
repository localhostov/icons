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

public val Icons.Filled.UserUnlock: ImageVector
    get() {
        if (_userUnlock != null) {
            return _userUnlock!!
        }
        _userUnlock = Builder(name = "UserUnlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.568f, 0.0f, 1.111f, 0.243f, 1.492f, 0.667f)
                curveToRelative(0.368f, 0.411f, 1.0f, 0.445f, 1.412f, 0.077f)
                curveToRelative(0.411f, -0.369f, 0.445f, -1.001f, 0.076f, -1.412f)
                curveToRelative(-0.759f, -0.847f, -1.845f, -1.332f, -2.98f, -1.332f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.537f)
                curveToRelative(-1.195f, 0.693f, -2.0f, 1.986f, -2.0f, 3.463f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(18.0f, 20.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.0f, 20.0f)
                curveToRelative(0.0f, 1.535f, 0.58f, 2.938f, 1.532f, 4.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-0.729f)
                curveToRelative(0.0f, -4.115f, 2.993f, -7.76f, 7.083f, -8.219f)
                curveToRelative(0.96f, -0.108f, 1.891f, -0.044f, 2.766f, 0.164f)
                curveToRelative(0.616f, 0.146f, 0.887f, 0.839f, 0.637f, 1.42f)
                curveToRelative(-0.312f, 0.726f, -0.486f, 1.525f, -0.486f, 2.364f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _userUnlock!!
    }

private var _userUnlock: ImageVector? = null
