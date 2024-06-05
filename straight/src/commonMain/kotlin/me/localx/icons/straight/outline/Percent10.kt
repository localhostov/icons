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

public val Icons.Outline.Percent10: ImageVector
    get() {
        if (_percent10 != null) {
            return _percent10!!
        }
        _percent10 = Builder(name = "Percent10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 10.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                close()
                moveTo(14.4f, 10.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.496f, -0.404f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.404f, -0.9f, -0.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.496f, 0.404f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.404f, 0.9f, 0.9f)
                close()
                moveTo(24.0f, 14.731f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(18.25f, 10.481f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(16.867f, 16.0f)
                lineToRelative(5.222f, -8.0f)
                horizontalLineToRelative(1.911f)
                lineToRelative(-5.222f, 8.0f)
                horizontalLineToRelative(-1.911f)
                close()
                moveTo(8.401f, 16.0f)
                verticalLineToRelative(-5.332f)
                lineToRelative(-0.917f, 0.946f)
                lineToRelative(-1.149f, -1.113f)
                lineToRelative(2.44f, -2.519f)
                horizontalLineToRelative(1.226f)
                verticalLineToRelative(8.018f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(19.967f, 18.0f)
                horizontalLineToRelative(2.398f)
                curveToRelative(-2.082f, 3.57f, -5.943f, 5.981f, -10.365f, 5.981f)
                curveTo(5.383f, 23.981f, 0.0f, 18.598f, 0.0f, 11.981f)
                reflectiveCurveTo(5.383f, -0.019f, 12.0f, -0.019f)
                curveTo(16.438f, -0.019f, 20.312f, 2.409f, 22.388f, 6.0f)
                horizontalLineToRelative(-2.393f)
                curveToRelative(-1.826f, -2.434f, -4.725f, -4.019f, -7.995f, -4.019f)
                curveTo(6.486f, 1.981f, 2.0f, 6.467f, 2.0f, 11.981f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(3.253f, 0.0f, 6.139f, -1.568f, 7.967f, -3.981f)
                close()
            }
        }
        .build()
        return _percent10!!
    }

private var _percent10: ImageVector? = null
