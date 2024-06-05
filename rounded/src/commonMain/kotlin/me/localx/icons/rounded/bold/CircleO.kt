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

public val Icons.Bold.CircleO: ImageVector
    get() {
        if (_circleO != null) {
            return _circleO!!
        }
        _circleO = Builder(name = "CircleO", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(12.0f, 5.75f)
                curveToRelative(-2.762f, 0.0f, -5.008f, 2.26f, -5.008f, 5.037f)
                verticalLineToRelative(2.426f)
                curveToRelative(0.0f, 2.777f, 2.247f, 5.037f, 5.008f, 5.037f)
                reflectiveCurveToRelative(4.992f, -2.26f, 4.992f, -5.037f)
                verticalLineToRelative(-2.426f)
                curveToRelative(0.0f, -2.777f, -2.239f, -5.037f, -4.992f, -5.037f)
                close()
                moveTo(13.992f, 13.213f)
                curveToRelative(0.0f, 1.143f, -0.875f, 2.037f, -1.992f, 2.037f)
                curveToRelative(-1.126f, 0.0f, -2.008f, -0.895f, -2.008f, -2.037f)
                verticalLineToRelative(-2.426f)
                curveToRelative(0.0f, -1.143f, 0.882f, -2.037f, 2.008f, -2.037f)
                curveToRelative(1.117f, 0.0f, 1.992f, 0.895f, 1.992f, 2.037f)
                verticalLineToRelative(2.426f)
                close()
            }
        }
        .build()
        return _circleO!!
    }

private var _circleO: ImageVector? = null
