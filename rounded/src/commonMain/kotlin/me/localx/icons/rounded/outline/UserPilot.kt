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

public val Icons.Outline.UserPilot: ImageVector
    get() {
        if (_userPilot != null) {
            return _userPilot!!
        }
        _userPilot = Builder(name = "UserPilot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.208f, 5.604f)
                lineToRelative(0.792f, 0.396f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.793f, -0.396f, 0.793f, -0.396f)
                curveToRelative(0.74f, -0.37f, 1.207f, -1.126f, 1.207f, -1.954f)
                curveToRelative(0.0f, -0.976f, -0.648f, -1.834f, -1.587f, -2.101f)
                lineTo(13.698f, 0.209f)
                curveToRelative(-1.115f, -0.279f, -2.281f, -0.279f, -3.396f, 0.0f)
                lineToRelative(-4.715f, 1.34f)
                curveToRelative(-0.939f, 0.267f, -1.587f, 1.125f, -1.587f, 2.101f)
                curveToRelative(0.0f, 0.827f, 0.467f, 1.584f, 1.207f, 1.954f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-0.391f)
                curveToRelative(0.978f, 0.208f, 2.296f, 0.391f, 4.0f, 0.391f)
                reflectiveCurveToRelative(3.022f, -0.183f, 4.0f, -0.391f)
                verticalLineToRelative(0.391f)
                close()
                moveTo(9.5f, 3.5f)
                curveToRelative(0.284f, -0.473f, 0.898f, -0.627f, 1.372f, -0.343f)
                lineToRelative(1.128f, 0.677f)
                lineToRelative(1.128f, -0.677f)
                curveToRelative(0.474f, -0.284f, 1.088f, -0.131f, 1.372f, 0.343f)
                curveToRelative(0.284f, 0.474f, 0.131f, 1.088f, -0.343f, 1.372f)
                lineToRelative(-1.643f, 0.985f)
                curveToRelative(-0.317f, 0.19f, -0.712f, 0.19f, -1.029f, 0.0f)
                lineToRelative(-1.643f, -0.985f)
                curveToRelative(-0.474f, -0.284f, -0.627f, -0.899f, -0.343f, -1.372f)
                close()
                moveTo(20.992f, 22.876f)
                curveToRelative(0.068f, 0.548f, -0.32f, 1.048f, -0.868f, 1.116f)
                curveToRelative(-0.042f, 0.005f, -0.084f, 0.008f, -0.125f, 0.008f)
                curveToRelative(-0.497f, 0.0f, -0.928f, -0.37f, -0.991f, -0.876f)
                curveToRelative(-0.416f, -3.327f, -2.78f, -5.656f, -6.008f, -6.056f)
                verticalLineToRelative(5.932f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.932f)
                curveToRelative(-3.227f, 0.4f, -5.592f, 2.729f, -6.008f, 6.056f)
                curveToRelative(-0.068f, 0.548f, -0.577f, 0.928f, -1.116f, 0.868f)
                curveToRelative(-0.548f, -0.068f, -0.937f, -0.568f, -0.868f, -1.116f)
                curveToRelative(0.58f, -4.638f, 4.277f, -7.876f, 8.992f, -7.876f)
                reflectiveCurveToRelative(8.413f, 3.238f, 8.992f, 7.876f)
                close()
            }
        }
        .build()
        return _userPilot!!
    }

private var _userPilot: ImageVector? = null
