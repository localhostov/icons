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

public val Icons.Bold.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.135f, 14.549f)
                curveToRelative(0.037f, 0.012f, 1.92f, 0.485f, 1.92f, 0.485f)
                reflectiveCurveToRelative(0.608f, 1.984f, 0.626f, 2.028f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, false, 2.857f, 1.915f)
                horizontalLineToRelative(0.05f)
                arcToRelative(3.079f, 3.079f, 0.0f, false, false, 2.846f, -2.006f)
                reflectiveCurveToRelative(2.461f, -6.554f, 2.474f, -6.6f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.633f, 6.1f)
                curveTo(13.575f, 6.11f, 7.0f, 8.719f, 7.0f, 8.719f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.137f, 5.83f)
                close()
                moveTo(8.095f, 11.511f)
                lineTo(14.461f, 8.983f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.555f, 0.575f)
                lineToRelative(-2.391f, 6.357f)
                arcToRelative(0.085f, 0.085f, 0.0f, false, true, -0.084f, 0.062f)
                curveToRelative(-0.045f, 0.0f, -0.057f, -0.009f, -0.069f, -0.024f)
                lineToRelative(-0.795f, -2.606f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.071f, -1.018f)
                lineToRelative(-2.549f, -0.637f)
                curveToRelative(-0.02f, -0.012f, -0.034f, -0.031f, -0.035f, -0.08f)
                curveTo(8.021f, 11.54f, 8.047f, 11.53f, 8.1f, 11.511f)
                close()
                moveTo(12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -9.0f, 9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
