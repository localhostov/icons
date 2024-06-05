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

public val Icons.Bold.Donate: ImageVector
    get() {
        if (_donate != null) {
            return _donate!!
        }
        _donate = Builder(name = "Donate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(3.0f, 4.037f, 3.0f, 9.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.176f, -0.555f, -0.449f, -0.664f)
                lineToRelative(-2.216f, -0.887f)
                curveToRelative(-1.418f, -0.566f, -2.335f, -1.921f, -2.335f, -3.449f)
                curveToRelative(0.0f, -1.58f, 1.059f, -2.903f, 2.5f, -3.337f)
                verticalLineToRelative(-1.163f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(1.441f, 0.434f, 2.5f, 1.757f, 2.5f, 3.337f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.176f, 0.555f, 0.449f, 0.664f)
                lineToRelative(2.216f, 0.887f)
                curveToRelative(1.418f, 0.566f, 2.335f, 1.921f, 2.335f, 3.449f)
                curveToRelative(0.0f, 1.58f, -1.059f, 2.903f, -2.5f, 3.337f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(-1.441f, -0.434f, -2.5f, -1.757f, -2.5f, -3.337f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                curveToRelative(0.0f, -1.945f, 1.247f, -3.59f, 2.978f, -4.217f)
                curveToRelative(0.737f, 1.057f, 1.655f, 1.976f, 2.709f, 2.717f)
                horizontalLineToRelative(-1.187f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.187f)
                curveToRelative(1.054f, -0.741f, 1.972f, -1.66f, 2.709f, -2.717f)
                curveToRelative(1.731f, 0.627f, 2.978f, 2.272f, 2.978f, 4.217f)
                close()
            }
        }
        .build()
        return _donate!!
    }

private var _donate: ImageVector? = null
