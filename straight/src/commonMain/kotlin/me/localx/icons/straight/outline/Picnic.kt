package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Picnic: ImageVector
    get() {
        if (_picnic != null) {
            return _picnic!!
        }
        _picnic = Builder(name = "Picnic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.929f, 8.0f)
                arcTo(8.983f, 8.983f, 0.0f, false, false, 3.071f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(1.914f, 21.425f)
                arcTo(3.012f, 3.012f, 0.0f, false, false, 4.879f, 24.0f)
                lineTo(19.121f, 24.0f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, 2.965f, -2.575f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 6.917f, 6.0f)
                lineTo(5.083f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(18.2f, 10.0f)
                lineTo(14.0f, 14.211f)
                lineTo(9.793f, 10.0f)
                close()
                moveTo(20.11f, 21.142f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.989f, 0.858f)
                lineTo(4.879f, 22.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.989f, -0.858f)
                lineTo(2.3f, 10.0f)
                lineTo(6.969f, 10.0f)
                lineTo(14.0f, 17.039f)
                lineTo(21.024f, 10.0f)
                lineTo(21.7f, 10.0f)
                close()
            }
        }
        .build()
        return _picnic!!
    }

private var _picnic: ImageVector? = null
