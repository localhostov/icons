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

public val Icons.Bold.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.907f, 21.9994f)
                lineTo(18.832f, 15.9994f)
                horizontalLineTo(22.0f)
                lineTo(17.5f, 9.9994f)
                horizontalLineTo(20.329f)
                lineTo(14.4f, 1.2534f)
                curveTo(14.1272f, 0.8688f, 13.766f, 0.5554f, 13.3467f, 0.3396f)
                curveTo(12.9275f, 0.1238f, 12.4626f, 0.0119f, 11.9911f, 0.0134f)
                curveTo(11.5196f, 0.0149f, 11.0553f, 0.1296f, 10.6374f, 0.348f)
                curveTo(10.2196f, 0.5665f, 9.8603f, 0.8821f, 9.59f, 1.2684f)
                lineTo(3.671f, 9.9994f)
                horizontalLineTo(6.5f)
                lineTo(2.0f, 15.9994f)
                horizontalLineTo(5.168f)
                lineTo(1.093f, 21.9994f)
                horizontalLineTo(10.5f)
                verticalLineTo(23.9994f)
                horizontalLineTo(13.5f)
                verticalLineTo(21.9994f)
                horizontalLineTo(22.907f)
                close()
                moveTo(8.794f, 15.9994f)
                horizontalLineTo(12.787f)
                lineTo(10.787f, 13.0594f)
                lineTo(10.828f, 12.9994f)
                horizontalLineTo(8.0f)
                lineTo(10.25f, 9.9994f)
                horizontalLineTo(11.25f)
                lineTo(9.173f, 7.2304f)
                lineTo(12.0f, 3.0594f)
                lineTo(14.671f, 6.9994f)
                horizontalLineTo(11.5f)
                lineTo(16.0f, 12.9994f)
                horizontalLineTo(13.168f)
                lineTo(17.243f, 18.9994f)
                horizontalLineTo(6.757f)
                lineTo(8.794f, 15.9994f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
