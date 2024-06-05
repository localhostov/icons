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

public val Icons.Outline.JumpingRope: ImageVector
    get() {
        if (_jumpingRope != null) {
            return _jumpingRope!!
        }
        _jumpingRope = Builder(name = "JumpingRope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.304f, 15.902f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-3.889f, 3.889f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.889f, -3.889f)
                lineToRelative(-1.292f, -1.292f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(0.0f, -2.213f, -0.815f, -4.252f, -2.174f, -5.905f)
                curveToRelative(-0.749f, 0.114f, -1.462f, 0.328f, -2.115f, 0.635f)
                curveToRelative(1.419f, 1.403f, 2.289f, 3.246f, 2.289f, 5.27f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -4.337f, 4.121f, -8.0f, 9.0f, -8.0f)
                curveToRelative(2.307f, 0.0f, 5.0f, 1.44f, 5.0f, 5.5f)
                curveToRelative(0.0f, 0.056f, -0.13f, 4.438f, -2.273f, 7.998f)
                lineToRelative(1.452f, 1.452f)
                curveToRelative(2.719f, -4.171f, 2.821f, -9.385f, 2.821f, -9.45f)
                curveToRelative(0.0f, -5.153f, -3.629f, -7.5f, -7.0f, -7.5f)
                curveTo(10.935f, 0.0f, 6.0f, 4.486f, 6.0f, 10.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(8.11f, 17.316f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(3.889f, 3.889f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.889f, -3.889f)
                lineToRelative(1.292f, -1.292f)
                close()
                moveTo(4.272f, 15.498f)
                curveToRelative(-2.142f, -3.559f, -2.273f, -7.942f, -2.273f, -7.998f)
                curveToRelative(0.0f, -4.06f, 2.693f, -5.5f, 5.0f, -5.5f)
                curveToRelative(0.109f, 0.0f, 0.215f, 0.011f, 0.323f, 0.015f)
                curveToRelative(0.635f, -0.655f, 1.343f, -1.245f, 2.118f, -1.758f)
                curveToRelative(-0.786f, -0.163f, -1.601f, -0.257f, -2.441f, -0.257f)
                curveTo(3.629f, 0.0f, 0.0f, 2.347f, 0.0f, 7.5f)
                curveToRelative(0.0f, 0.065f, 0.101f, 5.279f, 2.821f, 9.45f)
                lineToRelative(1.452f, -1.452f)
                close()
            }
        }
        .build()
        return _jumpingRope!!
    }

private var _jumpingRope: ImageVector? = null
