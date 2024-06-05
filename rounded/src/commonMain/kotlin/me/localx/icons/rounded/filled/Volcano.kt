package me.localx.icons.rounded.filled

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

public val Icons.Filled.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 8.0f)
                arcToRelative(2.477f, 2.477f, 0.0f, false, true, -1.043f, -0.231f)
                arcTo(3.251f, 3.251f, 0.0f, false, true, 17.25f, 8.0f)
                lineTo(14.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(13.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.75f, 8.0f)
                arcToRelative(3.232f, 3.232f, 0.0f, false, true, -1.207f, -0.232f)
                curveTo(1.729f, 9.239f, 0.476f, 3.167f, 4.549f, 3.0f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, true, 4.62f, -1.819f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 5.662f, 0.0f)
                arcTo(3.988f, 3.988f, 0.0f, false, true, 19.451f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 8.0f)
                close()
                moveTo(5.367f, 14.0f)
                lineToRelative(3.506f, -3.689f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.6f, 10.0f)
                horizontalLineToRelative(4.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.725f, 0.311f)
                lineTo(18.634f, 14.0f)
                lineTo(16.0f, 14.0f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -2.0f, 0.766f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 8.0f, 14.0f)
                close()
                moveTo(20.536f, 16.0f)
                lineTo(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(9.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.466f, 16.0f)
                lineTo(0.727f, 18.882f)
                arcTo(3.121f, 3.121f, 0.0f, false, false, 3.124f, 24.0f)
                lineTo(20.876f, 24.0f)
                arcToRelative(3.119f, 3.119f, 0.0f, false, false, 2.353f, -5.167f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
