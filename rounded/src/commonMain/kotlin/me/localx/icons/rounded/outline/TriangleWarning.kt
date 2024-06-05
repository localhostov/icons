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

public val Icons.Outline.TriangleWarning: ImageVector
    get() {
        if (_triangleWarning != null) {
            return _triangleWarning!!
        }
        _triangleWarning = Builder(name = "TriangleWarning", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                lineTo(11.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.58f, 19.88f)
                curveToRelative(-0.7f, 1.35f, -2.17f, 2.12f, -4.01f, 2.12f)
                lineTo(4.44f, 22.0f)
                curveToRelative(-1.85f, 0.0f, -3.31f, -0.77f, -4.01f, -2.12f)
                curveToRelative(-0.71f, -1.36f, -0.51f, -3.1f, 0.5f, -4.56f)
                lineTo(8.97f, 2.6f)
                curveToRelative(0.71f, -1.02f, 1.83f, -1.6f, 3.03f, -1.6f)
                reflectiveCurveToRelative(2.32f, 0.58f, 3.0f, 1.57f)
                lineToRelative(8.08f, 12.77f)
                curveToRelative(1.01f, 1.46f, 1.2f, 3.19f, 0.49f, 4.54f)
                close()
                moveTo(21.43f, 16.46f)
                reflectiveCurveToRelative(-0.02f, -0.02f, -0.02f, -0.04f)
                lineTo(13.34f, 3.67f)
                curveToRelative(-0.29f, -0.41f, -0.79f, -0.67f, -1.34f, -0.67f)
                reflectiveCurveToRelative(-1.05f, 0.26f, -1.36f, 0.71f)
                lineTo(2.59f, 16.42f)
                curveToRelative(-0.62f, 0.88f, -0.76f, 1.84f, -0.4f, 2.53f)
                curveToRelative(0.35f, 0.68f, 1.15f, 1.05f, 2.24f, 1.05f)
                horizontalLineToRelative(15.12f)
                curveToRelative(1.09f, 0.0f, 1.89f, -0.37f, 2.24f, -1.05f)
                curveToRelative(0.36f, -0.69f, 0.22f, -1.65f, -0.37f, -2.49f)
                close()
            }
        }
        .build()
        return _triangleWarning!!
    }

private var _triangleWarning: ImageVector? = null
