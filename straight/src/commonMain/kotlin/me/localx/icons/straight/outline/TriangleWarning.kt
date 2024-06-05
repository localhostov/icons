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
                moveTo(23.64f, 18.1f)
                lineTo(14.24f, 2.28f)
                curveToRelative(-0.47f, -0.8f, -1.3f, -1.28f, -2.24f, -1.28f)
                reflectiveCurveToRelative(-1.77f, 0.48f, -2.23f, 1.28f)
                lineTo(0.36f, 18.1f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.47f, 0.82f, -0.47f, 1.79f, 0.0f, 2.6f)
                reflectiveCurveToRelative(1.31f, 1.3f, 2.24f, 1.3f)
                lineTo(21.41f, 22.0f)
                curveToRelative(0.94f, 0.0f, 1.78f, -0.49f, 2.24f, -1.3f)
                reflectiveCurveToRelative(0.46f, -1.78f, -0.01f, -2.6f)
                close()
                moveTo(21.92f, 19.7f)
                curveToRelative(-0.05f, 0.09f, -0.2f, 0.29f, -0.51f, 0.29f)
                lineTo(2.59f, 19.99f)
                curveToRelative(-0.31f, 0.0f, -0.46f, -0.21f, -0.51f, -0.29f)
                reflectiveCurveToRelative(-0.15f, -0.32f, 0.0f, -0.59f)
                lineTo(11.49f, 3.29f)
                curveToRelative(0.15f, -0.26f, 0.41f, -0.29f, 0.51f, -0.29f)
                reflectiveCurveToRelative(0.35f, 0.03f, 0.51f, 0.3f)
                lineToRelative(9.4f, 15.82f)
                curveToRelative(0.16f, 0.26f, 0.05f, 0.5f, 0.0f, 0.59f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _triangleWarning!!
    }

private var _triangleWarning: ImageVector? = null
