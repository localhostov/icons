package me.localx.icons.rounded.filled

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

public val Icons.Filled.Vacuum: ImageVector
    get() {
        if (_vacuum != null) {
            return _vacuum!!
        }
        _vacuum = Builder(name = "Vacuum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(19.0f, 7.21f)
                verticalLineToRelative(-1.085f)
                curveToRelative(0.0f, -3.377f, -2.748f, -6.125f, -6.125f, -6.125f)
                curveToRelative(-3.029f, 0.0f, -5.573f, 2.171f, -6.05f, 5.163f)
                lineToRelative(-2.679f, 16.837f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.146f)
                curveToRelative(0.989f, 0.0f, 1.819f, -0.709f, 1.975f, -1.686f)
                lineToRelative(2.679f, -16.837f)
                curveToRelative(0.321f, -2.015f, 2.035f, -3.478f, 4.075f, -3.478f)
                curveToRelative(2.274f, 0.0f, 4.125f, 1.851f, 4.125f, 4.125f)
                verticalLineToRelative(0.875f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.023f)
                curveToRelative(-0.633f, -0.838f, -1.023f, -1.869f, -1.023f, -3.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                curveToRelative(1.131f, 0.0f, 2.162f, 0.39f, 3.0f, 1.023f)
                verticalLineToRelative(-3.398f)
                curveToRelative(0.0f, -3.092f, -2.131f, -5.688f, -5.0f, -6.415f)
                close()
            }
        }
        .build()
        return _vacuum!!
    }

private var _vacuum: ImageVector? = null
