package me.localx.icons.straight.filled

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

public val Icons.Filled.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.141f, 8.408f)
                lineToRelative(1.058f, 0.866f)
                lineToRelative(1.268f, -1.548f)
                lineToRelative(-3.666f, -3.0f)
                lineToRelative(-1.268f, 1.548f)
                lineToRelative(1.059f, 0.867f)
                lineToRelative(-1.426f, 1.743f)
                curveToRelative(-0.669f, -0.45f, -1.393f, -0.833f, -2.166f, -1.133f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.75f)
                curveToRelative(-4.217f, 1.639f, -7.0f, 5.668f, -7.0f, 10.25f)
                curveToRelative(0.0f, 1.129f, 0.173f, 2.244f, 0.514f, 3.313f)
                curveToRelative(0.512f, 1.607f, 2.031f, 2.687f, 3.779f, 2.687f)
                horizontalLineToRelative(13.414f)
                curveToRelative(1.748f, 0.0f, 3.268f, -1.08f, 3.779f, -2.687f)
                curveToRelative(0.341f, -1.069f, 0.514f, -2.184f, 0.514f, -3.313f)
                curveToRelative(0.0f, -3.039f, -1.23f, -5.831f, -3.286f, -7.848f)
                lineToRelative(1.427f, -1.744f)
                close()
                moveTo(20.067f, 14.0f)
                curveToRelative(0.311f, 0.631f, 0.55f, 1.301f, 0.707f, 2.0f)
                lineTo(3.226f, 16.0f)
                curveToRelative(0.157f, -0.699f, 0.396f, -1.369f, 0.707f, -2.0f)
                horizontalLineToRelative(16.133f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
