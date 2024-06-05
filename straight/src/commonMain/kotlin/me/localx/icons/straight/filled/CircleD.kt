package me.localx.icons.straight.filled

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

public val Icons.Filled.CircleD: ImageVector
    get() {
        if (_circleD != null) {
            return _circleD!!
        }
        _circleD = Builder(name = "CircleD", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.75f, 18.25f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(3.446f, 0.0f, 6.25f, 2.804f, 6.25f, 6.25f)
                reflectiveCurveToRelative(-2.804f, 6.25f, -6.25f, 6.25f)
                close()
                moveTo(11.75f, 16.25f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(2.344f, 0.0f, 4.25f, 1.907f, 4.25f, 4.25f)
                reflectiveCurveToRelative(-1.906f, 4.25f, -4.25f, 4.25f)
                close()
            }
        }
        .build()
        return _circleD!!
    }

private var _circleD: ImageVector? = null
