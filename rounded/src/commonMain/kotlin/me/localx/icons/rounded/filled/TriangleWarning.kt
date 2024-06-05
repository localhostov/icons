package me.localx.icons.rounded.filled

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

public val Icons.Filled.TriangleWarning: ImageVector
    get() {
        if (_triangleWarning != null) {
            return _triangleWarning!!
        }
        _triangleWarning = Builder(name = "TriangleWarning", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.08f, 15.33f)
                lineTo(15.0f, 2.57f)
                curveToRelative(-0.68f, -0.98f, -1.81f, -1.57f, -3.0f, -1.57f)
                reflectiveCurveToRelative(-2.32f, 0.58f, -3.03f, 1.6f)
                lineTo(0.93f, 15.31f)
                curveToRelative(-1.02f, 1.46f, -1.21f, 3.21f, -0.5f, 4.56f)
                curveToRelative(0.7f, 1.35f, 2.17f, 2.12f, 4.01f, 2.12f)
                horizontalLineToRelative(15.12f)
                curveToRelative(1.85f, 0.0f, 3.31f, -0.77f, 4.01f, -2.12f)
                curveToRelative(0.7f, -1.35f, 0.51f, -3.09f, -0.49f, -4.54f)
                close()
                moveTo(11.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 7.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _triangleWarning!!
    }

private var _triangleWarning: ImageVector? = null
