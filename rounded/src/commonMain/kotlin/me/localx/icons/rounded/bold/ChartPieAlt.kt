package me.localx.icons.rounded.bold

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

public val Icons.Bold.ChartPieAlt: ImageVector
    get() {
        if (_chartPieAlt != null) {
            return _chartPieAlt!!
        }
        _chartPieAlt = Builder(name = "ChartPieAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.556f, 11.385f)
                lineTo(14.011f, 11.385f)
                arcToRelative(1.388f, 1.388f, 0.0f, false, true, -1.393f, -1.389f)
                lineTo(12.618f, 5.433f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, -1.331f, -2.722f)
                arcTo(3.307f, 3.307f, 0.0f, false, false, 8.436f, 2.1f)
                arcTo(11.112f, 11.112f, 0.0f, true, false, 21.9f, 15.579f)
                arcToRelative(3.309f, 3.309f, 0.0f, false, false, -0.61f, -2.858f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 18.556f, 11.385f)
                close()
                moveTo(18.989f, 14.844f)
                arcTo(8.115f, 8.115f, 0.0f, true, true, 9.167f, 5.009f)
                arcTo(0.3f, 0.3f, 0.0f, false, true, 9.239f, 5.0f)
                arcToRelative(0.331f, 0.331f, 0.0f, false, true, 0.2f, 0.077f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, true, 0.176f, 0.356f)
                lineTo(9.615f, 9.994f)
                arcToRelative(4.389f, 4.389f, 0.0f, false, false, 4.393f, 4.39f)
                horizontalLineToRelative(4.545f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, true, 0.365f, 0.18f)
                arcTo(0.311f, 0.311f, 0.0f, false, true, 18.989f, 14.844f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.651f, 7.446f)
                arcTo(10.073f, 10.073f, 0.0f, false, false, 16.582f, 0.372f)
                arcTo(2.014f, 2.014f, 0.0f, false, false, 14.019f, 2.3f)
                verticalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.719f)
                arcTo(2.008f, 2.008f, 0.0f, false, false, 23.651f, 7.446f)
                close()
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
