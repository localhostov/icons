package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.WishlistHeart: ImageVector
    get() {
        if (_wishlistHeart != null) {
            return _wishlistHeart!!
        }
        _wishlistHeart = Builder(name = "WishlistHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.327f)
                curveToRelative(0.0f, 3.485f, -6.0f, 7.673f, -6.0f, 7.673f)
                curveToRelative(0.0f, 0.0f, -6.0f, -4.188f, -6.0f, -7.673f)
                curveToRelative(0.0f, -1.838f, 1.343f, -3.327f, 3.0f, -3.327f)
                reflectiveCurveToRelative(3.0f, 1.2f, 3.0f, 3.6f)
                curveToRelative(0.0f, -2.4f, 1.343f, -3.6f, 3.0f, -3.6f)
                reflectiveCurveToRelative(3.0f, 1.49f, 3.0f, 3.327f)
                close()
                moveTo(19.0f, 3.0f)
                verticalLineToRelative(8.458f)
                curveToRelative(-0.33f, 0.15f, -0.704f, 0.323f, -1.0f, 0.551f)
                curveToRelative(-0.602f, -0.464f, -1.293f, -0.75f, -2.0f, -0.895f)
                verticalLineToRelative(-1.114f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.105f)
                curveToRelative(-0.942f, 0.717f, -1.631f, 1.773f, -1.929f, 3.0f)
                horizontalLineToRelative(-2.176f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.082f)
                curveToRelative(0.34f, 2.578f, 2.514f, 5.052f, 4.363f, 6.713f)
                curveToRelative(-0.01f, 0.137f, -0.002f, 0.245f, 0.05f, 0.287f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 16.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(6.0f, 11.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(6.0f, 6.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _wishlistHeart!!
    }

private var _wishlistHeart: ImageVector? = null
