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
                moveTo(17.57f, 16.15f)
                curveToRelative(0.12f, -0.13f, 0.23f, -0.28f, 0.36f, -0.39f)
                curveToRelative(1.95f, -1.71f, 3.07f, -4.17f, 3.07f, -6.76f)
                reflectiveCurveToRelative(-1.1f, -5.01f, -3.01f, -6.71f)
                curveTo(16.09f, 0.58f, 13.52f, -0.23f, 10.96f, 0.06f)
                curveToRelative(-2.38f, 0.27f, -4.57f, 1.53f, -6.05f, 3.43f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.45f)
                lineTo(22.54f, 23.95f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.38f, -6.38f)
                close()
                moveTo(11.18f, 2.05f)
                curveToRelative(2.03f, -0.23f, 3.98f, 0.39f, 5.48f, 1.73f)
                curveToRelative(1.49f, 1.33f, 2.34f, 3.23f, 2.34f, 5.22f)
                reflectiveCurveToRelative(-0.87f, 3.93f, -2.39f, 5.26f)
                curveToRelative(-0.16f, 0.14f, -0.32f, 0.3f, -0.47f, 0.46f)
                lineTo(6.33f, 4.91f)
                curveToRelative(1.15f, -1.59f, 2.92f, -2.65f, 4.85f, -2.86f)
                close()
                moveTo(9.68f, 18.0f)
                curveToRelative(-0.42f, -1.43f, -1.25f, -2.77f, -2.45f, -3.88f)
                curveToRelative(-1.38f, -1.29f, -2.15f, -3.01f, -2.21f, -4.87f)
                lineToRelative(-1.86f, -1.86f)
                curveToRelative(-0.03f, 0.14f, -0.06f, 0.29f, -0.08f, 0.43f)
                curveToRelative(-0.37f, 2.93f, 0.64f, 5.76f, 2.79f, 7.76f)
                curveToRelative(1.38f, 1.28f, 2.13f, 2.9f, 2.13f, 4.57f)
                verticalLineToRelative(3.85f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.69f)
                reflectiveCurveToRelative(0.0f, -0.05f, 0.0f, -0.07f)
                lineToRelative(-2.24f, -2.24f)
                horizontalLineToRelative(-4.09f)
                close()
                moveTo(14.0f, 20.31f)
                verticalLineToRelative(1.69f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.85f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.1f, 0.0f, -0.15f)
                horizontalLineToRelative(4.03f)
                curveToRelative(0.0f, 0.11f, -0.02f, 0.21f, -0.02f, 0.31f)
                close()
            }
        }
        .build()
        return _lightbulbSlash!!
    }

private var _lightbulbSlash: ImageVector? = null
