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

public val Icons.Filled.Interrogation: ImageVector
    get() {
        if (_interrogation != null) {
            return _interrogation!!
        }
        _interrogation = Builder(name = "Interrogation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(13.93f, 12.506f)
                arcTo(1.982f, 1.982f, 0.0f, false, false, 13.0f, 14.257f)
                lineTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-0.743f)
                arcToRelative(3.954f, 3.954f, 0.0f, false, true, 1.964f, -3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, -2.125f)
                arcToRelative(2.024f, 2.024f, 0.0f, false, false, -1.6f, -1.595f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.93f, 3.505f)
                close()
            }
        }
        .build()
        return _interrogation!!
    }

private var _interrogation: ImageVector? = null
