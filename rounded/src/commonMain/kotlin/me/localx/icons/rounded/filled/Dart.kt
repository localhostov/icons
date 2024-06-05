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

public val Icons.Filled.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                horizontalLineToRelative(-1.757f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, -2.829f, 1.172f)
                lineToRelative(-3.242f, 3.242f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, false, -1.172f, 2.828f)
                verticalLineToRelative(3.748f)
                curveToRelative(-2.855f, 1.986f, -7.509f, 5.276f, -8.121f, 5.889f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -0.577f, 3.4f)
                lineToRelative(-2.009f, 2.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(2.007f, -2.007f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 3.407f, -0.579f)
                curveToRelative(0.613f, -0.612f, 3.9f, -5.266f, 5.889f, -8.121f)
                horizontalLineToRelative(3.747f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, 2.829f, -1.172f)
                lineToRelative(3.242f, -3.242f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, false, 1.172f, -2.828f)
                verticalLineToRelative(-1.758f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(19.707f, 5.707f)
                lineTo(14.707f, 10.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
