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
                moveToRelative(19.5f, 0.0f)
                lineTo(4.5f, 0.0f)
                curveTo(2.846f, 0.0f, 1.5f, 1.346f, 1.5f, 3.0f)
                verticalLineToRelative(20.934f)
                lineToRelative(10.5f, -7.583f)
                lineToRelative(10.5f, 7.583f)
                lineTo(22.5f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.5f, 18.066f)
                lineToRelative(-7.5f, -5.417f)
                lineToRelative(-7.5f, 5.417f)
                lineTo(4.5f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(15.066f)
                close()
                moveTo(10.175f, 8.846f)
                lineToRelative(-2.212f, -1.231f)
                verticalLineToRelative(-0.615f)
                horizontalLineToRelative(2.899f)
                lineToRelative(0.784f, -3.0f)
                horizontalLineToRelative(0.648f)
                lineToRelative(0.784f, 3.0f)
                horizontalLineToRelative(2.883f)
                verticalLineToRelative(0.611f)
                lineToRelative(-2.197f, 1.273f)
                lineToRelative(0.884f, 2.686f)
                lineToRelative(-0.504f, 0.349f)
                lineToRelative(-2.173f, -1.68f)
                lineToRelative(-2.183f, 1.687f)
                lineToRelative(-0.48f, -0.362f)
                lineToRelative(0.869f, -2.717f)
                close()
            }
        }
        .build()
        return _wishlistStar!!
    }

private var _wishlistStar: ImageVector? = null
