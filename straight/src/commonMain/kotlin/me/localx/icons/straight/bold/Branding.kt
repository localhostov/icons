package me.localx.icons.straight.bold

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

public val Icons.Bold.Branding: ImageVector
    get() {
        if (_branding != null) {
            return _branding!!
        }
        _branding = Builder(name = "Branding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.664f)
                verticalLineToRelative(16.336f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.712f, 0.0f, -1.386f, 0.154f, -2.0f, 0.424f)
                lineTo(6.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.382f)
                lineToRelative(5.618f, 5.664f)
                close()
                moveTo(2.0f, 0.0f)
                curveTo(0.895f, 0.0f, 0.0f, 0.895f, 0.0f, 2.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.354f, 17.849f)
                lineToRelative(4.661f, -4.661f)
                curveToRelative(-0.318f, -0.115f, -0.656f, -0.188f, -1.014f, -0.188f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.358f, 0.0f, -0.696f, 0.073f, -1.014f, 0.188f)
                lineToRelative(4.661f, 4.661f)
                curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0.0f)
                close()
                moveTo(14.475f, 19.97f)
                curveToRelative(-0.683f, 0.683f, -1.578f, 1.023f, -2.475f, 1.023f)
                reflectiveCurveToRelative(-1.792f, -0.341f, -2.475f, -1.023f)
                lineToRelative(-4.474f, -4.474f)
                curveToRelative(-0.028f, 0.165f, -0.051f, 0.332f, -0.051f, 0.505f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.173f, -0.023f, -0.34f, -0.051f, -0.505f)
                lineToRelative(-4.474f, 4.474f)
                close()
            }
        }
        .build()
        return _branding!!
    }

private var _branding: ImageVector? = null
