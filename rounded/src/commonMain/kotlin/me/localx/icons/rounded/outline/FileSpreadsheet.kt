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

public val Icons.Outline.FileSpreadsheet: ImageVector
    get() {
        if (_fileSpreadsheet != null) {
            return _fileSpreadsheet!!
        }
        _fileSpreadsheet = Builder(name = "FileSpreadsheet", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.949f, 5.535f)
                lineToRelative(-3.484f, -3.484f)
                curveToRelative(-1.322f, -1.322f, -3.08f, -2.051f, -4.95f, -2.051f)
                lineTo(7.0f, -0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 10.485f)
                curveToRelative(0.0f, -1.87f, -0.729f, -3.628f, -2.051f, -4.95f)
                close()
                moveTo(18.535f, 6.949f)
                curveToRelative(0.318f, 0.318f, 0.587f, 0.671f, 0.806f, 1.051f)
                horizontalLineToRelative(-4.341f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(14.0f, 2.659f)
                curveToRelative(0.38f, 0.218f, 0.733f, 0.488f, 1.051f, 0.806f)
                lineToRelative(3.484f, 3.484f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.325f, 0.008f, 0.485f, 0.023f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.977f)
                curveToRelative(0.015f, 0.16f, 0.023f, 0.322f, 0.023f, 0.485f)
                verticalLineToRelative(8.515f)
                close()
            }
        }
        .build()
        return _fileSpreadsheet!!
    }

private var _fileSpreadsheet: ImageVector? = null
