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

public val Icons.Outline.License: ImageVector
    get() {
        if (_license != null) {
            return _license!!
        }
        _license = Builder(name = "License", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.95f, 5.54f)
                lineToRelative(-3.48f, -3.49f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                lineTo(7.0f, 0.0f)
                curveTo(4.24f, 0.0f, 2.0f, 2.24f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0.0f, 0.33f, 0.0f, 0.49f, 0.02f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.98f)
                curveToRelative(0.02f, 0.16f, 0.02f, 0.32f, 0.02f, 0.49f)
                verticalLineToRelative(8.51f)
                curveToRelative(0.0f, 1.07f, -0.58f, 2.06f, -1.5f, 2.6f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                curveToRelative(0.27f, 0.48f, 0.88f, 0.64f, 1.37f, 0.37f)
                curveToRelative(1.54f, -0.89f, 2.5f, -2.55f, 2.5f, -4.33f)
                lineTo(22.01f, 10.49f)
                curveToRelative(0.0f, -1.87f, -0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(14.0f, 2.66f)
                curveToRelative(0.38f, 0.22f, 0.73f, 0.49f, 1.05f, 0.81f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.32f, 0.32f, 0.59f, 0.67f, 0.81f, 1.05f)
                horizontalLineToRelative(-4.34f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.48f, 0.81f, 2.77f, 2.0f, 3.46f)
                verticalLineToRelative(3.81f)
                curveToRelative(0.0f, 0.64f, 0.78f, 0.96f, 1.23f, 0.51f)
                lineToRelative(0.77f, -0.77f)
                lineToRelative(0.77f, 0.77f)
                curveToRelative(0.45f, 0.45f, 1.23f, 0.13f, 1.23f, -0.51f)
                verticalLineToRelative(-3.81f)
                curveToRelative(1.19f, -0.69f, 2.0f, -1.99f, 2.0f, -3.46f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(14.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _license!!
    }

private var _license: ImageVector? = null
