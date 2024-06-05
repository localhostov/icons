package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.FileAi: ImageVector
    get() {
        if (_fileAi != null) {
            return _fileAi!!
        }
        _fileAi = Builder(name = "FileAi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.965f, 181.632f)
                lineToRelative(29.078f, 0.0f)
                lineToRelative(-14.486f, -38.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 0.0f)
                horizontalLineTo(106.667f)
                curveTo(47.786f, 0.071f, 0.071f, 47.786f, 0.0f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(0.071f, 464.214f, 47.786f, 511.93f, 106.667f, 512.0f)
                horizontalLineToRelative(224.32f)
                curveToRelative(3.477f, 0.0f, 6.912f, -0.277f, 10.347f, -0.512f)
                verticalLineTo(405.333f)
                curveToRelative(0.0f, -35.346f, 28.654f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(106.155f)
                curveToRelative(0.235f, -3.435f, 0.512f, -6.869f, 0.512f, -10.347f)
                verticalLineToRelative(-224.32f)
                curveTo(511.93f, 47.786f, 464.214f, 0.071f, 405.333f, 0.0f)
                close()
                moveTo(194.432f, 235.008f)
                curveToRelative(-6.892f, 2.579f, -14.572f, -0.903f, -17.173f, -7.787f)
                lineToRelative(-7.147f, -18.923f)
                horizontalLineToRelative(-49.301f)
                lineToRelative(-7.232f, 18.965f)
                curveToRelative(-1.992f, 5.145f, -6.942f, 8.535f, -12.459f, 8.533f)
                curveToRelative(-1.618f, -0.009f, -3.222f, -0.305f, -4.736f, -0.875f)
                curveToRelative(-6.884f, -2.615f, -10.344f, -10.316f, -7.729f, -17.199f)
                curveToRelative(0.002f, -0.006f, 0.004f, -0.011f, 0.006f, -0.017f)
                lineToRelative(42.133f, -110.592f)
                curveToRelative(2.378f, -6.119f, 8.262f, -10.157f, 14.827f, -10.176f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(6.441f, 0.02f, 12.232f, 3.931f, 14.656f, 9.899f)
                lineToRelative(41.899f, 110.933f)
                curveToRelative(2.624f, 6.893f, -0.837f, 14.608f, -7.73f, 17.232f)
                curveTo(194.441f, 235.004f, 194.437f, 235.006f, 194.432f, 235.008f)
                close()
                moveTo(252.949f, 222.528f)
                curveToRelative(0.0f, 7.364f, -5.97f, 13.333f, -13.333f, 13.333f)
                reflectiveCurveToRelative(-13.333f, -5.97f, -13.333f, -13.333f)
                verticalLineTo(110.272f)
                curveToRelative(0.0f, -7.364f, 5.97f, -13.333f, 13.333f, -13.333f)
                reflectiveCurveToRelative(13.333f, 5.97f, 13.333f, 13.333f)
                verticalLineTo(222.528f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 405.333f)
                verticalLineToRelative(96.853f)
                curveToRelative(19.734f, -7.452f, 37.66f, -19.015f, 52.587f, -33.92f)
                lineToRelative(31.659f, -31.68f)
                curveToRelative(14.923f, -14.917f, 26.494f, -32.844f, 33.941f, -52.587f)
                horizontalLineToRelative(-96.853f)
                curveTo(393.551f, 384.0f, 384.0f, 393.551f, 384.0f, 405.333f)
                close()
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
