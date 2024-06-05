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

public val Icons.Filled.Tools: ImageVector
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
                moveTo(8.353f, 15.424f)
                lineToRelative(1.424f, -1.424f)
                lineToRelative(-2.009f, -2.009f)
                lineTo(0.879f, 18.879f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.567f, 0.566f, 1.32f, 0.879f, 2.122f, 0.879f)
                reflectiveCurveToRelative(1.555f, -0.312f, 2.121f, -0.879f)
                lineToRelative(5.465f, -5.465f)
                lineToRelative(-2.233f, -2.233f)
                close()
                moveTo(23.119f, 4.058f)
                curveToRelative(0.558f, 1.077f, 0.841f, 2.235f, 0.841f, 3.442f)
                curveToRelative(0.0f, 2.549f, -1.281f, 4.803f, -3.231f, 6.158f)
                lineToRelative(-5.281f, -5.281f)
                lineToRelative(-1.412f, 1.397f)
                lineToRelative(-3.017f, -3.017f)
                lineTo(11.019f, 2.355f)
                curveToRelative(1.368f, -1.446f, 3.297f, -2.355f, 5.44f, -2.355f)
                curveToRelative(1.181f, 0.0f, 2.318f, 0.272f, 3.381f, 0.811f)
                lineToRelative(0.319f, 0.162f)
                lineToRelative(-3.574f, 3.614f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.047f, 0.0f, 2.828f)
                curveToRelative(0.781f, 0.781f, 2.047f, 0.781f, 2.828f, 0.0f)
                lineToRelative(3.573f, -3.612f)
                lineToRelative(0.132f, 0.256f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
