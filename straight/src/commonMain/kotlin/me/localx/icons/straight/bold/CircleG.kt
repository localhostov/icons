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

public val Icons.Bold.CircleG: ImageVector
    get() {
        if (_circleG != null) {
            return _circleG!!
        }
        _circleG = Builder(name = "CircleG", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(17.004f, 11.0f)
                lineToRelative(-0.006f, 2.463f)
                curveToRelative(0.056f, 1.379f, -0.589f, 2.742f, -1.771f, 3.677f)
                curveToRelative(-0.917f, 0.726f, -2.059f, 1.107f, -3.224f, 1.107f)
                curveToRelative(-0.479f, 0.0f, -0.96f, -0.064f, -1.433f, -0.196f)
                curveToRelative(-2.101f, -0.584f, -3.57f, -2.504f, -3.57f, -4.668f)
                verticalLineToRelative(-2.717f)
                curveToRelative(0.0f, -1.294f, 0.547f, -2.566f, 1.501f, -3.491f)
                curveToRelative(0.991f, -0.961f, 2.299f, -1.477f, 3.672f, -1.422f)
                curveToRelative(1.598f, 0.049f, 3.091f, 0.835f, 3.994f, 2.102f)
                lineToRelative(-2.442f, 1.741f)
                curveToRelative(-0.363f, -0.508f, -0.978f, -0.824f, -1.646f, -0.845f)
                curveToRelative(-0.555f, -0.028f, -1.088f, 0.188f, -1.49f, 0.578f)
                curveToRelative(-0.375f, 0.363f, -0.589f, 0.85f, -0.589f, 1.337f)
                verticalLineToRelative(2.717f)
                curveToRelative(0.0f, 0.822f, 0.565f, 1.554f, 1.375f, 1.778f)
                curveToRelative(0.702f, 0.196f, 1.447f, 0.055f, 1.991f, -0.375f)
                curveToRelative(0.18f, -0.142f, 0.445f, -0.404f, 0.568f, -0.786f)
                horizontalLineToRelative(-1.934f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.004f)
                close()
            }
        }
        .build()
        return _circleG!!
    }

private var _circleG: ImageVector? = null
