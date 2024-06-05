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

public val Icons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.119f, 0.872f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 20.714f, 0.015f)
                curveTo(17.921f, 0.285f, 8.528f, 1.448f, 4.9f, 5.072f)
                arcToRelative(9.931f, 9.931f, 0.0f, false, false, -0.671f, 13.281f)
                lineToRelative(11.06f, -11.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineTo(5.647f, 19.767f)
                arcTo(9.929f, 9.929f, 0.0f, false, false, 18.928f, 19.1f)
                curveToRelative(3.676f, -3.677f, 4.8f, -13.041f, 5.059f, -15.823f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 23.119f, 0.872f)
                close()
                moveTo(4.9f, 19.1f)
                quadToRelative(0.358f, 0.357f, 0.743f, 0.671f)
                lineToRelative(-3.94f, 3.94f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.293f, 22.293f)
                lineToRelative(3.94f, -3.94f)
                quadTo(4.547f, 18.737f, 4.9f, 19.1f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
