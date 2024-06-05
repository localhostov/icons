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

public val Icons.Filled.MarketplaceAlt: ImageVector
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
                moveTo(13.082f, 7.339f)
                curveToRelative(0.164f, 0.962f, 0.993f, 1.661f, 1.971f, 1.661f)
                horizontalLineToRelative(6.682f)
                lineToRelative(2.197f, -7.0f)
                horizontalLineToRelative(-9.744f)
                lineToRelative(-0.059f, -0.341f)
                curveToRelative(-0.166f, -0.961f, -0.995f, -1.659f, -1.971f, -1.659f)
                horizontalLineToRelative(-2.158f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.158f)
                lineToRelative(0.924f, 5.339f)
                close()
                moveTo(24.0f, 20.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.28f, 0.0f, -2.39f, -0.698f, -3.0f, -1.726f)
                curveToRelative(-0.61f, 1.028f, -1.72f, 1.726f, -3.0f, 1.726f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.836f, 0.307f, -1.594f, 0.797f, -2.196f)
                curveToRelative(-0.336f, -0.475f, -0.583f, -1.021f, -0.687f, -1.629f)
                lineToRelative(-0.636f, -3.675f)
                horizontalLineToRelative(-2.475f)
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
                close()
            }
        }
        .build()
        return _marketplaceAlt!!
    }

private var _marketplaceAlt: ImageVector? = null
