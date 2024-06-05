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

public val Icons.Bold.LampStreet: ImageVector
    get() {
        if (_lampStreet != null) {
            return _lampStreet!!
        }
        _lampStreet = Builder(name = "LampStreet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 15.5f)
                curveToRelative(0.0f, -4.214f, -3.084f, -7.722f, -7.114f, -8.386f)
                curveTo(16.222f, 3.084f, 12.714f, 0.0f, 8.5f, 0.0f)
                curveTo(3.813f, 0.0f, 0.0f, 3.813f, 0.0f, 8.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.572f, 0.0f, 4.737f, 1.775f, 5.336f, 4.164f)
                curveToRelative(-3.892f, 0.776f, -6.836f, 4.219f, -6.836f, 8.336f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(10.208f, 14.0f)
                curveToRelative(0.654f, -2.306f, 2.779f, -4.0f, 5.292f, -4.0f)
                reflectiveCurveToRelative(4.638f, 1.694f, 5.292f, 4.0f)
                horizontalLineToRelative(-10.584f)
                close()
            }
        }
        .build()
        return _lampStreet!!
    }

private var _lampStreet: ImageVector? = null
