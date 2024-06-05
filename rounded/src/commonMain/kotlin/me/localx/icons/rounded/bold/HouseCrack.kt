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

public val Icons.Bold.HouseCrack: ImageVector
    get() {
        if (_houseCrack != null) {
            return _houseCrack!!
        }
        _houseCrack = Builder(name = "HouseCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.576f, 5.327f)
                lineTo(15.077f, 0.941f)
                curveToRelative(-1.869f, -1.262f, -4.284f, -1.261f, -6.153f, 0.0f)
                lineTo(2.423f, 5.327f)
                curveTo(0.906f, 6.352f, 0.0f, 8.056f, 0.0f, 9.886f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 9.886f)
                curveToRelative(0.0f, -1.83f, -0.906f, -3.534f, -2.424f, -4.559f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.42f)
                lineToRelative(1.853f, -5.372f)
                curveToRelative(0.275f, -0.797f, -0.317f, -1.628f, -1.16f, -1.628f)
                horizontalLineToRelative(-2.87f)
                lineToRelative(1.369f, -4.497f)
                curveToRelative(0.228f, -0.748f, -0.332f, -1.503f, -1.114f, -1.503f)
                curveToRelative(-0.392f, 0.0f, -0.758f, 0.197f, -0.973f, 0.525f)
                lineToRelative(-4.952f, 7.361f)
                curveToRelative(-0.592f, 0.91f, 0.061f, 2.114f, 1.147f, 2.114f)
                horizontalLineToRelative(2.755f)
                lineToRelative(-1.152f, 3.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 9.886f)
                curveToRelative(0.0f, -0.832f, 0.412f, -1.606f, 1.102f, -2.072f)
                lineTo(10.602f, 3.428f)
                curveToRelative(0.425f, -0.287f, 0.911f, -0.43f, 1.398f, -0.43f)
                reflectiveCurveToRelative(0.974f, 0.143f, 1.398f, 0.43f)
                lineToRelative(6.5f, 4.386f)
                curveToRelative(0.69f, 0.466f, 1.102f, 1.24f, 1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                close()
            }
        }
        .build()
        return _houseCrack!!
    }

private var _houseCrack: ImageVector? = null
