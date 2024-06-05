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

public val Icons.Filled.GingerbreadMan: ImageVector
    get() {
        if (_gingerbreadMan != null) {
            return _gingerbreadMan!!
        }
        _gingerbreadMan = Builder(name = "GingerbreadMan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 8.291f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, false, -2.2f, -1.277f)
                curveToRelative(-0.274f, 0.0f, -2.512f, 0.258f, -4.268f, 0.465f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.345f, -0.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.776f, -0.011f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.349f, 0.706f)
                curveToRelative(-1.76f, -0.205f, -3.927f, -0.45f, -4.2f, -0.45f)
                arcTo(2.535f, 2.535f, 0.0f, false, false, 2.305f, 8.291f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.378f, 3.562f)
                lineTo(7.0f, 12.38f)
                verticalLineToRelative(4.161f)
                lineToRelative(-2.586f, 3.52f)
                arcToRelative(2.579f, 2.579f, 0.0f, false, false, 0.366f, 3.291f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.016f, 0.625f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, false, 1.765f, -1.122f)
                lineTo(11.479f, 19.3f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.57f, -0.3f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, true, 0.565f, 0.312f)
                lineToRelative(2.719f, 3.456f)
                arcToRelative(2.589f, 2.589f, 0.0f, false, false, 3.293f, 0.98f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.979f, -3.581f)
                lineTo(17.0f, 16.563f)
                lineTo(17.0f, 12.38f)
                lineToRelative(3.316f, -0.527f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.7f, 8.291f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _gingerbreadMan!!
    }

private var _gingerbreadMan: ImageVector? = null
