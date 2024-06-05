package me.localx.icons.rounded.outline

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
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(21.573f, 9.12f)
                lineTo(12.665f, 10.852f)
                arcToRelative(4.941f, 4.941f, 0.0f, false, true, -0.368f, -0.679f)
                lineToRelative(-3.34f, -7.7f)
                arcTo(9.987f, 9.987f, 0.0f, false, true, 21.573f, 9.12f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(9.995f, 9.995f, 0.0f, false, true, 7.124f, 3.278f)
                lineToRelative(3.338f, 7.691f)
                arcToRelative(7.011f, 7.011f, 0.0f, false, false, 2.167f, 2.772f)
                lineToRelative(6.653f, 5.092f)
                arcTo(9.966f, 9.966f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(20.5f, 17.245f)
                lineTo(14.375f, 12.557f)
                lineTo(21.956f, 11.084f)
                curveToRelative(0.027f, 0.3f, 0.046f, 0.607f, 0.046f, 0.916f)
                arcTo(9.925f, 9.925f, 0.0f, false, true, 20.5f, 17.245f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
