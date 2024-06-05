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

public val Icons.Outline.WindTurbine: ImageVector
    get() {
        if (_windTurbine != null) {
            return _windTurbine!!
        }
        _windTurbine = Builder(name = "WindTurbine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.196f, 13.948f)
                curveToRelative(-0.159f, -0.131f, -3.756f, -3.087f, -6.674f, -4.978f)
                curveToRelative(-0.392f, -3.456f, -1.433f, -7.995f, -1.479f, -8.195f)
                lineToRelative(-0.179f, -0.775f)
                horizontalLineToRelative(-3.729f)
                lineToRelative(-0.179f, 0.775f)
                curveToRelative(-0.046f, 0.2f, -1.087f, 4.739f, -1.479f, 8.195f)
                curveToRelative(-2.918f, 1.891f, -6.516f, 4.847f, -6.674f, 4.978f)
                lineToRelative(-0.614f, 0.506f)
                lineToRelative(1.663f, 3.336f)
                lineToRelative(0.773f, -0.186f)
                curveToRelative(0.193f, -0.046f, 4.196f, -1.013f, 7.387f, -2.116f)
                verticalLineToRelative(6.512f)
                horizontalLineToRelative(-4.022f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.045f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.023f)
                verticalLineToRelative(-6.503f)
                curveToRelative(3.187f, 1.1f, 7.167f, 2.061f, 7.36f, 2.107f)
                lineToRelative(0.773f, 0.186f)
                lineToRelative(1.663f, -3.336f)
                lineToRelative(-0.614f, -0.506f)
                close()
                moveTo(20.07f, 15.468f)
                curveToRelative(-1.589f, -0.403f, -5.282f, -1.379f, -7.702f, -2.337f)
                lineToRelative(-0.368f, -0.146f)
                lineToRelative(-0.368f, 0.146f)
                curveToRelative(-2.419f, 0.958f, -6.113f, 1.934f, -7.702f, 2.337f)
                lineToRelative(-0.237f, -0.476f)
                curveToRelative(1.232f, -0.989f, 4.067f, -3.217f, 6.26f, -4.59f)
                lineToRelative(0.417f, -0.261f)
                lineToRelative(0.047f, -0.489f)
                curveToRelative(0.251f, -2.576f, 0.981f, -6.107f, 1.316f, -7.651f)
                horizontalLineToRelative(0.532f)
                curveToRelative(0.335f, 1.544f, 1.065f, 5.076f, 1.316f, 7.651f)
                lineToRelative(0.047f, 0.489f)
                lineToRelative(0.417f, 0.261f)
                curveToRelative(2.193f, 1.373f, 5.028f, 3.602f, 6.26f, 4.59f)
                lineToRelative(-0.237f, 0.476f)
                close()
            }
        }
        .build()
        return _windTurbine!!
    }

private var _windTurbine: ImageVector? = null
