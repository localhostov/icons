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

public val Icons.Bold.BugSlash: ImageVector
    get() {
        if (_bugSlash != null) {
            return _bugSlash!!
        }
        _bugSlash = Builder(name = "BugSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.88f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.57f)
                curveToRelative(0.04f, -0.33f, 0.07f, -0.66f, 0.07f, -1.0f)
                curveToRelative(0.0f, -0.29f, -0.03f, -0.63f, -0.09f, -1.0f)
                horizontalLineToRelative(3.09f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.82f)
                curveToRelative(-0.21f, -0.7f, -0.43f, -1.39f, -0.65f, -2.0f)
                horizontalLineToRelative(1.97f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.68f)
                curveToRelative(-1.11f, -1.82f, -3.16f, -3.0f, -5.34f, -3.0f)
                reflectiveCurveToRelative(-3.98f, 1.06f, -5.11f, 2.75f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-0.96f, -0.96f)
                close()
                moveTo(9.1f, 6.9f)
                curveToRelative(0.5f, -1.15f, 1.64f, -1.9f, 2.89f, -1.9f)
                reflectiveCurveToRelative(2.46f, 0.76f, 2.96f, 1.9f)
                curveToRelative(0.35f, 0.81f, 2.06f, 5.68f, 2.06f, 7.1f)
                curveToRelative(0.0f, 0.27f, -0.03f, 0.54f, -0.07f, 0.81f)
                lineToRelative(-7.86f, -7.86f)
                reflectiveCurveToRelative(0.02f, -0.04f, 0.02f, -0.05f)
                close()
                moveTo(13.74f, 18.69f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(-1.19f, 0.68f, -2.56f, 1.07f, -3.98f, 1.07f)
                curveToRelative(-2.95f, 0.0f, -5.53f, -1.61f, -6.92f, -4.0f)
                horizontalLineToRelative(-1.08f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 21.01f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.57f)
                curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1.0f)
                curveToRelative(0.0f, -0.29f, 0.04f, -0.63f, 0.1f, -1.0f)
                lineTo(1.0f, 13.01f)
                verticalLineToRelative(-3.0f)
                lineTo(5.05f, 10.01f)
                lineToRelative(2.26f, 2.26f)
                curveToRelative(-0.19f, 0.73f, -0.31f, 1.36f, -0.31f, 1.74f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.6f, 0.0f, 1.19f, -0.11f, 1.74f, -0.31f)
                close()
            }
        }
        .build()
        return _bugSlash!!
    }

private var _bugSlash: ImageVector? = null
