package me.localx.icons.rounded.filled

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

public val Icons.Filled.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.004f, 133.44f)
                verticalLineTo(44.565f)
                curveTo(63.504f, 20.486f, 82.592f, 0.548f, 106.671f, 0.0f)
                horizontalLineToRelative(85.333f)
                curveToRelative(12.306f, 0.0f, 22.283f, 9.976f, 22.283f, 22.283f)
                reflectiveCurveToRelative(-9.976f, 22.283f, -22.283f, 22.283f)
                horizontalLineToRelative(-54.635f)
                lineToRelative(125.995f, 131.797f)
                curveToRelative(0.865f, 0.93f, 2.079f, 1.456f, 3.349f, 1.451f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(1.262f, 0.016f, 2.471f, -0.503f, 3.328f, -1.429f)
                lineTo(416.943f, 23.232f)
                curveToRelative(20.523f, -20.693f, 49.579f, 11.563f, 30.165f, 31.467f)
                lineToRelative(-146.88f, 153.088f)
                curveToRelative(-8.702f, 9.22f, -20.815f, 14.451f, -33.493f, 14.464f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-12.701f, -0.026f, -24.83f, -5.28f, -33.536f, -14.528f)
                lineTo(106.671f, 75.371f)
                verticalLineToRelative(58.069f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                reflectiveCurveTo(64.004f, 145.222f, 64.004f, 133.44f)
                close()
                moveTo(478.831f, 342.507f)
                curveToRelative(-95.765f, -99.797f, -349.867f, -99.819f, -445.632f, 0.0f)
                curveTo(11.562f, 365.05f, -0.358f, 395.188f, 0.004f, 426.432f)
                lineToRelative(1.728f, 25.045f)
                curveTo(1.1f, 484.183f, 27.034f, 511.242f, 59.737f, 512.0f)
                curveToRelative(0.939f, 0.0f, 53.824f, -7.168f, 53.824f, -7.168f)
                curveToRelative(31.523f, -1.541f, 56.336f, -27.469f, 56.491f, -59.029f)
                lineToRelative(3.371f, -40.064f)
                curveToRelative(26.202f, -10.792f, 54.244f, -16.413f, 82.581f, -16.555f)
                curveToRelative(28.357f, 0.41f, 56.391f, 6.096f, 82.667f, 16.768f)
                lineToRelative(3.328f, 39.851f)
                curveToRelative(0.155f, 31.561f, 24.967f, 57.488f, 56.491f, 59.029f)
                curveToRelative(0.0f, 0.0f, 52.885f, 7.168f, 53.824f, 7.168f)
                curveToRelative(32.19f, -0.524f, 58.01f, -26.771f, 58.005f, -58.965f)
                lineToRelative(1.685f, -28.096f)
                curveToRelative(0.041f, -30.723f, -11.862f, -60.259f, -33.195f, -82.368f)
                lineTo(478.831f, 342.507f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
