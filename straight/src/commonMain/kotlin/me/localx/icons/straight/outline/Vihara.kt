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

public val Icons.Outline.Vihara: ImageVector
    get() {
        if (_vihara != null) {
            return _vihara!!
        }
        _vihara = Builder(name = "Vihara", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.33f)
                verticalLineToRelative(-3.33f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.718f, 0.0f, -3.989f, -5.896f, -4.0f, -5.949f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 0.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.016f)
                curveToRelative(-0.011f, 0.052f, -1.205f, 5.984f, -4.0f, 5.984f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.075f)
                curveToRelative(-0.154f, 1.744f, -1.799f, 5.925f, -4.0f, 5.925f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.208f, 0.0f, -3.641f, -3.782f, -4.0f, -5.67f)
                close()
                moveTo(7.576f, 4.0f)
                horizontalLineToRelative(8.848f)
                curveToRelative(0.291f, 0.976f, 0.907f, 2.662f, 1.955f, 4.0f)
                lineTo(5.622f, 8.0f)
                curveToRelative(1.048f, -1.338f, 1.663f, -3.024f, 1.955f, -4.0f)
                close()
                moveTo(18.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(3.625f, 19.0f)
                curveToRelative(1.051f, -1.338f, 1.67f, -3.025f, 1.962f, -4.0f)
                horizontalLineToRelative(12.78f)
                curveToRelative(0.3f, 0.973f, 0.932f, 2.661f, 1.994f, 4.0f)
                lineTo(3.625f, 19.0f)
                close()
            }
        }
        .build()
        return _vihara!!
    }

private var _vihara: ImageVector? = null
