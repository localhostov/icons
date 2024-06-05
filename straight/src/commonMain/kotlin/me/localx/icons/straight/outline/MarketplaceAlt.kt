package me.localx.icons.straight.outline

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

public val Icons.Outline.MarketplaceAlt: ImageVector
    get() {
        if (_marketplaceAlt != null) {
            return _marketplaceAlt!!
        }
        _marketplaceAlt = Builder(name = "MarketplaceAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.158f, 2.0f)
                horizontalLineToRelative(-2.158f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(2.158f)
                curveToRelative(0.976f, 0.0f, 1.805f, 0.698f, 1.971f, 1.659f)
                lineToRelative(0.059f, 0.341f)
                horizontalLineToRelative(9.744f)
                lineToRelative(-2.197f, 7.0f)
                horizontalLineToRelative(-6.682f)
                curveToRelative(-0.978f, 0.0f, -1.807f, -0.699f, -1.971f, -1.661f)
                lineToRelative(-0.924f, -5.339f)
                close()
                moveTo(14.534f, 4.0f)
                lineToRelative(0.519f, 3.0f)
                horizontalLineToRelative(5.213f)
                lineToRelative(0.941f, -3.0f)
                horizontalLineToRelative(-6.673f)
                close()
                moveTo(23.949f, 12.0f)
                curveToRelative(-0.17f, 1.176f, -0.915f, 2.156f, -1.95f, 2.65f)
                verticalLineToRelative(3.35f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-0.05f)
                close()
            }
        }
        .build()
        return _marketplaceAlt!!
    }

private var _marketplaceAlt: ImageVector? = null
