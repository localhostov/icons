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

public val Icons.Bold.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.864f, 14.923f)
                arcTo(9.466f, 9.466f, 0.0f, false, false, 13.5f, 17.236f)
                verticalLineTo(15.287f)
                arcToRelative(6.621f, 6.621f, 0.0f, false, false, 5.113f, -6.436f)
                curveToRelative(0.0f, -2.432f, -1.369f, -5.062f, -4.068f, -7.814f)
                arcToRelative(3.643f, 3.643f, 0.0f, false, false, -5.09f, 0.0f)
                curveTo(6.755f, 3.79f, 5.386f, 6.42f, 5.386f, 8.851f)
                arcTo(6.621f, 6.621f, 0.0f, false, false, 10.5f, 15.287f)
                verticalLineToRelative(1.949f)
                arcToRelative(9.469f, 9.469f, 0.0f, false, false, -9.364f, -2.313f)
                lineTo(0.0f, 15.206f)
                verticalLineToRelative(1.172f)
                arcToRelative(6.756f, 6.756f, 0.0f, false, false, 2.292f, 5.355f)
                curveToRelative(2.557f, 2.218f, 6.582f, 2.345f, 8.637f, 2.242f)
                horizontalLineToRelative(2.133f)
                curveToRelative(4.279f, 0.376f, 11.117f, -1.266f, 10.938f, -7.6f)
                verticalLineTo(15.206f)
                close()
                moveTo(4.253f, 19.463f)
                arcTo(3.476f, 3.476f, 0.0f, false, true, 3.136f, 17.6f)
                arcTo(6.6f, 6.6f, 0.0f, false, true, 9.712f, 21.0f)
                curveTo(7.919f, 20.973f, 5.612f, 20.645f, 4.253f, 19.463f)
                close()
                moveTo(8.386f, 8.851f)
                arcTo(7.624f, 7.624f, 0.0f, false, true, 10.5f, 4.36f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.36f)
                curveTo(20.07f, 11.751f, 9.2f, 15.878f, 8.386f, 8.851f)
                close()
                moveTo(19.747f, 19.463f)
                curveToRelative(-1.359f, 1.182f, -3.667f, 1.51f, -5.459f, 1.538f)
                arcToRelative(6.723f, 6.723f, 0.0f, false, true, 6.576f, -3.4f)
                arcTo(3.476f, 3.476f, 0.0f, false, true, 19.747f, 19.463f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
