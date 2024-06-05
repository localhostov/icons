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

public val Icons.Bold.Onion: ImageVector
    get() {
        if (_onion != null) {
            return _onion!!
        }
        _onion = Builder(name = "Onion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -5.737f, -4.6f, -8.627f, -8.017f, -9.667f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 0.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.017f, 3.328f)
                curveTo(4.719f, 4.335f, 0.0f, 7.23f, 0.0f, 13.0f)
                curveToRelative(0.0f, 4.805f, 3.448f, 8.029f, 9.172f, 8.811f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.7f, 23.4f)
                lineTo(12.0f, 23.0f)
                lineToRelative(0.3f, 0.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.528f, -1.589f)
                curveTo(20.552f, 21.029f, 24.0f, 17.805f, 24.0f, 13.0f)
                close()
                moveTo(11.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.268f, 2.268f, 0.0f, false, false, 0.108f, 0.543f)
                arcToRelative(3.139f, 3.139f, 0.0f, false, false, 0.249f, 0.43f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 16.0f, 13.0f)
                arcToRelative(6.27f, 6.27f, 0.0f, false, true, -2.5f, 5.468f)
                lineTo(13.5f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(8.968f)
                arcTo(6.27f, 6.27f, 0.0f, false, true, 8.0f, 13.0f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, 2.639f, -7.523f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, 0.255f, -0.435f)
                arcTo(3.619f, 3.619f, 0.0f, false, false, 11.0f, 4.5f)
                close()
                moveTo(3.0f, 13.0f)
                arcTo(6.37f, 6.37f, 0.0f, false, true, 6.075f, 7.534f)
                arcTo(14.853f, 14.853f, 0.0f, false, false, 5.0f, 13.0f)
                arcToRelative(10.424f, 10.424f, 0.0f, false, false, 1.123f, 4.854f)
                arcTo(5.11f, 5.11f, 0.0f, false, true, 3.0f, 13.0f)
                close()
                moveTo(17.877f, 17.854f)
                arcTo(10.424f, 10.424f, 0.0f, false, false, 19.0f, 13.0f)
                arcToRelative(14.841f, 14.841f, 0.0f, false, false, -1.068f, -5.448f)
                arcTo(6.366f, 6.366f, 0.0f, false, true, 21.0f, 13.0f)
                arcTo(5.11f, 5.11f, 0.0f, false, true, 17.877f, 17.854f)
                close()
            }
        }
        .build()
        return _onion!!
    }

private var _onion: ImageVector? = null
