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

public val Icons.Bold.MartiniGlassEmpty: ImageVector
    get() {
        if (_martiniGlassEmpty != null) {
            return _martiniGlassEmpty!!
        }
        _martiniGlassEmpty = Builder(name = "MartiniGlassEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.686f, 0.712f, 3.303f, 1.955f, 4.441f)
                lineToRelative(8.545f, 8.198f)
                verticalLineToRelative(6.86f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-6.86f)
                lineToRelative(8.529f, -8.185f)
                curveToRelative(1.252f, -1.139f, 1.971f, -2.763f, 1.971f, -4.455f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(19.981f, 3.764f)
                lineToRelative(-7.981f, 7.657f)
                lineTo(4.019f, 3.764f)
                lineToRelative(-0.029f, -0.027f)
                curveToRelative(-0.236f, -0.215f, -0.435f, -0.464f, -0.59f, -0.736f)
                horizontalLineToRelative(17.198f)
                curveToRelative(-0.161f, 0.279f, -0.367f, 0.536f, -0.616f, 0.764f)
                close()
            }
        }
        .build()
        return _martiniGlassEmpty!!
    }

private var _martiniGlassEmpty: ImageVector? = null
