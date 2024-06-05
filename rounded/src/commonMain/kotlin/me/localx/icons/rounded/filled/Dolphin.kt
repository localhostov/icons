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

public val Icons.Filled.Dolphin: ImageVector
    get() {
        if (_dolphin != null) {
            return _dolphin!!
        }
        _dolphin = Builder(name = "Dolphin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.899f)
                curveToRelative(-0.144f, 0.0f, -0.3f, 0.01f, -0.451f, 0.015f)
                curveToRelative(-0.122f, 0.873f, -0.395f, 2.0f, -0.948f, 3.44f)
                curveToRelative(-0.237f, 0.617f, -1.28f, 0.776f, -1.418f, 0.13f)
                curveToRelative(-0.299f, -1.397f, -0.686f, -2.284f, -1.057f, -2.849f)
                curveToRelative(-1.084f, 0.463f, -2.114f, 1.185f, -2.904f, 2.331f)
                curveToRelative(-0.898f, 1.302f, -1.546f, 3.148f, -1.75f, 4.858f)
                curveToRelative(1.656f, 0.673f, 2.967f, 2.096f, 3.396f, 3.818f)
                curveToRelative(0.169f, 0.681f, -0.397f, 1.351f, -1.09f, 1.245f)
                curveToRelative(-3.153f, -0.481f, -4.38f, -2.737f, -4.38f, -2.737f)
                curveToRelative(0.0f, 0.0f, -1.189f, 2.26f, -4.38f, 2.737f)
                curveToRelative(-0.693f, 0.104f, -1.259f, -0.566f, -1.09f, -1.246f)
                curveToRelative(0.398f, -1.601f, 1.56f, -2.938f, 3.05f, -3.661f)
                curveToRelative(-0.465f, -1.37f, -1.081f, -3.64f, -1.081f, -6.082f)
                curveToRelative(0.0f, -3.048f, 0.628f, -5.467f, 1.652f, -7.355f)
                curveToRelative(-0.718f, -1.273f, -1.783f, -2.683f, -3.379f, -3.946f)
                curveTo(-0.451f, 1.127f, 0.394f, -0.081f, 1.313f, 0.004f)
                curveToRelative(2.643f, 0.244f, 4.674f, 0.905f, 6.174f, 1.608f)
                curveToRelative(1.877f, -1.123f, 4.008f, -1.612f, 6.014f, -1.612f)
                curveToRelative(5.112f, 0.0f, 7.991f, 3.377f, 8.438f, 7.0f)
                curveToRelative(1.103f, 0.0f, 2.062f, 0.897f, 2.062f, 2.0f)
                close()
            }
        }
        .build()
        return _dolphin!!
    }

private var _dolphin: ImageVector? = null
