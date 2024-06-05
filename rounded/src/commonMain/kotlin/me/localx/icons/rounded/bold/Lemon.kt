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

public val Icons.Bold.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 10.5f)
                close()
                moveTo(15.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 17.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 13.0f)
                close()
                moveTo(23.539f, 6.046f)
                arcTo(16.6f, 16.6f, 0.0f, false, true, 24.0f, 10.11f)
                curveToRelative(-0.032f, 2.339f, -0.573f, 6.751f, -3.854f, 10.032f)
                reflectiveCurveTo(12.449f, 23.964f, 10.111f, 24.0f)
                arcToRelative(16.529f, 16.529f, 0.0f, false, true, -4.065f, -0.457f)
                arcToRelative(1.446f, 1.446f, 0.0f, false, false, -1.0f, 0.042f)
                arcTo(3.408f, 3.408f, 0.0f, false, true, 0.429f, 18.938f)
                arcToRelative(1.469f, 1.469f, 0.0f, false, false, 0.042f, -1.016f)
                arcTo(16.265f, 16.265f, 0.0f, false, true, 0.0f, 13.889f)
                curveToRelative(0.032f, -2.338f, 0.573f, -6.75f, 3.854f, -10.031f)
                reflectiveCurveTo(11.551f, 0.036f, 13.889f, 0.0f)
                arcToRelative(15.845f, 15.845f, 0.0f, false, true, 4.034f, 0.468f)
                arcTo(1.472f, 1.472f, 0.0f, false, false, 18.938f, 0.429f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, true, 4.644f, 4.616f)
                arcTo(1.452f, 1.452f, 0.0f, false, false, 23.539f, 6.046f)
                close()
                moveTo(20.952f, 3.6f)
                arcTo(0.413f, 0.413f, 0.0f, false, false, 21.0f, 3.409f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, -0.6f, -0.359f)
                arcToRelative(4.328f, 4.328f, 0.0f, false, true, -3.19f, 0.335f)
                arcTo(14.546f, 14.546f, 0.0f, false, false, 13.929f, 3.0f)
                arcToRelative(11.55f, 11.55f, 0.0f, false, false, -7.95f, 2.975f)
                arcTo(11.55f, 11.55f, 0.0f, false, false, 3.0f, 13.929f)
                arcToRelative(13.215f, 13.215f, 0.0f, false, false, 0.381f, 3.277f)
                arcTo(4.334f, 4.334f, 0.0f, false, true, 3.05f, 20.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.05f, 0.194f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, 0.6f, 0.36f)
                arcToRelative(4.327f, 4.327f, 0.0f, false, true, 3.152f, -0.327f)
                arcTo(13.1f, 13.1f, 0.0f, false, false, 10.071f, 21.0f)
                arcToRelative(11.55f, 11.55f, 0.0f, false, false, 7.95f, -2.975f)
                arcTo(11.55f, 11.55f, 0.0f, false, false, 21.0f, 10.071f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, -0.372f, -3.315f)
                arcTo(4.32f, 4.32f, 0.0f, false, true, 20.952f, 3.6f)
                close()
                moveTo(17.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 19.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 9.0f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
