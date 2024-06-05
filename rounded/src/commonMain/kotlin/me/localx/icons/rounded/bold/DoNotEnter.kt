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

public val Icons.Bold.DoNotEnter: ImageVector
    get() {
        if (_doNotEnter != null) {
            return _doNotEnter!!
        }
        _doNotEnter = Builder(name = "DoNotEnter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.0f, 11.4f)
                verticalLineToRelative(1.2f)
                curveToRelative(0.0f, 0.773f, -0.627f, 1.4f, -1.4f, 1.4f)
                lineTo(7.4f, 14.0f)
                curveToRelative(-0.773f, 0.0f, -1.4f, -0.627f, -1.4f, -1.4f)
                verticalLineToRelative(-1.2f)
                curveToRelative(0.0f, -0.773f, 0.627f, -1.4f, 1.4f, -1.4f)
                horizontalLineToRelative(9.2f)
                curveToRelative(0.773f, 0.0f, 1.4f, 0.627f, 1.4f, 1.4f)
                close()
            }
        }
        .build()
        return _doNotEnter!!
    }

private var _doNotEnter: ImageVector? = null
