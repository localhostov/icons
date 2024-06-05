package me.localx.icons.rounded.filled

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

public val Icons.Filled.FileChartLine: ImageVector
    get() {
        if (_fileChartLine != null) {
            return _fileChartLine!!
        }
        _fileChartLine = Builder(name = "FileChartLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 10.485f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.324f, 0.013f, 0.485f, 0.024f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.976f)
                curveToRelative(0.011f, 0.161f, 0.024f, 0.322f, 0.024f, 0.485f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.307f, 2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 13.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.307f, 2.0f, 0.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(17.0f, 16.0f)
                curveToRelative(-0.006f, -1.308f, -1.995f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _fileChartLine!!
    }

private var _fileChartLine: ImageVector? = null
