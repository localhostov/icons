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

public val Icons.Outline.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = Builder(name = "GolfHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.42f, -5.159f, 6.0f, -12.0f, 6.0f)
                reflectiveCurveTo(0.0f, 21.42f, 0.0f, 18.0f)
                curveToRelative(0.0f, -2.626f, 2.999f, -4.789f, 7.825f, -5.645f)
                curveToRelative(0.553f, -0.093f, 1.063f, 0.267f, 1.159f, 0.811f)
                curveToRelative(0.097f, 0.543f, -0.266f, 1.062f, -0.81f, 1.159f)
                curveToRelative(-3.578f, 0.634f, -6.175f, 2.179f, -6.175f, 3.675f)
                curveToRelative(0.0f, 1.892f, 4.106f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveToRelative(10.0f, -2.108f, 10.0f, -4.0f)
                curveToRelative(0.0f, -1.496f, -2.597f, -3.041f, -6.175f, -3.675f)
                curveToRelative(-0.544f, -0.097f, -0.906f, -0.616f, -0.81f, -1.159f)
                curveToRelative(0.096f, -0.544f, 0.606f, -0.907f, 1.159f, -0.811f)
                curveToRelative(4.826f, 0.855f, 7.825f, 3.018f, 7.825f, 5.645f)
                close()
                moveTo(11.0f, 18.0f)
                lineTo(11.0f, 2.692f)
                curveToRelative(0.0f, -1.387f, 0.732f, -2.048f, 1.17f, -2.318f)
                curveToRelative(0.727f, -0.449f, 1.726f, -0.497f, 2.487f, -0.117f)
                curveToRelative(0.039f, 0.019f, 5.301f, 3.562f, 5.301f, 3.562f)
                curveToRelative(0.729f, 0.538f, 1.102f, 1.356f, 1.034f, 2.214f)
                curveToRelative(-0.066f, 0.857f, -0.562f, 1.607f, -1.323f, 2.006f)
                lineToRelative(-6.669f, 3.271f)
                verticalLineToRelative(6.689f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 9.083f)
                lineToRelative(5.765f, -2.828f)
                curveToRelative(0.183f, -0.096f, 0.226f, -0.278f, 0.233f, -0.377f)
                curveToRelative(0.008f, -0.1f, -0.007f, -0.288f, -0.193f, -0.426f)
                lineToRelative(-5.079f, -3.422f)
                curveToRelative(-0.055f, -0.019f, -0.127f, -0.031f, -0.204f, -0.031f)
                curveToRelative(-0.102f, 0.0f, -0.212f, 0.021f, -0.3f, 0.076f)
                curveToRelative(-0.147f, 0.091f, -0.222f, 0.298f, -0.222f, 0.617f)
                verticalLineToRelative(6.392f)
                close()
            }
        }
        .build()
        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
