package me.localx.icons.rounded.outline

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

public val Icons.Outline.ShipSide: ImageVector
    get() {
        if (_shipSide != null) {
            return _shipSide!!
        }
        _shipSide = Builder(name = "ShipSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.989f, 12.0f)
                lineTo(18.653f, 12.0f)
                arcToRelative(15.71f, 15.71f, 0.0f, false, false, -4.328f, -5.864f)
                arcTo(5.03f, 5.03f, 0.0f, false, false, 11.146f, 5.0f)
                lineTo(8.818f, 5.0f)
                lineTo(8.11f, 2.315f)
                arcTo(3.105f, 3.105f, 0.0f, true, false, 2.1f, 3.9f)
                lineTo(2.394f, 5.0f)
                lineTo(1.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 7.0f)
                lineTo(11.146f, 7.0f)
                arcToRelative(3.029f, 3.029f, 0.0f, false, true, 1.913f, 0.687f)
                arcToRelative(13.411f, 13.411f, 0.0f, false, true, 3.386f, 4.318f)
                horizontalLineToRelative(-0.82f)
                arcToRelative(3.037f, 3.037f, 0.0f, false, false, -1.692f, 0.5f)
                lineToRelative(-1.984f, 1.322f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 11.4f, 14.0f)
                lineTo(1.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(11.4f, 16.0f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, 1.664f, -0.5f)
                lineToRelative(1.983f, -1.322f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, true, 0.574f, -0.168f)
                lineToRelative(4.369f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.7f, 0.935f)
                arcToRelative(1.949f, 1.949f, 0.0f, false, true, 0.123f, 1.912f)
                arcTo(9.03f, 9.03f, 0.0f, false, true, 13.668f, 22.0f)
                lineTo(1.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(13.668f, 24.0f)
                arcToRelative(11.04f, 11.04f, 0.0f, false, false, 9.948f, -6.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.989f, 12.0f)
                close()
                moveTo(4.037f, 3.388f)
                arcToRelative(1.107f, 1.107f, 0.0f, false, true, 2.14f, -0.564f)
                lineTo(6.75f, 5.0f)
                lineTo(4.462f, 5.0f)
                close()
                moveTo(0.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(1.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(4.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 20.0f)
                close()
                moveTo(8.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 20.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _shipSide!!
    }

private var _shipSide: ImageVector? = null
