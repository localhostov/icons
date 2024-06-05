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

public val Icons.Outline.RestroomSimple: ImageVector
    get() {
        if (_restroomSimple != null) {
            return _restroomSimple!!
        }
        _restroomSimple = Builder(name = "RestroomSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.985f)
                lineToRelative(1.604f, -12.255f)
                curveToRelative(0.205f, -1.565f, 1.602f, -2.745f, 3.247f, -2.745f)
                horizontalLineToRelative(0.268f)
                curveToRelative(1.646f, 0.0f, 3.042f, 1.18f, 3.247f, 2.744f)
                lineToRelative(1.604f, 12.256f)
                horizontalLineToRelative(-1.985f)
                close()
                moveTo(16.294f, 19.0f)
                horizontalLineToRelative(5.412f)
                lineToRelative(-1.308f, -9.995f)
                curveToRelative(-0.077f, -0.582f, -0.608f, -1.005f, -1.265f, -1.005f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-0.656f, 0.0f, -1.188f, 0.423f, -1.265f, 1.006f)
                lineToRelative(-1.308f, 9.994f)
                close()
                moveTo(4.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(5.381f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(1.5f, 1.119f, 1.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _restroomSimple!!
    }

private var _restroomSimple: ImageVector? = null
