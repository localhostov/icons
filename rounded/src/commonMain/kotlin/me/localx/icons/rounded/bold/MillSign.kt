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

public val Icons.Bold.MillSign: ImageVector
    get() {
        if (_millSign != null) {
            return _millSign!!
        }
        _millSign = Builder(name = "MillSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.75f)
                verticalLineToRelative(9.75f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(9.75f)
                curveToRelative(0.0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                curveToRelative(-0.39f, 0.0f, -0.77f, 0.06f, -1.12f, 0.17f)
                lineToRelative(-2.63f, 6.14f)
                verticalLineToRelative(7.19f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.19f)
                lineToRelative(-1.62f, 3.78f)
                curveToRelative(-0.24f, 0.57f, -0.8f, 0.91f, -1.38f, 0.91f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.04f, -0.59f, -0.12f)
                curveToRelative(-0.76f, -0.33f, -1.11f, -1.21f, -0.79f, -1.97f)
                lineToRelative(4.38f, -10.22f)
                verticalLineToRelative(-1.94f)
                curveToRelative(0.0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                reflectiveCurveToRelative(-3.75f, 1.68f, -3.75f, 3.75f)
                verticalLineToRelative(9.75f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.71f, 0.0f, 1.31f, 0.5f, 1.46f, 1.17f)
                curveToRelative(1.08f, -0.74f, 2.38f, -1.17f, 3.79f, -1.17f)
                curveToRelative(2.12f, 0.0f, 4.01f, 0.98f, 5.25f, 2.51f)
                curveToRelative(0.51f, -0.63f, 1.13f, -1.16f, 1.82f, -1.58f)
                lineToRelative(1.3f, -3.03f)
                curveToRelative(0.33f, -0.76f, 1.21f, -1.11f, 1.97f, -0.79f)
                curveToRelative(0.76f, 0.33f, 1.11f, 1.21f, 0.79f, 1.97f)
                lineToRelative(-0.39f, 0.91f)
                curveToRelative(3.61f, 0.13f, 6.51f, 3.1f, 6.51f, 6.75f)
                close()
            }
        }
        .build()
        return _millSign!!
    }

private var _millSign: ImageVector? = null
