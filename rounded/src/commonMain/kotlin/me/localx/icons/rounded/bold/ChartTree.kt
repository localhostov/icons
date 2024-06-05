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

public val Icons.Bold.ChartTree: ImageVector
    get() {
        if (_chartTree != null) {
            return _chartTree!!
        }
        _chartTree = Builder(name = "ChartTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.864f, 18.127f)
                arcTo(5.337f, 5.337f, 0.0f, false, false, 16.674f, 14.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.384f)
                arcToRelative(6.282f, 6.282f, 0.0f, true, false, -3.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.326f)
                arcToRelative(5.337f, 5.337f, 0.0f, false, false, -5.19f, 4.127f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.921f, 0.69f)
                arcTo(2.331f, 2.331f, 0.0f, false, true, 7.326f, 17.0f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(1.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(3.174f)
                arcToRelative(2.331f, 2.331f, 0.0f, false, true, 2.269f, 1.817f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 2.921f, -0.69f)
                close()
                moveTo(8.718f, 6.283f)
                arcTo(3.282f, 3.282f, 0.0f, true, true, 12.0f, 9.565f)
                arcTo(3.286f, 3.286f, 0.0f, false, true, 8.718f, 6.283f)
                close()
            }
        }
        .build()
        return _chartTree!!
    }

private var _chartTree: ImageVector? = null
