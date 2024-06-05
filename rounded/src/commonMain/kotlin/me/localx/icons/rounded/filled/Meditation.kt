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

public val Icons.Filled.Meditation: ImageVector
    get() {
        if (_meditation != null) {
            return _meditation!!
        }
        _meditation = Builder(name = "Meditation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.947f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.367f, -3.0f, 3.054f, -3.0f)
                reflectiveCurveToRelative(2.946f, 1.343f, 2.946f, 3.0f)
                reflectiveCurveToRelative(-1.26f, 3.0f, -2.946f, 3.0f)
                reflectiveCurveToRelative(-3.054f, -1.343f, -3.054f, -3.0f)
                close()
                moveTo(23.837f, 17.047f)
                curveToRelative(-0.302f, 0.462f, -0.921f, 0.592f, -1.384f, 0.29f)
                lineToRelative(-4.0f, -2.615f)
                curveToRelative(-0.123f, -0.081f, -0.227f, -0.188f, -0.305f, -0.313f)
                lineToRelative(-1.425f, -2.321f)
                curveToRelative(-0.202f, -0.329f, -0.447f, -0.625f, -0.723f, -0.885f)
                verticalLineToRelative(7.162f)
                lineToRelative(5.059f, 2.377f)
                curveToRelative(0.83f, 0.47f, 1.142f, 1.356f, 0.812f, 2.187f)
                curveToRelative(-0.264f, 0.666f, -0.952f, 1.071f, -1.669f, 1.071f)
                lineTo(11.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.554f)
                curveToRelative(1.069f, 0.0f, 1.392f, -1.451f, 0.425f, -1.905f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.133f, -0.062f, -0.278f, -0.095f, -0.425f, -0.095f)
                horizontalLineToRelative(-3.554f)
                curveToRelative(-1.665f, 0.028f, -3.0f, 1.335f, -3.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f)
                lineTo(3.809f, 24.0f)
                curveToRelative(-0.72f, 0.0f, -1.415f, -0.403f, -1.681f, -1.072f)
                curveToRelative(-0.329f, -0.831f, -0.01f, -1.72f, 0.742f, -2.149f)
                lineToRelative(5.13f, -2.414f)
                verticalLineToRelative(-7.012f)
                curveToRelative(-0.255f, 0.266f, -0.481f, 0.565f, -0.665f, 0.895f)
                lineToRelative(-1.461f, 2.623f)
                curveToRelative(-0.079f, 0.141f, -0.191f, 0.262f, -0.326f, 0.35f)
                lineToRelative(-4.0f, 2.615f)
                curveToRelative(-0.169f, 0.11f, -0.359f, 0.163f, -0.546f, 0.163f)
                curveToRelative(-0.326f, 0.0f, -0.646f, -0.159f, -0.838f, -0.453f)
                curveToRelative(-0.302f, -0.462f, -0.172f, -1.082f, 0.29f, -1.384f)
                lineToRelative(3.794f, -2.48f)
                lineToRelative(1.341f, -2.407f)
                curveToRelative(1.126f, -2.022f, 3.259f, -3.276f, 5.574f, -3.276f)
                horizontalLineToRelative(1.83f)
                curveToRelative(2.217f, 0.0f, 4.276f, 1.151f, 5.436f, 3.041f)
                lineToRelative(1.308f, 2.129f)
                lineToRelative(3.812f, 2.493f)
                curveToRelative(0.462f, 0.302f, 0.592f, 0.922f, 0.29f, 1.384f)
                close()
            }
        }
        .build()
        return _meditation!!
    }

private var _meditation: ImageVector? = null
