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

public val Icons.Filled.StoreAlt: ImageVector
    get() {
        if (_storeAlt != null) {
            return _storeAlt!!
        }
        _storeAlt = Builder(name = "StoreAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.962f, 7.725f)
                lineToRelative(-1.172f, -4.099f)
                curveToRelative(-0.61f, -2.135f, -2.588f, -3.626f, -4.808f, -3.626f)
                horizontalLineToRelative(-0.982f)
                lineTo(17.0f, 4.0f)
                curveToRelative(-0.006f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 4.0f)
                curveToRelative(-0.006f, 1.308f, -1.994f, 1.307f, -2.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-0.983f)
                curveTo(3.797f, 0.0f, 1.82f, 1.491f, 1.209f, 3.626f)
                lineTo(0.039f, 7.725f)
                curveToRelative(-0.161f, 1.066f, 0.314f, 2.138f, 0.961f, 2.893f)
                verticalLineToRelative(9.382f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(15.0f, 11.444f)
                curveToRelative(0.378f, -0.221f, 0.714f, -0.498f, 1.0f, -0.826f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.347f, 0.0f, 0.678f, -0.058f, 1.0f, -0.142f)
                verticalLineToRelative(11.142f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                lineTo(23.0f, 10.618f)
                curveToRelative(0.648f, -0.754f, 1.122f, -1.826f, 0.962f, -2.893f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(-5.142f)
                curveToRelative(0.322f, 0.084f, 0.653f, 0.142f, 1.0f, 0.142f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.2f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _storeAlt!!
    }

private var _storeAlt: ImageVector? = null
