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

public val Icons.Filled.BootHeeled: ImageVector
    get() {
        if (_bootHeeled != null) {
            return _bootHeeled!!
        }
        _bootHeeled = Builder(name = "BootHeeled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.59f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(-8.78f)
                curveToRelative(-1.326f, 0.0f, -2.598f, -0.527f, -3.536f, -1.465f)
                lineToRelative(-2.363f, -2.364f)
                curveToRelative(-0.75f, -0.75f, -1.768f, -1.172f, -2.829f, -1.172f)
                lineTo(0.0f, 18.999f)
                lineTo(0.0f, 2.075f)
                lineTo(6.0f, 0.91f)
                verticalLineToRelative(11.09f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 0.522f)
                lineToRelative(2.356f, -0.458f)
                curveToRelative(0.872f, -0.194f, 1.839f, 0.031f, 2.559f, 0.608f)
                curveToRelative(0.7f, 0.561f, 1.085f, 1.388f, 1.085f, 2.327f)
                verticalLineToRelative(8.264f)
                curveToRelative(0.0f, 0.379f, 0.214f, 0.725f, 0.552f, 0.894f)
                lineToRelative(6.131f, 3.066f)
                curveToRelative(2.033f, 1.016f, 3.317f, 3.094f, 3.317f, 5.367f)
                close()
                moveTo(7.907f, 21.586f)
                curveToRelative(-0.378f, -0.378f, -0.88f, -0.586f, -1.415f, -0.586f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.321f)
                lineToRelative(-1.093f, -1.093f)
                close()
            }
        }
        .build()
        return _bootHeeled!!
    }

private var _bootHeeled: ImageVector? = null
