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

public val Icons.Bold.EarthAmericas: ImageVector
    get() {
        if (_earthAmericas != null) {
            return _earthAmericas!!
        }
        _earthAmericas = Builder(name = "EarthAmericas", defaultWidth = 512.0.dp, defaultHeight =
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                curveToRelative(0.0f, -1.203f, 0.238f, -2.351f, 0.668f, -3.401f)
                lineToRelative(1.332f, 1.401f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.0f, -6.5f)
                lineToRelative(-4.0f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-1.5f, -2.5f)
                reflectiveCurveToRelative(0.406f, -0.631f, 0.973f, -1.5f)
                curveToRelative(0.009f, 0.0f, 0.018f, 0.0f, 0.027f, 0.0f)
                curveToRelative(3.159f, 0.0f, 5.943f, 1.637f, 7.549f, 4.106f)
                lineToRelative(-1.549f, 0.894f)
                lineToRelative(1.0f, 4.0f)
                lineToRelative(1.948f, 0.967f)
                curveToRelative(-0.484f, 4.509f, -4.312f, 8.033f, -8.948f, 8.033f)
                close()
            }
        }
        .build()
        return _earthAmericas!!
    }

private var _earthAmericas: ImageVector? = null
