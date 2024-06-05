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

public val Icons.Bold.FileChartPie: ImageVector
    get() {
        if (_fileChartPie != null) {
            return _fileChartPie!!
        }
        _fileChartPie = Builder(name = "FileChartPie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.389f, 4.268f)
                lineToRelative(-2.656f, -2.657f)
                curveToRelative(-1.039f, -1.039f, -2.42f, -1.611f, -3.89f, -1.611f)
                lineTo(7.5f, 0.0f)
                curveTo(4.468f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(22.0f, 8.157f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
                moveTo(16.5f, 21.0f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                lineTo(13.0f, 7.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(16.614f, 12.077f)
                curveToRelative(1.403f, 3.18f, -1.117f, 7.0f, -4.614f, 6.923f)
                curveToRelative(-2.703f, 0.0f, -5.001f, -2.297f, -5.0f, -5.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.714f, 0.726f, 1.198f, 1.385f, 0.923f)
                lineToRelative(3.23f, -1.346f)
                close()
            }
        }
        .build()
        return _fileChartPie!!
    }

private var _fileChartPie: ImageVector? = null
