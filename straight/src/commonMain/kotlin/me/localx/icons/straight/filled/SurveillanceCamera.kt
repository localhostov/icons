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

public val Icons.Filled.SurveillanceCamera: ImageVector
    get() {
        if (_surveillanceCamera != null) {
            return _surveillanceCamera!!
        }
        _surveillanceCamera = Builder(name = "SurveillanceCamera", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 3.0f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(1.5f, -3.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.057f)
                lineToRelative(-2.006f, 5.351f)
                curveToRelative(-0.146f, 0.389f, -0.522f, 0.649f, -0.937f, 0.649f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(10.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                lineTo(7.114f, 18.0f)
                curveToRelative(1.243f, 0.0f, 2.372f, -0.782f, 2.81f, -1.946f)
                lineToRelative(2.27f, -6.054f)
                horizontalLineToRelative(8.807f)
                close()
                moveTo(23.387f, 19.039f)
                curveToRelative(-0.492f, -0.947f, -2.407f, -4.039f, -6.387f, -4.039f)
                reflectiveCurveToRelative(-5.896f, 3.092f, -6.388f, 4.04f)
                lineToRelative(-0.239f, 0.46f)
                lineToRelative(0.239f, 0.461f)
                curveToRelative(0.492f, 0.947f, 2.406f, 4.039f, 6.388f, 4.039f)
                reflectiveCurveToRelative(5.896f, -3.092f, 6.387f, -4.039f)
                lineToRelative(0.24f, -0.461f)
                lineToRelative(-0.24f, -0.461f)
                close()
                moveTo(17.0f, 21.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _surveillanceCamera!!
    }

private var _surveillanceCamera: ImageVector? = null
