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

public val Icons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 0.988f)
                arcTo(3.385f, 3.385f, 0.0f, false, false, 20.275f, 0.016f)
                curveTo(17.577f, 0.277f, 8.493f, 1.406f, 4.92f, 4.979f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.973f, 12.953f)
                lineTo(0.439f, 21.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(3.507f, -3.508f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 12.953f, -0.973f)
                curveTo(22.644f, 15.457f, 23.737f, 6.4f, 23.985f, 3.709f)
                arcTo(3.388f, 3.388f, 0.0f, false, false, 23.0f, 0.988f)
                close()
                moveTo(16.9f, 16.958f)
                arcTo(6.991f, 6.991f, 0.0f, false, true, 8.22f, 17.9f)
                lineToRelative(8.341f, -8.34f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineTo(6.1f, 15.78f)
                arcTo(6.991f, 6.991f, 0.0f, false, true, 7.042f, 7.1f)
                curveTo(9.322f, 4.82f, 15.751f, 3.468f, 20.565f, 3.0f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, 0.319f, 0.113f)
                arcTo(0.385f, 0.385f, 0.0f, false, true, 21.0f, 3.433f)
                curveTo(20.555f, 8.225f, 19.216f, 14.642f, 16.9f, 16.958f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
