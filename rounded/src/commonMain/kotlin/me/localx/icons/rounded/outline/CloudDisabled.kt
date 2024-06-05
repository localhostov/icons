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

public val Icons.Outline.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.781f, 20.367f)
                arcToRelative(7.494f, 7.494f, 0.0f, false, false, 2.2f, -4.729f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -5.621f, -8.277f)
                arcToRelative(1.089f, 1.089f, 0.0f, false, true, -0.721f, -0.734f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -13.07f, -3.473f)
                lineToRelative(-2.862f, -2.861f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(22.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                close()
                moveTo(9.1f, 3.065f)
                arcToRelative(5.992f, 5.992f, 0.0f, false, true, 6.624f, 4.155f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 2.044f, 2.052f)
                arcToRelative(5.971f, 5.971f, 0.0f, false, true, 4.213f, 6.21f)
                arcToRelative(5.406f, 5.406f, 0.0f, false, true, -1.627f, 3.458f)
                lineToRelative(-14.372f, -14.372f)
                arcToRelative(5.952f, 5.952f, 0.0f, false, true, 3.118f, -1.503f)
                close()
                moveTo(16.993f, 21.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.887f, 1.1f)
                arcToRelative(12.216f, 12.216f, 0.0f, false, true, -1.321f, 0.07f)
                horizontalLineToRelative(-9.1f)
                arcToRelative(5.843f, 5.843f, 0.0f, false, true, -5.628f, -4.698f)
                arcToRelative(5.446f, 5.446f, 0.0f, false, true, 2.881f, -5.65f)
                arcToRelative(7.646f, 7.646f, 0.0f, false, true, -0.858f, -4.789f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.981f, 0.278f)
                arcToRelative(5.968f, 5.968f, 0.0f, false, false, 0.6f, 3.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.791f, 2.7f)
                arcToRelative(3.467f, 3.467f, 0.0f, false, false, -1.832f, 3.6f)
                arcToRelative(3.809f, 3.809f, 0.0f, false, false, 3.645f, 2.976f)
                horizontalLineToRelative(9.1f)
                arcToRelative(10.245f, 10.245f, 0.0f, false, false, 1.107f, -0.059f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 1.104f, 0.887f)
                close()
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
