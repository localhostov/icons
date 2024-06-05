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

public val Icons.Outline.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.717f, 14.7f)
                lineToRelative(4.133f, 9.3f)
                horizontalLineToRelative(2.456f)
                arcToRelative(2.752f, 2.752f, 0.0f, false, false, 2.514f, -3.868f)
                lineToRelative(-2.281f, -5.132f)
                horizontalLineToRelative(2.461f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.717f, 2.7f)
                close()
                moveTo(8.992f, 20.943f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.686f, 1.057f)
                horizontalLineToRelative(-1.156f)
                lineToRelative(-3.111f, -7.0f)
                horizontalLineToRelative(2.311f)
                close()
                moveTo(2.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.973f, 6.973f, 0.0f, false, false, 5.0f, -2.111f)
                verticalLineToRelative(10.222f)
                arcToRelative(6.973f, 6.973f, 0.0f, false, false, -5.0f, -2.111f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(22.293f, 15.707f)
                lineTo(20.005f, 13.419f)
                lineTo(21.419f, 12.005f)
                lineTo(23.707f, 14.293f)
                close()
                moveTo(21.457f, 7.957f)
                lineTo(20.043f, 6.543f)
                lineTo(22.293f, 4.293f)
                lineTo(23.707f, 5.707f)
                close()
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
