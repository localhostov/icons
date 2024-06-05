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

public val Icons.Filled.Chocolate: ImageVector
    get() {
        if (_chocolate != null) {
            return _chocolate!!
        }
        _chocolate = Builder(name = "Chocolate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.547f, 5.666f)
                lineTo(18.355f, 1.474f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, -7.065f, 0.0f)
                lineTo(1.473f, 11.291f)
                arcToRelative(5.019f, 5.019f, 0.0f, false, false, 0.0f, 7.064f)
                lineToRelative(4.192f, 4.192f)
                arcToRelative(5.019f, 5.019f, 0.0f, false, false, 7.065f, 0.0f)
                lineToRelative(9.817f, -9.817f)
                arcTo(5.018f, 5.018f, 0.0f, false, false, 22.547f, 5.666f)
                close()
                moveTo(18.638f, 12.4f)
                lineToRelative(-2.861f, -2.86f)
                lineToRelative(-2.4f, 2.4f)
                lineTo(16.242f, 14.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.413f, 1.413f)
                lineToRelative(-2.861f, -2.861f)
                lineTo(9.63f, 15.69f)
                lineToRelative(2.86f, 2.861f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.412f, 1.413f)
                lineTo(8.217f, 17.1f)
                lineTo(6.321f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.413f, -1.413f)
                lineToRelative(1.9f, -1.9f)
                lineTo(4.062f, 12.948f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.413f, -1.413f)
                lineToRelative(2.742f, 2.742f)
                lineToRelative(2.338f, -2.338f)
                lineTo(7.813f, 9.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.226f, 7.784f)
                lineToRelative(2.742f, 2.742f)
                lineToRelative(2.4f, -2.4f)
                lineTo(11.622f, 5.388f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.413f, -1.413f)
                lineToRelative(2.742f, 2.742f)
                lineToRelative(1.771f, -1.77f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.96f, 6.36f)
                lineTo(17.19f, 8.13f)
                lineToRelative(2.861f, 2.861f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.638f, 12.4f)
                close()
            }
        }
        .build()
        return _chocolate!!
    }

private var _chocolate: ImageVector? = null
