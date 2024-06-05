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

public val Icons.Filled.HockeyStickPuck: ImageVector
    get() {
        if (_hockeyStickPuck != null) {
            return _hockeyStickPuck!!
        }
        _hockeyStickPuck = Builder(name = "HockeyStickPuck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.461f, 0.112f)
                curveToRelative(-0.49f, -0.254f, -1.095f, -0.064f, -1.349f, 0.427f)
                lineToRelative(-8.543f, 16.46f)
                lineTo(3.5f, 16.999f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.044f)
                curveToRelative(2.249f, 0.0f, 4.29f, -1.24f, 5.326f, -3.236f)
                lineTo(23.888f, 1.46f)
                curveToRelative(0.254f, -0.49f, 0.063f, -1.094f, -0.427f, -1.348f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _hockeyStickPuck!!
    }

private var _hockeyStickPuck: ImageVector? = null
