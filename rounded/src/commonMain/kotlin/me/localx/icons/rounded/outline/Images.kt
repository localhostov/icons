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

public val Icons.Outline.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(10.0f, 16.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(5.0f, 5.0f)
                curveTo(5.0f, 2.24f, 7.24f, 0.0f, 10.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(7.0f, 11.0f)
                curveToRelative(0.0f, 0.77f, 0.29f, 1.47f, 0.77f, 2.01f)
                lineToRelative(5.24f, -5.24f)
                curveToRelative(0.98f, -0.98f, 2.69f, -0.98f, 3.67f, 0.0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0.0f)
                lineToRelative(3.43f, -3.43f)
                verticalLineToRelative(-0.38f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(10.0f, 2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(22.0f, 11.0f)
                verticalLineToRelative(-2.79f)
                lineToRelative(-2.02f, 2.02f)
                curveToRelative(-0.98f, 0.98f, -2.69f, 0.98f, -3.67f, 0.0f)
                lineToRelative(-1.04f, -1.04f)
                curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0.0f)
                lineToRelative(-4.79f, 4.79f)
                curveToRelative(0.12f, 0.02f, 0.24f, 0.02f, 0.37f, 0.02f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                close()
                moveTo(18.09f, 18.04f)
                curveToRelative(-0.53f, -0.15f, -1.08f, 0.17f, -1.23f, 0.7f)
                lineToRelative(-0.29f, 1.06f)
                curveToRelative(-0.21f, 0.77f, -0.71f, 1.42f, -1.41f, 1.81f)
                curveToRelative(-0.7f, 0.4f, -1.51f, 0.5f, -2.28f, 0.29f)
                lineToRelative(-8.68f, -2.38f)
                curveToRelative(-1.6f, -0.44f, -2.54f, -2.09f, -2.1f, -3.69f)
                lineToRelative(0.96f, -3.56f)
                curveToRelative(0.14f, -0.53f, -0.17f, -1.08f, -0.7f, -1.23f)
                curveToRelative(-0.53f, -0.14f, -1.08f, 0.17f, -1.23f, 0.7f)
                lineTo(0.18f, 15.29f)
                curveToRelative(-0.73f, 2.66f, 0.84f, 5.42f, 3.5f, 6.15f)
                lineToRelative(8.68f, 2.38f)
                curveToRelative(0.44f, 0.12f, 0.89f, 0.18f, 1.33f, 0.18f)
                curveToRelative(0.86f, 0.0f, 1.7f, -0.22f, 2.47f, -0.66f)
                curveToRelative(1.16f, -0.66f, 1.99f, -1.73f, 2.35f, -3.02f)
                lineToRelative(0.29f, -1.06f)
                curveToRelative(0.15f, -0.53f, -0.17f, -1.08f, -0.7f, -1.23f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
