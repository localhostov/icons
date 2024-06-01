package me.localx.icons.straight.filled

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

public val Icons.Filled.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4f, 21.9997f)
                lineTo(18.266f, 15.9997f)
                horizontalLineTo(21.085f)
                lineTo(16.8f, 9.9997f)
                horizontalLineTo(19.955f)
                lineTo(14.055f, 1.0707f)
                curveTo(13.8213f, 0.7415f, 13.5118f, 0.4734f, 13.1526f, 0.289f)
                curveTo(12.7934f, 0.1046f, 12.3951f, 0.0094f, 11.9913f, 0.0113f)
                curveTo(11.5876f, 0.0133f, 11.1903f, 0.1124f, 10.8329f, 0.3002f)
                curveTo(10.4755f, 0.4881f, 10.1686f, 0.7592f, 9.938f, 1.0907f)
                lineTo(5.366f, 7.9997f)
                horizontalLineTo(12.0f)
                lineTo(13.429f, 9.9997f)
                horizontalLineTo(6.858f)
                lineTo(4.0f, 13.9997f)
                horizontalLineTo(13.576f)
                lineTo(14.955f, 15.9997f)
                horizontalLineTo(5.731f)
                lineTo(1.6f, 21.9997f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.9997f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.9997f)
                horizontalLineTo(22.4f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
