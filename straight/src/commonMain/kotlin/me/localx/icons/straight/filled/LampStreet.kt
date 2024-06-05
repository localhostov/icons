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

public val Icons.Filled.LampStreet: ImageVector
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
                curveToRelative(0.0f, -4.378f, -3.329f, -7.994f, -7.588f, -8.451f)
                curveTo(15.829f, 3.067f, 12.391f, 0.0f, 8.25f, 0.0f)
                curveTo(3.701f, 0.0f, 0.0f, 3.701f, 0.0f, 8.252f)
                lineToRelative(0.038f, 15.75f)
                lineToRelative(2.0f, -0.004f)
                lineToRelative(-0.038f, -15.748f)
                curveToRelative(0.0f, -3.446f, 2.804f, -6.25f, 6.25f, -6.25f)
                curveToRelative(3.044f, 0.0f, 5.586f, 2.187f, 6.138f, 5.073f)
                curveToRelative(-4.163f, 0.546f, -7.388f, 4.117f, -7.388f, 8.427f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _lampStreet!!
    }

private var _lampStreet: ImageVector? = null
