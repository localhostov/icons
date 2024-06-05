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

public val Icons.Outline.CommentPen: ImageVector
    get() {
        if (_commentPen != null) {
            return _commentPen!!
        }
        _commentPen = Builder(name = "CommentPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.586f, 18.0f)
                horizontalLineToRelative(-1.586f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -1.068f, 0.416f, -2.073f, 1.172f, -2.828f)
                lineToRelative(5.707f, -5.707f)
                curveToRelative(1.17f, -1.17f, 3.072f, -1.17f, 4.242f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.122f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.755f, 0.755f, -1.76f, 1.172f, -2.828f, 1.172f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(0.586f)
                curveToRelative(0.534f, 0.0f, 1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(5.707f, -5.707f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-5.707f, 5.707f)
                curveToRelative(-0.372f, 0.373f, -0.586f, 0.888f, -0.586f, 1.414f)
                verticalLineToRelative(0.586f)
                close()
                moveTo(19.0f, 24.0f)
                horizontalLineToRelative(-5.917f)
                curveTo(6.082f, 24.0f, 0.471f, 19.208f, 0.029f, 12.854f)
                curveTo(-0.211f, 9.378f, 1.057f, 5.976f, 3.509f, 3.521f)
                curveTo(5.962f, 1.065f, 9.371f, -0.205f, 12.836f, 0.029f)
                curveToRelative(6.261f, 0.425f, 11.164f, 5.833f, 11.164f, 12.312f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(12.015f, 2.001f)
                curveToRelative(-2.656f, 0.0f, -5.209f, 1.048f, -7.091f, 2.933f)
                curveToRelative(-2.043f, 2.046f, -3.1f, 4.883f, -2.898f, 7.782f)
                curveToRelative(0.372f, 5.38f, 5.023f, 9.285f, 11.058f, 9.285f)
                horizontalLineToRelative(5.917f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.66f)
                curveToRelative(0.0f, -5.431f, -4.085f, -9.962f, -9.299f, -10.316f)
                curveToRelative(-0.229f, -0.016f, -0.458f, -0.023f, -0.687f, -0.023f)
                close()
            }
        }
        .build()
        return _commentPen!!
    }

private var _commentPen: ImageVector? = null
