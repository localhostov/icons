package me.localx.icons.rounded.outline

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

public val Icons.Outline.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.844f, 15.873f)
                lineToRelative(-2.804f, -9.872f)
                lineToRelative(0.861f, -3.02f)
                curveToRelative(0.227f, -0.689f, 0.109f, -1.453f, -0.317f, -2.041f)
                curveToRelative(-0.426f, -0.588f, -1.113f, -0.939f, -1.839f, -0.939f)
                horizontalLineToRelative(-3.488f)
                curveToRelative(-0.726f, 0.0f, -1.414f, 0.351f, -1.839f, 0.939f)
                curveToRelative(-0.426f, 0.588f, -0.544f, 1.351f, -0.329f, 2.002f)
                lineToRelative(0.872f, 3.058f)
                lineToRelative(-2.791f, 9.829f)
                curveToRelative(-0.501f, 1.502f, -0.068f, 3.16f, 1.104f, 4.225f)
                lineToRelative(4.054f, 3.686f)
                curveToRelative(0.191f, 0.173f, 0.432f, 0.26f, 0.673f, 0.26f)
                reflectiveCurveToRelative(0.482f, -0.087f, 0.673f, -0.26f)
                lineToRelative(4.054f, -3.685f)
                curveToRelative(1.172f, -1.065f, 1.605f, -2.723f, 1.117f, -4.182f)
                close()
                moveTo(10.037f, 2.112f)
                curveToRelative(0.037f, -0.051f, 0.104f, -0.112f, 0.219f, -0.112f)
                horizontalLineToRelative(3.488f)
                curveToRelative(0.114f, 0.0f, 0.182f, 0.061f, 0.219f, 0.112f)
                curveToRelative(0.037f, 0.051f, 0.074f, 0.134f, 0.026f, 0.281f)
                lineToRelative(-0.744f, 2.607f)
                horizontalLineToRelative(-2.491f)
                lineToRelative(-0.755f, -2.645f)
                curveToRelative(-0.036f, -0.109f, 0.0f, -0.192f, 0.038f, -0.243f)
                close()
                moveTo(15.381f, 18.575f)
                lineToRelative(-3.381f, 3.074f)
                lineToRelative(-3.382f, -3.074f)
                curveToRelative(-0.585f, -0.532f, -0.802f, -1.361f, -0.538f, -2.155f)
                lineToRelative(2.675f, -9.419f)
                horizontalLineToRelative(2.489f)
                lineToRelative(2.689f, 9.462f)
                curveToRelative(0.25f, 0.751f, 0.034f, 1.58f, -0.552f, 2.112f)
                close()
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
