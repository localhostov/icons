package me.localx.icons.rounded.bold

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
                moveTo(18.5f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineToRelative(2.857f, -0.952f)
                arcToRelative(1.617f, 1.617f, 0.0f, false, false, -0.009f, -3.07f)
                lineTo(13.329f, 0.154f)
                arcTo(1.636f, 1.636f, 0.0f, false, false, 11.0f, 1.636f)
                lineTo(11.0f, 5.0f)
                lineTo(5.5f, 5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 10.5f)
                verticalLineToRelative(10.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineToRelative(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                verticalLineToRelative(-10.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(20.949f, 10.0f)
                lineTo(19.657f, 10.0f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, -1.768f, -0.732f)
                lineTo(16.621f, 8.0f)
                lineTo(18.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.949f, 10.0f)
                close()
                moveTo(5.5f, 8.0f)
                lineTo(7.378f, 8.0f)
                lineTo(6.111f, 9.268f)
                arcTo(2.516f, 2.516f, 0.0f, false, true, 4.343f, 10.0f)
                lineTo(3.051f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 8.0f)
                close()
                moveTo(20.5f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(3.0f, 13.0f)
                lineTo(4.343f, 13.0f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, false, 3.889f, -1.611f)
                lineToRelative(2.707f, -2.707f)
                arcToRelative(1.536f, 1.536f, 0.0f, false, true, 2.122f, 0.0f)
                lineToRelative(2.707f, 2.707f)
                arcTo(5.464f, 5.464f, 0.0f, false, false, 19.657f, 13.0f)
                lineTo(21.0f, 13.0f)
                verticalLineToRelative(7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.5f, 21.0f)
                close()
                moveTo(8.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 19.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 17.5f)
                close()
                moveTo(20.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 19.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 17.5f)
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
