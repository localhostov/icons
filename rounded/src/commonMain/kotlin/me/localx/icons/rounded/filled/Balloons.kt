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

public val Icons.Filled.Balloons: ImageVector
    get() {
        if (_balloons != null) {
            return _balloons!!
        }
        _balloons = Builder(name = "Balloons", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 0.0f, 7.0f)
                curveToRelative(0.0f, 3.971f, 2.257f, 8.485f, 5.39f, 9.685f)
                arcTo(2.822f, 2.822f, 0.0f, false, false, 5.0f, 17.87f)
                curveToRelative(0.0f, 1.571f, 1.489f, 2.267f, 2.576f, 2.776f)
                curveToRelative(0.6f, 0.28f, 1.424f, 0.665f, 1.424f, 0.963f)
                arcToRelative(2.291f, 2.291f, 0.0f, false, true, -0.428f, 0.851f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.684f, 1.08f)
                arcTo(3.745f, 3.745f, 0.0f, false, false, 11.0f, 21.609f)
                curveToRelative(0.0f, -1.571f, -1.489f, -2.267f, -2.576f, -2.775f)
                curveToRelative(-0.6f, -0.281f, -1.424f, -0.666f, -1.433f, -0.865f)
                arcToRelative(5.379f, 5.379f, 0.0f, false, true, 0.568f, -1.016f)
                curveTo(11.227f, 16.475f, 14.0f, 11.4f, 14.0f, 7.0f)
                close()
                moveTo(9.176f, 10.47f)
                arcTo(5.723f, 5.723f, 0.0f, false, false, 10.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(7.662f, 7.662f, 0.0f, false, true, -1.129f, 3.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.7f, -1.06f)
                close()
                moveTo(19.5f, 18.589f)
                curveToRelative(-0.682f, -0.362f, -1.386f, -0.737f, -1.484f, -1.162f)
                curveToRelative(-0.046f, -0.193f, -0.025f, -0.628f, 0.515f, -1.473f)
                curveTo(21.7f, 15.5f, 24.0f, 11.025f, 24.0f, 7.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(6.151f, 6.151f, 0.0f, false, false, -3.5f, 1.036f)
                arcTo(8.942f, 8.942f, 0.0f, false, true, 16.0f, 7.0f)
                arcToRelative(15.088f, 15.088f, 0.0f, false, true, -1.784f, 6.812f)
                arcToRelative(5.928f, 5.928f, 0.0f, false, false, 2.2f, 1.84f)
                arcToRelative(3.381f, 3.381f, 0.0f, false, false, -0.352f, 2.229f)
                curveToRelative(0.306f, 1.31f, 1.519f, 1.955f, 2.494f, 2.474f)
                curveToRelative(0.616f, 0.328f, 1.313f, 0.7f, 1.419f, 1.068f)
                arcToRelative(1.627f, 1.627f, 0.0f, false, true, -0.315f, 1.078f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.732f, 1.0f)
                arcToRelative(3.329f, 3.329f, 0.0f, false, false, 0.506f, -2.627f)
                arcTo(4.166f, 4.166f, 0.0f, false, false, 19.5f, 18.589f)
                close()
                moveTo(19.175f, 10.47f)
                arcTo(5.723f, 5.723f, 0.0f, false, false, 20.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(7.662f, 7.662f, 0.0f, false, true, -1.129f, 3.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.7f, -1.06f)
                close()
            }
        }
        .build()
        return _balloons!!
    }

private var _balloons: ImageVector? = null
