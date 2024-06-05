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

public val Icons.Bold.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 9.6f)
                lineTo(18.75f, 3.41f)
                lineTo(13.78f, 0.48f)
                curveToRelative(-1.1f, -0.65f, -2.46f, -0.65f, -3.55f, 0.0f)
                lineTo(5.25f, 3.41f)
                verticalLineToRelative(6.19f)
                lineTo(0.01f, 12.69f)
                verticalLineToRelative(7.9f)
                lineToRelative(4.97f, 2.93f)
                curveToRelative(0.55f, 0.32f, 1.16f, 0.48f, 1.78f, 0.48f)
                reflectiveCurveToRelative(1.23f, -0.16f, 1.78f, -0.48f)
                lineToRelative(3.47f, -2.04f)
                lineToRelative(3.47f, 2.04f)
                curveToRelative(0.55f, 0.32f, 1.16f, 0.48f, 1.78f, 0.48f)
                reflectiveCurveToRelative(1.23f, -0.16f, 1.78f, -0.48f)
                lineToRelative(4.97f, -2.93f)
                verticalLineToRelative(-7.9f)
                lineToRelative(-5.24f, -3.09f)
                close()
                moveTo(17.25f, 15.48f)
                lineToRelative(-2.78f, -1.64f)
                lineToRelative(2.78f, -1.64f)
                lineToRelative(2.78f, 1.64f)
                lineToRelative(-2.78f, 1.64f)
                close()
                moveTo(6.76f, 15.48f)
                lineToRelative(-2.78f, -1.64f)
                lineToRelative(2.78f, -1.64f)
                lineToRelative(2.78f, 1.64f)
                lineToRelative(-2.78f, 1.64f)
                close()
                moveTo(8.26f, 6.31f)
                lineToRelative(2.75f, 1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, -1.62f)
                verticalLineToRelative(-3.28f)
                close()
                moveTo(13.01f, 11.21f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, -1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, 1.62f)
                close()
                moveTo(11.76f, 3.06f)
                curveToRelative(0.16f, -0.09f, 0.35f, -0.09f, 0.51f, 0.0f)
                lineToRelative(2.53f, 1.49f)
                lineToRelative(-2.78f, 1.64f)
                lineToRelative(-2.78f, -1.64f)
                lineToRelative(2.53f, -1.49f)
                close()
                moveTo(3.01f, 18.88f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.74f, 1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.74f, -1.62f)
                close()
                moveTo(7.75f, 20.5f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, -1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, 1.62f)
                close()
                moveTo(13.5f, 18.88f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, 1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, -1.62f)
                close()
                moveTo(18.25f, 20.5f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.74f, -1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.74f, 1.62f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
