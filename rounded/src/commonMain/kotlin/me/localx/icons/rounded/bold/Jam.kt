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

public val Icons.Bold.Jam: ImageVector
    get() {
        if (_jam != null) {
            return _jam!!
        }
        _jam = Builder(name = "Jam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.789f, 6.479f)
                curveTo(23.317f, 5.2f, 22.043f, 3.979f, 20.0f, 2.837f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 2.837f)
                curveTo(1.957f, 3.979f, 0.683f, 5.2f, 0.21f, 6.479f)
                arcTo(3.439f, 3.439f, 0.0f, false, false, 0.621f, 9.631f)
                arcTo(3.114f, 3.114f, 0.0f, false, false, 2.0f, 10.731f)
                lineTo(2.0f, 17.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 8.5f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 22.0f, 17.5f)
                lineTo(22.0f, 10.74f)
                arcToRelative(3.175f, 3.175f, 0.0f, false, false, 1.376f, -1.109f)
                arcTo(3.433f, 3.433f, 0.0f, false, false, 23.789f, 6.479f)
                close()
                moveTo(19.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.0f, 17.5f)
                lineTo(5.0f, 10.561f)
                arcToRelative(4.032f, 4.032f, 0.0f, false, false, 0.749f, -0.445f)
                curveToRelative(0.22f, -0.17f, 0.285f, -0.168f, 0.5f, 0.0f)
                arcTo(4.442f, 4.442f, 0.0f, false, false, 9.0f, 11.0f)
                arcToRelative(4.439f, 4.439f, 0.0f, false, false, 2.75f, -0.884f)
                curveToRelative(0.22f, -0.17f, 0.285f, -0.168f, 0.5f, 0.0f)
                arcTo(4.438f, 4.438f, 0.0f, false, false, 15.0f, 11.0f)
                arcToRelative(4.438f, 4.438f, 0.0f, false, false, 2.749f, -0.884f)
                curveToRelative(0.22f, -0.17f, 0.284f, -0.169f, 0.5f, 0.0f)
                arcToRelative(3.948f, 3.948f, 0.0f, false, false, 0.751f, 0.444f)
                close()
                moveTo(20.915f, 7.917f)
                arcToRelative(1.441f, 1.441f, 0.0f, false, true, -0.831f, -0.176f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -4.17f, 0.0f)
                arcToRelative(1.764f, 1.764f, 0.0f, false, true, -1.832f, 0.0f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, false, -4.169f, 0.0f)
                arcToRelative(1.764f, 1.764f, 0.0f, false, true, -1.832f, 0.0f)
                arcToRelative(3.382f, 3.382f, 0.0f, false, false, -4.168f, 0.0f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 3.177f, 8.0f)
                curveToRelative(-0.015f, 0.0f, -0.307f, 0.0f, -0.153f, -0.479f)
                curveTo(3.191f, 7.0f, 4.263f, 6.015f, 6.293f, 5.0f)
                lineTo(17.707f, 5.0f)
                curveToRelative(2.03f, 1.015f, 3.079f, 2.008f, 3.268f, 2.521f)
                arcTo(0.447f, 0.447f, 0.0f, false, true, 20.916f, 7.917f)
                close()
            }
        }
        .build()
        return _jam!!
    }

private var _jam: ImageVector? = null
