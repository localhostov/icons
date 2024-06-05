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

public val Icons.Filled.Raygun: ImageVector
    get() {
        if (_raygun != null) {
            return _raygun!!
        }
        _raygun = Builder(name = "Raygun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.138f, 15.273f)
                curveToRelative(1.654f, 1.05f, 3.615f, 1.848f, 5.535f, 2.429f)
                lineToRelative(-1.673f, 6.297f)
                lineTo(0.0f, 23.999f)
                lineToRelative(0.041f, -1.629f)
                lineToRelative(2.097f, -7.098f)
                close()
                moveTo(20.0f, 8.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.35f, 0.0f, -3.897f, 0.374f, -6.514f, 1.149f)
                curveTo(6.15f, 0.47f, 3.727f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, 2.216f, 1.794f, 2.474f, 4.927f)
                curveTo(0.991f, 6.036f, 0.0f, 7.388f, 0.0f, 9.0f)
                curveToRelative(0.0f, 5.506f, 11.506f, 8.0f, 15.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(2.417f, 1.185f, 4.0f, 3.0f, 4.0f, 3.0f)
                lineTo(24.0f, 5.0f)
                reflectiveCurveToRelative(-1.583f, 1.815f, -4.0f, 3.0f)
                close()
            }
        }
        .build()
        return _raygun!!
    }

private var _raygun: ImageVector? = null
