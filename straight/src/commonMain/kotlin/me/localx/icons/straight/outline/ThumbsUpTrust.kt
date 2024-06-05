package me.localx.icons.straight.outline

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

public val Icons.Outline.ThumbsUpTrust: ImageVector
    get() {
        if (_thumbsUpTrust != null) {
            return _thumbsUpTrust!!
        }
        _thumbsUpTrust = Builder(name = "ThumbsUpTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.335f, 17.823f)
                lineToRelative(0.384f, 2.085f)
                curveTo(3.81f, 19.276f, 0.0f, 15.079f, 0.0f, 10.0f)
                curveTo(0.0f, 4.486f, 4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(5.012f, 0.0f, 9.163f, 3.711f, 9.879f, 8.528f)
                curveToRelative(-0.383f, -0.571f, -0.88f, -1.01f, -1.444f, -1.243f)
                curveToRelative(-0.329f, -0.136f, -0.668f, -0.206f, -1.01f, -0.245f)
                curveToRelative(-1.18f, -2.949f, -4.061f, -5.04f, -7.426f, -5.04f)
                curveTo(5.589f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 3.84f, 2.721f, 7.055f, 6.335f, 7.823f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-10.47f)
                lineToRelative(-1.53f, -8.23f)
                verticalLineToRelative(-1.77f)
                horizontalLineToRelative(6.184f)
                lineToRelative(-0.58f, -3.265f)
                curveToRelative(-0.057f, -0.334f, -0.029f, -0.519f, -0.007f, -0.599f)
                curveToRelative(0.188f, -0.69f, 0.75f, -1.136f, 1.432f, -1.136f)
                curveToRelative(0.213f, 0.0f, 0.428f, 0.044f, 0.64f, 0.132f)
                curveToRelative(0.254f, 0.105f, 0.503f, 0.367f, 0.682f, 0.719f)
                lineToRelative(2.193f, 4.149f)
                horizontalLineToRelative(1.456f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(-7.939f)
                lineToRelative(1.128f, 6.0f)
                horizontalLineToRelative(6.812f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(14.696f, 7.718f)
                lineToRelative(-1.393f, -1.436f)
                lineToRelative(-4.193f, 4.066f)
                lineToRelative(-2.385f, -2.338f)
                lineToRelative(-1.4f, 1.429f)
                lineToRelative(2.64f, 2.587f)
                curveToRelative(0.306f, 0.306f, 0.711f, 0.474f, 1.144f, 0.474f)
                reflectiveCurveToRelative(0.838f, -0.168f, 1.133f, -0.463f)
                lineToRelative(4.455f, -4.319f)
                close()
            }
        }
        .build()
        return _thumbsUpTrust!!
    }

private var _thumbsUpTrust: ImageVector? = null
