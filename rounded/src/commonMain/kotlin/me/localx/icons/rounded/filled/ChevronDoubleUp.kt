package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.012f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, -0.707f)
                lineTo(8.477f, 3.122f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 7.07f, 0.0f)
                lineToRelative(8.172f, 8.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineTo(14.133f, 4.536f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.242f, 0.0f)
                lineTo(1.719f, 12.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.012f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.012f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.293f, -0.707f)
                lineToRelative(9.586f, -9.586f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.242f, 0.0f)
                lineToRelative(9.586f, 9.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineToRelative(-9.586f, -9.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(1.719f, 22.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.012f, 22.0f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
