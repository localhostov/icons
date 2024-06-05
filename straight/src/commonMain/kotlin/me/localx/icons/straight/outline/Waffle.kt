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

public val Icons.Outline.Waffle: ImageVector
    get() {
        if (_waffle != null) {
            return _waffle!!
        }
        _waffle = Builder(name = "Waffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.485f, 3.515f)
                curveTo(18.219f, 1.249f, 15.205f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(5.781f, 1.249f, 3.515f, 3.515f)
                reflectiveCurveTo(0.0f, 8.795f, 0.0f, 12.0f)
                reflectiveCurveToRelative(1.248f, 6.219f, 3.515f, 8.485f)
                curveToRelative(2.267f, 2.267f, 5.28f, 3.515f, 8.485f, 3.515f)
                reflectiveCurveToRelative(6.219f, -1.248f, 8.485f, -3.515f)
                curveToRelative(2.267f, -2.266f, 3.515f, -5.28f, 3.515f, -8.485f)
                reflectiveCurveToRelative(-1.249f, -6.219f, -3.515f, -8.485f)
                close()
                moveTo(19.071f, 19.071f)
                curveToRelative(-1.889f, 1.889f, -4.4f, 2.929f, -7.071f, 2.929f)
                reflectiveCurveToRelative(-5.183f, -1.04f, -7.071f, -2.929f)
                reflectiveCurveToRelative(-2.929f, -4.4f, -2.929f, -7.071f)
                reflectiveCurveToRelative(1.04f, -5.183f, 2.929f, -7.071f)
                reflectiveCurveToRelative(4.4f, -2.929f, 7.071f, -2.929f)
                reflectiveCurveToRelative(5.182f, 1.041f, 7.071f, 2.929f)
                reflectiveCurveToRelative(2.929f, 4.4f, 2.929f, 7.071f)
                reflectiveCurveToRelative(-1.041f, 5.182f, -2.929f, 7.071f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _waffle!!
    }

private var _waffle: ImageVector? = null
