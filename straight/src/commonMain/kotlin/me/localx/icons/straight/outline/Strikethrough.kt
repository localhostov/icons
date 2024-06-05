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

public val Icons.Outline.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.074f)
                curveToRelative(-1.853f, -0.998f, -3.074f, -2.967f, -3.074f, -5.151f)
                curveTo(2.0f, 2.624f, 4.624f, 0.0f, 7.848f, 0.0f)
                horizontalLineToRelative(8.235f)
                curveToRelative(3.262f, 0.0f, 5.917f, 2.654f, 5.917f, 5.917f)
                verticalLineToRelative(1.083f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.083f)
                curveToRelative(0.0f, -2.16f, -1.757f, -3.917f, -3.917f, -3.917f)
                lineTo(7.848f, 2.0f)
                curveToRelative(-2.122f, 0.0f, -3.848f, 1.727f, -3.848f, 3.849f)
                curveToRelative(0.0f, 1.732f, 1.167f, 3.26f, 2.84f, 3.714f)
                lineToRelative(4.806f, 1.438f)
                horizontalLineToRelative(12.354f)
                close()
                moveTo(18.352f, 15.0f)
                curveToRelative(1.008f, 0.706f, 1.648f, 1.871f, 1.648f, 3.151f)
                curveToRelative(0.0f, 2.122f, -1.726f, 3.849f, -3.848f, 3.849f)
                lineTo(7.917f, 22.0f)
                curveToRelative(-2.16f, 0.0f, -3.917f, -1.757f, -3.917f, -3.917f)
                verticalLineToRelative(-1.083f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.083f)
                curveToRelative(0.0f, 3.263f, 2.654f, 5.917f, 5.917f, 5.917f)
                horizontalLineToRelative(8.235f)
                curveToRelative(3.225f, 0.0f, 5.848f, -2.624f, 5.848f, -5.849f)
                curveToRelative(0.0f, -1.15f, -0.354f, -2.23f, -0.948f, -3.151f)
                horizontalLineToRelative(-2.701f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
