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

public val Icons.Outline.Pie: ImageVector
    get() {
        if (_pie != null) {
            return _pie!!
        }
        _pie = Builder(name = "Pie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.364f, 10.879f)
                arcTo(8.205f, 8.205f, 0.0f, false, true, 11.0f, 10.0f)
                arcToRelative(8.216f, 8.216f, 0.0f, false, true, -0.878f, 2.636f)
                arcToRelative(1.243f, 1.243f, 0.0f, true, true, -1.758f, -1.757f)
                close()
                moveTo(13.0f, 10.0f)
                arcToRelative(8.223f, 8.223f, 0.0f, false, false, 0.879f, 2.636f)
                arcToRelative(1.243f, 1.243f, 0.0f, true, false, 1.758f, -1.757f)
                arcTo(8.209f, 8.209f, 0.0f, false, false, 13.0f, 10.0f)
                close()
                moveTo(21.858f, 16.887f)
                lineTo(21.033f, 21.525f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.08f, 24.0f)
                lineTo(5.922f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.954f, -2.475f)
                lineToRelative(-0.826f, -4.638f)
                arcTo(2.946f, 2.946f, 0.0f, false, true, 0.0f, 14.0f)
                curveToRelative(0.0f, -3.624f, 5.353f, -8.0f, 12.0f, -8.0f)
                reflectiveCurveToRelative(12.0f, 4.376f, 12.0f, 8.0f)
                arcTo(2.946f, 2.946f, 0.0f, false, true, 21.858f, 16.887f)
                close()
                moveTo(19.064f, 21.176f)
                lineTo(19.5f, 18.7f)
                arcTo(3.943f, 3.943f, 0.0f, false, true, 15.0f, 17.618f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, true, -6.0f, 0.0f)
                arcTo(3.943f, 3.943f, 0.0f, false, true, 4.5f, 18.7f)
                lineToRelative(0.441f, 2.474f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.922f, 22.0f)
                lineTo(18.08f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.064f, 21.176f)
                close()
                moveTo(22.0f, 13.988f)
                curveTo(22.0f, 11.631f, 17.521f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(2.0f, 11.631f, 2.0f, 14.0f)
                arcToRelative(0.915f, 0.915f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(4.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                arcTo(0.918f, 0.918f, 0.0f, false, false, 22.0f, 13.988f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pie!!
    }

private var _pie: ImageVector? = null
