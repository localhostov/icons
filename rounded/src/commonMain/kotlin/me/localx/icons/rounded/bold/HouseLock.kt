package me.localx.icons.rounded.bold

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

public val Icons.Bold.HouseLock: ImageVector
    get() {
        if (_houseLock != null) {
            return _houseLock!!
        }
        _houseLock = Builder(name = "HouseLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 15.778f)
                verticalLineToRelative(-2.278f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(2.278f)
                curveToRelative(-0.61f, 0.549f, -1.0f, 1.336f, -1.0f, 2.221f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.885f, -0.39f, -1.672f, -1.0f, -2.221f)
                close()
                moveTo(18.5f, 12.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(18.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(3.0f, 9.886f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveTo(2.467f, 24.0f, 0.0f, 21.532f, 0.0f, 18.5f)
                verticalLineToRelative(-8.614f)
                curveTo(0.0f, 8.055f, 0.906f, 6.351f, 2.424f, 5.327f)
                lineTo(8.924f, 0.941f)
                curveToRelative(1.868f, -1.261f, 4.283f, -1.261f, 6.152f, 0.0f)
                lineToRelative(6.263f, 4.227f)
                curveToRelative(0.687f, 0.463f, 0.868f, 1.396f, 0.404f, 2.082f)
                curveToRelative(-0.463f, 0.687f, -1.395f, 0.868f, -2.082f, 0.404f)
                lineToRelative(-6.263f, -4.226f)
                curveToRelative(-0.85f, -0.572f, -1.947f, -0.573f, -2.797f, 0.0f)
                lineToRelative(-6.5f, 4.386f)
                curveToRelative(-0.69f, 0.466f, -1.102f, 1.24f, -1.102f, 2.072f)
                close()
            }
        }
        .build()
        return _houseLock!!
    }

private var _houseLock: ImageVector? = null
