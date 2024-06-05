package me.localx.icons.rounded.bold

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

public val Icons.Bold.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.3f, -2.91f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.3f, 2.09f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.208f, 5.755f)
                lineTo(3.539f, 19.4f)
                arcTo(5.257f, 5.257f, 0.0f, false, false, 8.748f, 24.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(5.257f, 5.257f, 0.0f, false, false, 5.209f, -4.6f)
                lineTo(21.906f, 7.845f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 24.0f, 5.0f)
                close()
                moveTo(18.238f, 13.0f)
                lineTo(14.816f, 13.0f)
                curveToRelative(-0.9f, -3.959f, -4.733f, -3.957f, -5.632f, 0.0f)
                lineTo(5.762f, 13.0f)
                lineTo(5.137f, 8.0f)
                lineTo(18.863f, 8.0f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 3.0f)
                close()
                moveTo(15.252f, 21.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(2.255f, 2.255f, 0.0f, false, true, -2.233f, -1.972f)
                lineTo(6.137f, 16.0f)
                lineTo(9.184f, 16.0f)
                curveToRelative(0.9f, 3.959f, 4.733f, 3.957f, 5.632f, 0.0f)
                horizontalLineToRelative(3.047f)
                lineToRelative(-0.379f, 3.029f)
                arcTo(2.253f, 2.253f, 0.0f, false, true, 15.252f, 21.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
