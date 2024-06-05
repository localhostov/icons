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

public val Icons.Bold.ChartPie: ImageVector
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
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(15.621f, 13.5f)
                horizontalLineToRelative(5.244f)
                arcToRelative(8.947f, 8.947f, 0.0f, false, true, -1.537f, 3.706f)
                close()
                moveTo(20.865f, 10.5f)
                lineTo(13.5f, 10.5f)
                lineTo(13.5f, 3.135f)
                arcTo(9.014f, 9.014f, 0.0f, false, true, 20.865f, 10.5f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.009f, 9.009f, 0.0f, false, true, 7.5f, -8.865f)
                verticalLineToRelative(9.486f)
                lineToRelative(6.706f, 6.707f)
                arcTo(8.986f, 8.986f, 0.0f, false, true, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
