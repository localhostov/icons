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

public val Icons.Bold.Theta: ImageVector
    get() {
        if (_theta != null) {
            return _theta!!
        }
        _theta = Builder(name = "Theta", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(7.038f, 0.0f, 3.0f, 5.383f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 12.0f, 9.0f, 12.0f)
                reflectiveCurveToRelative(9.0f, -5.383f, 9.0f, -12.0f)
                reflectiveCurveTo(16.962f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(2.913f, 0.0f, 5.42f, 3.306f, 5.912f, 7.5f)
                lineTo(6.088f, 10.5f)
                curveToRelative(0.492f, -4.194f, 3.0f, -7.5f, 5.912f, -7.5f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.913f, 0.0f, -5.42f, -3.306f, -5.912f, -7.5f)
                horizontalLineToRelative(11.824f)
                curveToRelative(-0.492f, 4.194f, -3.0f, 7.5f, -5.912f, 7.5f)
                close()
            }
        }
        .build()
        return _theta!!
    }

private var _theta: ImageVector? = null
