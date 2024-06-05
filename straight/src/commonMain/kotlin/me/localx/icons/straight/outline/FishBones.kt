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

public val Icons.Outline.FishBones: ImageVector
    get() {
        if (_fishBones != null) {
            return _fishBones!!
        }
        _fishBones = Builder(name = "FishBones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 19.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 7.0f)
                curveToRelative(0.0f, 1.178f, -0.78f, 2.0f, -1.898f, 2.0f)
                horizontalLineToRelative(-4.976f)
                lineToRelative(1.437f, 1.438f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.269f, 1.269f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(-1.061f, 1.061f)
                curveToRelative(1.156f, 1.375f, 1.997f, 3.022f, 2.408f, 4.826f)
                lineToRelative(0.186f, 0.814f)
                lineToRelative(-0.769f, 0.327f)
                curveToRelative(-2.27f, 0.966f, -5.328f, 1.416f, -9.622f, 1.416f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.294f, 0.45f, -7.352f, 1.415f, -9.622f)
                lineToRelative(0.327f, -0.769f)
                lineToRelative(0.815f, 0.186f)
                curveToRelative(1.804f, 0.411f, 3.451f, 1.251f, 4.826f, 2.407f)
                lineToRelative(1.062f, -1.062f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(1.269f, -1.269f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(1.437f, 1.437f)
                lineTo(15.001f, 1.898f)
                curveToRelative(0.0f, -1.118f, 0.822f, -1.898f, 2.0f, -1.898f)
                curveToRelative(1.423f, 0.0f, 3.447f, 0.989f, 3.905f, 3.095f)
                curveToRelative(2.105f, 0.458f, 3.095f, 2.482f, 3.095f, 3.905f)
                close()
                moveTo(9.024f, 21.051f)
                curveToRelative(-0.938f, -2.862f, -3.213f, -5.137f, -6.076f, -6.075f)
                curveToRelative(-0.582f, 1.749f, -0.886f, 4.021f, -0.94f, 7.016f)
                curveToRelative(2.996f, -0.055f, 5.267f, -0.358f, 7.016f, -0.94f)
                close()
                moveTo(22.0f, 7.0f)
                curveToRelative(0.0f, -0.02f, -0.117f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.858f, -1.931f, -1.997f, -1.998f, -2.0f)
                lineToRelative(-0.002f, 5.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _fishBones!!
    }

private var _fishBones: ImageVector? = null
