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

public val Icons.Filled.Fork: ImageVector
    get() {
        if (_fork != null) {
            return _fork!!
        }
        _fork = Builder(name = "Fork", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 5.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-5.172f, 5.171f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, -3.4f, 0.568f)
                lineToRelative(6.982f, -6.982f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineTo(12.3f, 10.286f)
                arcToRelative(2.984f, 2.984f, 0.0f, false, true, 0.579f, -3.407f)
                lineTo(18.05f, 1.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.636f, 0.293f)
                lineTo(11.465f, 5.465f)
                arcToRelative(5.02f, 5.02f, 0.0f, false, false, -0.636f, 6.292f)
                lineTo(0.293f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineTo(12.243f, 13.171f)
                arcToRelative(5.02f, 5.02f, 0.0f, false, false, 6.292f, -0.636f)
                lineToRelative(5.172f, -5.171f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.707f, 5.95f)
                close()
            }
        }
        .build()
        return _fork!!
    }

private var _fork: ImageVector? = null
