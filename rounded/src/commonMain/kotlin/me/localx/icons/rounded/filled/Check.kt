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

public val Icons.Filled.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 465.822f, viewportHeight = 465.822f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.988f, 289.981f)
                lineToRelative(88.875f, 88.875f)
                curveToRelative(24.992f, 24.984f, 65.504f, 24.984f, 90.496f, 0.0f)
                lineToRelative(274.475f, -274.475f)
                curveToRelative(8.185f, -8.475f, 7.95f, -21.98f, -0.525f, -30.165f)
                curveToRelative(-8.267f, -7.985f, -21.374f, -7.985f, -29.641f, 0.0f)
                lineTo(155.194f, 348.691f)
                curveToRelative(-8.331f, 8.328f, -21.835f, 8.328f, -30.165f, 0.0f)
                lineToRelative(-88.875f, -88.875f)
                curveToRelative(-8.475f, -8.185f, -21.98f, -7.95f, -30.165f, 0.525f)
                curveTo(-1.996f, 268.608f, -1.996f, 281.714f, 5.988f, 289.981f)
                lineTo(5.988f, 289.981f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
