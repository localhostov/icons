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

public val Icons.Outline.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.007f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -7.063f, 17.078f)
                lineToRelative(5.025f, 4.915f)
                horizontalLineToRelative(-4.962f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.962f)
                lineToRelative(5.033f, -4.923f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -7.071f, -17.07f)
                close()
                moveTo(17.665f, 15.655f)
                lineTo(12.0f, 21.2f)
                lineTo(6.343f, 15.663f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.322f, -0.008f)
                close()
                moveTo(7.0f, 6.382f)
                verticalLineToRelative(6.236f)
                lineToRelative(5.0f, 2.5f)
                lineToRelative(5.0f, -2.5f)
                verticalLineToRelative(-6.236f)
                lineToRelative(-5.0f, -2.5f)
                close()
                moveTo(15.0f, 11.382f)
                lineTo(12.0f, 12.882f)
                lineTo(9.0f, 11.382f)
                verticalLineToRelative(-3.764f)
                lineToRelative(0.118f, -0.059f)
                lineToRelative(2.882f, 1.441f)
                lineToRelative(2.882f, -1.441f)
                lineToRelative(0.118f, 0.059f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
