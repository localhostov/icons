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

public val Icons.Filled.Radish: ImageVector
    get() {
        if (_radish != null) {
            return _radish!!
        }
        _radish = Builder(name = "Radish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.022f, 9.01f)
                curveToRelative(-0.295f, -3.7f, -2.084f, -4.643f, -2.0f, -6.5f)
                curveToRelative(0.312f, -3.871f, 6.366f, -2.912f, 4.725f, 0.9f)
                curveTo(13.061f, 4.711f, 12.153f, 6.451f, 11.022f, 9.01f)
                close()
                moveTo(20.636f, 10.291f)
                curveToRelative(-1.747f, 0.917f, -3.739f, 1.909f, -5.615f, 2.719f)
                curveToRelative(3.7f, 0.3f, 4.631f, 2.083f, 6.487f, 2.0f)
                curveTo(25.351f, 14.705f, 24.453f, 8.674f, 20.636f, 10.291f)
                close()
                moveTo(24.017f, 3.882f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 17.41f, 1.145f)
                curveToRelative(-0.488f, 0.488f, -3.981f, 6.721f, -5.984f, 10.328f)
                curveTo(8.42f, 8.707f, 4.447f, 7.92f, 1.465f, 10.949f)
                curveToRelative(-2.0f, 1.916f, -1.291f, 6.491f, -1.448f, 9.035f)
                arcToRelative(4.018f, 4.018f, 0.0f, false, false, 4.0f, 4.016f)
                curveToRelative(2.539f, -0.156f, 7.145f, 0.567f, 9.061f, -1.428f)
                curveToRelative(2.758f, -2.762f, 2.539f, -6.524f, -0.515f, -9.958f)
                curveToRelative(3.584f, -1.981f, 9.761f, -5.432f, 10.322f, -6.0f)
                arcTo(3.846f, 3.846f, 0.0f, false, false, 24.017f, 3.882f)
                close()
            }
        }
        .build()
        return _radish!!
    }

private var _radish: ImageVector? = null
