package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.94f, 1.0587f)
                    curveTo(22.2602f, 0.3799f, 21.3387f, -0.0013f, 20.378f, -0.0013f)
                    curveTo(19.4173f, -0.0013f, 18.4958f, 0.3799f, 17.816f, 1.0587f)
                    lineTo(0.0f, 18.8747f)
                    verticalLineTo(23.9987f)
                    horizontalLineTo(5.124f)
                    lineTo(22.94f, 6.1827f)
                    curveTo(23.6186f, 5.5027f, 23.9997f, 4.5813f, 23.9997f, 3.6207f)
                    curveTo(23.9997f, 2.6601f, 23.6186f, 1.7387f, 22.94f, 1.0587f)
                    close()
                    moveTo(4.3f, 21.9987f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(19.6987f)
                    lineTo(15.31f, 6.3987f)
                    lineTo(17.61f, 8.6987f)
                    lineTo(4.3f, 21.9987f)
                    close()
                    moveTo(21.526f, 4.7687f)
                    lineTo(19.019f, 7.2757f)
                    lineTo(16.724f, 4.9757f)
                    lineTo(19.23f, 2.4727f)
                    curveTo(19.535f, 2.1677f, 19.9487f, 1.9964f, 20.38f, 1.9964f)
                    curveTo(20.8113f, 1.9964f, 21.225f, 2.1677f, 21.53f, 2.4727f)
                    curveTo(21.835f, 2.7777f, 22.0063f, 3.1914f, 22.0063f, 3.6227f)
                    curveTo(22.0063f, 4.054f, 21.835f, 4.4677f, 21.53f, 4.7727f)
                    lineTo(21.526f, 4.7687f)
                    close()
                }
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
