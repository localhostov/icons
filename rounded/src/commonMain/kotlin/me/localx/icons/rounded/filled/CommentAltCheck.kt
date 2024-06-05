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

public val Icons.Filled.CommentAltCheck: ImageVector
    get() {
        if (_commentAltCheck != null) {
            return _commentAltCheck!!
        }
        _commentAltCheck = Builder(name = "CommentAltCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.923f)
                lineToRelative(3.748f, 3.157f)
                curveToRelative(0.382f, 0.339f, 0.862f, 0.507f, 1.337f, 0.507f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.162f, 1.293f, -0.484f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(2.852f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(17.702f, 7.712f)
                lineToRelative(-5.793f, 5.707f)
                curveToRelative(-0.386f, 0.387f, -0.896f, 0.58f, -1.407f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-2.782f, -2.696f)
                curveToRelative(-0.397f, -0.385f, -0.407f, -1.018f, -0.022f, -1.414f)
                curveToRelative(0.385f, -0.397f, 1.018f, -0.406f, 1.414f, -0.022f)
                lineToRelative(2.793f, 2.707f)
                lineToRelative(5.809f, -5.701f)
                curveToRelative(0.396f, -0.387f, 1.027f, -0.383f, 1.414f, 0.011f)
                curveToRelative(0.388f, 0.393f, 0.384f, 1.026f, -0.01f, 1.414f)
                close()
            }
        }
        .build()
        return _commentAltCheck!!
    }

private var _commentAltCheck: ImageVector? = null
