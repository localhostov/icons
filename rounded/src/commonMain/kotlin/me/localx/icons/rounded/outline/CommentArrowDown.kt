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

public val Icons.Outline.CommentArrowDown: ImageVector
    get() {
        if (_commentArrowDown != null) {
            return _commentArrowDown!!
        }
        _commentArrowDown = Builder(name = "CommentArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.707f, 13.174f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.535f, 2.535f)
                curveToRelative(-0.585f, 0.585f, -1.412f, 0.876f, -2.172f, 0.876f)
                reflectiveCurveToRelative(-1.515f, -0.32f, -2.071f, -0.876f)
                lineToRelative(-2.636f, -2.636f)
                curveToRelative(-0.391f, -0.39f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                lineTo(11.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(13.0f, 15.467f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
                moveTo(24.0f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-5.917f)
                curveTo(6.082f, 24.0f, 0.47f, 19.208f, 0.03f, 12.854f)
                curveTo(-0.211f, 9.378f, 1.057f, 5.976f, 3.509f, 3.521f)
                reflectiveCurveTo(9.367f, -0.206f, 12.836f, 0.029f)
                curveToRelative(6.26f, 0.425f, 11.164f, 5.833f, 11.164f, 12.311f)
                close()
                moveTo(22.0f, 12.34f)
                curveToRelative(0.0f, -5.431f, -4.085f, -9.962f, -9.299f, -10.316f)
                curveToRelative(-0.229f, -0.016f, -0.458f, -0.023f, -0.686f, -0.023f)
                curveToRelative(-2.656f, 0.0f, -5.209f, 1.048f, -7.091f, 2.933f)
                curveToRelative(-2.044f, 2.046f, -3.101f, 4.883f, -2.899f, 7.782f)
                curveToRelative(0.373f, 5.38f, 5.023f, 9.285f, 11.058f, 9.285f)
                horizontalLineToRelative(5.917f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.66f)
                close()
            }
        }
        .build()
        return _commentArrowDown!!
    }

private var _commentArrowDown: ImageVector? = null
