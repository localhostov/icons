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

public val Icons.Bold.Eyes: ImageVector
    get() {
        if (_eyes != null) {
            return _eyes!!
        }
        _eyes = Builder(name = "Eyes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.25f, 0.0f)
                curveToRelative(-2.166f, 0.0f, -4.032f, 1.635f, -5.25f, 4.284f)
                curveTo(10.782f, 1.635f, 8.916f, 0.0f, 6.75f, 0.0f)
                curveTo(2.902f, 0.0f, 0.0f, 5.159f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.902f, 12.0f, 6.75f, 12.0f)
                curveToRelative(2.166f, 0.0f, 4.032f, -1.635f, 5.25f, -4.284f)
                curveToRelative(1.218f, 2.649f, 3.084f, 4.284f, 5.25f, 4.284f)
                curveToRelative(3.848f, 0.0f, 6.75f, -5.159f, 6.75f, -12.0f)
                reflectiveCurveTo(21.098f, 0.0f, 17.25f, 0.0f)
                close()
                moveTo(6.75f, 21.0f)
                curveToRelative(-1.039f, 0.0f, -2.351f, -1.509f, -3.116f, -4.154f)
                curveToRelative(0.27f, 0.1f, 0.561f, 0.154f, 0.866f, 0.154f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.56f, 0.0f, -1.077f, 0.184f, -1.494f, 0.495f)
                curveToRelative(-0.004f, -0.163f, -0.006f, -0.328f, -0.006f, -0.495f)
                curveToRelative(0.0f, -5.576f, 2.184f, -9.0f, 3.75f, -9.0f)
                reflectiveCurveToRelative(3.75f, 3.424f, 3.75f, 9.0f)
                reflectiveCurveToRelative(-2.184f, 9.0f, -3.75f, 9.0f)
                close()
                moveTo(17.25f, 21.0f)
                curveToRelative(-1.08f, 0.0f, -2.453f, -1.627f, -3.202f, -4.465f)
                curveToRelative(0.409f, 0.293f, 0.91f, 0.465f, 1.452f, 0.465f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.805f, 0.0f, -1.52f, 0.38f, -1.977f, 0.971f)
                curveToRelative(-0.015f, -0.316f, -0.023f, -0.64f, -0.023f, -0.971f)
                curveToRelative(0.0f, -5.576f, 2.184f, -9.0f, 3.75f, -9.0f)
                reflectiveCurveToRelative(3.75f, 3.424f, 3.75f, 9.0f)
                reflectiveCurveToRelative(-2.184f, 9.0f, -3.75f, 9.0f)
                close()
            }
        }
        .build()
        return _eyes!!
    }

private var _eyes: ImageVector? = null
