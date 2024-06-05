package me.localx.icons.straight.bold

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

public val Icons.Bold.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.768f, 18.146f)
                lineToRelative(-4.826f, -4.788f)
                curveToRelative(2.831f, -3.136f, 2.737f, -7.994f, -0.284f, -11.017f)
                curveToRelative(-1.512f, -1.51f, -3.521f, -2.342f, -5.657f, -2.342f)
                reflectiveCurveToRelative(-4.146f, 0.832f, -5.657f, 2.343f)
                curveToRelative(-3.021f, 3.021f, -3.115f, 7.879f, -0.284f, 11.016f)
                lineToRelative(-4.826f, 4.788f)
                lineToRelative(6.048f, 5.888f)
                lineToRelative(4.72f, -4.72f)
                lineToRelative(4.721f, 4.72f)
                lineToRelative(6.047f, -5.888f)
                close()
                moveTo(16.748f, 19.819f)
                lineToRelative(-8.284f, -8.283f)
                curveToRelative(-1.399f, -1.4f, -1.794f, -3.429f, -1.184f, -5.184f)
                curveToRelative(0.764f, 1.941f, 2.889f, 3.711f, 3.737f, 4.362f)
                lineToRelative(7.472f, 7.413f)
                lineToRelative(-1.74f, 1.692f)
                close()
                moveTo(14.222f, 9.668f)
                curveToRelative(0.924f, -0.857f, 2.001f, -2.05f, 2.499f, -3.316f)
                curveToRelative(0.568f, 1.636f, 0.263f, 3.509f, -0.913f, 4.89f)
                lineToRelative(-1.586f, -1.573f)
                close()
                moveTo(14.0f, 5.0f)
                curveToRelative(0.0f, 0.48f, -0.888f, 1.612f, -2.0f, 2.626f)
                curveToRelative(-1.112f, -1.014f, -2.0f, -2.146f, -2.0f, -2.626f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(7.251f, 19.819f)
                lineToRelative(-1.739f, -1.692f)
                lineToRelative(2.661f, -2.64f)
                lineToRelative(1.706f, 1.706f)
                lineToRelative(-2.627f, 2.627f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
