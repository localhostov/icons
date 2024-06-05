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

public val Icons.Filled.StarChristmas: ImageVector
    get() {
        if (_starChristmas != null) {
            return _starChristmas!!
        }
        _starChristmas = Builder(name = "StarChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.939f, 23.371f)
                curveToRelative(-0.345f, 0.839f, -1.533f, 0.839f, -1.878f, 0.0f)
                lineToRelative(-2.89f, -7.542f)
                lineTo(0.629f, 12.939f)
                curveToRelative(-0.839f, -0.345f, -0.839f, -1.533f, 0.0f, -1.878f)
                lineToRelative(7.542f, -2.89f)
                lineTo(11.061f, 0.629f)
                curveToRelative(0.345f, -0.839f, 1.533f, -0.839f, 1.878f, 0.0f)
                lineToRelative(2.89f, 7.542f)
                lineToRelative(7.542f, 2.89f)
                curveToRelative(0.839f, 0.345f, 0.839f, 1.533f, 0.0f, 1.878f)
                lineToRelative(-7.542f, 2.89f)
                lineToRelative(-2.89f, 7.542f)
                close()
                moveTo(4.778f, 7.405f)
                lineToRelative(1.861f, -0.766f)
                lineToRelative(0.77f, -1.871f)
                lineToRelative(-3.922f, -2.602f)
                curveToRelative(-0.866f, -0.572f, -1.894f, 0.455f, -1.322f, 1.322f)
                lineToRelative(2.612f, 3.917f)
                close()
                moveTo(17.361f, 6.639f)
                lineToRelative(1.861f, 0.766f)
                lineToRelative(2.612f, -3.917f)
                curveToRelative(0.572f, -0.866f, -0.456f, -1.894f, -1.322f, -1.322f)
                lineToRelative(-3.922f, 2.602f)
                lineToRelative(0.77f, 1.871f)
                close()
                moveTo(19.228f, 16.593f)
                lineToRelative(-1.867f, 0.769f)
                lineToRelative(-0.766f, 1.861f)
                lineToRelative(3.918f, 2.6f)
                curveToRelative(0.866f, 0.572f, 1.894f, -0.455f, 1.322f, -1.322f)
                lineToRelative(-2.606f, -3.907f)
                close()
                moveTo(6.638f, 17.362f)
                lineToRelative(-1.867f, -0.769f)
                lineToRelative(-2.606f, 3.907f)
                curveToRelative(-0.572f, 0.866f, 0.456f, 1.894f, 1.322f, 1.322f)
                lineToRelative(3.918f, -2.6f)
                lineToRelative(-0.766f, -1.861f)
                close()
            }
        }
        .build()
        return _starChristmas!!
    }

private var _starChristmas: ImageVector? = null
