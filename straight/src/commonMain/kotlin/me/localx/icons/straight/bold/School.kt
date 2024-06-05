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

public val Icons.Bold.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = Builder(name = "School", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 5.0f)
                lineTo(14.042f, 5.0f)
                lineToRelative(-0.381f, -0.413f)
                lineTo(17.0f, 2.5f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 3.871f)
                lineTo(9.958f, 5.0f)
                lineTo(3.5f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 8.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 5.0f)
                close()
                moveTo(20.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(21.0f, 10.0f)
                lineTo(18.657f, 10.0f)
                lineTo(16.811f, 8.0f)
                close()
                moveTo(3.5f, 8.0f)
                lineTo(7.189f, 8.0f)
                lineTo(5.343f, 10.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 8.0f)
                close()
                moveTo(14.0f, 21.0f)
                lineTo(14.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 13.0f)
                lineTo(6.657f, 13.0f)
                lineTo(12.0f, 7.212f)
                lineTo(17.343f, 13.0f)
                lineTo(21.0f, 13.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(16.0f, 19.0f)
                close()
                moveTo(13.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 11.5f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
