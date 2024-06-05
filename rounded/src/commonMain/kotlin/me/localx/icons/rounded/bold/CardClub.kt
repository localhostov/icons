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

public val Icons.Bold.CardClub: ImageVector
    get() {
        if (_cardClub != null) {
            return _cardClub!!
        }
        _cardClub = Builder(name = "CardClub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(5.467f, 0.0f, 3.0f, 2.467f, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(6.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(15.956f, 13.428f)
                curveToRelative(-0.151f, 0.727f, -0.733f, 1.335f, -1.454f, 1.511f)
                curveToRelative(-0.741f, 0.181f, -1.436f, -0.053f, -1.904f, -0.515f)
                curveToRelative(0.197f, 0.66f, 0.454f, 1.284f, 0.802f, 1.825f)
                curveToRelative(0.209f, 0.325f, -0.046f, 0.752f, -0.432f, 0.752f)
                horizontalLineToRelative(-1.935f)
                curveToRelative(-0.386f, 0.0f, -0.641f, -0.427f, -0.432f, -0.752f)
                curveToRelative(0.348f, -0.541f, 0.606f, -1.165f, 0.802f, -1.825f)
                curveToRelative(-0.469f, 0.462f, -1.163f, 0.696f, -1.904f, 0.515f)
                curveToRelative(-0.721f, -0.176f, -1.303f, -0.784f, -1.454f, -1.511f)
                curveToRelative(-0.268f, -1.292f, 0.711f, -2.428f, 1.956f, -2.428f)
                curveToRelative(0.101f, 0.0f, 0.197f, 0.015f, 0.293f, 0.03f)
                curveToRelative(-0.182f, -0.302f, -0.293f, -0.651f, -0.293f, -1.03f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.378f, -0.111f, 0.728f, -0.293f, 1.03f)
                curveToRelative(0.097f, -0.014f, 0.193f, -0.03f, 0.293f, -0.03f)
                curveToRelative(1.244f, 0.0f, 2.223f, 1.136f, 1.956f, 2.428f)
                close()
            }
        }
        .build()
        return _cardClub!!
    }

private var _cardClub: ImageVector? = null
