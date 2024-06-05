package me.localx.icons.straight.bold

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

public val Icons.Bold.WishlistHeart: ImageVector
    get() {
        if (_wishlistHeart != null) {
            return _wishlistHeart!!
        }
        _wishlistHeart = Builder(name = "WishlistHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 10.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 13.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.49f, -3.0f, 3.327f)
                curveToRelative(0.0f, -1.838f, -1.343f, -3.327f, -3.0f, -3.327f)
                reflectiveCurveToRelative(-3.0f, 1.49f, -3.0f, 3.327f)
                curveToRelative(0.0f, 3.485f, 6.0f, 7.673f, 6.0f, 7.673f)
                curveToRelative(0.0f, 0.0f, 6.0f, -4.188f, 6.0f, -7.673f)
                curveToRelative(0.0f, -1.838f, -1.343f, -3.327f, -3.0f, -3.327f)
                close()
                moveTo(10.0f, 13.5f)
                horizontalLineToRelative(0.779f)
                curveToRelative(0.886f, -1.497f, 2.441f, -2.5f, 4.221f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.901f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(7.963f)
                curveToRelative(0.354f, 0.166f, 0.694f, 0.36f, 1.0f, 0.605f)
                curveToRelative(0.581f, -0.466f, 1.263f, -0.788f, 2.0f, -0.949f)
                lineTo(20.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14.765f)
                curveToRelative(-0.926f, -0.805f, -1.981f, -1.838f, -2.864f, -3.0f)
                close()
            }
        }
        .build()
        return _wishlistHeart!!
    }

private var _wishlistHeart: ImageVector? = null
