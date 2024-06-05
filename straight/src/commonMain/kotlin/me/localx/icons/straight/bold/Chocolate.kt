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

public val Icons.Bold.Chocolate: ImageVector
    get() {
        if (_chocolate != null) {
            return _chocolate!!
        }
        _chocolate = Builder(name = "Chocolate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 7.073f)
                lineTo(16.928f, 1.0f)
                arcToRelative(3.414f, 3.414f, 0.0f, false, false, -4.823f, 0.0f)
                lineTo(1.0f, 12.105f)
                arcToRelative(3.415f, 3.415f, 0.0f, false, false, 0.0f, 4.822f)
                lineTo(7.072f, 23.0f)
                arcToRelative(3.409f, 3.409f, 0.0f, false, false, 4.822f, 0.0f)
                lineTo(23.0f, 11.9f)
                arcTo(3.414f, 3.414f, 0.0f, false, false, 23.0f, 7.073f)
                close()
                moveTo(14.227f, 3.12f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, 0.579f, 0.0f)
                lineToRelative(1.946f, 1.945f)
                lineTo(14.22f, 7.6f)
                lineTo(11.984f, 5.362f)
                close()
                moveTo(9.719f, 12.1f)
                lineTo(7.483f, 9.862f)
                lineToRelative(2.38f, -2.379f)
                lineTo(12.1f, 9.719f)
                close()
                moveTo(14.219f, 11.842f)
                lineTo(16.519f, 14.142f)
                lineTo(14.139f, 16.521f)
                lineTo(11.839f, 14.221f)
                close()
                moveTo(3.119f, 14.229f)
                lineTo(5.363f, 11.985f)
                lineTo(7.6f, 14.219f)
                lineTo(5.065f, 16.752f)
                lineTo(3.119f, 14.806f)
                arcTo(0.41f, 0.41f, 0.0f, false, true, 3.118f, 14.227f)
                close()
                moveTo(9.773f, 20.883f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, -0.578f, 0.0f)
                lineTo(7.186f, 18.873f)
                lineToRelative(2.533f, -2.532f)
                lineToRelative(2.3f, 2.3f)
                close()
                moveTo(20.881f, 9.773f)
                lineToRelative(-2.243f, 2.243f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(2.533f, -2.532f)
                lineToRelative(2.007f, 2.007f)
                arcTo(0.409f, 0.409f, 0.0f, false, true, 20.881f, 9.773f)
                close()
            }
        }
        .build()
        return _chocolate!!
    }

private var _chocolate: ImageVector? = null
