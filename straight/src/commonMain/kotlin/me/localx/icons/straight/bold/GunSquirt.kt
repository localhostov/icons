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

public val Icons.Bold.GunSquirt: ImageVector
    get() {
        if (_gunSquirt != null) {
            return _gunSquirt!!
        }
        _gunSquirt = Builder(name = "GunSquirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                horizontalLineToRelative(-2.208f)
                curveToRelative(-0.655f, -2.306f, -2.78f, -4.0f, -5.292f, -4.0f)
                lineTo(6.0f, 2.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.161f)
                lineTo(0.109f, 20.332f)
                curveToRelative(-0.516f, 1.842f, 0.869f, 3.668f, 2.782f, 3.668f)
                curveToRelative(1.295f, 0.0f, 2.433f, -0.862f, 2.782f, -2.11f)
                lineToRelative(0.529f, -1.89f)
                horizontalLineToRelative(3.799f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.959f)
                lineToRelative(1.12f, -4.0f)
                horizontalLineToRelative(8.339f)
                curveToRelative(2.512f, 0.0f, 4.637f, -1.694f, 5.292f, -4.0f)
                horizontalLineToRelative(2.208f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(16.5f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _gunSquirt!!
    }

private var _gunSquirt: ImageVector? = null
