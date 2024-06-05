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

public val Icons.Filled.StarRatingCall: ImageVector
    get() {
        if (_starRatingCall != null) {
            return _starRatingCall!!
        }
        _starRatingCall = Builder(name = "StarRatingCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.286f, 9.703f)
                curveToRelative(-0.176f, 0.0f, -0.352f, -0.056f, -0.5f, -0.166f)
                curveToRelative(-0.283f, -0.212f, -0.401f, -0.58f, -0.295f, -0.917f)
                lineToRelative(0.784f, -2.513f)
                lineToRelative(-1.981f, -1.612f)
                curveToRelative(-0.267f, -0.226f, -0.364f, -0.594f, -0.243f, -0.922f)
                curveToRelative(0.12f, -0.328f, 0.433f, -0.546f, 0.782f, -0.546f)
                horizontalLineToRelative(2.501f)
                lineToRelative(0.885f, -2.483f)
                curveToRelative(0.121f, -0.326f, 0.433f, -0.542f, 0.781f, -0.542f)
                reflectiveCurveToRelative(0.66f, 0.216f, 0.781f, 0.542f)
                lineToRelative(0.885f, 2.483f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.35f, 0.0f, 0.663f, 0.219f, 0.783f, 0.548f)
                reflectiveCurveToRelative(0.022f, 0.698f, -0.246f, 0.923f)
                lineToRelative(-1.971f, 1.606f)
                lineToRelative(0.815f, 2.484f)
                curveToRelative(0.111f, 0.336f, -0.002f, 0.706f, -0.282f, 0.922f)
                curveToRelative(-0.281f, 0.216f, -0.667f, 0.231f, -0.964f, 0.038f)
                lineToRelative(-2.295f, -1.495f)
                lineToRelative(-2.257f, 1.51f)
                curveToRelative(-0.14f, 0.094f, -0.302f, 0.141f, -0.463f, 0.141f)
                close()
                moveTo(20.656f, 14.856f)
                curveToRelative(-1.193f, -1.142f, -3.09f, -1.138f, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                curveToRelative(-3.198f, -1.357f, -5.474f, -3.637f, -6.932f, -6.945f)
                lineToRelative(1.6f, -1.897f)
                curveToRelative(0.557f, -0.579f, 0.863f, -1.339f, 0.863f, -2.145f)
                reflectiveCurveToRelative(-0.304f, -1.559f, -0.857f, -2.138f)
                curveToRelative(0.0f, 0.0f, -1.852f, -2.407f, -1.883f, -2.438f)
                curveToRelative(-1.207f, -1.207f, -3.17f, -1.206f, -4.327f, -0.047f)
                lineToRelative(-1.15f, 1.004f)
                curveTo(0.635f, 3.012f, 0.001f, 4.565f, 0.001f, 6.238f)
                curveTo(0.001f, 13.874f, 10.127f, 24.0f, 17.763f, 24.0f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.634f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.171f, 0.0f, -4.378f)
                curveToRelative(-0.031f, -0.03f, -2.439f, -1.883f, -2.439f, -1.883f)
                close()
            }
        }
        .build()
        return _starRatingCall!!
    }

private var _starRatingCall: ImageVector? = null
