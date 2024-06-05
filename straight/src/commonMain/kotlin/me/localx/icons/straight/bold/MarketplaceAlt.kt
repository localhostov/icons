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

public val Icons.Bold.MarketplaceAlt: ImageVector
    get() {
        if (_marketplaceAlt != null) {
            return _marketplaceAlt!!
        }
        _marketplaceAlt = Builder(name = "MarketplaceAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.737f, 3.0f)
                horizontalLineToRelative(-1.737f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(2.158f)
                curveToRelative(1.194f, 0.0f, 2.213f, 0.836f, 2.449f, 2.0f)
                horizontalLineToRelative(9.436f)
                lineToRelative(-2.511f, 8.0f)
                horizontalLineToRelative(-6.479f)
                curveToRelative(-1.222f, 0.0f, -2.258f, -0.874f, -2.464f, -2.077f)
                lineToRelative(-0.852f, -4.923f)
                close()
                moveTo(15.128f, 5.0f)
                lineToRelative(0.346f, 2.0f)
                horizontalLineToRelative(3.855f)
                lineToRelative(0.628f, -2.0f)
                horizontalLineToRelative(-4.829f)
                close()
                moveTo(13.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 5.0f)
                close()
            }
        }
        .build()
        return _marketplaceAlt!!
    }

private var _marketplaceAlt: ImageVector? = null
