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

public val Icons.Filled.Peach: ImageVector
    get() {
        if (_peach != null) {
            return _peach!!
        }
        _peach = Builder(name = "Peach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 2.551f)
                curveTo(21.329f, 4.289f, 19.729f, 7.0f, 15.309f, 7.0f)
                curveToRelative(-0.841f, -0.021f, -2.274f, 0.255f, -2.309f, -1.0f)
                arcTo(3.851f, 3.851f, 0.0f, false, false, 9.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.2f, 2.9f)
                arcTo(5.878f, 5.878f, 0.0f, false, true, 19.285f, 0.0f)
                curveTo(20.857f, -0.132f, 22.44f, 0.783f, 21.9f, 2.551f)
                close()
                moveTo(21.939f, 6.351f)
                curveTo(20.109f, 8.483f, 16.766f, 9.235f, 13.7f, 8.98f)
                arcTo(7.09f, 7.09f, 0.0f, false, true, 14.0f, 11.0f)
                arcToRelative(17.161f, 17.161f, 0.0f, false, true, -2.168f, 7.555f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.665f, -1.109f)
                arcTo(15.5f, 15.5f, 0.0f, false, false, 12.0f, 11.0f)
                curveToRelative(0.0f, -0.818f, -0.495f, -6.0f, -5.495f, -6.0f)
                arcTo(6.41f, 6.41f, 0.0f, false, false, 0.0f, 11.5f)
                curveTo(0.0f, 19.588f, 7.927f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -4.412f, 12.0f, -12.5f)
                arcTo(7.476f, 7.476f, 0.0f, false, false, 21.94f, 6.347f)
                close()
            }
        }
        .build()
        return _peach!!
    }

private var _peach: ImageVector? = null
