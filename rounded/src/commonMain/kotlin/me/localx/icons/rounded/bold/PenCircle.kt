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

public val Icons.Bold.PenCircle: ImageVector
    get() {
        if (_penCircle != null) {
            return _penCircle!!
        }
        _penCircle = Builder(name = "PenCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.647f, 10.268f)
                lineToRelative(3.086f, 3.086f)
                lineToRelative(-2.377f, 2.377f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.269f, -3.064f, 1.269f)
                horizontalLineToRelative(-0.79f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.791f)
                curveToRelative(0.0f, -1.149f, 0.457f, -2.252f, 1.269f, -3.064f)
                lineToRelative(2.377f, -2.377f)
                close()
                moveTo(13.776f, 7.139f)
                lineToRelative(-1.008f, 1.008f)
                lineToRelative(3.086f, 3.086f)
                lineToRelative(1.008f, -1.008f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                reflectiveCurveToRelative(-2.234f, -0.852f, -3.086f, 0.0f)
                close()
                moveTo(24.001f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.001f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _penCircle!!
    }

private var _penCircle: ImageVector? = null
