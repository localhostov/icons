package me.localx.icons.rounded.outline

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

public val Icons.Outline.LightbulbSlash: ImageVector
    get() {
        if (_lightbulbSlash != null) {
            return _lightbulbSlash!!
        }
        _lightbulbSlash = Builder(name = "LightbulbSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.88f, 21.26f)
                curveToRelative(-0.43f, 1.62f, -1.89f, 2.74f, -3.57f, 2.74f)
                horizontalLineToRelative(-0.62f)
                curveToRelative(-2.03f, 0.0f, -3.69f, -1.66f, -3.69f, -3.69f)
                verticalLineToRelative(-0.16f)
                curveToRelative(0.0f, -1.67f, -0.76f, -3.29f, -2.13f, -4.57f)
                curveToRelative(-1.82f, -1.7f, -2.87f, -4.1f, -2.87f, -6.58f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.96f, 0.79f, 3.78f, 2.23f, 5.12f)
                curveToRelative(1.2f, 1.12f, 2.04f, 2.45f, 2.46f, 3.88f)
                horizontalLineToRelative(3.31f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                reflectiveCurveToRelative(0.0f, 0.1f, 0.0f, 0.15f)
                verticalLineToRelative(0.16f)
                curveToRelative(0.0f, 0.93f, 0.76f, 1.69f, 1.69f, 1.69f)
                horizontalLineToRelative(0.62f)
                curveToRelative(0.77f, 0.0f, 1.44f, -0.52f, 1.63f, -1.26f)
                curveToRelative(0.14f, -0.53f, 0.69f, -0.85f, 1.22f, -0.71f)
                curveToRelative(0.53f, 0.14f, 0.85f, 0.69f, 0.71f, 1.22f)
                close()
                moveTo(23.71f, 23.7f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.7f)
                curveTo(-0.1f, 1.31f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(3.19f, 3.19f)
                curveTo(6.38f, 1.58f, 8.57f, 0.33f, 10.96f, 0.06f)
                curveToRelative(2.56f, -0.29f, 5.13f, 0.52f, 7.04f, 2.23f)
                curveToRelative(1.91f, 1.71f, 3.01f, 4.15f, 3.01f, 6.71f)
                reflectiveCurveToRelative(-1.12f, 5.05f, -3.07f, 6.76f)
                curveToRelative(-0.13f, 0.12f, -0.26f, 0.24f, -0.38f, 0.37f)
                lineToRelative(6.16f, 6.16f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                close()
                moveTo(6.33f, 4.91f)
                lineToRelative(9.81f, 9.81f)
                curveToRelative(0.15f, -0.16f, 0.31f, -0.31f, 0.48f, -0.46f)
                curveToRelative(1.52f, -1.33f, 2.39f, -3.25f, 2.39f, -5.26f)
                reflectiveCurveToRelative(-0.85f, -3.89f, -2.34f, -5.22f)
                curveToRelative(-1.51f, -1.35f, -3.45f, -1.96f, -5.48f, -1.73f)
                curveToRelative(-1.93f, 0.22f, -3.7f, 1.27f, -4.85f, 2.86f)
                close()
            }
        }
        .build()
        return _lightbulbSlash!!
    }

private var _lightbulbSlash: ImageVector? = null
