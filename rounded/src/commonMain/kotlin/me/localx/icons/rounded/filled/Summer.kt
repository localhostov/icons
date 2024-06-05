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

public val Icons.Filled.Summer: ImageVector
    get() {
        if (_summer != null) {
            return _summer!!
        }
        _summer = Builder(name = "Summer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-6.077f, 0.117f, -9.335f, -7.638f, -5.0f, -11.889f)
                lineTo(12.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.111f)
                arcTo(7.007f, 7.007f, 0.0f, false, true, 24.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.828f)
                lineTo(18.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(6.172f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 20.0f, 17.0f)
                close()
                moveTo(10.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 1.0f)
                lineTo(8.0f, 3.083f)
                arcToRelative(5.879f, 5.879f, 0.0f, false, false, -1.085f, 0.291f)
                lineTo(5.872f, 1.512f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.744f, 0.976f)
                lineTo(5.184f, 4.373f)
                arcToRelative(6.067f, 6.067f, 0.0f, false, false, -0.834f, 0.839f)
                lineTo(2.5f, 4.136f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 1.5f, 5.864f)
                lineTo(3.361f, 6.951f)
                arcTo(5.928f, 5.928f, 0.0f, false, false, 3.084f, 8.0f)
                lineTo(1.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(3.085f, 10.0f)
                arcToRelative(5.912f, 5.912f, 0.0f, false, false, 0.291f, 1.084f)
                lineTo(1.512f, 12.128f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.976f, 1.744f)
                lineToRelative(1.887f, -1.057f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, 0.837f, 0.835f)
                lineTo(4.136f, 15.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.864f, 16.5f)
                lineTo(6.951f, 14.64f)
                lineTo(7.0f, 14.658f)
                curveToRelative(1.414f, 0.657f, 1.809f, -1.648f, 2.475f, -2.6f)
                arcTo(3.237f, 3.237f, 0.0f, false, false, 10.0f, 10.282f)
                close()
            }
        }
        .build()
        return _summer!!
    }

private var _summer: ImageVector? = null
