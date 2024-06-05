package me.localx.icons.straight.filled

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

public val Icons.Filled.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                arcToRelative(3.971f, 3.971f, 0.0f, false, true, 1.339f, 0.247f)
                lineToRelative(2.454f, -2.454f)
                lineToRelative(1.414f, 1.414f)
                lineTo(11.014f, 6.4f)
                arcTo(3.963f, 3.963f, 0.0f, false, true, 12.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 2.293f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(0.0f, 13.414f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, 13.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -14.586f)
                lineToRelative(2.707f, -2.707f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
