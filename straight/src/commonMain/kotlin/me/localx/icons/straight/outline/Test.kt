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

public val Icons.Outline.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.828f, 3.414f)
                lineToRelative(-2.242f, -2.242f)
                arcToRelative(4.024f, 4.024f, 0.0f, false, false, -2.828f, -1.172f)
                horizontalLineToRelative(-8.758f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-17.758f)
                arcToRelative(4.024f, 4.024f, 0.0f, false, false, -1.172f, -2.828f)
                close()
                moveTo(18.414f, 4.828f)
                arcToRelative(2.113f, 2.113f, 0.0f, false, true, 0.141f, 0.172f)
                horizontalLineToRelative(-2.555f)
                verticalLineToRelative(-2.555f)
                arcToRelative(2.113f, 2.113f, 0.0f, false, true, 0.172f, 0.141f)
                close()
                moveTo(5.0f, 22.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-1.707f)
                arcToRelative(6.964f, 6.964f, 0.0f, false, false, -0.621f, -2.883f)
                lineToRelative(-0.522f, -1.153f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.7f, -0.04f)
                lineToRelative(-0.539f, 1.194f)
                arcToRelative(6.956f, 6.956f, 0.0f, false, false, -0.618f, 2.882f)
                verticalLineToRelative(1.707f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.018f, 10.041f)
                lineTo(12.557f, 11.233f)
                arcToRelative(4.949f, 4.949f, 0.0f, false, true, 0.252f, 0.767f)
                horizontalLineToRelative(-1.618f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 0.252f, -0.766f)
                close()
                moveTo(11.54f, 16.041f)
                lineTo(12.96f, 17.449f)
                lineTo(11.094f, 19.333f)
                arcToRelative(2.255f, 2.255f, 0.0f, false, true, -3.185f, 0.0f)
                lineToRelative(-0.873f, -0.891f)
                lineToRelative(1.428f, -1.4f)
                lineToRelative(0.866f, 0.884f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, 0.347f, -0.007f)
                close()
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
