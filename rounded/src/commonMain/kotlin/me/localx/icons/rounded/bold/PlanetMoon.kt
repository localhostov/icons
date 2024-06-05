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

public val Icons.Bold.PlanetMoon: ImageVector
    get() {
        if (_planetMoon != null) {
            return _planetMoon!!
        }
        _planetMoon = Builder(name = "PlanetMoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 3.0f)
                curveTo(4.71f, 3.0f, 0.0f, 7.71f, 0.0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3.0f, 10.5f, 3.0f)
                close()
                moveTo(10.5f, 21.0f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                curveToRelative(0.0f, -1.038f, 0.212f, -2.027f, 0.594f, -2.926f)
                lineToRelative(0.034f, 0.036f)
                curveToRelative(0.237f, 0.249f, 0.566f, 0.39f, 0.909f, 0.39f)
                horizontalLineToRelative(1.942f)
                curveToRelative(0.333f, 0.0f, 0.652f, 0.132f, 0.887f, 0.368f)
                lineToRelative(0.265f, 0.265f)
                curveToRelative(0.235f, 0.235f, 0.368f, 0.555f, 0.368f, 0.887f)
                verticalLineToRelative(0.96f)
                curveToRelative(0.0f, 0.333f, 0.132f, 0.652f, 0.368f, 0.887f)
                lineToRelative(1.265f, 1.265f)
                curveToRelative(0.235f, 0.235f, 0.368f, 0.555f, 0.368f, 0.887f)
                verticalLineToRelative(1.225f)
                curveToRelative(0.0f, 0.693f, 0.562f, 1.255f, 1.255f, 1.255f)
                curveToRelative(0.459f, 0.0f, 0.882f, -0.251f, 1.102f, -0.654f)
                lineToRelative(2.077f, -3.808f)
                curveToRelative(0.318f, -0.583f, 0.127f, -1.313f, -0.437f, -1.665f)
                lineToRelative(-2.533f, -1.583f)
                curveToRelative(-0.303f, -0.19f, -0.654f, -0.29f, -1.012f, -0.29f)
                horizontalLineToRelative(-1.388f)
                curveToRelative(-0.361f, 0.0f, -0.708f, -0.144f, -0.963f, -0.399f)
                lineToRelative(-0.435f, -0.435f)
                curveToRelative(-0.368f, -0.368f, -0.368f, -0.964f, 0.0f, -1.332f)
                lineToRelative(0.354f, -0.354f)
                curveToRelative(0.287f, -0.287f, 0.725f, -0.358f, 1.087f, -0.176f)
                lineToRelative(0.786f, 0.393f)
                curveToRelative(0.363f, 0.181f, 0.801f, 0.11f, 1.087f, -0.176f)
                curveToRelative(0.306f, -0.306f, 0.364f, -0.78f, 0.142f, -1.151f)
                lineToRelative(-0.82f, -1.367f)
                curveToRelative(0.066f, -0.002f, 0.132f, -0.003f, 0.198f, -0.003f)
                curveToRelative(4.136f, 0.0f, 7.5f, 3.364f, 7.5f, 7.5f)
                reflectiveCurveToRelative(-3.364f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(24.0f, 2.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _planetMoon!!
    }

private var _planetMoon: ImageVector? = null
