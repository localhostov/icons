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

public val Icons.Outline.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 18.879f)
                lineToRelative(-7.68f, -7.681f)
                lineToRelative(-1.411f, 1.398f)
                lineToRelative(-5.01f, -5.01f)
                lineTo(9.02f, 3.422f)
                lineTo(3.129f, 0.025f)
                lineTo(0.044f, 3.109f)
                lineToRelative(3.398f, 5.891f)
                horizontalLineToRelative(4.164f)
                lineToRelative(5.003f, 5.003f)
                lineToRelative(-1.431f, 1.417f)
                lineToRelative(7.7f, 7.701f)
                curveToRelative(0.567f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                close()
                moveTo(7.02f, 7.0f)
                horizontalLineToRelative(-2.422f)
                lineToRelative(-2.054f, -3.561f)
                lineToRelative(0.915f, -0.916f)
                lineToRelative(3.562f, 2.055f)
                verticalLineToRelative(2.422f)
                close()
                moveTo(21.707f, 21.707f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                lineToRelative(-6.28f, -6.279f)
                lineToRelative(1.421f, -1.407f)
                lineToRelative(6.272f, 6.272f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                close()
                moveTo(11.0f, 6.863f)
                lineTo(11.0f, 2.374f)
                curveToRelative(1.369f, -1.457f, 3.307f, -2.374f, 5.46f, -2.374f)
                curveToRelative(1.181f, 0.0f, 2.318f, 0.272f, 3.381f, 0.811f)
                lineToRelative(1.231f, 0.624f)
                lineToRelative(-4.819f, 4.818f)
                curveToRelative(-0.189f, 0.189f, -0.293f, 0.44f, -0.293f, 0.707f)
                reflectiveCurveToRelative(0.104f, 0.518f, 0.292f, 0.706f)
                curveToRelative(0.379f, 0.379f, 1.037f, 0.378f, 1.415f, 0.0f)
                lineToRelative(4.823f, -4.823f)
                lineToRelative(0.628f, 1.214f)
                curveToRelative(0.558f, 1.077f, 0.841f, 2.235f, 0.841f, 3.442f)
                curveToRelative(0.0f, 2.55f, -1.281f, 4.803f, -3.231f, 6.158f)
                lineToRelative(-1.447f, -1.447f)
                curveToRelative(1.601f, -0.963f, 2.678f, -2.712f, 2.678f, -4.712f)
                curveToRelative(0.0f, -0.398f, -0.042f, -0.789f, -0.126f, -1.171f)
                lineToRelative(-2.752f, 2.752f)
                curveToRelative(-1.17f, 1.169f, -3.073f, 1.17f, -4.243f, 0.0f)
                curveToRelative(-0.566f, -0.565f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.879f, -2.121f)
                lineToRelative(2.727f, -2.727f)
                curveToRelative(-0.362f, -0.074f, -0.73f, -0.112f, -1.105f, -0.112f)
                curveToRelative(-2.817f, 0.0f, -5.143f, 2.13f, -5.46f, 4.863f)
                close()
                moveTo(9.171f, 16.242f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.465f, 5.465f)
                curveToRelative(-0.566f, 0.566f, -1.32f, 0.879f, -2.121f, 0.879f)
                reflectiveCurveToRelative(-1.555f, -0.312f, -2.122f, -0.879f)
                curveToRelative(-1.169f, -1.17f, -1.169f, -3.072f, 0.0f, -4.242f)
                lineToRelative(6.889f, -6.889f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.889f, 6.889f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0.0f, 1.414f)
                curveToRelative(0.378f, 0.379f, 1.037f, 0.379f, 1.414f, 0.0f)
                lineToRelative(5.465f, -5.465f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
