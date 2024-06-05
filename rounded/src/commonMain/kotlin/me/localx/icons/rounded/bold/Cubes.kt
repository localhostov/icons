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
                moveTo(22.27f, 11.68f)
                lineToRelative(-3.52f, -2.08f)
                lineTo(18.75f, 5.41f)
                curveToRelative(0.0f, -1.23f, -0.66f, -2.39f, -1.72f, -3.01f)
                lineTo(13.78f, 0.48f)
                curveToRelative(-1.1f, -0.65f, -2.46f, -0.65f, -3.55f, 0.0f)
                lineToRelative(-3.25f, 1.91f)
                curveToRelative(-1.06f, 0.63f, -1.72f, 1.78f, -1.72f, 3.01f)
                verticalLineToRelative(4.19f)
                lineToRelative(-3.52f, 2.08f)
                curveTo(0.67f, 12.3f, 0.01f, 13.46f, 0.01f, 14.69f)
                verticalLineToRelative(3.9f)
                curveToRelative(0.0f, 1.23f, 0.66f, 2.39f, 1.72f, 3.02f)
                lineToRelative(3.25f, 1.91f)
                curveToRelative(0.55f, 0.32f, 1.16f, 0.48f, 1.78f, 0.48f)
                reflectiveCurveToRelative(1.23f, -0.16f, 1.78f, -0.48f)
                lineToRelative(3.47f, -2.04f)
                lineToRelative(3.47f, 2.04f)
                curveToRelative(0.55f, 0.32f, 1.16f, 0.48f, 1.78f, 0.48f)
                reflectiveCurveToRelative(1.23f, -0.16f, 1.78f, -0.48f)
                lineToRelative(3.25f, -1.91f)
                curveToRelative(1.06f, -0.63f, 1.72f, -1.78f, 1.72f, -3.01f)
                verticalLineToRelative(-3.9f)
                curveToRelative(0.0f, -1.23f, -0.66f, -2.39f, -1.72f, -3.02f)
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
                moveTo(11.01f, 7.93f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, -1.62f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, 1.62f)
                close()
                moveTo(15.76f, 6.31f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, 1.62f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, -1.62f)
                close()
                moveTo(11.76f, 3.06f)
                curveToRelative(0.16f, -0.09f, 0.35f, -0.09f, 0.51f, 0.0f)
                lineToRelative(2.53f, 1.49f)
                lineToRelative(-2.78f, 1.64f)
                lineToRelative(-2.78f, -1.64f)
                lineToRelative(2.53f, -1.49f)
                close()
                moveTo(3.26f, 19.03f)
                curveToRelative(-0.15f, -0.09f, -0.25f, -0.25f, -0.25f, -0.43f)
                verticalLineToRelative(-3.0f)
                lineToRelative(2.74f, 1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.5f, -1.47f)
                close()
                moveTo(7.76f, 20.5f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, -1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, 1.62f)
                close()
                moveTo(13.51f, 18.88f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.75f, 1.62f)
                verticalLineToRelative(3.28f)
                lineToRelative(-2.75f, -1.62f)
                close()
                moveTo(20.75f, 19.03f)
                lineToRelative(-2.5f, 1.47f)
                verticalLineToRelative(-3.28f)
                lineToRelative(2.74f, -1.62f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.18f, -0.09f, 0.34f, -0.25f, 0.43f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
