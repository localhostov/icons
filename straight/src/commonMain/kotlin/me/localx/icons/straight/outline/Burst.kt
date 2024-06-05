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

public val Icons.Outline.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.924f, 11.882f)
                lineToRelative(-4.94f, -2.639f)
                lineToRelative(3.422f, -6.756f)
                lineToRelative(-7.074f, 2.995f)
                lineTo(12.42f, 0.028f)
                lineToRelative(-2.815f, 5.289f)
                lineTo(-0.006f, 0.15f)
                lineTo(5.805f, 9.271f)
                lineTo(0.163f, 12.052f)
                lineToRelative(5.76f, 2.544f)
                lineToRelative(-2.138f, 5.825f)
                lineToRelative(5.797f, -1.991f)
                lineToRelative(2.96f, 5.531f)
                lineToRelative(2.757f, -5.388f)
                lineToRelative(8.389f, 4.549f)
                lineToRelative(-4.583f, -8.663f)
                lineToRelative(4.819f, -2.578f)
                close()
                moveTo(14.451f, 15.839f)
                lineToRelative(-1.949f, 3.81f)
                lineToRelative(-1.96f, -3.663f)
                lineToRelative(-3.431f, 1.179f)
                lineToRelative(1.336f, -3.639f)
                lineToRelative(-3.56f, -1.572f)
                lineToRelative(3.803f, -1.875f)
                lineToRelative(-2.89f, -4.536f)
                lineToRelative(4.626f, 2.486f)
                lineToRelative(1.995f, -3.749f)
                lineToRelative(2.004f, 3.757f)
                lineToRelative(3.725f, -1.577f)
                lineToRelative(-1.836f, 3.625f)
                lineToRelative(3.366f, 1.798f)
                lineToRelative(-3.276f, 1.752f)
                lineToRelative(2.421f, 4.576f)
                lineToRelative(-4.375f, -2.373f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
