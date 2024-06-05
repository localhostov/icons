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

public val Icons.Bold.ClockElevenThirty: ImageVector
    get() {
        if (_clockElevenThirty != null) {
            return _clockElevenThirty!!
        }
        _clockElevenThirty = Builder(name = "ClockElevenThirty", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.037f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(14.0f, 17.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.296f, -0.088f, -0.585f, -0.252f, -0.832f)
                lineToRelative(-2.0f, -3.0f)
                curveToRelative(-0.46f, -0.689f, -1.392f, -0.875f, -2.08f, -0.416f)
                curveToRelative(-0.689f, 0.459f, -0.876f, 1.391f, -0.416f, 2.08f)
                lineToRelative(1.748f, 2.622f)
                verticalLineToRelative(5.546f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _clockElevenThirty!!
    }

private var _clockElevenThirty: ImageVector? = null
