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

public val Icons.Bold.Soup: ImageVector
    get() {
        if (_soup != null) {
            return _soup!!
        }
        _soup = Builder(name = "Soup", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.122f, 24.0f)
                lineTo(9.877f, 24.0f)
                arcTo(8.766f, 8.766f, 0.0f, false, true, 3.72f, 21.507f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -3.546f, -6.04f)
                arcTo(4.26f, 4.26f, 0.0f, false, true, 4.252f, 10.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(4.284f, 4.284f, 0.0f, false, true, 4.079f, 5.467f)
                arcToRelative(14.11f, 14.11f, 0.0f, false, true, -3.548f, 6.04f)
                arcTo(8.763f, 8.763f, 0.0f, false, true, 14.122f, 24.0f)
                close()
                moveTo(4.252f, 13.0f)
                arcToRelative(1.222f, 1.222f, 0.0f, false, false, -1.0f, 0.5f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.2f, 1.128f)
                arcToRelative(11.24f, 11.24f, 0.0f, false, false, 2.783f, 4.755f)
                arcTo(5.744f, 5.744f, 0.0f, false, false, 9.877f, 21.0f)
                horizontalLineToRelative(4.245f)
                arcToRelative(5.744f, 5.744f, 0.0f, false, false, 4.04f, -1.618f)
                arcToRelative(11.247f, 11.247f, 0.0f, false, false, 2.785f, -4.756f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.2f, -1.128f)
                arcToRelative(1.222f, 1.222f, 0.0f, false, false, -1.0f, -0.5f)
                close()
                moveTo(17.0f, 6.5f)
                arcToRelative(5.165f, 5.165f, 0.0f, false, false, -1.44f, -3.647f)
                arcTo(1.763f, 1.763f, 0.0f, false, true, 15.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 1.5f)
                arcToRelative(4.757f, 4.757f, 0.0f, false, false, 1.439f, 3.473f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 14.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(12.0f, 7.5f)
                lineTo(12.0f, 7.192f)
                arcToRelative(4.909f, 4.909f, 0.0f, false, false, -1.439f, -3.474f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 10.0f, 2.364f)
                lineTo(10.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.864f)
                arcTo(4.882f, 4.882f, 0.0f, false, false, 8.44f, 5.839f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 9.0f, 7.192f)
                lineTo(9.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _soup!!
    }

private var _soup: ImageVector? = null
