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

public val Icons.Filled.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(5.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                curveToRelative(3.286f, 0.0f, 4.008f, 2.5f, 4.0f, 3.474f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.47f, 9.414f)
                arcTo(2.289f, 2.289f, 0.0f, false, false, 6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 8.0f)
                close()
                moveTo(17.746f, 17.666f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.411f, 0.081f)
                arcToRelative(6.357f, 6.357f, 0.0f, false, false, -8.671f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.33f, -1.494f)
                arcToRelative(8.375f, 8.375f, 0.0f, false, true, 11.332f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.746f, 17.666f)
                close()
                moveTo(18.0f, 9.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -1.471f, 0.413f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.0f, 10.474f)
                curveTo(13.992f, 9.5f, 14.714f, 7.0f, 18.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
