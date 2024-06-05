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

public val Icons.Bold.LightbulbSlash: ImageVector
    get() {
        if (_lightbulbSlash != null) {
            return _lightbulbSlash!!
        }
        _lightbulbSlash = Builder(name = "LightbulbSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.88f, 15.76f)
                reflectiveCurveToRelative(0.04f, -0.04f, 0.06f, -0.05f)
                curveToRelative(1.94f, -1.7f, 3.06f, -4.16f, 3.06f, -6.74f)
                reflectiveCurveToRelative(-1.09f, -4.99f, -2.99f, -6.69f)
                curveTo(16.1f, 0.58f, 13.55f, -0.22f, 11.0f, 0.06f)
                curveToRelative(-2.23f, 0.25f, -4.28f, 1.36f, -5.75f, 3.06f)
                lineTo(2.16f, 0.03f)
                lineTo(0.04f, 2.15f)
                lineTo(21.84f, 23.95f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-6.08f, -6.08f)
                close()
                moveTo(11.33f, 3.04f)
                curveToRelative(1.73f, -0.2f, 3.39f, 0.33f, 4.67f, 1.47f)
                curveToRelative(1.27f, 1.13f, 1.99f, 2.75f, 1.99f, 4.45f)
                reflectiveCurveToRelative(-0.74f, 3.35f, -2.03f, 4.48f)
                curveToRelative(-0.07f, 0.06f, -0.14f, 0.12f, -0.21f, 0.19f)
                lineTo(7.38f, 5.25f)
                curveToRelative(0.98f, -1.23f, 2.41f, -2.03f, 3.96f, -2.21f)
                close()
                moveTo(11.05f, 16.0f)
                lineToRelative(4.94f, 4.94f)
                verticalLineToRelative(3.06f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.2f)
                curveToRelative(-0.04f, -1.49f, -0.7f, -2.89f, -1.82f, -3.87f)
                curveToRelative(-2.19f, -2.03f, -3.33f, -4.94f, -3.11f, -7.91f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(0.37f, 0.76f, 0.87f, 1.47f, 1.5f, 2.06f)
                curveToRelative(0.71f, 0.66f, 1.31f, 1.42f, 1.77f, 2.27f)
                horizontalLineToRelative(1.06f)
                close()
            }
        }
        .build()
        return _lightbulbSlash!!
    }

private var _lightbulbSlash: ImageVector? = null
