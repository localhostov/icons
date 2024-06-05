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

public val Icons.Filled.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 8.0f)
                close()
                moveTo(21.452f, 24.0f)
                lineTo(12.589f, 24.0f)
                arcToRelative(2.548f, 2.548f, 0.0f, false, true, -2.221f, -1.26f)
                arcToRelative(2.463f, 2.463f, 0.0f, false, true, -0.029f, -2.471f)
                lineToRelative(4.436f, -7.959f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 4.5f, 0.0f)
                lineTo(23.7f, 20.263f)
                arcToRelative(2.468f, 2.468f, 0.0f, false, true, -0.028f, 2.475f)
                arcTo(2.551f, 2.551f, 0.0f, false, true, 21.452f, 24.0f)
                close()
                moveTo(8.644f, 23.754f)
                arcTo(4.45f, 4.45f, 0.0f, false, true, 8.591f, 19.3f)
                lineToRelative(4.437f, -7.96f)
                arcToRelative(4.519f, 4.519f, 0.0f, false, true, 1.507f, -1.605f)
                lineTo(12.944f, 6.755f)
                arcToRelative(3.344f, 3.344f, 0.0f, false, false, -5.885f, 0.0f)
                lineTo(0.406f, 19.055f)
                arcTo(3.351f, 3.351f, 0.0f, false, false, 3.35f, 24.0f)
                lineTo(8.8f, 24.0f)
                curveTo(8.745f, 23.92f, 8.693f, 23.838f, 8.644f, 23.754f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
