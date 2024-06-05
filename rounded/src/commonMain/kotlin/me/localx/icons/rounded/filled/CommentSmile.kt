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

public val Icons.Filled.CommentSmile: ImageVector
    get() {
        if (_commentSmile != null) {
            return _commentSmile!!
        }
        _commentSmile = Builder(name = "CommentSmile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.836f, 0.029f)
                curveToRelative(-3.465f, -0.233f, -6.874f, 1.036f, -9.327f, 3.492f)
                curveTo(1.057f, 5.976f, -0.211f, 9.378f, 0.029f, 12.854f)
                curveToRelative(0.441f, 6.354f, 6.053f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.862f, 19.097f, 0.454f, 12.836f, 0.029f)
                close()
                moveTo(8.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.704f, 15.21f)
                curveToRelative(-0.074f, 0.073f, -1.84f, 1.79f, -4.704f, 1.79f)
                reflectiveCurveToRelative(-4.63f, -1.716f, -4.704f, -1.79f)
                curveToRelative(-0.392f, -0.389f, -0.396f, -1.021f, -0.007f, -1.414f)
                curveToRelative(0.39f, -0.392f, 1.021f, -0.396f, 1.415f, -0.007f)
                curveToRelative(0.046f, 0.045f, 1.28f, 1.21f, 3.296f, 1.21f)
                reflectiveCurveToRelative(3.25f, -1.166f, 3.302f, -1.215f)
                curveToRelative(0.396f, -0.382f, 1.028f, -0.374f, 1.411f, 0.02f)
                curveToRelative(0.384f, 0.393f, 0.381f, 1.02f, -0.009f, 1.406f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _commentSmile!!
    }

private var _commentSmile: ImageVector? = null
