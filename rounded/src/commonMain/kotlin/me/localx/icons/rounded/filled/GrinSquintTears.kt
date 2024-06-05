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

public val Icons.Filled.GrinSquintTears: ImageVector
    get() {
        if (_grinSquintTears != null) {
            return _grinSquintTears!!
        }
        _grinSquintTears = Builder(name = "GrinSquintTears", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.233f, 21.883f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, true, -4.233f, 0.0f)
                curveToRelative(-0.053f, -0.927f, 1.541f, -4.751f, 2.6f, -3.582f)
                arcTo(7.088f, 7.088f, 0.0f, false, true, 6.233f, 21.883f)
                close()
                moveTo(21.883f, 7.0f)
                arcToRelative(2.117f, 2.117f, 0.0f, false, false, 0.0f, -4.233f)
                curveToRelative(-0.927f, -0.053f, -4.751f, 1.541f, -3.582f, 2.6f)
                arcTo(7.088f, 7.088f, 0.0f, false, false, 21.883f, 7.0f)
                close()
                moveTo(23.519f, 8.657f)
                curveToRelative(2.866f, 9.162f, -6.589f, 18.055f, -15.55f, 14.634f)
                curveToRelative(0.945f, -2.068f, -0.869f, -5.184f, -1.839f, -6.279f)
                arcToRelative(2.632f, 2.632f, 0.0f, false, false, -2.008f, -0.938f)
                lineTo(4.113f, 16.074f)
                arcTo(2.632f, 2.632f, 0.0f, false, false, 2.108f, 17.0f)
                arcToRelative(8.892f, 8.892f, 0.0f, false, false, -0.606f, 0.81f)
                curveTo(-4.431f, 6.956f, 7.978f, -4.708f, 18.429f, 1.879f)
                arcToRelative(10.087f, 10.087f, 0.0f, false, false, -1.431f, 1.0f)
                arcTo(2.655f, 2.655f, 0.0f, false, false, 17.01f, 6.9f)
                curveTo(18.157f, 7.925f, 21.428f, 9.763f, 23.519f, 8.657f)
                close()
                moveTo(10.586f, 9.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.9f, 0.274f)
                lineToRelative(3.536f, -0.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.393f, -1.961f)
                lineToRelative(-2.064f, 0.412f)
                lineToRelative(0.412f, -2.064f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.96f, -0.393f)
                lineToRelative(-0.708f, 3.536f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.586f, 9.171f)
                close()
                moveTo(9.171f, 10.586f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, false, -0.9f, -0.274f)
                lineToRelative(-3.536f, 0.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.393f, 1.96f)
                lineToRelative(2.064f, -0.412f)
                lineToRelative(-0.412f, 2.064f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.961f, 0.393f)
                lineToRelative(0.707f, -3.536f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.171f, 10.586f)
                close()
                moveTo(18.781f, 10.516f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.817f, -0.329f)
                arcToRelative(15.416f, 15.416f, 0.0f, false, true, -2.7f, 4.079f)
                arcToRelative(15.391f, 15.391f, 0.0f, false, true, -4.079f, 2.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.329f, 1.817f)
                arcToRelative(6.841f, 6.841f, 0.0f, false, false, 6.581f, -1.69f)
                arcTo(6.828f, 6.828f, 0.0f, false, false, 18.781f, 10.516f)
                close()
            }
        }
        .build()
        return _grinSquintTears!!
    }

private var _grinSquintTears: ImageVector? = null
