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

public val Icons.Filled.MapMarkerCheck: ImageVector
    get() {
        if (_mapMarkerCheck != null) {
            return _mapMarkerCheck!!
        }
        _mapMarkerCheck = Builder(name = "MapMarkerCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 2.936f)
                curveTo(17.182f, 1.046f, 14.671f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveTo(6.818f, 1.046f, 4.929f, 2.936f)
                curveToRelative(-3.898f, 3.899f, -3.898f, 10.243f, 0.008f, 14.15f)
                lineToRelative(7.063f, 6.908f)
                lineToRelative(7.071f, -6.916f)
                curveToRelative(3.898f, -3.899f, 3.898f, -10.243f, 0.0f, -14.142f)
                close()
                moveTo(11.906f, 13.42f)
                curveToRelative(-0.387f, 0.387f, -0.896f, 0.58f, -1.407f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-2.782f, -2.696f)
                lineToRelative(1.393f, -1.437f)
                lineToRelative(2.793f, 2.707f)
                lineToRelative(5.809f, -5.701f)
                lineToRelative(1.404f, 1.425f)
                lineToRelative(-5.793f, 5.707f)
                close()
            }
        }
        .build()
        return _mapMarkerCheck!!
    }

private var _mapMarkerCheck: ImageVector? = null
