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

public val Icons.Bold.WhiteSpace: ImageVector
    get() {
        if (_whiteSpace != null) {
            return _whiteSpace!!
        }
        _whiteSpace = Builder(name = "WhiteSpace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                lineTo(3.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                close()
                moveTo(21.038f, 0.0f)
                lineTo(21.038f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.038f, 0.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(16.0f, 7.0f)
                verticalLineToRelative(3.5f)
                lineTo(8.0f, 10.5f)
                verticalLineToRelative(-3.5f)
                lineTo(3.371f, 11.236f)
                curveToRelative(-0.247f, 0.222f, -0.371f, 0.526f, -0.371f, 0.83f)
                reflectiveCurveToRelative(0.124f, 0.609f, 0.371f, 0.83f)
                lineToRelative(4.629f, 4.236f)
                verticalLineToRelative(-3.632f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.632f)
                lineToRelative(4.629f, -4.236f)
                curveToRelative(0.494f, -0.443f, 0.494f, -1.217f, 0.0f, -1.66f)
                lineToRelative(-4.629f, -4.236f)
                close()
            }
        }
        .build()
        return _whiteSpace!!
    }

private var _whiteSpace: ImageVector? = null
