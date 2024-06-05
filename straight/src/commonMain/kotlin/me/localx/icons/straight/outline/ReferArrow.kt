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

public val Icons.Outline.ReferArrow: ImageVector
    get() {
        if (_referArrow != null) {
            return _referArrow!!
        }
        _referArrow = Builder(name = "ReferArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.414f, 17.414f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.75f, -2.75f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.78f, 0.779f, 0.78f, 2.049f, 0.0f, 2.828f)
                close()
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 2.691f, 4.691f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
                moveTo(11.5f, 14.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.172f, 0.0f, 0.339f, 0.018f, 0.501f, 0.051f)
                curveToRelative(0.384f, -0.609f, 0.862f, -1.152f, 1.42f, -1.604f)
                curveToRelative(-0.585f, -0.278f, -1.231f, -0.447f, -1.92f, -0.447f)
                close()
            }
        }
        .build()
        return _referArrow!!
    }

private var _referArrow: ImageVector? = null
