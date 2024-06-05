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

public val Icons.Outline.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.749f, 0.024f)
                curveToRelative(-3.079f, -0.2f, -6.01f, 0.841f, -8.258f, 2.944f)
                curveTo(2.272f, 5.044f, 1.0f, 7.971f, 1.0f, 11.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.647f)
                curveTo(23.0f, 5.384f, 18.497f, 0.408f, 12.749f, 0.024f)
                close()
                moveTo(21.0f, 17.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.478f, 1.041f, -4.872f, 2.856f, -6.571f)
                curveToRelative(1.84f, -1.722f, 4.238f, -2.571f, 6.759f, -2.408f)
                curveToRelative(4.701f, 0.313f, 8.384f, 4.413f, 8.384f, 9.332f)
                verticalLineToRelative(5.647f)
                close()
                moveTo(10.0f, 11.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(18.0f, 11.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 16.997f)
                curveToRelative(0.0f, 1.105f, -0.895f, 1.0f, -2.0f, 1.0f)
                reflectiveCurveToRelative(-2.0f, 0.105f, -2.0f, -1.0f)
                reflectiveCurveToRelative(0.895f, -3.0f, 2.0f, -3.0f)
                reflectiveCurveToRelative(2.0f, 1.895f, 2.0f, 3.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
