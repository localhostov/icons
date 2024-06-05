package me.localx.icons.rounded.bold

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

public val Icons.Bold.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.44f, 10.982f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, 0.0f)
                lineToRelative(7.671f, 7.672f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.536f, 0.0f)
                lineToRelative(7.671f, -7.672f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 23.561f, 13.1f)
                lineToRelative(-7.672f, 7.672f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -7.778f, 0.0f)
                lineTo(0.439f, 13.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.118f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.44f, 1.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, 0.0f)
                lineToRelative(9.085f, 9.086f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineTo(21.439f, 1.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.119f)
                lineTo(14.475f, 12.64f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, -4.95f, 0.0f)
                lineTo(0.439f, 3.559f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.12f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

private var _chevronDoubleDown: ImageVector? = null
