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

public val Icons.Bold.WishlistStar: ImageVector
    get() {
        if (_wishlistStar != null) {
            return _wishlistStar!!
        }
        _wishlistStar = Builder(name = "WishlistStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(3.467f, 0.0f, 1.0f, 2.468f, 1.0f, 5.5f)
                verticalLineToRelative(14.972f)
                curveToRelative(0.0f, 1.442f, 0.866f, 2.719f, 2.206f, 3.252f)
                curveToRelative(1.339f, 0.534f, 2.845f, 0.201f, 3.838f, -0.848f)
                lineToRelative(4.912f, -5.198f)
                lineToRelative(5.013f, 5.25f)
                curveToRelative(0.669f, 0.7f, 1.602f, 1.078f, 2.545f, 1.078f)
                curveToRelative(0.435f, 0.0f, 0.873f, -0.081f, 1.288f, -0.247f)
                curveToRelative(1.335f, -0.536f, 2.198f, -1.812f, 2.198f, -3.249f)
                lineTo(23.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(20.0f, 20.51f)
                curveToRelative(0.0f, 0.209f, -0.121f, 0.388f, -0.313f, 0.465f)
                curveToRelative(-0.186f, 0.071f, -0.411f, 0.024f, -0.548f, -0.119f)
                lineToRelative(-6.104f, -6.392f)
                curveToRelative(-0.283f, -0.296f, -0.675f, -0.464f, -1.085f, -0.464f)
                horizontalLineToRelative(-0.004f)
                curveToRelative(-0.411f, 0.0f, -0.804f, 0.171f, -1.086f, 0.47f)
                lineToRelative(-5.995f, 6.344f)
                curveToRelative(-0.145f, 0.153f, -0.354f, 0.199f, -0.55f, 0.123f)
                curveToRelative(-0.194f, -0.077f, -0.315f, -0.256f, -0.315f, -0.465f)
                lineTo(4.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(15.01f)
                close()
                moveTo(15.96f, 7.443f)
                curveToRelative(0.096f, 0.263f, 0.017f, 0.558f, -0.197f, 0.739f)
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
                curveToRelative(0.096f, -0.262f, 0.346f, -0.437f, 0.626f, -0.437f)
                horizontalLineToRelative(2.001f)
                lineToRelative(0.708f, -1.987f)
                curveToRelative(0.097f, -0.261f, 0.346f, -0.434f, 0.625f, -0.434f)
                reflectiveCurveToRelative(0.528f, 0.173f, 0.625f, 0.434f)
                lineToRelative(0.708f, 1.987f)
                horizontalLineToRelative(2.001f)
                curveToRelative(0.28f, 0.0f, 0.53f, 0.175f, 0.626f, 0.438f)
                close()
            }
        }
        .build()
        return _wishlistStar!!
    }

private var _wishlistStar: ImageVector? = null
