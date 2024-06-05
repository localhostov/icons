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

public val Icons.Bold.CircleM: ImageVector
    get() {
        if (_circleM != null) {
            return _circleM!!
        }
        _circleM = Builder(name = "CircleM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.358f)
                verticalLineToRelative(9.392f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.241f)
                lineToRelative(-3.0f, 4.76f)
                lineToRelative(-3.0f, -4.759f)
                verticalLineToRelative(6.24f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.392f)
                curveToRelative(0.0f, -0.947f, 0.565f, -1.736f, 1.441f, -2.013f)
                curveToRelative(0.878f, -0.278f, 1.828f, 0.053f, 2.363f, 0.818f)
                lineToRelative(2.195f, 3.479f)
                lineToRelative(2.156f, -3.42f)
                curveToRelative(0.575f, -0.826f, 1.524f, -1.154f, 2.403f, -0.878f)
                curveToRelative(0.875f, 0.276f, 1.441f, 1.065f, 1.441f, 2.013f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _circleM!!
    }

private var _circleM: ImageVector? = null
