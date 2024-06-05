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

public val Icons.Bold.License: ImageVector
    get() {
        if (_license != null) {
            return _license!!
        }
        _license = Builder(name = "License", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 11.0f)
                curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0.0f, 1.56f, 0.79f, 2.93f, 2.0f, 3.74f)
                verticalLineToRelative(3.86f)
                curveToRelative(0.0f, 0.8f, 0.97f, 1.21f, 1.54f, 0.64f)
                lineToRelative(0.96f, -0.96f)
                lineToRelative(0.96f, 0.96f)
                curveToRelative(0.57f, 0.57f, 1.54f, 0.17f, 1.54f, -0.64f)
                verticalLineToRelative(-3.86f)
                curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(13.5f, 14.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22.0f, 8.2f)
                verticalLineToRelative(10.34f)
                curveToRelative(0.0f, 1.34f, -0.49f, 2.63f, -1.38f, 3.64f)
                curveToRelative(-0.55f, 0.62f, -1.5f, 0.68f, -2.12f, 0.13f)
                curveToRelative(-0.62f, -0.55f, -0.68f, -1.5f, -0.13f, -2.12f)
                curveToRelative(0.4f, -0.46f, 0.62f, -1.04f, 0.62f, -1.65f)
                lineTo(18.99f, 9.04f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(12.99f, 3.04f)
                lineTo(7.5f, 3.04f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(2.0f, 5.54f)
                curveTo(2.0f, 2.51f, 4.47f, 0.04f, 7.5f, 0.04f)
                horizontalLineToRelative(6.34f)
                curveToRelative(1.47f, 0.0f, 2.85f, 0.57f, 3.89f, 1.61f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
                close()
            }
        }
        .build()
        return _license!!
    }

private var _license: ImageVector? = null
