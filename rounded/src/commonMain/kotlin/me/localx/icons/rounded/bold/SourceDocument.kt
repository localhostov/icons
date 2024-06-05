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

public val Icons.Bold.SourceDocument: ImageVector
    get() {
        if (_sourceDocument != null) {
            return _sourceDocument!!
        }
        _sourceDocument = Builder(name = "SourceDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.151f, 0.0f, 0.295f, -0.029f, 0.432f, -0.071f)
                curveToRelative(0.183f, 0.043f, 0.372f, 0.071f, 0.568f, 0.071f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.108f, -0.607f, 2.064f, -1.5f, 2.584f)
                verticalLineToRelative(2.916f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.916f)
                curveToRelative(-0.893f, -0.52f, -1.5f, -1.476f, -1.5f, -2.584f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.195f, 0.0f, -0.385f, -0.022f, -0.57f, -0.057f)
                lineToRelative(-1.804f, 2.049f)
                curveToRelative(-0.297f, 0.337f, -0.71f, 0.509f, -1.126f, 0.509f)
                curveToRelative(-0.352f, 0.0f, -0.706f, -0.123f, -0.991f, -0.374f)
                curveToRelative(-0.622f, -0.548f, -0.682f, -1.495f, -0.135f, -2.117f)
                lineToRelative(1.799f, -2.043f)
                curveToRelative(-0.104f, -0.305f, -0.173f, -0.626f, -0.173f, -0.966f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(7.491f, 11.126f)
                curveToRelative(-0.285f, 0.251f, -0.639f, 0.374f, -0.991f, 0.374f)
                curveToRelative(-0.416f, 0.0f, -0.83f, -0.172f, -1.126f, -0.509f)
                lineToRelative(-1.804f, -2.049f)
                curveToRelative(-0.185f, 0.036f, -0.375f, 0.057f, -0.57f, 0.057f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.34f, -0.069f, 0.661f, -0.173f, 0.966f)
                lineToRelative(1.799f, 2.043f)
                curveToRelative(0.547f, 0.622f, 0.487f, 1.569f, -0.135f, 2.117f)
                close()
            }
        }
        .build()
        return _sourceDocument!!
    }

private var _sourceDocument: ImageVector? = null
