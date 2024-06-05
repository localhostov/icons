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

public val Icons.Bold.Dollar: ImageVector
    get() {
        if (_dollar != null) {
            return _dollar!!
        }
        _dollar = Builder(name = "Dollar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 8.0f)
                lineTo(20.0f, 7.313f)
                arcTo(5.32f, 5.32f, 0.0f, false, false, 14.687f, 2.0f)
                lineTo(13.5f, 2.0f)
                lineTo(13.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(10.5f, 2.0f)
                lineTo(9.313f, 2.0f)
                arcTo(5.313f, 5.313f, 0.0f, false, false, 7.772f, 12.4f)
                lineToRelative(2.728f, 0.746f)
                lineTo(10.5f, 19.0f)
                lineTo(9.313f, 19.0f)
                arcTo(2.316f, 2.316f, 0.0f, false, true, 7.0f, 16.687f)
                lineTo(7.0f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.687f)
                arcTo(5.32f, 5.32f, 0.0f, false, false, 9.313f, 22.0f)
                lineTo(10.5f, 22.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 22.0f)
                horizontalLineToRelative(1.187f)
                arcToRelative(5.313f, 5.313f, 0.0f, false, false, 1.541f, -10.4f)
                lineTo(13.5f, 10.856f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(1.187f)
                arcTo(2.316f, 2.316f, 0.0f, false, true, 17.0f, 7.313f)
                lineTo(17.0f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 9.5f)
                close()
                moveTo(15.382f, 14.479f)
                arcToRelative(2.314f, 2.314f, 0.0f, false, true, -0.7f, 4.521f)
                lineTo(13.5f, 19.0f)
                lineTo(13.5f, 13.965f)
                close()
                moveTo(10.5f, 10.035f)
                lineTo(8.618f, 9.521f)
                arcTo(2.314f, 2.314f, 0.0f, false, true, 9.313f, 5.0f)
                lineTo(10.5f, 5.0f)
                close()
            }
        }
        .build()
        return _dollar!!
    }

private var _dollar: ImageVector? = null
