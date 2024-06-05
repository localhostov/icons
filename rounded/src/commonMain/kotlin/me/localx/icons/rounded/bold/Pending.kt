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

public val Icons.Bold.Pending: ImageVector
    get() {
        if (_pending != null) {
            return _pending!!
        }
        _pending = Builder(name = "Pending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.998f, 22.418f)
                curveToRelative(0.039f, 0.827f, -0.6f, 1.529f, -1.428f, 1.568f)
                curveToRelative(-0.189f, 0.009f, -0.379f, 0.014f, -0.57f, 0.014f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(3.058f, 0.0f, 5.96f, 1.181f, 8.16f, 3.223f)
                lineToRelative(1.49f, -1.49f)
                curveToRelative(0.498f, -0.498f, 1.35f, -0.145f, 1.35f, 0.559f)
                verticalLineToRelative(4.52f)
                curveToRelative(0.0f, 0.656f, -0.531f, 1.187f, -1.187f, 1.187f)
                horizontalLineToRelative(-4.52f)
                curveToRelative(-0.705f, 0.0f, -1.058f, -0.852f, -0.559f, -1.35f)
                lineToRelative(1.309f, -1.309f)
                curveToRelative(-1.64f, -1.486f, -3.786f, -2.341f, -6.042f, -2.341f)
                curveTo(7.037f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                curveToRelative(0.145f, 0.0f, 0.287f, -0.003f, 0.43f, -0.01f)
                curveToRelative(0.806f, -0.039f, 1.53f, 0.601f, 1.568f, 1.428f)
                close()
                moveTo(16.803f, 14.744f)
                curveToRelative(0.411f, -0.719f, 0.161f, -1.636f, -0.559f, -2.047f)
                lineToRelative(-2.744f, -1.567f)
                verticalLineToRelative(-3.63f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.538f, 0.288f, 1.035f, 0.756f, 1.303f)
                lineToRelative(3.5f, 2.0f)
                curveToRelative(0.234f, 0.134f, 0.49f, 0.197f, 0.743f, 0.197f)
                curveToRelative(0.521f, 0.0f, 1.026f, -0.271f, 1.304f, -0.756f)
                close()
                moveTo(22.5f, 10.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.26f, 19.606f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21.087f, 15.75f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _pending!!
    }

private var _pending: ImageVector? = null
