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

public val Icons.Filled.ReferArrow: ImageVector
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
                moveTo(11.0f, 19.5f)
                curveToRelative(0.0f, -2.039f, 0.944f, -3.862f, 2.418f, -5.054f)
                curveToRelative(-0.584f, -0.278f, -1.229f, -0.446f, -1.918f, -0.446f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }
        .build()
        return _referArrow!!
    }

private var _referArrow: ImageVector? = null
