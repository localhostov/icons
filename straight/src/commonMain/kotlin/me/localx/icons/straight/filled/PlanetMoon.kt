package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.PlanetMoon: ImageVector
    get() {
        if (_planetMoon != null) {
            return _planetMoon!!
        }
        _planetMoon = Builder(name = "PlanetMoon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 2.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 3.0f)
                curveTo(4.71f, 3.0f, 0.0f, 7.71f, 0.0f, 13.5f)
                reflectiveCurveToRelative(4.71f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveToRelative(10.5f, -4.71f, 10.5f, -10.5f)
                reflectiveCurveTo(16.29f, 3.0f, 10.5f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-1.141f, -1.199f)
                curveToRelative(1.354f, -2.784f, 4.177f, -4.721f, 7.458f, -4.791f)
                curveToRelative(-0.194f, 0.299f, -0.317f, 0.491f, -0.317f, 0.491f)
                lineToRelative(1.5f, 2.5f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4.0f, 2.5f)
                lineToRelative(-3.0f, 5.5f)
                close()
            }
        }
        .build()
        return _planetMoon!!
    }

private var _planetMoon: ImageVector? = null
