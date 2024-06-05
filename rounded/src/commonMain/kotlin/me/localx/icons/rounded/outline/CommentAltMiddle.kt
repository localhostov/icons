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

public val Icons.Outline.CommentAltMiddle: ImageVector
    get() {
        if (_commentAltMiddle != null) {
            return _commentAltMiddle!!
        }
        _commentAltMiddle = Builder(name = "CommentAltMiddle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.009f, 23.665f)
                curveToRelative(-0.476f, 0.0f, -0.955f, -0.168f, -1.337f, -0.507f)
                lineToRelative(-3.748f, -3.157f)
                horizontalLineToRelative(-2.923f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(4.0f)
                curveTo(0.0f, 1.794f, 1.794f, 0.0f, 4.0f, 0.0f)
                horizontalLineTo(20.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.852f)
                lineToRelative(-3.847f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.825f, 0.484f, -1.293f, 0.484f)
                close()
                moveTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.289f)
                curveToRelative(0.236f, 0.0f, 0.464f, 0.083f, 0.645f, 0.235f)
                lineToRelative(4.047f, 3.41f)
                lineToRelative(4.17f, -3.416f)
                curveToRelative(0.18f, -0.148f, 0.405f, -0.229f, 0.638f, -0.229f)
                horizontalLineToRelative(3.212f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _commentAltMiddle!!
    }

private var _commentAltMiddle: ImageVector? = null
