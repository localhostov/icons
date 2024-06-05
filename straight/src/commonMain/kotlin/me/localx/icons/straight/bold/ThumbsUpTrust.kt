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

public val Icons.Bold.ThumbsUpTrust: ImageVector
    get() {
        if (_thumbsUpTrust != null) {
            return _thumbsUpTrust!!
        }
        _thumbsUpTrust = Builder(name = "ThumbsUpTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.136f, 16.74f)
                lineToRelative(0.583f, 3.168f)
                curveTo(3.81f, 19.276f, 0.0f, 15.079f, 0.0f, 10.0f)
                curveTo(0.0f, 4.486f, 4.486f, 0.0f, 10.0f, 0.0f)
                curveToRelative(5.012f, 0.0f, 9.163f, 3.711f, 9.879f, 8.528f)
                curveToRelative(-0.383f, -0.571f, -0.88f, -1.01f, -1.444f, -1.243f)
                curveToRelative(-0.456f, -0.189f, -0.93f, -0.285f, -1.406f, -0.285f)
                curveToRelative(-0.233f, 0.0f, -0.459f, 0.029f, -0.679f, 0.073f)
                curveToRelative(-1.111f, -2.4f, -3.536f, -4.073f, -6.35f, -4.073f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                curveToRelative(0.0f, 3.213f, 2.18f, 5.921f, 5.136f, 6.74f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-10.5f)
                lineToRelative(-1.5f, -8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.184f)
                lineToRelative(-0.58f, -3.265f)
                curveToRelative(-0.057f, -0.334f, -0.029f, -0.519f, -0.007f, -0.599f)
                curveToRelative(0.188f, -0.69f, 0.75f, -1.136f, 1.432f, -1.136f)
                curveToRelative(0.213f, 0.0f, 0.428f, 0.044f, 0.64f, 0.132f)
                curveToRelative(0.254f, 0.105f, 0.503f, 0.367f, 0.682f, 0.719f)
                lineToRelative(2.193f, 4.149f)
                horizontalLineToRelative(1.456f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-6.76f)
                lineToRelative(0.75f, 4.0f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.044f, 8.077f)
                lineToRelative(-2.088f, -2.154f)
                lineToRelative(-3.844f, 3.727f)
                lineToRelative(-2.037f, -1.997f)
                lineToRelative(-2.1f, 2.143f)
                lineToRelative(2.636f, 2.583f)
                curveToRelative(0.399f, 0.4f, 0.932f, 0.621f, 1.497f, 0.621f)
                reflectiveCurveToRelative(1.097f, -0.22f, 1.48f, -0.604f)
                lineToRelative(4.455f, -4.319f)
                close()
            }
        }
        .build()
        return _thumbsUpTrust!!
    }

private var _thumbsUpTrust: ImageVector? = null
