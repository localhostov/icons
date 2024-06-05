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

public val Icons.Bold.PrintSlash: ImageVector
    get() {
        if (_printSlash != null) {
            return _printSlash!!
        }
        _printSlash = Builder(name = "PrintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 20.949f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(0.051f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -1.096f, 0.591f, -2.056f, 1.471f, -2.58f)
                lineToRelative(1.529f, 1.529f)
                verticalLineToRelative(10.051f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.051f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-3.051f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.051f)
                close()
                moveTo(24.0f, 21.0f)
                horizontalLineToRelative(-0.879f)
                lineToRelative(0.84f, 0.84f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.039f, 2.16f)
                lineTo(2.16f, 0.039f)
                lineToRelative(2.84f, 2.84f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(8.0f, 5.879f)
                lineToRelative(0.121f, 0.121f)
                horizontalLineToRelative(7.879f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.879f)
                close()
                moveTo(20.121f, 18.0f)
                horizontalLineToRelative(0.879f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.879f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(3.879f)
                verticalLineToRelative(3.879f)
                lineToRelative(1.121f, 1.121f)
                close()
            }
        }
        .build()
        return _printSlash!!
    }

private var _printSlash: ImageVector? = null
