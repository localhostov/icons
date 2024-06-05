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

public val Icons.Bold.Shuttlecock: ImageVector
    get() {
        if (_shuttlecock != null) {
            return _shuttlecock!!
        }
        _shuttlecock = Builder(name = "Shuttlecock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.11f, 12.179f)
                curveToRelative(-0.175f, -0.2f, -1.721f, -1.982f, -2.172f, -2.434f)
                arcTo(3.674f, 3.674f, 0.0f, false, false, 19.863f, 9.0f)
                arcToRelative(4.075f, 4.075f, 0.0f, false, false, -3.938f, -5.0f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -0.948f, 0.113f)
                arcToRelative(3.658f, 3.658f, 0.0f, false, false, -0.747f, -1.075f)
                curveTo(13.779f, 2.586f, 12.0f, 1.041f, 11.8f, 0.866f)
                lineTo(10.741f, -0.048f)
                lineTo(9.754f, 0.939f)
                curveTo(5.44f, 5.253f, 3.78f, 11.2f, 2.582f, 16.468f)
                lineTo(1.025f, 18.025f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, false, -0.013f, 4.938f)
                arcToRelative(3.517f, 3.517f, 0.0f, false, false, 4.939f, -0.012f)
                lineToRelative(1.557f, -1.557f)
                curveToRelative(5.27f, -1.2f, 11.215f, -2.858f, 15.528f, -7.172f)
                lineToRelative(0.988f, -0.987f)
                close()
                moveTo(10.931f, 4.094f)
                curveToRelative(0.526f, 0.464f, 1.015f, 0.9f, 1.178f, 1.065f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 0.206f, 0.525f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, true, -0.2f, 0.511f)
                lineToRelative(0.01f, 0.01f)
                curveTo(10.65f, 7.865f, 8.954f, 10.07f, 8.2f, 11.074f)
                lineToRelative(-0.748f, -0.748f)
                arcTo(21.426f, 21.426f, 0.0f, false, true, 10.931f, 4.094f)
                close()
                moveTo(7.45f, 18.328f)
                lineToRelative(-1.8f, -1.8f)
                curveToRelative(0.23f, -0.985f, 0.478f, -1.99f, 0.761f, -3.0f)
                lineToRelative(4.039f, 4.039f)
                curveTo(9.44f, 17.851f, 8.435f, 18.1f, 7.45f, 18.328f)
                close()
                moveTo(10.337f, 13.216f)
                arcToRelative(71.878f, 71.878f, 0.0f, false, true, 4.882f, -5.924f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, true, 1.464f, 1.465f)
                arcToRelative(71.724f, 71.724f, 0.0f, false, true, -5.923f, 4.882f)
                close()
                moveTo(13.649f, 16.528f)
                lineTo(12.902f, 15.781f)
                curveToRelative(1.0f, -0.759f, 3.209f, -2.455f, 4.869f, -3.934f)
                lineToRelative(0.01f, 0.01f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, true, 0.511f, -0.2f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.525f, 0.205f)
                curveToRelative(0.163f, 0.164f, 0.6f, 0.653f, 1.065f, 1.179f)
                arcTo(21.392f, 21.392f, 0.0f, false, true, 13.649f, 16.528f)
                close()
            }
        }
        .build()
        return _shuttlecock!!
    }

private var _shuttlecock: ImageVector? = null
