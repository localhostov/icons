package me.localx.icons.rounded.outline

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

public val Icons.Outline.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.428f, 24.0f)
                lineTo(6.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, false, 3.818f, -1.24f)
                arcToRelative(10.042f, 10.042f, 0.0f, false, true, -7.266f, -13.1f)
                arcTo(11.472f, 11.472f, 0.0f, false, true, 13.572f, 0.0f)
                lineTo(18.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, false, -3.818f, 1.24f)
                arcToRelative(10.041f, 10.041f, 0.0f, false, true, 7.266f, 13.1f)
                arcTo(11.472f, 11.472f, 0.0f, false, true, 10.428f, 24.0f)
                close()
                moveTo(12.475f, 2.059f)
                arcTo(9.387f, 9.387f, 0.0f, false, false, 4.45f, 8.3f)
                arcToRelative(8.039f, 8.039f, 0.0f, false, false, 6.085f, 10.569f)
                arcToRelative(1.809f, 1.809f, 0.0f, false, true, 1.436f, 1.352f)
                arcToRelative(1.837f, 1.837f, 0.0f, false, true, -0.446f, 1.725f)
                arcTo(9.393f, 9.393f, 0.0f, false, false, 19.551f, 15.7f)
                arcTo(8.04f, 8.04f, 0.0f, false, false, 13.466f, 5.135f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.809f, 1.809f, 0.0f, false, true, -1.437f, -1.352f)
                arcTo(1.834f, 1.834f, 0.0f, false, true, 12.475f, 2.059f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
