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

public val Icons.Bold.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 9.0f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(23.4f, -3.9f, 0.6f, -3.893f, 0.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                curveTo(3.452f, 0.076f, 20.55f, 0.08f, 21.0f, 12.0f)
                arcTo(9.047f, 9.047f, 0.0f, false, true, 9.0f, 20.488f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.0f, 2.828f)
                arcTo(12.006f, 12.006f, 0.0f, false, false, 24.0f, 12.0f)
                close()
                moveTo(3.0f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                curveToRelative(0.072f, -1.083f, -1.837f, -5.626f, -3.072f, -4.231f)
                arcTo(8.359f, 8.359f, 0.0f, false, false, 3.0f, 16.5f)
                close()
                moveTo(17.065f, 17.056f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.009f, -2.121f)
                arcTo(7.452f, 7.452f, 0.0f, false, false, 12.0f, 13.0f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, false, -1.87f, 0.233f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.74f, 2.909f)
                arcToRelative(4.589f, 4.589f, 0.0f, false, true, 4.084f, 0.933f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.111f, -0.019f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
