package me.localx.icons.straight.filled

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

public val Icons.Filled.ThumbsUpTrust: ImageVector
    get() {
        if (_thumbsUpTrust != null) {
            return _thumbsUpTrust!!
        }
        _thumbsUpTrust = Builder(name = "ThumbsUpTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 16.77f)
                verticalLineToRelative(-3.77f)
                horizontalLineToRelative(5.798f)
                lineToRelative(-0.163f, -0.916f)
                curveToRelative(-0.097f, -0.561f, -0.083f, -1.059f, 0.037f, -1.488f)
                curveToRelative(0.42f, -1.546f, 1.771f, -2.596f, 3.357f, -2.596f)
                curveToRelative(0.477f, 0.0f, 0.95f, 0.096f, 1.406f, 0.285f)
                curveToRelative(0.179f, 0.074f, 0.352f, 0.17f, 0.517f, 0.283f)
                curveTo(18.484f, 3.759f, 14.432f, 0.0f, 9.5f, 0.0f)
                curveTo(4.253f, 0.0f, 0.0f, 4.253f, 0.0f, 9.5f)
                curveToRelative(0.0f, 4.891f, 3.697f, 8.915f, 8.449f, 9.439f)
                lineToRelative(-0.449f, -2.169f)
                close()
                moveTo(4.825f, 8.939f)
                lineToRelative(1.4f, -1.429f)
                lineToRelative(2.385f, 2.338f)
                lineToRelative(4.193f, -4.066f)
                lineToRelative(1.393f, 1.436f)
                lineToRelative(-4.455f, 4.319f)
                curveToRelative(-0.295f, 0.295f, -0.701f, 0.463f, -1.133f, 0.463f)
                reflectiveCurveToRelative(-0.838f, -0.168f, -1.144f, -0.474f)
                lineToRelative(-2.64f, -2.587f)
                close()
                moveTo(20.0f, 24.0f)
                horizontalLineToRelative(-8.47f)
                lineToRelative(-1.53f, -7.23f)
                verticalLineToRelative(-1.77f)
                horizontalLineToRelative(6.184f)
                lineToRelative(-0.58f, -3.265f)
                curveToRelative(-0.057f, -0.334f, -0.029f, -0.519f, -0.007f, -0.599f)
                curveToRelative(0.188f, -0.69f, 0.75f, -1.136f, 1.432f, -1.136f)
                curveToRelative(0.213f, 0.0f, 0.428f, 0.044f, 0.64f, 0.132f)
                curveToRelative(0.254f, 0.105f, 0.503f, 0.367f, 0.682f, 0.719f)
                lineToRelative(1.649f, 3.119f)
                verticalLineToRelative(10.03f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _thumbsUpTrust!!
    }

private var _thumbsUpTrust: ImageVector? = null
