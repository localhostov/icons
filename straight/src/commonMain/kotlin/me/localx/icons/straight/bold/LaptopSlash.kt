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

public val Icons.Bold.LaptopSlash: ImageVector
    get() {
        if (_laptopSlash != null) {
            return _laptopSlash!!
        }
        _laptopSlash = Builder(name = "LaptopSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.098f, 17.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(2.0f, 6.903f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(6.097f)
                horizontalLineToRelative(3.308f)
                lineToRelative(0.923f, 1.0f)
                horizontalLineToRelative(2.867f)
                close()
                moveTo(22.636f, 20.514f)
                lineToRelative(1.325f, 1.325f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.039f, 2.161f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.961f, 2.96f)
                horizontalLineToRelative(16.879f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.053f, -0.543f, 1.979f, -1.365f, 2.514f)
                close()
                moveTo(8.121f, 6.0f)
                lineToRelative(10.0f, 10.0f)
                horizontalLineToRelative(0.879f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(-10.879f)
                close()
            }
        }
        .build()
        return _laptopSlash!!
    }

private var _laptopSlash: ImageVector? = null
