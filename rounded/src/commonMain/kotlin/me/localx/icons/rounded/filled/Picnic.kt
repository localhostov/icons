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

public val Icons.Filled.Picnic: ImageVector
    get() {
        if (_picnic != null) {
            return _picnic!!
        }
        _picnic = Builder(name = "Picnic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.283f, 9.034f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 20.93f, 8.0f)
                curveTo(19.5f, -2.6f, 4.492f, -2.591f, 3.07f, 8.0f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 0.046f, 11.425f)
                lineToRelative(1.059f, 7.424f)
                arcTo(6.024f, 6.024f, 0.0f, false, false, 7.037f, 24.0f)
                horizontalLineToRelative(9.957f)
                arcToRelative(6.025f, 6.025f, 0.0f, false, false, 5.932f, -5.151f)
                lineToRelative(1.059f, -7.424f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.283f, 9.034f)
                close()
                moveTo(5.089f, 8.0f)
                curveTo(6.356f, 0.062f, 17.647f, 0.068f, 18.911f, 8.0f)
                close()
                moveTo(20.322f, 11.707f)
                lineTo(15.763f, 16.271f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, -3.531f, 0.0f)
                lineTo(7.673f, 11.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.413f, -1.414f)
                lineToRelative(4.558f, 4.564f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.706f, 0.0f)
                lineToRelative(4.559f, -4.564f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.322f, 11.707f)
                close()
            }
        }
        .build()
        return _picnic!!
    }

private var _picnic: ImageVector? = null
