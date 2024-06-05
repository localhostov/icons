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

public val Icons.Filled.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 4.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(21.5f, 3.914f)
                lineTo(17.311f, 8.1f)
                arcTo(2.686f, 2.686f, 0.0f, false, false, 16.5f, 9.98f)
                arcTo(2.526f, 2.526f, 0.0f, false, false, 16.721f, 11.0f)
                arcToRelative(3.072f, 3.072f, 0.0f, false, true, -0.357f, 3.178f)
                lineToRelative(-0.982f, -0.982f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 12.424f, 12.0f)
                arcToRelative(1.444f, 1.444f, 0.0f, false, true, -0.379f, -0.031f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, -0.045f, -0.3f)
                arcToRelative(4.218f, 4.218f, 0.0f, false, false, -1.194f, -3.056f)
                lineToRelative(-0.981f, -0.98f)
                arcTo(3.057f, 3.057f, 0.0f, false, true, 13.0f, 7.276f)
                arcToRelative(2.437f, 2.437f, 0.0f, false, false, 1.05f, 0.224f)
                arcTo(2.687f, 2.687f, 0.0f, false, false, 15.9f, 6.689f)
                lineTo(20.086f, 2.5f)
                lineToRelative(-0.793f, -0.793f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.707f, 0.293f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.707f, 4.707f)
                close()
                moveTo(13.969f, 14.607f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 12.413f, 14.0f)
                arcTo(2.166f, 2.166f, 0.0f, false, true, 10.0f, 11.673f)
                arcToRelative(2.288f, 2.288f, 0.0f, false, false, -0.609f, -1.642f)
                lineTo(8.4f, 9.038f)
                lineTo(0.917f, 16.518f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.853f, 1.711f)
                arcToRelative(5.054f, 5.054f, 0.0f, false, false, 1.3f, 4.405f)
                arcTo(4.841f, 4.841f, 0.0f, false, false, 4.869f, 24.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 0.9f, -0.064f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, 1.71f, -0.852f)
                lineTo(14.963f, 15.6f)
                close()
                moveTo(24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
