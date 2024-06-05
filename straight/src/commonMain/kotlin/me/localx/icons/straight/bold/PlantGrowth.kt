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

public val Icons.Bold.PlantGrowth: ImageVector
    get() {
        if (_plantGrowth != null) {
            return _plantGrowth!!
        }
        _plantGrowth = Builder(name = "PlantGrowth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.971f, 8.916f)
                lineToRelative(-0.081f, -1.439f)
                lineToRelative(-1.44f, 0.023f)
                curveToRelative(-5.629f, 0.09f, -8.807f, 3.169f, -10.449f, 6.483f)
                curveToRelative(-1.643f, -3.315f, -4.82f, -6.394f, -10.449f, -6.483f)
                lineToRelative(-1.44f, -0.023f)
                lineToRelative(-0.081f, 1.439f)
                curveToRelative(-0.22f, 3.919f, 0.784f, 7.006f, 2.983f, 9.174f)
                curveToRelative(2.394f, 2.36f, 5.59f, 2.978f, 7.487f, 3.126f)
                verticalLineToRelative(2.796f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.796f)
                curveToRelative(1.898f, -0.148f, 5.094f, -0.766f, 7.487f, -3.126f)
                curveToRelative(2.199f, -2.168f, 3.203f, -5.255f, 2.983f, -9.174f)
                close()
                moveTo(5.104f, 15.939f)
                curveToRelative(-1.273f, -1.263f, -1.973f, -3.046f, -2.087f, -5.314f)
                curveToRelative(5.12f, 0.794f, 6.743f, 5.129f, 7.254f, 7.553f)
                curveToRelative(-1.462f, -0.171f, -3.61f, -0.693f, -5.167f, -2.238f)
                close()
                moveTo(18.895f, 15.939f)
                curveToRelative(-1.558f, 1.545f, -3.706f, 2.067f, -5.167f, 2.238f)
                curveToRelative(0.511f, -2.426f, 2.136f, -6.759f, 7.254f, -7.553f)
                curveToRelative(-0.114f, 2.268f, -0.813f, 4.052f, -2.087f, 5.314f)
                close()
                moveTo(10.5f, 5.0f)
                horizontalLineToRelative(-3.632f)
                lineTo(11.104f, 0.371f)
                curveToRelative(0.443f, -0.494f, 1.217f, -0.494f, 1.66f, 0.0f)
                lineToRelative(4.236f, 4.629f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 5.0f)
                close()
            }
        }
        .build()
        return _plantGrowth!!
    }

private var _plantGrowth: ImageVector? = null
