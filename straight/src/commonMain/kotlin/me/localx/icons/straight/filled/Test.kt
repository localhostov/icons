package me.localx.icons.straight.filled

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

public val Icons.Filled.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.191f, 13.0f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 0.252f, -0.766f)
                lineToRelative(0.575f, -1.193f)
                lineToRelative(0.539f, 1.192f)
                arcToRelative(4.949f, 4.949f, 0.0f, false, true, 0.252f, 0.767f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(11.96f, 19.456f)
                lineTo(10.54f, 18.048f)
                lineTo(8.677f, 19.929f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, -0.347f, 0.007f)
                lineToRelative(-0.866f, -0.884f)
                lineToRelative(-1.428f, 1.4f)
                lineToRelative(0.873f, 0.891f)
                arcToRelative(2.255f, 2.255f, 0.0f, false, false, 3.185f, 0.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.7f)
                arcToRelative(6.964f, 6.964f, 0.0f, false, false, -0.621f, -2.883f)
                lineToRelative(-0.522f, -1.153f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.7f, -0.04f)
                lineToRelative(-0.539f, 1.194f)
                arcToRelative(6.956f, 6.956f, 0.0f, false, false, -0.618f, 2.882f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(20.785f, 5.0f)
                horizontalLineToRelative(-4.785f)
                verticalLineToRelative(-4.781f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.586f, 0.953f)
                lineToRelative(2.242f, 2.242f)
                arcToRelative(3.969f, 3.969f, 0.0f, false, true, 0.957f, 1.586f)
                close()
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
