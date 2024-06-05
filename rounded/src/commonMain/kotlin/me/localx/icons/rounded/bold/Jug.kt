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

public val Icons.Bold.Jug: ImageVector
    get() {
        if (_jug != null) {
            return _jug!!
        }
        _jug = Builder(name = "Jug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.28f)
                curveToRelative(0.0f, -2.36f, -1.92f, -4.28f, -4.28f, -4.28f)
                curveToRelative(-0.61f, 0.0f, -1.19f, 0.13f, -1.72f, 0.36f)
                verticalLineToRelative(-1.45f)
                curveToRelative(0.58f, -0.21f, 1.0f, -0.76f, 1.0f, -1.41f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0.0f, 0.65f, 0.42f, 1.21f, 1.0f, 1.41f)
                lineTo(8.0f, 7.29f)
                curveToRelative(0.0f, 0.17f, -0.08f, 0.32f, -0.22f, 0.42f)
                lineToRelative(-3.33f, 2.22f)
                curveToRelative(-1.53f, 1.02f, -2.45f, 2.73f, -2.45f, 4.58f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.22f, -0.4f, -2.39f, -1.12f, -3.33f)
                curveToRelative(0.71f, -0.78f, 1.12f, -1.8f, 1.12f, -2.89f)
                close()
                moveTo(17.72f, 7.0f)
                curveToRelative(0.7f, 0.0f, 1.28f, 0.57f, 1.28f, 1.28f)
                curveToRelative(0.0f, 0.38f, -0.17f, 0.74f, -0.45f, 0.98f)
                lineToRelative(-2.04f, -1.36f)
                curveToRelative(0.16f, -0.52f, 0.66f, -0.89f, 1.22f, -0.89f)
                close()
                moveTo(19.0f, 18.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                lineTo(15.5f, 16.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(5.5f, 13.0f)
                curveToRelative(0.17f, -0.22f, 0.37f, -0.42f, 0.61f, -0.58f)
                lineToRelative(3.33f, -2.22f)
                curveToRelative(0.98f, -0.65f, 1.56f, -1.74f, 1.56f, -2.91f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 7.29f)
                curveToRelative(0.0f, 1.17f, 0.58f, 2.26f, 1.56f, 2.91f)
                lineToRelative(3.33f, 2.22f)
                curveToRelative(0.7f, 0.46f, 1.11f, 1.24f, 1.11f, 2.08f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _jug!!
    }

private var _jug: ImageVector? = null
