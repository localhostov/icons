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

public val Icons.Filled.BlenderPhone: ImageVector
    get() {
        if (_blenderPhone != null) {
            return _blenderPhone!!
        }
        _blenderPhone = Builder(name = "BlenderPhone", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 19.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(5.795f, 4.707f)
                lineToRelative(0.205f, -1.56f)
                curveToRelative(0.0f, -0.605f, -0.49f, -1.095f, -1.095f, -1.095f)
                lineToRelative(-1.038f, -0.053f)
                curveToRelative(-0.747f, 0.0f, -1.416f, 0.314f, -1.906f, 0.804f)
                curveToRelative(-2.517f, 2.517f, -2.711f, 9.681f, 0.0f, 12.391f)
                curveToRelative(0.49f, 0.49f, 1.159f, 0.805f, 1.906f, 0.804f)
                lineToRelative(1.038f, -0.053f)
                curveToRelative(0.605f, 0.0f, 1.095f, -0.49f, 1.095f, -1.095f)
                lineToRelative(-0.205f, -1.56f)
                curveToRelative(0.0f, -0.605f, -0.49f, -1.095f, -1.095f, -1.095f)
                lineToRelative(-1.578f, -0.148f)
                curveToRelative(-0.91f, -2.131f, -0.868f, -4.16f, 0.0f, -6.099f)
                lineToRelative(1.578f, -0.148f)
                curveToRelative(0.605f, 0.0f, 1.095f, -0.49f, 1.095f, -1.095f)
                close()
                moveTo(23.289f, 1.061f)
                curveToRelative(-0.571f, -0.674f, -1.405f, -1.061f, -2.289f, -1.061f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(11.405f)
                curveToRelative(0.476f, 0.0f, 0.886f, -0.335f, 0.98f, -0.801f)
                lineToRelative(2.573f, -12.706f)
                curveToRelative(0.146f, -0.872f, -0.099f, -1.758f, -0.67f, -2.432f)
                close()
            }
        }
        .build()
        return _blenderPhone!!
    }

private var _blenderPhone: ImageVector? = null
