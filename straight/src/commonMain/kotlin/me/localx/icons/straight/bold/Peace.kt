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

public val Icons.Bold.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 1.424f, -0.341f, 2.767f, -0.933f, 3.965f)
                lineToRelative(-6.567f, -6.567f)
                lineTo(13.5f, 3.135f)
                curveToRelative(4.249f, 0.718f, 7.5f, 4.414f, 7.5f, 8.865f)
                close()
                moveTo(10.5f, 20.865f)
                curveToRelative(-1.855f, -0.313f, -3.521f, -1.189f, -4.807f, -2.455f)
                lineToRelative(4.807f, -4.807f)
                verticalLineToRelative(7.262f)
                close()
                moveTo(13.5f, 13.64f)
                lineToRelative(4.788f, 4.788f)
                curveToRelative(-1.284f, 1.256f, -2.941f, 2.125f, -4.788f, 2.437f)
                verticalLineToRelative(-7.225f)
                close()
                moveTo(10.5f, 3.136f)
                verticalLineToRelative(6.225f)
                lineToRelative(-6.579f, 6.579f)
                curveToRelative(-0.584f, -1.192f, -0.921f, -2.525f, -0.921f, -3.939f)
                curveToRelative(0.0f, -4.45f, 3.251f, -8.147f, 7.5f, -8.865f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
