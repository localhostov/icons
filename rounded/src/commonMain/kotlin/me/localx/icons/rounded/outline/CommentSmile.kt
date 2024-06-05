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

public val Icons.Outline.CommentSmile: ImageVector
    get() {
        if (_commentSmile != null) {
            return _commentSmile!!
        }
        _commentSmile = Builder(name = "CommentSmile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.713f, 13.804f)
                curveToRelative(0.384f, 0.393f, 0.381f, 1.02f, -0.009f, 1.406f)
                curveToRelative(-0.074f, 0.073f, -1.84f, 1.79f, -4.704f, 1.79f)
                reflectiveCurveToRelative(-4.63f, -1.716f, -4.704f, -1.79f)
                curveToRelative(-0.392f, -0.389f, -0.396f, -1.021f, -0.007f, -1.414f)
                curveToRelative(0.39f, -0.392f, 1.021f, -0.396f, 1.415f, -0.007f)
                curveToRelative(0.046f, 0.045f, 1.28f, 1.21f, 3.296f, 1.21f)
                reflectiveCurveToRelative(3.25f, -1.166f, 3.302f, -1.215f)
                curveToRelative(0.396f, -0.382f, 1.028f, -0.374f, 1.411f, 0.02f)
                close()
                moveTo(8.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-5.917f)
                curveTo(6.082f, 24.0f, 0.471f, 19.208f, 0.029f, 12.854f)
                curveToRelative(-0.24f, -3.476f, 1.027f, -6.878f, 3.479f, -9.333f)
                curveTo(5.962f, 1.065f, 9.371f, -0.205f, 12.836f, 0.029f)
                curveToRelative(6.261f, 0.425f, 11.164f, 5.833f, 11.164f, 12.312f)
                close()
                moveTo(22.0f, 12.34f)
                curveToRelative(0.0f, -5.431f, -4.085f, -9.962f, -9.299f, -10.316f)
                curveToRelative(-0.229f, -0.016f, -0.458f, -0.023f, -0.687f, -0.023f)
                curveToRelative(-2.656f, 0.0f, -5.209f, 1.048f, -7.091f, 2.933f)
                curveToRelative(-2.043f, 2.046f, -3.1f, 4.883f, -2.898f, 7.782f)
                curveToRelative(0.372f, 5.38f, 5.023f, 9.285f, 11.058f, 9.285f)
                horizontalLineToRelative(5.917f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.66f)
                close()
            }
        }
        .build()
        return _commentSmile!!
    }

private var _commentSmile: ImageVector? = null
