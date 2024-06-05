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

public val Icons.Outline.FileChartLine: ImageVector
    get() {
        if (_fileChartLine != null) {
            return _fileChartLine!!
        }
        _fileChartLine = Builder(name = "FileChartLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 10.485f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(1.869f, 0.0f, 3.627f, 0.728f, 4.95f, 2.05f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(1.322f, 1.321f, 2.051f, 3.079f, 2.051f, 4.95f)
                close()
                moveTo(15.051f, 3.464f)
                curveToRelative(-0.318f, -0.318f, -0.671f, -0.587f, -1.051f, -0.805f)
                lineTo(14.0f, 7.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.341f)
                curveToRelative(-0.218f, -0.379f, -0.488f, -0.732f, -0.805f, -1.05f)
                lineToRelative(-3.484f, -3.486f)
                close()
                moveTo(20.0f, 10.485f)
                curveToRelative(0.0f, -0.163f, -0.008f, -0.325f, -0.023f, -0.485f)
                horizontalLineToRelative(-4.977f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.0f, 2.023f)
                curveToRelative(-0.16f, -0.015f, -0.322f, -0.023f, -0.485f, -0.023f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(20.0f, 10.485f)
                close()
            }
        }
        .build()
        return _fileChartLine!!
    }

private var _fileChartLine: ImageVector? = null
