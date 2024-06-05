package me.localx.icons.straight.filled

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

public val Icons.Filled.FileChartPie: ImageVector
    get() {
        if (_fileChartPie != null) {
            return _fileChartPie!!
        }
        _fileChartPie = Builder(name = "FileChartPie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(12.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.559f, -0.117f, -1.091f, -0.325f, -1.575f)
                lineToRelative(-3.675f, 1.575f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.343f, 3.343f, 0.0f, 5.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _fileChartPie!!
    }

private var _fileChartPie: ImageVector? = null
