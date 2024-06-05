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
                moveTo(20.415f, 8.836f)
                lineTo(12.915f, 10.294f)
                curveToRelative(-0.044f, -0.085f, -0.093f, -0.167f, -0.131f, -0.255f)
                lineTo(9.847f, 3.271f)
                arcTo(8.939f, 8.939f, 0.0f, false, true, 20.415f, 8.836f)
                close()
                moveTo(3.0f, 12.0f)
                arcTo(8.994f, 8.994f, 0.0f, false, true, 7.094f, 4.465f)
                lineToRelative(2.938f, 6.768f)
                arcTo(7.245f, 7.245f, 0.0f, false, false, 12.269f, 14.1f)
                lineToRelative(5.855f, 4.481f)
                arcTo(8.985f, 8.985f, 0.0f, false, true, 3.0f, 12.0f)
                close()
                moveTo(19.954f, 16.2f)
                lineTo(15.56f, 12.836f)
                lineToRelative(5.429f, -1.055f)
                curveToRelative(0.0f, 0.073f, 0.011f, 0.145f, 0.011f, 0.219f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 19.954f, 16.2f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
