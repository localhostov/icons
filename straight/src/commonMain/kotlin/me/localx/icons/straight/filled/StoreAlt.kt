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
                moveTo(24.0f, 7.0f)
                lineTo(21.802f, 0.0f)
                horizontalLineToRelative(-4.802f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 0.0f)
                lineTo(2.198f, 0.0f)
                lineTo(0.024f, 6.783f)
                lineToRelative(-0.024f, 1.217f)
                curveToRelative(0.0f, 1.005f, 0.385f, 1.914f, 1.0f, 2.618f)
                verticalLineToRelative(10.382f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(15.0f, 11.438f)
                curveToRelative(0.372f, -0.217f, 0.717f, -0.474f, 1.0f, -0.795f)
                curveToRelative(0.733f, 0.832f, 1.807f, 1.357f, 3.0f, 1.357f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.347f, 0.0f, 0.678f, -0.058f, 1.0f, -0.142f)
                verticalLineToRelative(12.142f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 10.618f)
                curveToRelative(0.615f, -0.703f, 1.0f, -1.612f, 1.0f, -2.618f)
                verticalLineToRelative(-1.0f)
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
