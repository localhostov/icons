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

public val Icons.Filled.CommentArrowDown: ImageVector
    get() {
        if (_commentArrowDown != null) {
            return _commentArrowDown!!
        }
        _commentArrowDown = Builder(name = "CommentArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.836f, 0.029f)
                curveTo(9.367f, -0.206f, 5.961f, 1.065f, 3.509f, 3.521f)
                reflectiveCurveTo(-0.211f, 9.378f, 0.03f, 12.854f)
                curveToRelative(0.44f, 6.354f, 6.052f, 11.146f, 13.053f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.861f, 19.097f, 0.454f, 12.836f, 0.029f)
                close()
                moveTo(16.707f, 14.589f)
                lineToRelative(-2.535f, 2.535f)
                curveToRelative(-0.585f, 0.585f, -1.354f, 0.877f, -2.122f, 0.877f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.021f, 0.0f, -0.042f, -0.001f, -0.064f, -0.003f)
                curveToRelative(-0.73f, -0.027f, -1.452f, -0.318f, -2.007f, -0.874f)
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
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _commentArrowDown!!
    }

private var _commentArrowDown: ImageVector? = null
