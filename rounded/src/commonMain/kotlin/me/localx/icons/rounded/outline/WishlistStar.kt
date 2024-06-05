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

public val Icons.Outline.WishlistStar: ImageVector
    get() {
        if (_wishlistStar != null) {
            return _wishlistStar!!
        }
        _wishlistStar = Builder(name = "WishlistStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(15.996f)
                curveToRelative(0.0f, 1.235f, 0.742f, 2.329f, 1.889f, 2.786f)
                curveToRelative(1.149f, 0.46f, 2.439f, 0.173f, 3.317f, -0.755f)
                lineToRelative(4.793f, -5.505f)
                lineToRelative(4.822f, 5.536f)
                curveToRelative(0.581f, 0.613f, 1.367f, 0.939f, 2.172f, 0.939f)
                curveToRelative(0.374f, 0.0f, 0.752f, -0.07f, 1.117f, -0.216f)
                curveToRelative(1.147f, -0.457f, 1.889f, -1.551f, 1.889f, -2.786f)
                lineTo(21.999f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 20.996f)
                curveToRelative(0.0f, 0.629f, -0.482f, 0.869f, -0.629f, 0.929f)
                curveToRelative(-0.147f, 0.059f, -0.663f, 0.215f, -1.069f, -0.21f)
                lineToRelative(-5.548f, -6.371f)
                curveToRelative(-0.189f, -0.219f, -0.465f, -0.344f, -0.754f, -0.344f)
                reflectiveCurveToRelative(-0.564f, 0.125f, -0.754f, 0.344f)
                lineToRelative(-5.52f, 6.34f)
                curveToRelative(-0.433f, 0.456f, -0.948f, 0.299f, -1.097f, 0.241f)
                curveToRelative(-0.147f, -0.06f, -0.629f, -0.3f, -0.629f, -0.929f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(15.996f)
                close()
                moveTo(16.949f, 7.544f)
                curveToRelative(0.12f, 0.329f, 0.022f, 0.698f, -0.246f, 0.923f)
                lineToRelative(-1.971f, 1.606f)
                lineToRelative(0.815f, 2.484f)
                curveToRelative(0.112f, 0.336f, -0.002f, 0.706f, -0.282f, 0.922f)
                curveToRelative(-0.281f, 0.216f, -0.667f, 0.231f, -0.964f, 0.038f)
                lineToRelative(-2.295f, -1.495f)
                lineToRelative(-2.257f, 1.51f)
                curveToRelative(-0.14f, 0.094f, -0.302f, 0.141f, -0.464f, 0.141f)
                curveToRelative(-0.176f, 0.0f, -0.352f, -0.056f, -0.5f, -0.166f)
                curveToRelative(-0.283f, -0.212f, -0.401f, -0.58f, -0.295f, -0.917f)
                lineToRelative(0.784f, -2.513f)
                lineToRelative(-1.981f, -1.612f)
                curveToRelative(-0.267f, -0.226f, -0.364f, -0.594f, -0.243f, -0.922f)
                curveToRelative(0.12f, -0.328f, 0.432f, -0.546f, 0.782f, -0.546f)
                horizontalLineToRelative(2.501f)
                lineToRelative(0.885f, -2.483f)
                curveToRelative(0.121f, -0.326f, 0.433f, -0.542f, 0.781f, -0.542f)
                reflectiveCurveToRelative(0.66f, 0.216f, 0.781f, 0.542f)
                lineToRelative(0.885f, 2.483f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.35f, 0.0f, 0.663f, 0.219f, 0.783f, 0.548f)
                close()
            }
        }
        .build()
        return _wishlistStar!!
    }

private var _wishlistStar: ImageVector? = null
