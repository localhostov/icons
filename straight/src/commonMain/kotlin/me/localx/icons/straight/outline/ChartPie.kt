package me.localx.icons.straight.outline

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

public val Icons.Outline.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(21.949f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 2.051f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 21.949f, 11.0f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(10.013f, 10.013f, 0.0f, false, true, 9.0f, -9.949f)
                lineTo(11.0f, 12.414f)
                lineToRelative(7.324f, 7.324f)
                arcTo(9.992f, 9.992f, 0.0f, false, true, 2.0f, 12.0f)
                close()
                moveTo(19.738f, 18.324f)
                lineTo(14.414f, 13.0f)
                horizontalLineToRelative(7.535f)
                arcTo(9.942f, 9.942f, 0.0f, false, true, 19.738f, 18.324f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
