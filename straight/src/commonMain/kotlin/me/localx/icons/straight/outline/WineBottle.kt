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

public val Icons.Outline.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.229f, 9.782f)
                lineToRelative(-4.219f, -2.813f)
                lineTo(15.01f, 0.005f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.964f)
                lineToRelative(-4.219f, 2.813f)
                curveToRelative(-1.115f, 0.744f, -1.781f, 1.988f, -1.781f, 3.328f)
                verticalLineToRelative(10.896f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-10.896f)
                curveToRelative(0.0f, -1.341f, -0.666f, -2.585f, -1.781f, -3.328f)
                close()
                moveTo(19.01f, 22.006f)
                lineTo(5.01f, 22.006f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.016f, 13.006f)
                curveToRelative(0.033f, -0.629f, 0.356f, -1.207f, 0.884f, -1.56f)
                lineToRelative(5.109f, -3.407f)
                verticalLineToRelative(-4.035f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.035f)
                lineToRelative(5.109f, 3.407f)
                curveToRelative(0.558f, 0.372f, 0.891f, 0.994f, 0.891f, 1.664f)
                verticalLineToRelative(8.896f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
