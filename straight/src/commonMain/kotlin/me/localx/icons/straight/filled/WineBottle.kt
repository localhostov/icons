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

public val Icons.Filled.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.01f, 2.004f)
                lineTo(9.01f, 0.005f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.999f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(19.229f, 9.782f)
                lineToRelative(-4.219f, -2.813f)
                verticalLineToRelative(-2.965f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.965f)
                lineToRelative(-4.219f, 2.813f)
                curveToRelative(-1.086f, 0.724f, -1.741f, 1.924f, -1.775f, 3.224f)
                horizontalLineToRelative(13.994f)
                verticalLineToRelative(2.0f)
                lineTo(3.01f, 15.006f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-10.896f)
                curveToRelative(0.0f, -1.341f, -0.666f, -2.585f, -1.781f, -3.328f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
