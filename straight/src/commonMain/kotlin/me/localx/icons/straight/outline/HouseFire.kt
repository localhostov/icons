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

public val Icons.Outline.HouseFire: ImageVector
    get() {
        if (_houseFire != null) {
            return _houseFire!!
        }
        _houseFire = Builder(name = "HouseFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.0f)
                curveToRelative(0.0f, 3.655f, -3.0f, 7.034f, -7.0f, 7.034f)
                curveToRelative(-3.5f, 0.0f, -7.0f, -3.379f, -7.0f, -7.034f)
                curveToRelative(0.0f, -2.182f, 1.3f, -3.775f, 2.278f, -4.783f)
                lineToRelative(1.153f, -1.189f)
                lineToRelative(0.515f, 1.575f)
                curveToRelative(0.094f, 0.287f, 0.215f, 0.591f, 0.335f, 0.853f)
                curveToRelative(0.065f, -0.219f, 0.129f, -0.459f, 0.185f, -0.667f)
                curveToRelative(0.302f, -1.141f, 0.717f, -2.705f, 1.778f, -3.931f)
                lineToRelative(0.703f, -0.812f)
                lineToRelative(0.76f, 0.76f)
                curveToRelative(0.434f, 0.433f, 1.024f, 0.904f, 1.649f, 1.403f)
                curveToRelative(2.069f, 1.65f, 4.644f, 3.703f, 4.644f, 6.791f)
                close()
                moveTo(18.0f, 21.036f)
                curveToRelative(0.0f, -0.267f, -0.104f, -0.519f, -0.293f, -0.708f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-0.707f, 0.707f)
                curveToRelative(-0.188f, 0.189f, -0.293f, 0.44f, -0.293f, 0.708f)
                reflectiveCurveToRelative(0.158f, 0.964f, 1.0f, 0.964f)
                reflectiveCurveToRelative(1.0f, -0.697f, 1.0f, -0.964f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.125f, -2.066f, -3.773f, -3.89f, -5.227f)
                curveToRelative(-0.32f, -0.255f, -0.632f, -0.503f, -0.926f, -0.749f)
                curveToRelative(-0.373f, 0.722f, -0.589f, 1.534f, -0.786f, 2.277f)
                curveToRelative(-0.335f, 1.265f, -0.716f, 2.699f, -2.116f, 2.699f)
                curveToRelative(-0.248f, 0.0f, -0.878f, 0.0f, -1.561f, -1.187f)
                curveToRelative(-0.493f, 0.744f, -0.722f, 1.448f, -0.722f, 2.187f)
                curveToRelative(0.0f, 1.629f, 0.795f, 3.066f, 2.006f, 3.979f)
                curveToRelative(0.015f, -0.78f, 0.321f, -1.512f, 0.873f, -2.065f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(0.553f, 0.553f, 0.859f, 1.285f, 0.873f, 2.065f)
                curveToRelative(1.21f, -0.913f, 2.006f, -2.35f, 2.006f, -3.979f)
                close()
                moveTo(22.813f, 7.635f)
                lineTo(13.908f, 0.659f)
                curveToRelative(-1.123f, -0.881f, -2.693f, -0.881f, -3.816f, 0.0f)
                lineTo(1.187f, 7.635f)
                curveToRelative(-0.754f, 0.592f, -1.187f, 1.48f, -1.187f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(11.356f)
                curveToRelative(-0.707f, -0.571f, -1.327f, -1.244f, -1.834f, -2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.926f)
                curveToRelative(0.0f, -0.335f, 0.157f, -0.658f, 0.421f, -0.865f)
                lineTo(11.326f, 2.233f)
                curveToRelative(0.396f, -0.311f, 0.95f, -0.312f, 1.348f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.172f, 0.135f, 0.293f, 0.322f, 0.36f, 0.528f)
                curveToRelative(0.712f, 0.609f, 1.429f, 1.29f, 2.061f, 2.06f)
                verticalLineToRelative(-1.723f)
                curveToRelative(0.0f, -0.958f, -0.433f, -1.847f, -1.187f, -2.439f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
