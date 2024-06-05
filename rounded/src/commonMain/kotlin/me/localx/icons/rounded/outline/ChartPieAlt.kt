package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.713f, 12.0f)
                lineTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(12.0f, 5.274f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.166f, -2.383f)
                arcToRelative(2.871f, 2.871f, 0.0f, false, false, -2.481f, -0.534f)
                arcToRelative(10.969f, 10.969f, 0.0f, false, false, 0.553f, 21.414f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 21.64f, 15.657f)
                arcToRelative(2.876f, 2.876f, 0.0f, false, false, -0.533f, -2.485f)
                arcTo(3.055f, 3.055f, 0.0f, false, false, 18.713f, 12.0f)
                close()
                moveTo(19.701f, 15.168f)
                arcTo(8.969f, 8.969f, 0.0f, true, true, 8.842f, 4.3f)
                arcToRelative(0.871f, 0.871f, 0.0f, false, true, 0.764f, 0.172f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, true, 0.4f, 0.806f)
                lineTo(10.006f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.712f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, true, 0.816f, 0.4f)
                arcTo(0.884f, 0.884f, 0.0f, false, true, 19.7f, 15.168f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.651f, 7.446f)
                arcTo(10.073f, 10.073f, 0.0f, false, false, 16.582f, 0.372f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 16.038f, 0.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.019f, 2.0f)
                verticalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.719f)
                arcTo(2.008f, 2.008f, 0.0f, false, false, 23.651f, 7.446f)
                close()
                moveTo(21.153f, 8.0f)
                horizontalLineTo(17.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineToRelative(-0.008f, -4.693f)
                arcToRelative(0.048f, 0.048f, 0.0f, false, true, 0.025f, -0.009f)
                lineToRelative(0.026f, 0.0f)
                arcTo(8.072f, 8.072f, 0.0f, false, true, 21.734f, 8.0f)
                close()
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
