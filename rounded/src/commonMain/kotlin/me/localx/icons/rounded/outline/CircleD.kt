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

public val Icons.Outline.CircleD: ImageVector
    get() {
        if (_circleD != null) {
            return _circleD!!
        }
        _circleD = Builder(name = "CircleD", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.038f, 0.019f)
                curveTo(5.421f, 0.019f, 0.038f, 5.402f, 0.038f, 12.019f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.019f, 12.038f, 0.019f)
                close()
                moveTo(12.038f, 22.019f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.019f, 12.038f, 2.019f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(11.788f, 5.769f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(3.446f, 0.0f, 6.25f, -2.804f, 6.25f, -6.25f)
                reflectiveCurveToRelative(-2.804f, -6.25f, -6.25f, -6.25f)
                close()
                moveTo(11.788f, 16.269f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(2.344f, 0.0f, 4.25f, 1.907f, 4.25f, 4.25f)
                reflectiveCurveToRelative(-1.906f, 4.25f, -4.25f, 4.25f)
                close()
            }
        }
        .build()
        return _circleD!!
    }

private var _circleD: ImageVector? = null
