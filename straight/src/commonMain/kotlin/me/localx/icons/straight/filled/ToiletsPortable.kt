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

public val Icons.Filled.ToiletsPortable: ImageVector
    get() {
        if (_toiletsPortable != null) {
            return _toiletsPortable!!
        }
        _toiletsPortable = Builder(name = "ToiletsPortable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.993f)
                verticalLineToRelative(2.007f)
                horizontalLineToRelative(-11.0f)
                lineTo(13.0f, 1.993f)
                lineToRelative(0.409f, -0.3f)
                curveToRelative(0.094f, -0.069f, 2.341f, -1.693f, 5.091f, -1.693f)
                reflectiveCurveToRelative(4.997f, 1.625f, 5.091f, 1.693f)
                lineToRelative(0.409f, 0.3f)
                close()
                moveTo(13.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(5.5f, 0.0f)
                curveTo(2.75f, 0.0f, 0.503f, 1.625f, 0.409f, 1.693f)
                lineToRelative(-0.409f, 0.3f)
                verticalLineToRelative(2.007f)
                horizontalLineToRelative(11.0f)
                lineTo(11.0f, 1.993f)
                lineToRelative(-0.409f, -0.3f)
                curveToRelative(-0.094f, -0.069f, -2.341f, -1.693f, -5.091f, -1.693f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _toiletsPortable!!
    }

private var _toiletsPortable: ImageVector? = null
