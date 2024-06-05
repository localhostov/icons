package me.localx.icons.straight.bold

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

public val Icons.Bold.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, false, -3.818f, 1.811f)
                lineToRelative(-5.4f, -2.438f)
                arcTo(4.914f, 4.914f, 0.0f, false, false, 10.0f, 12.0f)
                arcToRelative(4.929f, 4.929f, 0.0f, false, false, -0.211f, -1.359f)
                lineToRelative(5.394f, -2.45f)
                arcTo(4.972f, 4.972f, 0.0f, true, false, 14.0f, 5.0f)
                curveToRelative(0.0f, 0.142f, 0.03f, 0.276f, 0.042f, 0.415f)
                lineTo(8.1f, 8.112f)
                arcTo(4.947f, 4.947f, 0.0f, false, false, 5.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 17.0f)
                arcToRelative(4.947f, 4.947f, 0.0f, false, false, 3.09f, -1.1f)
                lineToRelative(5.952f, 2.687f)
                curveToRelative(-0.012f, 0.139f, -0.042f, 0.272f, -0.042f, 0.413f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, -5.0f)
                close()
                moveTo(19.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 3.0f)
                close()
                moveTo(5.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 14.0f)
                close()
                moveTo(19.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
