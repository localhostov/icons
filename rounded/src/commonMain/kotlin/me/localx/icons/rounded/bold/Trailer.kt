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

public val Icons.Bold.Trailer: ImageVector
    get() {
        if (_trailer != null) {
            return _trailer!!
        }
        _trailer = Builder(name = "Trailer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.086f)
                lineTo(23.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 17.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 1.375f, 3.639f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.25f, -1.987f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 3.0f, 16.5f)
                lineTo(3.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                verticalLineToRelative(4.0f)
                lineTo(15.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.0f, 19.086f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(10.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(5.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                lineTo(3.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.0f, 5.5f)
                lineTo(20.0f, 12.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 20.5f)
                close()
            }
        }
        .build()
        return _trailer!!
    }

private var _trailer: ImageVector? = null
