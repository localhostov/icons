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

public val Icons.Bold.CircleW: ImageVector
    get() {
        if (_circleW != null) {
            return _circleW!!
        }
        _circleW = Builder(name = "CircleW", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.232f, 8.728f)
                lineToRelative(-1.09f, 7.088f)
                curveToRelative(-0.23f, 1.248f, -1.061f, 2.083f, -2.123f, 2.175f)
                curveToRelative(-1.021f, 0.096f, -1.967f, -0.558f, -2.4f, -1.65f)
                lineToRelative(-0.62f, -1.317f)
                lineToRelative(-0.62f, 1.317f)
                curveToRelative(-0.406f, 1.026f, -1.255f, 1.658f, -2.211f, 1.658f)
                curveToRelative(-1.169f, 0.0f, -2.081f, -0.935f, -2.304f, -2.137f)
                lineToRelative(-1.097f, -7.134f)
                curveToRelative(-0.126f, -0.818f, 0.436f, -1.584f, 1.254f, -1.71f)
                curveToRelative(0.817f, -0.122f, 1.585f, 0.436f, 1.71f, 1.255f)
                lineToRelative(0.771f, 5.011f)
                lineToRelative(1.14f, -2.422f)
                curveToRelative(0.248f, -0.525f, 0.776f, -0.861f, 1.357f, -0.861f)
                reflectiveCurveToRelative(1.109f, 0.336f, 1.357f, 0.861f)
                lineToRelative(1.139f, 2.42f)
                lineToRelative(0.771f, -5.009f)
                curveToRelative(0.126f, -0.82f, 0.894f, -1.378f, 1.71f, -1.255f)
                curveToRelative(0.819f, 0.126f, 1.381f, 0.892f, 1.255f, 1.71f)
                close()
            }
        }
        .build()
        return _circleW!!
    }

private var _circleW: ImageVector? = null
