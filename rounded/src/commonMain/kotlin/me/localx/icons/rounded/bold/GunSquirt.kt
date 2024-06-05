package me.localx.icons.rounded.bold

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
                moveToRelative(22.5f, 6.0f)
                horizontalLineToRelative(-0.708f)
                curveToRelative(-0.655f, -2.306f, -2.78f, -4.0f, -5.292f, -4.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.102f)
                curveTo(1.221f, 3.514f, 0.0f, 5.367f, 0.0f, 7.5f)
                curveToRelative(0.0f, 1.894f, 0.963f, 3.568f, 2.425f, 4.558f)
                lineTo(0.109f, 20.332f)
                curveToRelative(-0.516f, 1.842f, 0.869f, 3.668f, 2.782f, 3.668f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.295f, 0.0f, 2.433f, -0.862f, 2.782f, -2.11f)
                lineToRelative(0.529f, -1.89f)
                horizontalLineToRelative(2.798f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.958f)
                lineToRelative(1.12f, -4.0f)
                horizontalLineToRelative(8.338f)
                curveToRelative(2.512f, 0.0f, 4.637f, -1.694f, 5.292f, -4.0f)
                horizontalLineToRelative(0.708f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 10.0f)
                lineTo(5.5f, 10.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _gunSquirt!!
    }

private var _gunSquirt: ImageVector? = null
