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

public val Icons.Bold.ReferralUser: ImageVector
    get() {
        if (_referralUser != null) {
            return _referralUser!!
        }
        _referralUser = Builder(name = "ReferralUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(19.0f, 20.0f)
                curveToRelative(-2.15f, 0.0f, -4.009f, 1.132f, -4.905f, 2.779f)
                curveToRelative(-0.305f, 0.561f, 0.159f, 1.221f, 0.844f, 1.221f)
                horizontalLineToRelative(8.121f)
                curveToRelative(0.685f, 0.0f, 1.149f, -0.66f, 0.844f, -1.221f)
                curveToRelative(-0.895f, -1.647f, -2.755f, -2.779f, -4.905f, -2.779f)
                close()
                moveTo(14.94f, 11.0f)
                horizontalLineToRelative(8.121f)
                curveToRelative(0.685f, 0.0f, 1.149f, -0.66f, 0.844f, -1.221f)
                curveToRelative(-0.895f, -1.647f, -2.755f, -2.779f, -4.905f, -2.779f)
                reflectiveCurveToRelative(-4.009f, 1.132f, -4.905f, 2.779f)
                curveToRelative(-0.305f, 0.561f, 0.159f, 1.221f, 0.844f, 1.221f)
                close()
                moveTo(10.272f, 14.55f)
                curveToRelative(-0.472f, -0.466f, -1.271f, -0.131f, -1.271f, 0.531f)
                verticalLineToRelative(1.919f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.0f)
                curveTo(2.468f, 4.0f, 0.0f, 6.468f, 0.0f, 9.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.919f)
                curveToRelative(0.0f, 0.663f, 0.8f, 0.997f, 1.271f, 0.531f)
                lineToRelative(3.536f, -3.49f)
                curveToRelative(0.256f, -0.253f, 0.256f, -0.667f, 0.0f, -0.92f)
                lineToRelative(-3.536f, -3.49f)
                close()
            }
        }
        .build()
        return _referralUser!!
    }

private var _referralUser: ImageVector? = null
