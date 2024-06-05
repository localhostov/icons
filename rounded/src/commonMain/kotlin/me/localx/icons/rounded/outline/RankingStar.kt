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

public val Icons.Outline.RankingStar: ImageVector
    get() {
        if (_rankingStar != null) {
            return _rankingStar!!
        }
        _rankingStar = Builder(name = "RankingStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 16.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.0f, 12.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(2.0f, 20.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.041f, 2.857f)
                curveToRelative(0.096f, -0.262f, 0.346f, -0.437f, 0.626f, -0.437f)
                horizontalLineToRelative(2.001f)
                lineToRelative(0.708f, -1.987f)
                curveToRelative(0.097f, -0.261f, 0.346f, -0.434f, 0.625f, -0.434f)
                reflectiveCurveToRelative(0.528f, 0.173f, 0.625f, 0.434f)
                lineToRelative(0.708f, 1.987f)
                horizontalLineToRelative(2.001f)
                curveToRelative(0.28f, 0.0f, 0.53f, 0.175f, 0.626f, 0.438f)
                reflectiveCurveToRelative(0.017f, 0.558f, -0.197f, 0.739f)
                lineToRelative(-1.577f, 1.285f)
                lineToRelative(0.652f, 1.987f)
                curveToRelative(0.089f, 0.269f, -0.001f, 0.565f, -0.226f, 0.738f)
                curveToRelative(-0.225f, 0.173f, -0.534f, 0.185f, -0.771f, 0.031f)
                lineToRelative(-1.836f, -1.196f)
                lineToRelative(-1.805f, 1.208f)
                curveToRelative(-0.112f, 0.075f, -0.242f, 0.113f, -0.371f, 0.113f)
                curveToRelative(-0.141f, 0.0f, -0.282f, -0.045f, -0.4f, -0.133f)
                curveToRelative(-0.227f, -0.17f, -0.321f, -0.464f, -0.236f, -0.734f)
                lineToRelative(0.627f, -2.011f)
                lineToRelative(-1.585f, -1.29f)
                curveToRelative(-0.213f, -0.181f, -0.291f, -0.476f, -0.194f, -0.738f)
                close()
            }
        }
        .build()
        return _rankingStar!!
    }

private var _rankingStar: ImageVector? = null
