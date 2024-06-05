package me.localx.icons.straight.bold

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

public val Icons.Bold.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.268f, 4.268f)
                curveToRelative(0.976f, -0.976f, 0.976f, -2.559f, 0.0f, -3.536f)
                reflectiveCurveToRelative(-2.559f, -0.976f, -3.536f, 0.0f)
                lineToRelative(-6.004f, 7.268f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.829f, 1.824f, 7.22f, 5.138f, 9.548f)
                curveToRelative(0.0f, 0.0f, 0.862f, 0.465f, 0.862f, 0.952f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.487f, 0.862f, -0.952f, 0.862f, -0.952f)
                curveToRelative(3.313f, -2.328f, 5.138f, -5.719f, 5.138f, -9.548f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.25f)
                lineToRelative(4.518f, -3.732f)
                close()
                moveTo(17.187f, 16.559f)
                curveToRelative(-1.266f, 0.752f, -1.816f, 1.673f, -2.041f, 2.441f)
                horizontalLineToRelative(-6.29f)
                curveToRelative(-0.226f, -0.768f, -0.775f, -1.689f, -2.041f, -2.441f)
                curveToRelative(-2.012f, -1.43f, -3.284f, -3.366f, -3.681f, -5.559f)
                horizontalLineToRelative(17.734f)
                curveToRelative(-0.396f, 2.192f, -1.669f, 4.128f, -3.681f, 5.559f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
