package me.localx.icons.straight.outline

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

public val Icons.Outline.Analyse: ImageVector
    get() {
        if (_analyse != null) {
            return _analyse!!
        }
        _analyse = Builder(name = "Analyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.548f, 23.962f)
                lineToRelative(-6.219f, -6.219f)
                curveToRelative(-1.782f, 1.462f, -3.995f, 2.257f, -6.329f, 2.257f)
                curveTo(4.486f, 20.0f, 0.0f, 15.514f, 0.0f, 10.0f)
                reflectiveCurveTo(4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(2.292f, 0.0f, 4.4f, 0.783f, 6.088f, 2.085f)
                lineToRelative(-1.308f, 1.515f)
                curveToRelative(-1.335f, -1.0f, -2.987f, -1.6f, -4.78f, -1.6f)
                curveTo(5.589f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 1.167f, 0.257f, 2.274f, 0.709f, 3.274f)
                lineToRelative(5.218f, -6.262f)
                lineToRelative(3.514f, 3.514f)
                lineTo(20.237f, 0.34f)
                lineToRelative(1.514f, 1.308f)
                lineToRelative(-10.203f, 11.814f)
                lineToRelative(-3.486f, -3.486f)
                lineToRelative(-4.245f, 5.094f)
                curveToRelative(1.468f, 1.788f, 3.695f, 2.931f, 6.183f, 2.931f)
                curveToRelative(2.137f, 0.0f, 4.146f, -0.832f, 5.657f, -2.343f)
                reflectiveCurveToRelative(2.343f, -3.52f, 2.343f, -5.657f)
                curveToRelative(0.0f, -0.301f, -0.02f, -0.596f, -0.052f, -0.888f)
                lineToRelative(1.647f, -1.907f)
                curveToRelative(0.259f, 0.888f, 0.405f, 1.825f, 0.405f, 2.796f)
                curveToRelative(0.0f, 2.334f, -0.795f, 4.547f, -2.257f, 6.329f)
                lineToRelative(6.219f, 6.219f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _analyse!!
    }

private var _analyse: ImageVector? = null
