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

public val Icons.Outline.Dart: ImageVector
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
                verticalLineToRelative(3.463f)
                curveToRelative(-3.266f, 2.415f, -7.581f, 5.633f, -8.121f, 6.174f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -0.577f, 3.4f)
                lineToRelative(-2.009f, 2.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(2.007f, -2.007f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 3.407f, -0.579f)
                curveToRelative(0.541f, -0.541f, 3.759f, -4.855f, 6.179f, -8.121f)
                horizontalLineToRelative(3.462f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, 2.829f, -1.172f)
                lineToRelative(3.242f, -3.242f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, false, 1.167f, -2.828f)
                verticalLineToRelative(-1.758f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(5.707f, 19.707f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, true, -1.414f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                curveToRelative(0.339f, -0.336f, 3.0f, -2.343f, 5.948f, -4.534f)
                curveToRelative(-2.192f, 2.947f, -4.199f, 5.61f, -4.534f, 5.948f)
                close()
                moveTo(22.0f, 5.758f)
                arcToRelative(2.011f, 2.011f, 0.0f, false, true, -0.586f, 1.414f)
                lineToRelative(-3.242f, 3.242f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, -1.415f, 0.586f)
                horizontalLineToRelative(-1.986f)
                lineToRelative(0.991f, -1.348f)
                lineToRelative(3.945f, -3.945f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-3.944f, 3.944f)
                lineToRelative(-1.349f, 0.992f)
                verticalLineToRelative(-1.987f)
                arcToRelative(2.011f, 2.011f, 0.0f, false, true, 0.586f, -1.414f)
                lineToRelative(3.242f, -3.242f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 1.415f, -0.586f)
                horizontalLineToRelative(1.757f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
