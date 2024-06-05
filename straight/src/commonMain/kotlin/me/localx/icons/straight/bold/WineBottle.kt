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

public val Icons.Bold.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.936f, 9.127f)
                lineToRelative(-2.936f, -2.349f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.779f)
                lineToRelative(-2.937f, 2.349f)
                curveToRelative(-1.312f, 1.05f, -2.063f, 2.615f, -2.063f, 4.295f)
                verticalLineToRelative(10.577f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-10.577f)
                curveToRelative(0.0f, -1.68f, -0.752f, -3.245f, -2.064f, -4.295f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.035f, 13.0f)
                curveToRelative(0.102f, -0.599f, 0.418f, -1.142f, 0.902f, -1.53f)
                lineToRelative(4.063f, -3.249f)
                verticalLineToRelative(-3.221f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.221f)
                lineToRelative(4.062f, 3.249f)
                curveToRelative(0.597f, 0.478f, 0.938f, 1.189f, 0.938f, 1.953f)
                verticalLineToRelative(7.577f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
