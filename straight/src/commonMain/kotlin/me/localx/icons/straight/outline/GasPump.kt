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

public val Icons.Outline.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 2.293f)
                lineTo(19.0f, 5.586f)
                lineTo(19.0f, 19.0f)
                lineTo(16.0f, 19.0f)
                lineTo(16.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 6.414f)
                lineToRelative(2.707f, -2.707f)
                close()
                moveTo(3.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(14.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                arcToRelative(3.967f, 3.967f, 0.0f, false, false, -0.985f, -2.6f)
                lineToRelative(1.692f, -1.693f)
                lineTo(11.293f, 3.293f)
                lineTo(9.339f, 5.247f)
                arcTo(3.962f, 3.962f, 0.0f, false, false, 4.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 11.0f)
                lineTo(14.0f, 11.0f)
                lineTo(14.0f, 22.0f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
