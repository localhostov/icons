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

public val Icons.Bold.GiftBoxBenefits: ImageVector
    get() {
        if (_giftBoxBenefits != null) {
            return _giftBoxBenefits!!
        }
        _giftBoxBenefits = Builder(name = "GiftBoxBenefits", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.096f)
                lineToRelative(-0.854f, -2.904f)
                horizontalLineToRelative(0.854f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 8.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(12.881f)
                lineToRelative(-0.884f, 3.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.362f)
                lineToRelative(-1.021f, 3.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-11.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.786f)
                curveToRelative(-0.109f, -0.029f, -0.183f, -0.049f, -0.186f, -0.051f)
                curveToRelative(-1.215f, -0.911f, -1.461f, -2.634f, -0.55f, -3.849f)
                curveToRelative(0.911f, -1.215f, 2.634f, -1.461f, 3.849f, -0.55f)
                curveToRelative(1.673f, 1.255f, 2.429f, 3.463f, 2.601f, 4.449f)
                curveToRelative(0.172f, -0.986f, 0.928f, -3.194f, 2.601f, -4.449f)
                curveToRelative(1.215f, -0.911f, 2.938f, -0.665f, 3.849f, 0.55f)
                curveToRelative(0.911f, 1.215f, 0.665f, 2.938f, -0.55f, 3.849f)
                curveToRelative(-0.002f, 0.002f, -0.077f, 0.022f, -0.185f, 0.051f)
                horizontalLineToRelative(2.784f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(18.543f, 11.637f)
                horizontalLineToRelative(-1.059f)
                lineToRelative(-1.285f, 4.363f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(1.006f)
                lineToRelative(3.079f, 2.016f)
                lineToRelative(-1.181f, 4.022f)
                lineToRelative(0.787f, 0.593f)
                lineToRelative(3.331f, -2.338f)
                lineToRelative(3.382f, 2.338f)
                lineToRelative(0.818f, -0.571f)
                lineToRelative(-1.271f, -3.982f)
                lineToRelative(3.054f, -2.083f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.174f)
                lineToRelative(-1.283f, -4.363f)
                close()
            }
        }
        .build()
        return _giftBoxBenefits!!
    }

private var _giftBoxBenefits: ImageVector? = null
