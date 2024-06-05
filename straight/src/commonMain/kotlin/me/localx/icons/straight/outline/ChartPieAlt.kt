package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

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
                moveTo(11.0f, 23.97f)
                arcTo(10.97f, 10.97f, 0.0f, false, true, 11.0f, 2.03f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.013f, 1.0f)
                lineTo(12.0f, 12.0f)
                horizontalLineTo(21.97f)
                verticalLineToRelative(1.0f)
                arcTo(10.982f, 10.982f, 0.0f, false, true, 11.0f, 23.97f)
                close()
                moveTo(10.012f, 4.085f)
                arcTo(8.97f, 8.97f, 0.0f, true, false, 19.915f, 14.0f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.019f, 2.288f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 21.733f, 8.0f)
                horizontalLineTo(16.019f)
                verticalLineTo(2.288f)
                moveToRelative(-2.0f, -2.254f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(9.968f)
                arcTo(10.015f, 10.015f, 0.0f, false, false, 14.019f, 0.034f)
                close()
            }
        }
        .build()
        return _chartPieAlt!!
    }

private var _chartPieAlt: ImageVector? = null
