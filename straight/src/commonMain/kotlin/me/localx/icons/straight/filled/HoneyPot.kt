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

public val Icons.Filled.HoneyPot: ImageVector
    get() {
        if (_honeyPot != null) {
            return _honeyPot!!
        }
        _honeyPot = Builder(name = "HoneyPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.0f, 2.0f)
                lineTo(1.0f, 0.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 2.0f)
                close()
                moveTo(22.191f, 4.0f)
                horizontalLineToRelative(-6.691f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 5.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                lineTo(1.809f, 4.0f)
                curveToRelative(-1.004f, 1.859f, -1.809f, 3.934f, -1.809f, 5.905f)
                curveToRelative(0.0f, 4.153f, 2.699f, 9.858f, 5.374f, 13.669f)
                lineToRelative(0.298f, 0.426f)
                horizontalLineToRelative(12.655f)
                lineToRelative(0.298f, -0.426f)
                curveToRelative(2.675f, -3.812f, 5.374f, -9.517f, 5.374f, -13.669f)
                curveToRelative(0.0f, -1.971f, -0.805f, -4.045f, -1.809f, -5.905f)
                close()
            }
        }
        .build()
        return _honeyPot!!
    }

private var _honeyPot: ImageVector? = null
