package me.localx.icons.rounded.bold

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

public val Icons.Bold.Invite: ImageVector
    get() {
        if (_invite != null) {
            return _invite!!
        }
        _invite = Builder(name = "Invite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.955f, 22.785f)
                curveToRelative(0.199f, 0.601f, -0.29f, 1.215f, -0.945f, 1.215f)
                lineTo(0.99f, 24.0f)
                curveToRelative(-0.655f, 0.0f, -1.144f, -0.613f, -0.945f, -1.215f)
                curveToRelative(0.533f, -1.615f, 2.103f, -2.785f, 3.955f, -2.785f)
                reflectiveCurveToRelative(3.422f, 1.17f, 3.955f, 2.785f)
                close()
                moveTo(20.0f, 20.0f)
                curveToRelative(-1.853f, 0.0f, -3.422f, 1.17f, -3.955f, 2.785f)
                curveToRelative(-0.199f, 0.601f, 0.29f, 1.215f, 0.945f, 1.215f)
                horizontalLineToRelative(6.02f)
                curveToRelative(0.655f, 0.0f, 1.144f, -0.613f, 0.945f, -1.215f)
                curveToRelative(-0.533f, -1.615f, -2.103f, -2.785f, -3.955f, -2.785f)
                close()
                moveTo(20.0f, 18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(13.5f, 21.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.545f)
                curveToRelative(0.0f, -0.804f, -0.651f, -1.455f, -1.455f, -1.455f)
                horizontalLineToRelative(-0.038f)
                curveToRelative(-0.832f, 0.0f, -1.507f, 0.675f, -1.507f, 1.507f)
                verticalLineToRelative(0.493f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveTo(2.462f, 2.0f, 0.0f, 4.462f, 0.0f, 7.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _invite!!
    }

private var _invite: ImageVector? = null
