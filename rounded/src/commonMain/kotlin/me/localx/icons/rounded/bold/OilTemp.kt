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

public val Icons.Bold.OilTemp: ImageVector
    get() {
        if (_oilTemp != null) {
            return _oilTemp!!
        }
        _oilTemp = Builder(name = "OilTemp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, -3.709f)
                lineTo(10.5f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.291f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 8.0f, 14.0f)
                close()
                moveTo(21.748f, 20.8f)
                arcToRelative(1.709f, 1.709f, 0.0f, false, true, -1.806f, -0.148f)
                arcToRelative(3.349f, 3.349f, 0.0f, false, false, -3.882f, 0.0f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, true, -2.118f, 0.0f)
                arcToRelative(3.349f, 3.349f, 0.0f, false, false, -3.882f, 0.0f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, true, -2.118f, 0.0f)
                arcToRelative(3.349f, 3.349f, 0.0f, false, false, -3.882f, 0.0f)
                arcToRelative(1.712f, 1.712f, 0.0f, false, true, -1.808f, 0.149f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, 2.6f)
                arcToRelative(4.762f, 4.762f, 0.0f, false, false, 5.05f, -0.3f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, 0.406f, 0.0f)
                arcToRelative(4.907f, 4.907f, 0.0f, false, false, 5.594f, 0.0f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, 0.406f, 0.0f)
                arcToRelative(4.907f, 4.907f, 0.0f, false, false, 5.594f, 0.0f)
                arcToRelative(0.333f, 0.333f, 0.0f, false, true, 0.406f, 0.0f)
                arcToRelative(4.686f, 4.686f, 0.0f, false, false, 5.048f, 0.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -2.6f)
                close()
                moveTo(18.2f, 17.068f)
                arcToRelative(4.678f, 4.678f, 0.0f, false, false, 5.05f, 0.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.508f, -2.594f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.806f, -0.149f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.2f, 17.068f)
                close()
                moveTo(0.742f, 17.368f)
                arcToRelative(4.678f, 4.678f, 0.0f, false, false, 5.05f, -0.3f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.06f, 14.623f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.806f, 0.149f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.746f, 17.366f)
                close()
            }
        }
        .build()
        return _oilTemp!!
    }

private var _oilTemp: ImageVector? = null
