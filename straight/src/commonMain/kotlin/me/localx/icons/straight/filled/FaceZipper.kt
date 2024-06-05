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

public val Icons.Filled.FaceZipper: ImageVector
    get() {
        if (_faceZipper != null) {
            return _faceZipper!!
        }
        _faceZipper = Builder(name = "FaceZipper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.415f, 21.415f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                reflectiveCurveToRelative(-1.027f, -0.192f, -1.414f, -0.585f)
                curveToRelative(-0.978f, -0.991f, -1.587f, -3.578f, -1.587f, -3.665f)
                curveToRelative(0.0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
                curveToRelative(0.577f, 0.0f, 2.849f, 0.876f, 3.665f, 1.587f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.048f, 0.0f, 2.828f)
                close()
                moveTo(18.555f, 22.045f)
                curveToRelative(-1.885f, 1.233f, -4.134f, 1.955f, -6.554f, 1.955f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                curveToRelative(0.0f, 1.458f, -0.274f, 2.848f, -0.75f, 4.14f)
                curveToRelative(-0.533f, -0.274f, -1.111f, -0.527f, -1.667f, -0.724f)
                curveToRelative(-1.393f, -0.627f, -3.15f, -1.416f, -3.15f, -1.416f)
                horizontalLineToRelative(-3.433f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.027f)
                curveToRelative(0.116f, 0.744f, 0.628f, 2.667f, 1.527f, 4.045f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _faceZipper!!
    }

private var _faceZipper: ImageVector? = null
