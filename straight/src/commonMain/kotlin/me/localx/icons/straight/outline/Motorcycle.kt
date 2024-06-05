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

public val Icons.Outline.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                arcToRelative(5.186f, 5.186f, 0.0f, false, false, -0.6f, 0.036f)
                lineToRelative(-0.607f, -1.82f)
                curveToRelative(0.495f, -0.087f, 1.018f, -0.152f, 1.493f, -0.187f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.747f, 1.026f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -2.02f, 0.259f)
                lineToRelative(-0.079f, 0.016f)
                lineTo(15.721f, 3.0f)
                lineTo(11.0f, 3.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(3.279f)
                lineToRelative(1.009f, 3.027f)
                arcTo(5.987f, 5.987f, 0.0f, false, false, 14.063f, 9.0f)
                lineTo(8.825f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 0.8f, 1.6f)
                lineToRelative(-0.44f, 0.586f)
                arcTo(5.025f, 5.025f, 0.0f, false, false, 0.0f, 16.0f)
                curveToRelative(0.105f, 6.089f, 8.817f, 6.785f, 9.927f, 0.852f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 11.4f, 15.8f)
                lineToRelative(3.752f, -5.0f)
                arcToRelative(4.139f, 4.139f, 0.0f, false, true, 0.794f, -0.8f)
                lineTo(16.5f, 11.67f)
                arcTo(5.015f, 5.015f, 0.0f, false, false, 19.0f, 21.0f)
                curveTo(25.608f, 20.79f, 25.606f, 11.209f, 19.0f, 11.0f)
                close()
                moveTo(5.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                lineToRelative(-0.6f, 0.8f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 17.0f)
                lineTo(7.828f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 19.0f)
                close()
                moveTo(9.8f, 14.6f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineToRelative(2.4f, -3.2f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, false, 0.431f, -0.8f)
                lineTo(12.5f, 11.0f)
                close()
                moveTo(19.0f, 19.0f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, true, -1.842f, -5.365f)
                lineToRelative(0.885f, 2.654f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.895f, -0.637f)
                lineTo(19.054f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
