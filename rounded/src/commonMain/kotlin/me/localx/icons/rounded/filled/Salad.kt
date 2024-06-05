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

public val Icons.Filled.Salad: ImageVector
    get() {
        if (_salad != null) {
            return _salad!!
        }
        _salad = Builder(name = "Salad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.0f)
                curveToRelative(0.0f, 5.077f, -7.0f, 9.0f, -9.0f, 9.0f)
                lineTo(9.0f, 24.0f)
                curveToRelative(-2.0f, 0.0f, -9.0f, -3.923f, -9.0f, -9.0f)
                arcToRelative(3.032f, 3.032f, 0.0f, false, true, 3.028f, -3.0f)
                lineTo(20.972f, 12.0f)
                arcTo(3.034f, 3.034f, 0.0f, false, true, 24.0f, 15.0f)
                close()
                moveTo(19.714f, 3.02f)
                curveToRelative(-0.348f, 0.048f, -0.727f, 0.116f, -1.115f, 0.193f)
                curveToRelative(0.295f, -0.876f, 1.0f, -3.1f, -0.6f, -3.213f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, true, -1.311f, 3.034f)
                arcToRelative(6.983f, 6.983f, 0.0f, false, false, -2.383f, 1.355f)
                arcTo(4.459f, 4.459f, 0.0f, false, false, 12.244f, 10.0f)
                horizontalLineToRelative(1.342f)
                lineToRelative(2.707f, -2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineTo(16.414f, 10.0f)
                horizontalLineToRelative(4.251f)
                arcToRelative(21.019f, 21.019f, 0.0f, false, false, 1.316f, -4.713f)
                arcTo(2.007f, 2.007f, 0.0f, false, false, 19.714f, 3.02f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.134f, -5.277f, -7.867f, -5.273f, -8.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(10.5f, 6.068f)
                arcToRelative(6.666f, 6.666f, 0.0f, false, true, 4.055f, -3.735f)
                arcToRelative(1.936f, 1.936f, 0.0f, false, false, 0.432f, -1.105f)
                arcTo(4.017f, 4.017f, 0.0f, false, false, 11.5f, 0.034f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 9.5f, 0.8f)
                arcTo(3.938f, 3.938f, 0.0f, false, false, 7.234f, 0.01f)
                arcTo(3.954f, 3.954f, 0.0f, false, false, 4.348f, 0.887f)
                arcTo(3.96f, 3.96f, 0.0f, false, false, 3.1f, 4.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.5f, 6.068f)
                close()
            }
        }
        .build()
        return _salad!!
    }

private var _salad: ImageVector? = null
