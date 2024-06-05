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

public val Icons.Bold.StarRatingCall: ImageVector
    get() {
        if (_starRatingCall != null) {
            return _starRatingCall!!
        }
        _starRatingCall = Builder(name = "StarRatingCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.327f, 14.891f)
                curveToRelative(-2.327f, -1.098f, -4.042f, -2.819f, -5.206f, -5.229f)
                lineToRelative(2.963f, -2.963f)
                lineTo(5.442f, 0.058f)
                lineTo(1.798f, 3.702f)
                curveTo(0.659f, 4.839f, 0.032f, 6.374f, 0.032f, 8.025f)
                curveTo(0.032f, 15.177f, 8.823f, 23.968f, 15.975f, 23.968f)
                curveToRelative(1.651f, 0.0f, 3.187f, -0.627f, 4.322f, -1.765f)
                lineToRelative(3.646f, -3.646f)
                lineToRelative(-6.641f, -6.642f)
                lineToRelative(-2.974f, 2.975f)
                close()
                moveTo(18.174f, 20.083f)
                curveToRelative(-0.569f, 0.57f, -1.35f, 0.885f, -2.199f, 0.885f)
                curveToRelative(-4.993f, 0.0f, -12.942f, -7.066f, -12.942f, -12.942f)
                curveToRelative(0.0f, -0.849f, 0.314f, -1.63f, 0.886f, -2.201f)
                lineToRelative(1.524f, -1.524f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-2.268f, 2.268f)
                lineToRelative(0.369f, 0.919f)
                curveToRelative(1.59f, 3.961f, 4.347f, 6.713f, 8.195f, 8.182f)
                lineToRelative(0.908f, 0.347f)
                lineToRelative(2.255f, -2.256f)
                lineToRelative(2.399f, 2.399f)
                lineToRelative(-1.526f, 1.525f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(0.764f)
                lineToRelative(-2.75f, 1.591f)
                lineToRelative(1.105f, 3.357f)
                lineToRelative(-0.625f, 0.436f)
                lineToRelative(-2.717f, -2.101f)
                lineToRelative(-2.729f, 2.11f)
                lineToRelative(-0.601f, -0.453f)
                lineToRelative(1.086f, -3.396f)
                lineToRelative(-2.769f, -1.54f)
                verticalLineToRelative(-0.769f)
                horizontalLineToRelative(3.625f)
                lineToRelative(0.981f, -3.75f)
                horizontalLineToRelative(0.809f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.605f)
                close()
            }
        }
        .build()
        return _starRatingCall!!
    }

private var _starRatingCall: ImageVector? = null
