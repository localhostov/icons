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

public val Icons.Outline.CommentMinus: ImageVector
    get() {
        if (_commentMinus != null) {
            return _commentMinus!!
        }
        _commentMinus = Builder(name = "CommentMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-5.917f)
                curveTo(6.082f, 24.0f, 0.47f, 19.208f, 0.03f, 12.854f)
                curveToRelative(-0.241f, -3.476f, 1.027f, -6.878f, 3.479f, -9.333f)
                reflectiveCurveTo(9.367f, -0.206f, 12.836f, 0.029f)
                curveToRelative(6.26f, 0.425f, 11.164f, 5.833f, 11.164f, 12.312f)
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
        return _commentMinus!!
    }

private var _commentMinus: ImageVector? = null
