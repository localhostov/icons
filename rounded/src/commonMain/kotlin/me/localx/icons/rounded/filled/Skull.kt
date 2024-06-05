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

public val Icons.Filled.Skull: ImageVector
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
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.421f, 1.729f, 4.445f, 4.018f, 4.903f)
                curveToRelative(0.205f, 2.293f, 2.136f, 4.097f, 4.482f, 4.097f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.346f, 0.0f, 4.277f, -1.804f, 4.482f, -4.097f)
                curveToRelative(2.289f, -0.458f, 4.018f, -2.482f, 4.018f, -4.903f)
                verticalLineToRelative(-3.647f)
                curveTo(23.0f, 5.384f, 18.497f, 0.408f, 12.749f, 0.024f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 17.997f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.105f, -2.0f, -1.0f)
                reflectiveCurveToRelative(0.895f, -3.0f, 2.0f, -3.0f)
                reflectiveCurveToRelative(2.0f, 1.895f, 2.0f, 3.0f)
                reflectiveCurveToRelative(-0.895f, 1.0f, -2.0f, 1.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
