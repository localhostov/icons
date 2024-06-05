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

public val Icons.Outline.MugHotAlt: ImageVector
    get() {
        if (_mugHotAlt != null) {
            return _mugHotAlt!!
        }
        _mugHotAlt = Builder(name = "MugHotAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.026f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.026f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.026f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.026f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(0.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                close()
                moveTo(23.993f, 13.143f)
                arcTo(3.981f, 3.981f, 0.0f, false, true, 20.0f, 17.0f)
                lineTo(16.845f, 17.0f)
                arcToRelative(22.085f, 22.085f, 0.0f, false, true, -2.431f, 3.0f)
                lineTo(5.59f, 20.0f)
                arcTo(21.943f, 21.943f, 0.0f, false, true, 0.033f, 9.4f)
                arcTo(2.844f, 2.844f, 0.0f, false, true, 0.674f, 7.087f)
                arcTo(3.047f, 3.047f, 0.0f, false, true, 3.007f, 6.0f)
                horizontalLineToRelative(0.0f)
                lineTo(17.0f, 6.0f)
                arcTo(3.05f, 3.05f, 0.0f, false, true, 19.328f, 7.09f)
                arcTo(2.84f, 2.84f, 0.0f, false, true, 19.97f, 9.4f)
                curveToRelative(-0.035f, 0.2f, -0.081f, 0.4f, -0.123f, 0.6f)
                lineTo(20.0f, 10.0f)
                curveTo(22.462f, 10.0f, 23.993f, 11.205f, 23.993f, 13.143f)
                close()
                moveTo(17.8f, 8.38f)
                arcTo(1.061f, 1.061f, 0.0f, false, false, 17.0f, 8.0f)
                lineTo(3.008f, 8.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, false, -0.8f, 0.376f)
                arcToRelative(0.841f, 0.841f, 0.0f, false, false, -0.2f, 0.685f)
                arcTo(19.193f, 19.193f, 0.0f, false, false, 6.44f, 18.0f)
                horizontalLineToRelative(7.124f)
                arcTo(19.181f, 19.181f, 0.0f, false, false, 18.0f, 9.064f)
                arcTo(0.841f, 0.841f, 0.0f, false, false, 17.8f, 8.38f)
                close()
                moveTo(22.0f, 13.143f)
                curveToRelative(0.0f, -0.758f, -0.672f, -1.143f, -2.0f, -1.143f)
                horizontalLineToRelative(-0.687f)
                arcToRelative(20.161f, 20.161f, 0.0f, false, true, -1.279f, 3.0f)
                lineTo(20.0f, 15.0f)
                arcTo(1.982f, 1.982f, 0.0f, false, false, 21.994f, 13.143f)
                close()
                moveTo(7.026f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.026f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _mugHotAlt!!
    }

private var _mugHotAlt: ImageVector? = null
