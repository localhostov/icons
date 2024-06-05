package me.localx.icons.straight.bold

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

public val Icons.Bold.First: ImageVector
    get() {
        if (_first != null) {
            return _first!!
        }
        _first = Builder(name = "First", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.969f, 6.996f)
                lineToRelative(-3.0f, 0.008f)
                lineToRelative(0.005f, 1.996f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(-0.005f, -2.004f)
                lineToRelative(-3.0f, 0.008f)
                lineToRelative(0.005f, 1.996f)
                horizontalLineToRelative(-2.005f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.013f)
                lineToRelative(0.005f, 2.0f)
                horizontalLineToRelative(-2.018f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.026f)
                lineToRelative(0.005f, 2.004f)
                lineToRelative(3.0f, -0.008f)
                lineToRelative(-0.005f, -1.996f)
                horizontalLineToRelative(1.969f)
                lineToRelative(0.005f, 2.004f)
                lineToRelative(3.0f, -0.008f)
                lineToRelative(-0.005f, -1.996f)
                horizontalLineToRelative(2.005f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.013f)
                lineToRelative(-0.005f, -2.0f)
                horizontalLineToRelative(2.018f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.026f)
                lineToRelative(-0.005f, -2.004f)
                close()
                moveTo(8.987f, 14.0f)
                horizontalLineToRelative(-1.969f)
                lineToRelative(-0.005f, -2.0f)
                horizontalLineToRelative(1.969f)
                lineToRelative(0.005f, 2.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(19.0f, 7.069f)
                lineToRelative(-2.012f, 2.063f)
                lineToRelative(-2.148f, -2.094f)
                lineToRelative(4.913f, -5.039f)
                horizontalLineToRelative(2.247f)
                close()
            }
        }
        .build()
        return _first!!
    }

private var _first: ImageVector? = null
