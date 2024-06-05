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

public val Icons.Filled.FishBones: ImageVector
    get() {
        if (_fishBones != null) {
            return _fishBones!!
        }
        _fishBones = Builder(name = "FishBones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.905f, 3.095f)
                curveToRelative(-0.458f, -2.105f, -2.482f, -3.095f, -3.905f, -3.095f)
                curveToRelative(-1.178f, 0.0f, -2.0f, 0.78f, -2.0f, 1.898f)
                verticalLineToRelative(4.976f)
                lineToRelative(-1.437f, -1.437f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.269f, 1.269f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.08f, 1.08f)
                curveToRelative(-1.374f, -1.155f, -3.004f, -2.015f, -4.808f, -2.426f)
                lineToRelative(-0.815f, -0.186f)
                lineToRelative(-0.327f, 0.769f)
                curveToRelative(-0.965f, 2.271f, -1.415f, 5.328f, -1.415f, 9.622f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(4.294f, 0.0f, 7.352f, -0.45f, 9.622f, -1.416f)
                lineToRelative(0.769f, -0.327f)
                lineToRelative(-0.186f, -0.814f)
                curveToRelative(-0.41f, -1.804f, -1.27f, -3.434f, -2.426f, -4.808f)
                lineToRelative(1.08f, -1.08f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.543f, -2.543f)
                lineToRelative(1.269f, -1.269f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.437f, -1.438f)
                horizontalLineToRelative(4.976f)
                curveToRelative(1.118f, 0.0f, 1.898f, -0.822f, 1.898f, -2.0f)
                curveToRelative(0.0f, -1.423f, -0.989f, -3.447f, -3.095f, -3.905f)
                close()
                moveTo(4.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _fishBones!!
    }

private var _fishBones: ImageVector? = null
