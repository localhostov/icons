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

public val Icons.Filled.Route: ImageVector
    get() {
        if (_route != null) {
            return _route!!
        }
        _route = Builder(name = "Route", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(7.854f, 24.0f)
                lineToRelative(2.045f, -2.0f)
                horizontalLineToRelative(10.102f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.927f, 1.37f, -3.539f, 3.187f, -3.916f)
                lineToRelative(1.959f, 1.916f)
                horizontalLineToRelative(-1.146f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(22.535f, 8.536f)
                lineToRelative(-3.535f, 3.458f)
                lineToRelative(-3.528f, -3.45f)
                curveToRelative(-1.957f, -1.958f, -1.957f, -5.129f, -0.008f, -7.079f)
                curveToRelative(0.945f, -0.944f, 2.201f, -1.464f, 3.536f, -1.464f)
                reflectiveCurveToRelative(2.591f, 0.52f, 3.535f, 1.464f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.122f, 0.0f, 7.071f)
                close()
                moveTo(8.535f, 13.465f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.122f, 0.0f, 7.071f)
                lineToRelative(-3.535f, 3.458f)
                lineToRelative(-3.528f, -3.45f)
                curveToRelative(-1.957f, -1.958f, -1.957f, -5.129f, -0.008f, -7.079f)
                curveToRelative(0.945f, -0.944f, 2.201f, -1.464f, 3.536f, -1.464f)
                reflectiveCurveToRelative(2.591f, 0.52f, 3.535f, 1.464f)
                close()
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
