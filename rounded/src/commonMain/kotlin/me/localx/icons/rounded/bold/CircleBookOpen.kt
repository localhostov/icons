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

public val Icons.Bold.CircleBookOpen: ImageVector
    get() {
        if (_circleBookOpen != null) {
            return _circleBookOpen!!
        }
        _circleBookOpen = Builder(name = "CircleBookOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.727f)
                verticalLineToRelative(5.333f)
                curveToRelative(0.0f, 0.892f, -0.591f, 1.677f, -1.449f, 1.923f)
                lineToRelative(-3.551f, 1.018f)
                verticalLineToRelative(-7.583f)
                curveToRelative(0.0f, -0.912f, 0.603f, -1.714f, 1.479f, -1.967f)
                lineToRelative(1.316f, -0.381f)
                curveToRelative(1.104f, -0.319f, 2.205f, 0.509f, 2.205f, 1.658f)
                close()
                moveTo(9.521f, 7.45f)
                lineToRelative(-1.316f, -0.381f)
                curveToRelative(-1.104f, -0.319f, -2.205f, 0.509f, -2.205f, 1.658f)
                verticalLineToRelative(5.333f)
                curveToRelative(0.0f, 0.892f, 0.591f, 1.677f, 1.449f, 1.923f)
                lineToRelative(3.551f, 1.018f)
                verticalLineToRelative(-7.583f)
                curveToRelative(0.0f, -0.912f, -0.603f, -1.714f, -1.479f, -1.967f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _circleBookOpen!!
    }

private var _circleBookOpen: ImageVector? = null
