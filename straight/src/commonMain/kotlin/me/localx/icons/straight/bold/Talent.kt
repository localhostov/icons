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

public val Icons.Bold.Talent: ImageVector
    get() {
        if (_talent != null) {
            return _talent!!
        }
        _talent = Builder(name = "Talent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(22.518f, 13.602f)
                lineToRelative(-2.035f, -2.204f)
                lineToRelative(-6.069f, 5.602f)
                horizontalLineToRelative(-4.827f)
                lineToRelative(-6.069f, -5.602f)
                lineToRelative(-2.035f, 2.204f)
                lineToRelative(6.518f, 6.016f)
                verticalLineToRelative(4.382f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.382f)
                lineToRelative(6.518f, -6.016f)
                close()
                moveTo(8.683f, 9.705f)
                lineToRelative(0.601f, 0.453f)
                lineToRelative(2.729f, -2.11f)
                lineToRelative(2.717f, 2.101f)
                lineToRelative(0.625f, -0.436f)
                lineToRelative(-1.105f, -3.357f)
                lineToRelative(2.75f, -1.591f)
                verticalLineToRelative(-0.764f)
                horizontalLineToRelative(-3.605f)
                lineToRelative(-0.98f, -3.75f)
                horizontalLineToRelative(-0.809f)
                lineToRelative(-0.981f, 3.75f)
                horizontalLineToRelative(-3.625f)
                verticalLineToRelative(0.769f)
                lineToRelative(2.769f, 1.54f)
                lineToRelative(-1.086f, 3.396f)
                close()
            }
        }
        .build()
        return _talent!!
    }

private var _talent: ImageVector? = null
