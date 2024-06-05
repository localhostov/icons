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

public val Icons.Bold.RadiationAlt: ImageVector
    get() {
        if (_radiationAlt != null) {
            return _radiationAlt!!
        }
        _radiationAlt = Builder(name = "RadiationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.221f, -0.628f, -2.294f, -1.576f, -2.92f)
                lineToRelative(1.926f, -2.927f)
                curveToRelative(0.773f, 0.508f, 1.459f, 1.177f, 2.0f, 2.0f)
                curveToRelative(0.781f, 1.188f, 1.151f, 2.525f, 1.15f, 3.848f)
                close()
                moveTo(8.5f, 12.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.001f, -1.323f, 0.368f, -2.66f, 1.15f, -3.848f)
                curveToRelative(0.541f, -0.822f, 1.227f, -1.491f, 2.0f, -2.0f)
                lineToRelative(1.926f, 2.927f)
                curveToRelative(-0.948f, 0.626f, -1.576f, 1.699f, -1.576f, 2.92f)
                close()
                moveTo(13.838f, 14.969f)
                lineToRelative(1.841f, 2.973f)
                curveToRelative(-1.07f, 0.665f, -2.326f, 1.06f, -3.678f, 1.06f)
                reflectiveCurveToRelative(-2.608f, -0.395f, -3.678f, -1.06f)
                lineToRelative(1.84f, -2.973f)
                curveToRelative(0.535f, 0.332f, 1.162f, 0.531f, 1.838f, 0.531f)
                reflectiveCurveToRelative(1.303f, -0.199f, 1.838f, -0.531f)
                close()
            }
        }
        .build()
        return _radiationAlt!!
    }

private var _radiationAlt: ImageVector? = null
